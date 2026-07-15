# SQL Validator — ANTLR + Streamlit

Interfaz en Python construida sobre los archivos originales del proyecto:

- `app.py`: interfaz principal.
- `archivo.py`: lectura y validación de archivos `.sql`.
- `analizador_lexico.py`: tokenización y errores léxicos.
- `analizador_sintactico.py`: validación sintáctica y árboles.
- `analizador_sql.py`: fachada que reúne ambos análisis.
- `ExprLexer.py` y `ExprParser.py`: archivos generados por ANTLR 4.13.2.

## Requisitos

Se recomienda Python 3.10, 3.11 o 3.12.

```bash
python -m venv .venv
```

Windows:

```bash
.venv\Scripts\activate
pip install -r requirements.txt
streamlit run app.py
```

Linux/macOS:

```bash
source .venv/bin/activate
pip install -r requirements.txt
streamlit run app.py
```

## Importante

`ExprLexer.py` y `ExprParser.py` fueron generados con ANTLR 4.13.2, por eso
`requirements.txt` fija exactamente `antlr4-python3-runtime==4.13.2`.

La regla generada `root` solo admite una `expr` seguida de EOF. Para conservar
los archivos generados sin editarlos, `analizador_sintactico.py` procesa el flujo
de tokens sentencia por sentencia y despacha directamente las reglas
`transaccion`, `crearProcedimiento` y `crearTrigger` cuando corresponde.

La interfaz valida el subconjunto SQL descrito por la gramática, no todo el
estándar SQL ni toda la sintaxis de PostgreSQL.
