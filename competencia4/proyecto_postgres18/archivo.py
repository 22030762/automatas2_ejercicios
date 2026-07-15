from __future__ import annotations

import os


class Archivo:
    """Helper para validar y leer archivos SQL cargados desde Streamlit."""

    EXTENSIONES_PERMITIDAS = {".sql"}

    def __init__(self, archivo_subido):
        self.archivo_subido = archivo_subido
        self.nombre = archivo_subido.name

    def obtener_extension(self) -> str:
        return os.path.splitext(self.nombre)[1].lower()

    def es_sql(self) -> bool:
        return self.obtener_extension() in self.EXTENSIONES_PERMITIDAS

    # Se conserva para no romper el código que ya utilizaba este método.
    def es_txt(self) -> bool:
        return self.es_sql()

    def leer(self) -> str:
        """Lee el archivo sin depender de la posición actual del cursor."""
        if hasattr(self.archivo_subido, "getvalue"):
            contenido_bytes = self.archivo_subido.getvalue()
        else:
            self.archivo_subido.seek(0)
            contenido_bytes = self.archivo_subido.read()

        if isinstance(contenido_bytes, str):
            return contenido_bytes

        for codificacion in ("utf-8-sig", "utf-8", "latin-1"):
            try:
                return contenido_bytes.decode(codificacion)
            except UnicodeDecodeError:
                continue

        raise ValueError("No fue posible identificar la codificación del archivo.")

    def obtener_info(self) -> dict:
        tamano = getattr(self.archivo_subido, "size", None)
        return {
            "nombre": self.nombre,
            "extension": self.obtener_extension(),
            "tamano_bytes": tamano,
        }
