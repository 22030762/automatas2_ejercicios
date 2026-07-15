# Generated from ./Expr.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .ExprParser import ExprParser
else:
    from ExprParser import ExprParser

# This class defines a complete listener for a parse tree produced by ExprParser.
class ExprListener(ParseTreeListener):

    # Enter a parse tree produced by ExprParser#root.
    def enterRoot(self, ctx:ExprParser.RootContext):
        pass

    # Exit a parse tree produced by ExprParser#root.
    def exitRoot(self, ctx:ExprParser.RootContext):
        pass


    # Enter a parse tree produced by ExprParser#expr.
    def enterExpr(self, ctx:ExprParser.ExprContext):
        pass

    # Exit a parse tree produced by ExprParser#expr.
    def exitExpr(self, ctx:ExprParser.ExprContext):
        pass


    # Enter a parse tree produced by ExprParser#transaccion.
    def enterTransaccion(self, ctx:ExprParser.TransaccionContext):
        pass

    # Exit a parse tree produced by ExprParser#transaccion.
    def exitTransaccion(self, ctx:ExprParser.TransaccionContext):
        pass


    # Enter a parse tree produced by ExprParser#crearTabla.
    def enterCrearTabla(self, ctx:ExprParser.CrearTablaContext):
        pass

    # Exit a parse tree produced by ExprParser#crearTabla.
    def exitCrearTabla(self, ctx:ExprParser.CrearTablaContext):
        pass


    # Enter a parse tree produced by ExprParser#listaElementosTabla.
    def enterListaElementosTabla(self, ctx:ExprParser.ListaElementosTablaContext):
        pass

    # Exit a parse tree produced by ExprParser#listaElementosTabla.
    def exitListaElementosTabla(self, ctx:ExprParser.ListaElementosTablaContext):
        pass


    # Enter a parse tree produced by ExprParser#elementoTabla.
    def enterElementoTabla(self, ctx:ExprParser.ElementoTablaContext):
        pass

    # Exit a parse tree produced by ExprParser#elementoTabla.
    def exitElementoTabla(self, ctx:ExprParser.ElementoTablaContext):
        pass


    # Enter a parse tree produced by ExprParser#definirColumna.
    def enterDefinirColumna(self, ctx:ExprParser.DefinirColumnaContext):
        pass

    # Exit a parse tree produced by ExprParser#definirColumna.
    def exitDefinirColumna(self, ctx:ExprParser.DefinirColumnaContext):
        pass


    # Enter a parse tree produced by ExprParser#restriccionColumna.
    def enterRestriccionColumna(self, ctx:ExprParser.RestriccionColumnaContext):
        pass

    # Exit a parse tree produced by ExprParser#restriccionColumna.
    def exitRestriccionColumna(self, ctx:ExprParser.RestriccionColumnaContext):
        pass


    # Enter a parse tree produced by ExprParser#restriccionTabla.
    def enterRestriccionTabla(self, ctx:ExprParser.RestriccionTablaContext):
        pass

    # Exit a parse tree produced by ExprParser#restriccionTabla.
    def exitRestriccionTabla(self, ctx:ExprParser.RestriccionTablaContext):
        pass


    # Enter a parse tree produced by ExprParser#restriccionEspecifica.
    def enterRestriccionEspecifica(self, ctx:ExprParser.RestriccionEspecificaContext):
        pass

    # Exit a parse tree produced by ExprParser#restriccionEspecifica.
    def exitRestriccionEspecifica(self, ctx:ExprParser.RestriccionEspecificaContext):
        pass


    # Enter a parse tree produced by ExprParser#tipoDato.
    def enterTipoDato(self, ctx:ExprParser.TipoDatoContext):
        pass

    # Exit a parse tree produced by ExprParser#tipoDato.
    def exitTipoDato(self, ctx:ExprParser.TipoDatoContext):
        pass


    # Enter a parse tree produced by ExprParser#insertarDatos.
    def enterInsertarDatos(self, ctx:ExprParser.InsertarDatosContext):
        pass

    # Exit a parse tree produced by ExprParser#insertarDatos.
    def exitInsertarDatos(self, ctx:ExprParser.InsertarDatosContext):
        pass


    # Enter a parse tree produced by ExprParser#listaIds.
    def enterListaIds(self, ctx:ExprParser.ListaIdsContext):
        pass

    # Exit a parse tree produced by ExprParser#listaIds.
    def exitListaIds(self, ctx:ExprParser.ListaIdsContext):
        pass


    # Enter a parse tree produced by ExprParser#listaValores.
    def enterListaValores(self, ctx:ExprParser.ListaValoresContext):
        pass

    # Exit a parse tree produced by ExprParser#listaValores.
    def exitListaValores(self, ctx:ExprParser.ListaValoresContext):
        pass


    # Enter a parse tree produced by ExprParser#valor.
    def enterValor(self, ctx:ExprParser.ValorContext):
        pass

    # Exit a parse tree produced by ExprParser#valor.
    def exitValor(self, ctx:ExprParser.ValorContext):
        pass


    # Enter a parse tree produced by ExprParser#consultaSelect.
    def enterConsultaSelect(self, ctx:ExprParser.ConsultaSelectContext):
        pass

    # Exit a parse tree produced by ExprParser#consultaSelect.
    def exitConsultaSelect(self, ctx:ExprParser.ConsultaSelectContext):
        pass


    # Enter a parse tree produced by ExprParser#listaSeleccion.
    def enterListaSeleccion(self, ctx:ExprParser.ListaSeleccionContext):
        pass

    # Exit a parse tree produced by ExprParser#listaSeleccion.
    def exitListaSeleccion(self, ctx:ExprParser.ListaSeleccionContext):
        pass


    # Enter a parse tree produced by ExprParser#itemSeleccion.
    def enterItemSeleccion(self, ctx:ExprParser.ItemSeleccionContext):
        pass

    # Exit a parse tree produced by ExprParser#itemSeleccion.
    def exitItemSeleccion(self, ctx:ExprParser.ItemSeleccionContext):
        pass


    # Enter a parse tree produced by ExprParser#origen.
    def enterOrigen(self, ctx:ExprParser.OrigenContext):
        pass

    # Exit a parse tree produced by ExprParser#origen.
    def exitOrigen(self, ctx:ExprParser.OrigenContext):
        pass


    # Enter a parse tree produced by ExprParser#alias.
    def enterAlias(self, ctx:ExprParser.AliasContext):
        pass

    # Exit a parse tree produced by ExprParser#alias.
    def exitAlias(self, ctx:ExprParser.AliasContext):
        pass


    # Enter a parse tree produced by ExprParser#condicionWhere.
    def enterCondicionWhere(self, ctx:ExprParser.CondicionWhereContext):
        pass

    # Exit a parse tree produced by ExprParser#condicionWhere.
    def exitCondicionWhere(self, ctx:ExprParser.CondicionWhereContext):
        pass


    # Enter a parse tree produced by ExprParser#agrupamiento.
    def enterAgrupamiento(self, ctx:ExprParser.AgrupamientoContext):
        pass

    # Exit a parse tree produced by ExprParser#agrupamiento.
    def exitAgrupamiento(self, ctx:ExprParser.AgrupamientoContext):
        pass


    # Enter a parse tree produced by ExprParser#condicion.
    def enterCondicion(self, ctx:ExprParser.CondicionContext):
        pass

    # Exit a parse tree produced by ExprParser#condicion.
    def exitCondicion(self, ctx:ExprParser.CondicionContext):
        pass


    # Enter a parse tree produced by ExprParser#expresion.
    def enterExpresion(self, ctx:ExprParser.ExpresionContext):
        pass

    # Exit a parse tree produced by ExprParser#expresion.
    def exitExpresion(self, ctx:ExprParser.ExpresionContext):
        pass


    # Enter a parse tree produced by ExprParser#operadorComparacion.
    def enterOperadorComparacion(self, ctx:ExprParser.OperadorComparacionContext):
        pass

    # Exit a parse tree produced by ExprParser#operadorComparacion.
    def exitOperadorComparacion(self, ctx:ExprParser.OperadorComparacionContext):
        pass


    # Enter a parse tree produced by ExprParser#ordenamiento.
    def enterOrdenamiento(self, ctx:ExprParser.OrdenamientoContext):
        pass

    # Exit a parse tree produced by ExprParser#ordenamiento.
    def exitOrdenamiento(self, ctx:ExprParser.OrdenamientoContext):
        pass


    # Enter a parse tree produced by ExprParser#itemOrden.
    def enterItemOrden(self, ctx:ExprParser.ItemOrdenContext):
        pass

    # Exit a parse tree produced by ExprParser#itemOrden.
    def exitItemOrden(self, ctx:ExprParser.ItemOrdenContext):
        pass


    # Enter a parse tree produced by ExprParser#limite.
    def enterLimite(self, ctx:ExprParser.LimiteContext):
        pass

    # Exit a parse tree produced by ExprParser#limite.
    def exitLimite(self, ctx:ExprParser.LimiteContext):
        pass


    # Enter a parse tree produced by ExprParser#actualizarDatos.
    def enterActualizarDatos(self, ctx:ExprParser.ActualizarDatosContext):
        pass

    # Exit a parse tree produced by ExprParser#actualizarDatos.
    def exitActualizarDatos(self, ctx:ExprParser.ActualizarDatosContext):
        pass


    # Enter a parse tree produced by ExprParser#listaAsignaciones.
    def enterListaAsignaciones(self, ctx:ExprParser.ListaAsignacionesContext):
        pass

    # Exit a parse tree produced by ExprParser#listaAsignaciones.
    def exitListaAsignaciones(self, ctx:ExprParser.ListaAsignacionesContext):
        pass


    # Enter a parse tree produced by ExprParser#asignacion.
    def enterAsignacion(self, ctx:ExprParser.AsignacionContext):
        pass

    # Exit a parse tree produced by ExprParser#asignacion.
    def exitAsignacion(self, ctx:ExprParser.AsignacionContext):
        pass


    # Enter a parse tree produced by ExprParser#eliminarDatos.
    def enterEliminarDatos(self, ctx:ExprParser.EliminarDatosContext):
        pass

    # Exit a parse tree produced by ExprParser#eliminarDatos.
    def exitEliminarDatos(self, ctx:ExprParser.EliminarDatosContext):
        pass


    # Enter a parse tree produced by ExprParser#crearIndice.
    def enterCrearIndice(self, ctx:ExprParser.CrearIndiceContext):
        pass

    # Exit a parse tree produced by ExprParser#crearIndice.
    def exitCrearIndice(self, ctx:ExprParser.CrearIndiceContext):
        pass


    # Enter a parse tree produced by ExprParser#crearVista.
    def enterCrearVista(self, ctx:ExprParser.CrearVistaContext):
        pass

    # Exit a parse tree produced by ExprParser#crearVista.
    def exitCrearVista(self, ctx:ExprParser.CrearVistaContext):
        pass


    # Enter a parse tree produced by ExprParser#eliminarTabla.
    def enterEliminarTabla(self, ctx:ExprParser.EliminarTablaContext):
        pass

    # Exit a parse tree produced by ExprParser#eliminarTabla.
    def exitEliminarTabla(self, ctx:ExprParser.EliminarTablaContext):
        pass


    # Enter a parse tree produced by ExprParser#nombreTabla.
    def enterNombreTabla(self, ctx:ExprParser.NombreTablaContext):
        pass

    # Exit a parse tree produced by ExprParser#nombreTabla.
    def exitNombreTabla(self, ctx:ExprParser.NombreTablaContext):
        pass


    # Enter a parse tree produced by ExprParser#crearProcedimiento.
    def enterCrearProcedimiento(self, ctx:ExprParser.CrearProcedimientoContext):
        pass

    # Exit a parse tree produced by ExprParser#crearProcedimiento.
    def exitCrearProcedimiento(self, ctx:ExprParser.CrearProcedimientoContext):
        pass


    # Enter a parse tree produced by ExprParser#crearTrigger.
    def enterCrearTrigger(self, ctx:ExprParser.CrearTriggerContext):
        pass

    # Exit a parse tree produced by ExprParser#crearTrigger.
    def exitCrearTrigger(self, ctx:ExprParser.CrearTriggerContext):
        pass



del ExprParser