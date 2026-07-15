from __future__ import annotations

from datetime import datetime
from typing import Any

from antlr4 import ParseTreeWalker
from analizador_lexico import AnalizadorLexico
from analizador_sintactico import AnalizadorSintactico
from analizador_semantico import listenerSemantico


class AnalizadorSQL:
    """Fachada que reúne el análisis léxico y sintáctico."""

    def __init__(self):
        self.lexico = AnalizadorLexico()
        self.sintactico = AnalizadorSintactico()

    def analizar(self, codigo: str) -> dict[str, Any]:
        self.lexico.analizar(codigo)
        self.sintactico.analizar(codigo)

        tokens = self.lexico.obtener_tokens()
        errores_lexicos = self.lexico.obtener_errores()
        errores_sintacticos = self.sintactico.obtener_errores()
        errores = errores_lexicos + errores_sintacticos
        sentencias = self.sintactico.obtener_sentencias()

        errores_semanticos = []

        if len(errores_lexicos) == 0 and len(errores_sintacticos) == 0 and bool(codigo.strip()):
            try:
                parser = self.sintactico.parser
                if parser:
                    parser.reset()
                    arbol = parser.root() # Regla inicial de la gramática
                    
                    listener_semantico = listenerSemantico()
                    walker = ParseTreeWalker()
                    walker.walk(listener_semantico, arbol)
                    
                    errores_semanticos = listener_semantico.errores
            except Exception as e:
                errores_semanticos = [{
                    "tipo_error": "Semántico",
                    "linea": 1,
                    "columna": 0,
                    "simbolo": "",
                    "mensaje": f"Error interno en análisis semántico: {str(e)}"
                }]

        errores = errores_lexicos + errores_sintacticos + errores_semanticos
        sentencias = self.sintactico.obtener_sentencias()

        return {
            "valido": len(errores) == 0 and bool(codigo.strip()),
            "fecha_analisis": datetime.now().isoformat(timespec="seconds"),
            "resumen": {
                "lineas": len(codigo.splitlines()) if codigo else 0,
                "caracteres": len(codigo),
                "tokens": len(tokens),
                "sentencias": len(sentencias),
                "errores_lexicos": len(errores_lexicos),
                "errores_sintacticos": len(errores_sintacticos),
                "errores_semanticos": len(errores_semanticos),
            },
            "tokens": tokens,
            "errores_lexicos": errores_lexicos,
            "errores_sintacticos": errores_sintacticos,
            "errores_semanticos": errores_semanticos,
            "errores": errores,
            "sentencias": sentencias,
            "arboles": self.sintactico.obtener_arboles(),
        }
