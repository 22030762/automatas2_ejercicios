from __future__ import annotations

from antlr4 import CommonTokenStream, InputStream, Token
from antlr4.error.ErrorListener import ErrorListener

from ExprLexer import ExprLexer


class ErroresLexicos(ErrorListener):
    """Captura los errores emitidos por el lexer de ANTLR."""

    def __init__(self):
        super().__init__()
        self.lista: list[dict] = []

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        self.lista.append(
            {
                "tipo_error": "Léxico",
                "linea": line,
                "columna": column,
                "simbolo": getattr(offendingSymbol, "text", "") if offendingSymbol else "",
                "mensaje": msg,
            }
        )


class AnalizadorLexico:
    """Ejecuta ExprLexer y expone tokens y errores en estructuras tabulares."""

    def __init__(self):
        self.lexer = None
        self.tokens = None
        self.errores = ErroresLexicos()

    def analizar(self, codigo: str):
        # Es indispensable reiniciar el listener en cada análisis. De lo contrario,
        # Streamlit acumula errores de ejecuciones anteriores.
        self.errores = ErroresLexicos()

        entrada = InputStream(codigo or "")
        self.lexer = ExprLexer(entrada)
        self.lexer.removeErrorListeners()
        self.lexer.addErrorListener(self.errores)

        self.tokens = CommonTokenStream(self.lexer)
        self.tokens.fill()
        return self

    def obtener_tokens(self) -> list[dict]:
        if self.tokens is None or self.lexer is None:
            return []

        resultado = []
        numero = 1

        for token in self.tokens.tokens:
            if token.type == Token.EOF:
                continue

            nombre_token = (
                self.lexer.symbolicNames[token.type]
                if 0 <= token.type < len(self.lexer.symbolicNames)
                else "DESCONOCIDO"
            )

            resultado.append(
                {
                    "#": numero,
                    "lexema": token.text,
                    "token": nombre_token,
                    "tipo": token.type,
                    "linea": token.line,
                    "columna": token.column,
                }
            )
            numero += 1

        return resultado

    def obtener_errores(self) -> list[dict]:
        return list(self.errores.lista)
