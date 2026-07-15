from ExprListener import ExprListener

class listenerSemantico(ExprListener):
    def __init__(self):
        super().__init__()
        self.errores: list[dict] = []

    def enterCrearTabla(self, c):
        """
        Valida que no existan columnas con el mismo nombre en la tabla.
        """
        columnas_vistas = set()
        
        lista_elementos = c.listaElementosTabla()
        if not lista_elementos:
            return

        # Iteramos sobre cada elemento definido en la tabla
        for elemento in lista_elementos.elementoTabla():
            definicion_columna = elemento.definirColumna()
            if definicion_columna:
                # El primer token ID corresponde al nombre de la columna
                token_id = definicion_columna.ID()
                nombre_columna = token_id.getText().lower() # Case-insensitive
                
                if nombre_columna in columnas_vistas:
                    # Capturamos el error semántico indicando línea y columna exacta
                    self.errores.append({
                        "tipo_error": "Semántico",
                        "linea": token_id.getSymbol().line,
                        "columna": token_id.getSymbol().column,
                        "simbolo": token_id.getText(),
                        "mensaje": f"La columna '{token_id.getText()}' ya ha sido definida en esta tabla."
                    })
                else:
                    columnas_vistas.add(nombre_columna)