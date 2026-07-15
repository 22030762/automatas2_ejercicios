from __future__ import annotations

from antlr4 import CommonTokenStream, InputStream, Token
from antlr4.error.ErrorListener import ErrorListener

from ExprLexer import ExprLexer
from ExprParser import ExprParser


class ErroresSintacticos(ErrorListener):
    """Listener de ANTLR que conserva línea, columna y símbolo ofensivo."""

    def __init__(self):
        super().__init__()
        self.lista: list[dict] = []

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        simbolo = getattr(offendingSymbol, "text", "") if offendingSymbol else ""
        self.lista.append(
            {
                "tipo_error": "Sintáctico",
                "linea": line,
                "columna": column,
                "simbolo": simbolo,
                "mensaje": msg,
            }
        )


class AnalizadorSintactico:
    """
    Valida una o varias sentencias con el parser generado.

    La gramática generada define ``root: expr EOF`` y, por tanto, la regla root
    solamente valida una sentencia convencional. Este helper conserva el parser
    generado sin editarlo y despacha repetidamente las reglas correspondientes.
    También conecta las reglas transaccion, crearProcedimiento y crearTrigger,
    que existen en ExprParser pero no forman parte de ``expr``.
    """

    def __init__(self):
        self.parser = None
        self.tokens = None
        self.errores = ErroresSintacticos()
        self.arboles: list[dict] = []
        self.sentencias: list[dict] = []

    def analizar(self, codigo: str):
        self.errores = ErroresSintacticos()
        self.arboles = []
        self.sentencias = []

        entrada = InputStream(codigo or "")
        lexer = ExprLexer(entrada)
        # Los errores léxicos se presentan desde AnalizadorLexico para no duplicarlos.
        lexer.removeErrorListeners()

        self.tokens = CommonTokenStream(lexer)
        self.tokens.fill()
        self.tokens.seek(0)

        self.parser = ExprParser(self.tokens)
        self.parser.removeErrorListeners()
        self.parser.addErrorListener(self.errores)
        self.parser.buildParseTrees = True

        numero = 1
        while self.tokens.LA(1) != Token.EOF:
            indice_inicial = self.tokens.index
            token_inicial = self.tokens.LT(1)

            arbol, regla = self._analizar_siguiente()

            token_final = getattr(arbol, "stop", None) or self.tokens.LT(-1)
            texto = self._texto_intervalo(indice_inicial, self.tokens.index - 1)

            self.sentencias.append(
                {
                    "#": numero,
                    "regla": regla,
                    "linea_inicio": getattr(token_inicial, "line", 1),
                    "linea_fin": getattr(token_final, "line", getattr(token_inicial, "line", 1)),
                    "fragmento": texto.strip(),
                }
            )

            try:
                arbol_texto = arbol.toStringTree(recog=self.parser)
            except Exception:
                arbol_texto = str(arbol)

            self.arboles.append(
                {
                    "#": numero,
                    "regla": regla,
                    "arbol": arbol_texto,
                }
            )
            numero += 1

            # Protección contra recuperaciones que no consuman ningún token.
            if self.tokens.index <= indice_inicial:
                token_bloqueado = self.tokens.LT(1)
                self.errores.lista.append(
                    {
                        "tipo_error": "Sintáctico",
                        "linea": getattr(token_bloqueado, "line", 1),
                        "columna": getattr(token_bloqueado, "column", 0),
                        "simbolo": getattr(token_bloqueado, "text", ""),
                        "mensaje": "El parser no pudo continuar desde este token.",
                    }
                )
                self.tokens.consume()

        return self

    def _analizar_siguiente(self):
        primero = self.tokens.LA(1)

        # Manejo de Transacciones (BEGIN / START TRANSACTION)
        if primero in (ExprParser.BEGIN, ExprParser.START):
            return self.parser.transaccion(), "transaccion"

        # Manejo de Estructuras DDL Avanzadas (Triggers, Procedimientos)
        if primero == ExprParser.CREATE:
            segundo = self.tokens.LA(2)
            tercero = self.tokens.LA(3)
            cuarto = self.tokens.LA(4)

            if segundo == ExprParser.TRIGGER:
                return self.parser.crearTrigger(), "crearTrigger"

            if segundo == ExprParser.PROCEDURE:
                return self.parser.crearProcedimiento(), "crearProcedimiento"

            # Soporte para CREATE OR REPLACE PROCEDURE
            if (
                segundo == ExprParser.OR
                and tercero == ExprParser.REPLACE
                and cuarto == ExprParser.PROCEDURE
            ):
                return self.parser.crearProcedimiento(), "crearProcedimiento"

        return self.parser.expr(), "expr"

    def _texto_intervalo(self, inicio: int, fin: int) -> str:
        if self.tokens is None or not self.tokens.tokens:
            return ""
        fin = max(inicio, min(fin, len(self.tokens.tokens) - 1))
        partes = []
        for token in self.tokens.tokens[inicio : fin + 1]:
            if token.type != Token.EOF and token.text:
                partes.append(token.text)
        return " ".join(partes)

    def obtener_errores(self) -> list[dict]:
        return list(self.errores.lista)

    def obtener_arboles(self) -> list[dict]:
        return list(self.arboles)

    def obtener_sentencias(self) -> list[dict]:
        return list(self.sentencias)

    def es_valido(self) -> bool:
        return len(self.errores.lista) == 0