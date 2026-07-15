from __future__ import annotations

import json

import streamlit as st

from analizador_sql import AnalizadorSQL
from archivo import Archivo


EJEMPLOS = {
    "Crear tabla y consultar": """CREATE TABLE usuarios (
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(80) NOT NULL,
    correo VARCHAR(120) UNIQUE,
    activo BOOLEAN DEFAULT TRUE
);

INSERT INTO usuarios (nombre, correo, activo)
VALUES ('Ana', 'ana@correo.com', TRUE);

SELECT id, nombre, correo
FROM usuarios
WHERE activo = TRUE
ORDER BY nombre ASC;
""",
    "Consulta con JOIN": """SELECT u.id, u.nombre, p.titulo
FROM usuarios AS u
LEFT JOIN publicaciones AS p ON u.id = p.usuario_id
WHERE u.activo = TRUE
ORDER BY u.nombre ASC
LIMIT 20;
""",
    "Ejemplo con errores": """CREATE TABLE productos (
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL
)

SELECT id nombre
FROM productos
WHERE precio > ;
""",
}


class App:
    def __init__(self):
        st.set_page_config(
            page_title="SQL Validator",
            page_icon="🧩",
            layout="wide",
            initial_sidebar_state="expanded",
        )
        self.analizador = AnalizadorSQL()
        self._inicializar_estado()

    @staticmethod
    def _inicializar_estado():
        valores = {
            "codigo_sql": EJEMPLOS["Crear tabla y consultar"],
            "resultado": None,
            "archivo_info": None,
            "archivo_cargado_id": None,
        }
        for clave, valor in valores.items():
            if clave not in st.session_state:
                st.session_state[clave] = valor

    @staticmethod
    def _aplicar_estilos():
        st.markdown(
            """
            <style>
                .stApp {
                    background:
                        radial-gradient(circle at 85% 5%, rgba(37, 99, 235, .13), transparent 26rem),
                        radial-gradient(circle at 5% 20%, rgba(14, 165, 233, .08), transparent 24rem);
                }
                .main .block-container {
                    max-width: 1500px;
                    padding-top: 2rem;
                    padding-bottom: 4rem;
                }
                .sql-hero {
                    padding: 1.7rem 1.9rem;
                    border: 1px solid rgba(148, 163, 184, .25);
                    border-radius: 18px;
                    background: linear-gradient(135deg, rgba(15, 23, 42, .97), rgba(30, 41, 59, .93));
                    box-shadow: 0 18px 50px rgba(2, 6, 23, .16);
                    margin-bottom: 1.4rem;
                }
                .sql-hero h1 {
                    margin: 0 0 .35rem 0;
                    color: #f8fafc;
                    font-size: 2rem;
                }
                .sql-hero p {
                    margin: 0;
                    color: #cbd5e1;
                }
                .status-valid, .status-invalid {
                    padding: 1rem 1.2rem;
                    border-radius: 14px;
                    font-weight: 700;
                    margin: .25rem 0 1rem 0;
                }
                .status-valid {
                    background: rgba(16, 185, 129, .12);
                    border: 1px solid rgba(16, 185, 129, .35);
                    color: #047857;
                }
                .status-invalid {
                    background: rgba(239, 68, 68, .10);
                    border: 1px solid rgba(239, 68, 68, .32);
                    color: #b91c1c;
                }
                div[data-testid="stMetric"] {
                    border: 1px solid rgba(148, 163, 184, .22);
                    border-radius: 14px;
                    padding: .8rem 1rem;
                    background: rgba(255, 255, 255, .035);
                }
                div[data-testid="stTextArea"] textarea {
                    font-family: "Cascadia Code", "JetBrains Mono", Consolas, monospace;
                    font-size: 14px;
                    line-height: 1.55;
                }
            </style>
            """,
            unsafe_allow_html=True,
        )

    def ejecutar(self):
        self._aplicar_estilos()

        st.markdown(
            """
            <section class="sql-hero">
                <h1>SQL Validator</h1>
                <p>Análisis léxico, sintáctico y semantico con ANTLR 4.13.2, Python y Streamlit.</p>
            </section>
            """,
            unsafe_allow_html=True,
        )

        self._renderizar_sidebar()

        columna_editor, columna_contexto = st.columns([2.35, 1], gap="large")

        with columna_editor:
            st.subheader("Editor SQL")
            st.caption(
                "Escribe código directamente o carga un archivo `.sql`. "
                "La validación se realiza con tu ExprLexer y ExprParser."
            )
            st.text_area(
                "Código fuente",
                key="codigo_sql",
                height=430,
                label_visibility="collapsed",
                placeholder="Escribe una sentencia SQL terminada en punto y coma…",
            )

            acciones = st.columns([1, 1, 4])
            with acciones[0]:
                analizar = st.button(
                    "▶ Analizar",
                    type="primary",
                    use_container_width=True,
                )
            with acciones[1]:
                st.button(
                    "Limpiar",
                    use_container_width=True,
                    on_click=self._limpiar,
                )

        with columna_contexto:
            self._renderizar_contexto()

        if analizar:
            codigo = st.session_state.codigo_sql
            if not codigo.strip():
                st.session_state.resultado = None
                st.warning("Escribe o carga código SQL antes de iniciar el análisis.")
            else:
                with st.spinner("Ejecutando lexer y parser…"):
                    st.session_state.resultado = self.analizador.analizar(codigo)

        if st.session_state.resultado:
            self._renderizar_resultado(st.session_state.resultado)

    def _renderizar_sidebar(self):
        with st.sidebar:
            st.header("Proyecto")
            st.caption("La interfaz se ejecuta desde `app.py` y reutiliza tus helpers.")

            archivo_subido = st.file_uploader(
                "Abrir archivo SQL",
                type=["sql"],
                help="El archivo se carga en el editor y puede modificarse antes de analizarlo.",
            )

            if archivo_subido is not None:
                identificador = (
                    archivo_subido.name,
                    getattr(archivo_subido, "size", None),
                )
                if identificador != st.session_state.archivo_cargado_id:
                    try:
                        archivo = Archivo(archivo_subido)
                        if not archivo.es_sql():
                            st.error("La extensión del archivo debe ser `.sql`.")
                        else:
                            st.session_state.codigo_sql = archivo.leer()
                            st.session_state.archivo_info = archivo.obtener_info()
                            st.session_state.archivo_cargado_id = identificador
                            st.session_state.resultado = None
                    except (UnicodeDecodeError, ValueError) as error:
                        st.error(str(error))

            st.divider()
            ejemplo = st.selectbox("Ejemplos", list(EJEMPLOS))
            if st.button("Cargar ejemplo", use_container_width=True):
                st.session_state.codigo_sql = EJEMPLOS[ejemplo]
                st.session_state.archivo_info = None
                st.session_state.archivo_cargado_id = None
                st.session_state.resultado = None
                st.rerun()

            st.divider()
            st.markdown("**Sentencias contempladas**")
            st.caption(
                "CREATE TABLE · INSERT · SELECT · UPDATE · DELETE · "
                "CREATE INDEX · CREATE VIEW · DROP TABLE · transacciones · "
                "procedimientos y triggers limitados."
            )
            st.info(
                "Cada sentencia debe respetar exactamente las reglas definidas "
                "en tu gramática y terminar con `;`."
            )

    @staticmethod
    def _limpiar():
        st.session_state.codigo_sql = ""
        st.session_state.resultado = None
        st.session_state.archivo_info = None
        st.session_state.archivo_cargado_id = None

    @staticmethod
    def _renderizar_contexto():
        st.subheader("Sesión")

        info = st.session_state.archivo_info
        if info:
            st.markdown(f"**Archivo:** `{info['nombre']}`")
            st.markdown(f"**Extensión:** `{info['extension']}`")
            if info.get("tamano_bytes") is not None:
                st.markdown(f"**Tamaño:** `{info['tamano_bytes']:,} bytes`")
        else:
            st.markdown("**Origen:** editor manual")

        codigo = st.session_state.codigo_sql
        st.metric("Líneas actuales", len(codigo.splitlines()) if codigo else 0)
        st.metric("Caracteres", len(codigo))

        st.markdown("**Flujo de análisis**")
        st.caption(
            "1. ExprLexer genera los tokens.\n\n"
            "2. Los listeners capturan errores.\n\n"
            "3. ExprParser valida la estructura.\n\n"
            "4. Streamlit presenta el diagnóstico."
        )

    def _renderizar_resultado(self, resultado: dict):
        st.divider()
        st.subheader("Resultado de la validación")

        if resultado["valido"]:
            st.markdown(
                '<div class="status-valid">✓ El código pertenece al lenguaje definido por la gramática.</div>',
                unsafe_allow_html=True,
            )
        else:
            st.markdown(
                '<div class="status-invalid">✕ El código contiene errores léxicos, sintácticos o semánticos.</div>',
                unsafe_allow_html=True,
            )

        resumen = resultado["resumen"]
        metricas = st.columns(7)
        valores = [
            ("Líneas", resumen["lineas"]),
            ("Tokens", resumen["tokens"]),
            ("Sentencias", resumen["sentencias"]),
            ("Errores léxicos", resumen["errores_lexicos"]),
            ("Errores sintácticos", resumen["errores_sintacticos"]),
            ("Errores semánticos", resumen.get("errores_semanticos", 0)),
            ("Caracteres", resumen["caracteres"]),
        ]
        for columna, (etiqueta, valor) in zip(metricas, valores):
            columna.metric(etiqueta, valor)

        tab_resumen, tab_tokens, tab_errores, tab_arbol, tab_reporte = st.tabs(
            ["Resumen", "Tokens", "Errores", "Árbol sintáctico", "Reporte"]
        )

        with tab_resumen:
            sentencias = resultado["sentencias"]
            if sentencias:
                st.dataframe(
                    sentencias,
                    use_container_width=True,
                    hide_index=True,
                )
            else:
                st.info("No se identificaron sentencias.")

        with tab_tokens:
            if resultado["tokens"]:
                st.dataframe(
                    resultado["tokens"],
                    use_container_width=True,
                    hide_index=True,
                    height=460,
                )
            else:
                st.warning("No se generaron tokens.")

        with tab_errores:
            if resultado["errores"]:
                st.dataframe(
                    resultado["errores"],
                    use_container_width=True,
                    hide_index=True,
                )
                primer_error = resultado["errores"][0]
                st.error(
                    f"Primer error: línea {primer_error['linea']}, "
                    f"columna {primer_error['columna']} — {primer_error['mensaje']}"
                )
            else:
                st.success("El lexer y el parser finalizaron sin errores.")

        with tab_arbol:
            if resultado["arboles"]:
                for arbol in resultado["arboles"]:
                    with st.expander(
                        f"Sentencia {arbol['#']} · {arbol['regla']}",
                        expanded=arbol["#"] == 1,
                    ):
                        st.code(arbol["arbol"], language="text")
            else:
                st.info("No se generó un árbol sintáctico.")

        with tab_reporte:
            reporte_json = json.dumps(resultado, ensure_ascii=False, indent=2)
            st.download_button(
                "Descargar reporte JSON",
                data=reporte_json,
                file_name="reporte_analisis_sql.json",
                mime="application/json",
                use_container_width=True,
            )
            st.code(reporte_json, language="json")


if __name__ == "__main__":
    App().ejecutar()
