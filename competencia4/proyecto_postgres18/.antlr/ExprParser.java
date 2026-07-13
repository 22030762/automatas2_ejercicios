// Generated from d:/Descargas/automatas2_ejercicios/competencia4/proyecto_postgres18/Expr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CREATE=1, TABLE=2, DROP=3, INSERT=4, INTO=5, VALUES=6, SELECT=7, FROM=8, 
		WHERE=9, UPDATE=10, SET=11, DELETE=12, PRIMARY=13, KEY=14, FOREIGN=15, 
		REFERENCES=16, CONSTRAINT=17, NOT=18, NULL=19, UNIQUE=20, DEFAULT=21, 
		INNER=22, LEFT=23, RIGHT=24, JOIN=25, ON=26, AS=27, ORDER=28, BY=29, ASC=30, 
		DESC=31, LIMIT=32, OFFSET=33, AND=34, OR=35, IS=36, IN=37, BETWEEN=38, 
		LIKE=39, TRUE=40, FALSE=41, INDEX=42, VIEW=43, GROUP=44, HAVING=45, BEGIN=46, 
		START=47, TRANSACTION=48, COMMIT=49, ROLLBACK=50, PROCEDURE=51, REPLACE=52, 
		LANGUAGE=53, TRIGGER=54, BEFORE=55, AFTER=56, ROW=57, EXECUTE=58, FUNCTION=59, 
		FOR=60, EACH=61, SERIAL=62, INTEGER=63, BIGINT=64, SMALLINT=65, NUMERIC=66, 
		REAL=67, BOOLEAN=68, VARCHAR=69, CHAR=70, TEXT=71, DATE=72, TIME=73, TIMESTAMP=74, 
		BYTEA=75, JSON=76, JSONB=77, UUID=78, IGUAL=79, DIFERENTE=80, MENOR=81, 
		MAYOR=82, MENOR_IGUAL=83, MAYOR_IGUAL=84, MAS=85, MENOS=86, DIV=87, ASTERISCO=88, 
		PUNTO=89, PUNTO_COMA=90, COMA=91, PAR_IZQ=92, PAR_DER=93, DECIMAL=94, 
		NUM=95, CADENA=96, ID=97, COMENTARIO=98, COMENTARIO_BLOQUE=99, WS=100;
	public static final int
		RULE_root = 0, RULE_expr = 1, RULE_transaccion = 2, RULE_crearTabla = 3, 
		RULE_listaElementosTabla = 4, RULE_elementoTabla = 5, RULE_definirColumna = 6, 
		RULE_restriccionColumna = 7, RULE_restriccionTabla = 8, RULE_restriccionEspecifica = 9, 
		RULE_tipoDato = 10, RULE_insertarDatos = 11, RULE_listaIds = 12, RULE_listaValores = 13, 
		RULE_valor = 14, RULE_consultaSelect = 15, RULE_listaSeleccion = 16, RULE_itemSeleccion = 17, 
		RULE_origen = 18, RULE_alias = 19, RULE_condicionWhere = 20, RULE_agrupamiento = 21, 
		RULE_condicion = 22, RULE_expresion = 23, RULE_operadorComparacion = 24, 
		RULE_ordenamiento = 25, RULE_itemOrden = 26, RULE_limite = 27, RULE_actualizarDatos = 28, 
		RULE_listaAsignaciones = 29, RULE_asignacion = 30, RULE_eliminarDatos = 31, 
		RULE_crearIndice = 32, RULE_crearVista = 33, RULE_eliminarTabla = 34, 
		RULE_nombreTabla = 35, RULE_crearProcedimiento = 36, RULE_crearTrigger = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "expr", "transaccion", "crearTabla", "listaElementosTabla", "elementoTabla", 
			"definirColumna", "restriccionColumna", "restriccionTabla", "restriccionEspecifica", 
			"tipoDato", "insertarDatos", "listaIds", "listaValores", "valor", "consultaSelect", 
			"listaSeleccion", "itemSeleccion", "origen", "alias", "condicionWhere", 
			"agrupamiento", "condicion", "expresion", "operadorComparacion", "ordenamiento", 
			"itemOrden", "limite", "actualizarDatos", "listaAsignaciones", "asignacion", 
			"eliminarDatos", "crearIndice", "crearVista", "eliminarTabla", "nombreTabla", 
			"crearProcedimiento", "crearTrigger"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'='", "'<>'", "'<'", "'>'", 
			"'<='", "'>='", "'+'", "'-'", "'/'", "'*'", "'.'", "';'", "','", "'('", 
			"')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CREATE", "TABLE", "DROP", "INSERT", "INTO", "VALUES", "SELECT", 
			"FROM", "WHERE", "UPDATE", "SET", "DELETE", "PRIMARY", "KEY", "FOREIGN", 
			"REFERENCES", "CONSTRAINT", "NOT", "NULL", "UNIQUE", "DEFAULT", "INNER", 
			"LEFT", "RIGHT", "JOIN", "ON", "AS", "ORDER", "BY", "ASC", "DESC", "LIMIT", 
			"OFFSET", "AND", "OR", "IS", "IN", "BETWEEN", "LIKE", "TRUE", "FALSE", 
			"INDEX", "VIEW", "GROUP", "HAVING", "BEGIN", "START", "TRANSACTION", 
			"COMMIT", "ROLLBACK", "PROCEDURE", "REPLACE", "LANGUAGE", "TRIGGER", 
			"BEFORE", "AFTER", "ROW", "EXECUTE", "FUNCTION", "FOR", "EACH", "SERIAL", 
			"INTEGER", "BIGINT", "SMALLINT", "NUMERIC", "REAL", "BOOLEAN", "VARCHAR", 
			"CHAR", "TEXT", "DATE", "TIME", "TIMESTAMP", "BYTEA", "JSON", "JSONB", 
			"UUID", "IGUAL", "DIFERENTE", "MENOR", "MAYOR", "MENOR_IGUAL", "MAYOR_IGUAL", 
			"MAS", "MENOS", "DIV", "ASTERISCO", "PUNTO", "PUNTO_COMA", "COMA", "PAR_IZQ", 
			"PAR_DER", "DECIMAL", "NUM", "CADENA", "ID", "COMENTARIO", "COMENTARIO_BLOQUE", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RootContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ExprParser.EOF, 0); }
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			expr();
			setState(77);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public CrearTablaContext crearTabla() {
			return getRuleContext(CrearTablaContext.class,0);
		}
		public InsertarDatosContext insertarDatos() {
			return getRuleContext(InsertarDatosContext.class,0);
		}
		public ConsultaSelectContext consultaSelect() {
			return getRuleContext(ConsultaSelectContext.class,0);
		}
		public ActualizarDatosContext actualizarDatos() {
			return getRuleContext(ActualizarDatosContext.class,0);
		}
		public EliminarDatosContext eliminarDatos() {
			return getRuleContext(EliminarDatosContext.class,0);
		}
		public CrearIndiceContext crearIndice() {
			return getRuleContext(CrearIndiceContext.class,0);
		}
		public CrearVistaContext crearVista() {
			return getRuleContext(CrearVistaContext.class,0);
		}
		public EliminarTablaContext eliminarTabla() {
			return getRuleContext(EliminarTablaContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				crearTabla();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				insertarDatos();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				consultaSelect();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				actualizarDatos();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(83);
				eliminarDatos();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(84);
				crearIndice();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(85);
				crearVista();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(86);
				eliminarTabla();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TransaccionContext extends ParserRuleContext {
		public List<TerminalNode> PUNTO_COMA() { return getTokens(ExprParser.PUNTO_COMA); }
		public TerminalNode PUNTO_COMA(int i) {
			return getToken(ExprParser.PUNTO_COMA, i);
		}
		public TerminalNode COMMIT() { return getToken(ExprParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(ExprParser.ROLLBACK, 0); }
		public TerminalNode BEGIN() { return getToken(ExprParser.BEGIN, 0); }
		public TerminalNode START() { return getToken(ExprParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(ExprParser.TRANSACTION, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TransaccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transaccion; }
	}

	public final TransaccionContext transaccion() throws RecognitionException {
		TransaccionContext _localctx = new TransaccionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_transaccion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				setState(89);
				match(BEGIN);
				}
				break;
			case START:
				{
				setState(90);
				match(START);
				setState(91);
				match(TRANSACTION);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(94);
			match(PUNTO_COMA);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5274L) != 0)) {
				{
				{
				setState(95);
				expr();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			_la = _input.LA(1);
			if ( !(_la==COMMIT || _la==ROLLBACK) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(102);
			match(PUNTO_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CrearTablaContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(ExprParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(ExprParser.TABLE, 0); }
		public NombreTablaContext nombreTabla() {
			return getRuleContext(NombreTablaContext.class,0);
		}
		public TerminalNode PAR_IZQ() { return getToken(ExprParser.PAR_IZQ, 0); }
		public ListaElementosTablaContext listaElementosTabla() {
			return getRuleContext(ListaElementosTablaContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(ExprParser.PAR_DER, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(ExprParser.PUNTO_COMA, 0); }
		public CrearTablaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crearTabla; }
	}

	public final CrearTablaContext crearTabla() throws RecognitionException {
		CrearTablaContext _localctx = new CrearTablaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_crearTabla);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(CREATE);
			setState(105);
			match(TABLE);
			setState(106);
			nombreTabla();
			setState(107);
			match(PAR_IZQ);
			setState(108);
			listaElementosTabla();
			setState(109);
			match(PAR_DER);
			setState(110);
			match(PUNTO_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaElementosTablaContext extends ParserRuleContext {
		public List<ElementoTablaContext> elementoTabla() {
			return getRuleContexts(ElementoTablaContext.class);
		}
		public ElementoTablaContext elementoTabla(int i) {
			return getRuleContext(ElementoTablaContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(ExprParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ExprParser.COMA, i);
		}
		public ListaElementosTablaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaElementosTabla; }
	}

	public final ListaElementosTablaContext listaElementosTabla() throws RecognitionException {
		ListaElementosTablaContext _localctx = new ListaElementosTablaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_listaElementosTabla);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			elementoTabla();
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(113);
				match(COMA);
				setState(114);
				elementoTabla();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementoTablaContext extends ParserRuleContext {
		public DefinirColumnaContext definirColumna() {
			return getRuleContext(DefinirColumnaContext.class,0);
		}
		public RestriccionTablaContext restriccionTabla() {
			return getRuleContext(RestriccionTablaContext.class,0);
		}
		public ElementoTablaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementoTabla; }
	}

	public final ElementoTablaContext elementoTabla() throws RecognitionException {
		ElementoTablaContext _localctx = new ElementoTablaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elementoTabla);
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				definirColumna();
				}
				break;
			case PRIMARY:
			case FOREIGN:
			case CONSTRAINT:
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				restriccionTabla();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefinirColumnaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TipoDatoContext tipoDato() {
			return getRuleContext(TipoDatoContext.class,0);
		}
		public List<RestriccionColumnaContext> restriccionColumna() {
			return getRuleContexts(RestriccionColumnaContext.class);
		}
		public RestriccionColumnaContext restriccionColumna(int i) {
			return getRuleContext(RestriccionColumnaContext.class,i);
		}
		public DefinirColumnaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definirColumna; }
	}

	public final DefinirColumnaContext definirColumna() throws RecognitionException {
		DefinirColumnaContext _localctx = new DefinirColumnaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_definirColumna);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(ID);
			setState(125);
			tipoDato();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3481600L) != 0)) {
				{
				{
				setState(126);
				restriccionColumna();
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RestriccionColumnaContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(ExprParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(ExprParser.KEY, 0); }
		public TerminalNode NOT() { return getToken(ExprParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(ExprParser.NULL, 0); }
		public TerminalNode UNIQUE() { return getToken(ExprParser.UNIQUE, 0); }
		public TerminalNode DEFAULT() { return getToken(ExprParser.DEFAULT, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TerminalNode REFERENCES() { return getToken(ExprParser.REFERENCES, 0); }
		public NombreTablaContext nombreTabla() {
			return getRuleContext(NombreTablaContext.class,0);
		}
		public TerminalNode PAR_IZQ() { return getToken(ExprParser.PAR_IZQ, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode PAR_DER() { return getToken(ExprParser.PAR_DER, 0); }
		public RestriccionColumnaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restriccionColumna; }
	}

	public final RestriccionColumnaContext restriccionColumna() throws RecognitionException {
		RestriccionColumnaContext _localctx = new RestriccionColumnaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_restriccionColumna);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(PRIMARY);
				setState(133);
				match(KEY);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(NOT);
				setState(135);
				match(NULL);
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				match(UNIQUE);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				match(DEFAULT);
				setState(138);
				valor();
				}
				break;
			case REFERENCES:
				enterOuterAlt(_localctx, 5);
				{
				setState(139);
				match(REFERENCES);
				setState(140);
				nombreTabla();
				setState(141);
				match(PAR_IZQ);
				setState(142);
				match(ID);
				setState(143);
				match(PAR_DER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RestriccionTablaContext extends ParserRuleContext {
		public TerminalNode CONSTRAINT() { return getToken(ExprParser.CONSTRAINT, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public RestriccionEspecificaContext restriccionEspecifica() {
			return getRuleContext(RestriccionEspecificaContext.class,0);
		}
		public RestriccionTablaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restriccionTabla; }
	}

	public final RestriccionTablaContext restriccionTabla() throws RecognitionException {
		RestriccionTablaContext _localctx = new RestriccionTablaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_restriccionTabla);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSTRAINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(CONSTRAINT);
				setState(148);
				match(ID);
				setState(149);
				restriccionEspecifica();
				}
				break;
			case PRIMARY:
			case FOREIGN:
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				restriccionEspecifica();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RestriccionEspecificaContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(ExprParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(ExprParser.KEY, 0); }
		public List<TerminalNode> PAR_IZQ() { return getTokens(ExprParser.PAR_IZQ); }
		public TerminalNode PAR_IZQ(int i) {
			return getToken(ExprParser.PAR_IZQ, i);
		}
		public List<ListaIdsContext> listaIds() {
			return getRuleContexts(ListaIdsContext.class);
		}
		public ListaIdsContext listaIds(int i) {
			return getRuleContext(ListaIdsContext.class,i);
		}
		public List<TerminalNode> PAR_DER() { return getTokens(ExprParser.PAR_DER); }
		public TerminalNode PAR_DER(int i) {
			return getToken(ExprParser.PAR_DER, i);
		}
		public TerminalNode FOREIGN() { return getToken(ExprParser.FOREIGN, 0); }
		public TerminalNode REFERENCES() { return getToken(ExprParser.REFERENCES, 0); }
		public NombreTablaContext nombreTabla() {
			return getRuleContext(NombreTablaContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(ExprParser.UNIQUE, 0); }
		public RestriccionEspecificaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restriccionEspecifica; }
	}

	public final RestriccionEspecificaContext restriccionEspecifica() throws RecognitionException {
		RestriccionEspecificaContext _localctx = new RestriccionEspecificaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_restriccionEspecifica);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(PRIMARY);
				setState(154);
				match(KEY);
				setState(155);
				match(PAR_IZQ);
				setState(156);
				listaIds();
				setState(157);
				match(PAR_DER);
				}
				break;
			case FOREIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(FOREIGN);
				setState(160);
				match(KEY);
				setState(161);
				match(PAR_IZQ);
				setState(162);
				listaIds();
				setState(163);
				match(PAR_DER);
				setState(164);
				match(REFERENCES);
				setState(165);
				nombreTabla();
				setState(166);
				match(PAR_IZQ);
				setState(167);
				listaIds();
				setState(168);
				match(PAR_DER);
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				match(UNIQUE);
				setState(171);
				match(PAR_IZQ);
				setState(172);
				listaIds();
				setState(173);
				match(PAR_DER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoDatoContext extends ParserRuleContext {
		public TerminalNode SERIAL() { return getToken(ExprParser.SERIAL, 0); }
		public TerminalNode INTEGER() { return getToken(ExprParser.INTEGER, 0); }
		public TerminalNode BIGINT() { return getToken(ExprParser.BIGINT, 0); }
		public TerminalNode SMALLINT() { return getToken(ExprParser.SMALLINT, 0); }
		public TerminalNode NUMERIC() { return getToken(ExprParser.NUMERIC, 0); }
		public TerminalNode PAR_IZQ() { return getToken(ExprParser.PAR_IZQ, 0); }
		public List<TerminalNode> NUM() { return getTokens(ExprParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(ExprParser.NUM, i);
		}
		public TerminalNode COMA() { return getToken(ExprParser.COMA, 0); }
		public TerminalNode PAR_DER() { return getToken(ExprParser.PAR_DER, 0); }
		public TerminalNode REAL() { return getToken(ExprParser.REAL, 0); }
		public TerminalNode BOOLEAN() { return getToken(ExprParser.BOOLEAN, 0); }
		public TerminalNode VARCHAR() { return getToken(ExprParser.VARCHAR, 0); }
		public TerminalNode CHAR() { return getToken(ExprParser.CHAR, 0); }
		public TerminalNode TEXT() { return getToken(ExprParser.TEXT, 0); }
		public TerminalNode DATE() { return getToken(ExprParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(ExprParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(ExprParser.TIMESTAMP, 0); }
		public TerminalNode BYTEA() { return getToken(ExprParser.BYTEA, 0); }
		public TerminalNode JSON() { return getToken(ExprParser.JSON, 0); }
		public TerminalNode JSONB() { return getToken(ExprParser.JSONB, 0); }
		public TerminalNode UUID() { return getToken(ExprParser.UUID, 0); }
		public TipoDatoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoDato; }
	}

	public final TipoDatoContext tipoDato() throws RecognitionException {
		TipoDatoContext _localctx = new TipoDatoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tipoDato);
		try {
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(SERIAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				match(INTEGER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				match(BIGINT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(180);
				match(SMALLINT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(181);
				match(NUMERIC);
				setState(182);
				match(PAR_IZQ);
				setState(183);
				match(NUM);
				setState(184);
				match(COMA);
				setState(185);
				match(NUM);
				setState(186);
				match(PAR_DER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(187);
				match(NUMERIC);
				setState(188);
				match(PAR_IZQ);
				setState(189);
				match(NUM);
				setState(190);
				match(PAR_DER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(191);
				match(REAL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(192);
				match(BOOLEAN);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(193);
				match(VARCHAR);
				setState(194);
				match(PAR_IZQ);
				setState(195);
				match(NUM);
				setState(196);
				match(PAR_DER);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(197);
				match(CHAR);
				setState(198);
				match(PAR_IZQ);
				setState(199);
				match(NUM);
				setState(200);
				match(PAR_DER);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(201);
				match(TEXT);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(202);
				match(DATE);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(203);
				match(TIME);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(204);
				match(TIMESTAMP);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(205);
				match(BYTEA);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(206);
				match(JSON);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(207);
				match(JSONB);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(208);
				match(UUID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InsertarDatosContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(ExprParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(ExprParser.INTO, 0); }
		public NombreTablaContext nombreTabla() {
			return getRuleContext(NombreTablaContext.class,0);
		}
		public List<TerminalNode> PAR_IZQ() { return getTokens(ExprParser.PAR_IZQ); }
		public TerminalNode PAR_IZQ(int i) {
			return getToken(ExprParser.PAR_IZQ, i);
		}
		public ListaIdsContext listaIds() {
			return getRuleContext(ListaIdsContext.class,0);
		}
		public List<TerminalNode> PAR_DER() { return getTokens(ExprParser.PAR_DER); }
		public TerminalNode PAR_DER(int i) {
			return getToken(ExprParser.PAR_DER, i);
		}
		public TerminalNode VALUES() { return getToken(ExprParser.VALUES, 0); }
		public ListaValoresContext listaValores() {
			return getRuleContext(ListaValoresContext.class,0);
		}
		public TerminalNode PUNTO_COMA() { return getToken(ExprParser.PUNTO_COMA, 0); }
		public InsertarDatosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertarDatos; }
	}

	public final InsertarDatosContext insertarDatos() throws RecognitionException {
		InsertarDatosContext _localctx = new InsertarDatosContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_insertarDatos);
		try {
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(INSERT);
				setState(212);
				match(INTO);
				setState(213);
				nombreTabla();
				setState(214);
				match(PAR_IZQ);
				setState(215);
				listaIds();
				setState(216);
				match(PAR_DER);
				setState(217);
				match(VALUES);
				setState(218);
				match(PAR_IZQ);
				setState(219);
				listaValores();
				setState(220);
				match(PAR_DER);
				setState(221);
				match(PUNTO_COMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				match(INSERT);
				setState(224);
				match(INTO);
				setState(225);
				nombreTabla();
				setState(226);
				match(VALUES);
				setState(227);
				match(PAR_IZQ);
				setState(228);
				listaValores();
				setState(229);
				match(PAR_DER);
				setState(230);
				match(PUNTO_COMA);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaIdsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}
		public List<TerminalNode> COMA() { return getTokens(ExprParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ExprParser.COMA, i);
		}
		public ListaIdsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaIds; }
	}

	public final ListaIdsContext listaIds() throws RecognitionException {
		ListaIdsContext _localctx = new ListaIdsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_listaIds);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(ID);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(235);
				match(COMA);
				setState(236);
				match(ID);
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaValoresContext extends ParserRuleContext {
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(ExprParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ExprParser.COMA, i);
		}
		public ListaValoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaValores; }
	}

	public final ListaValoresContext listaValores() throws RecognitionException {
		ListaValoresContext _localctx = new ListaValoresContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_listaValores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			valor();
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(243);
				match(COMA);
				setState(244);
				valor();
				}
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValorContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(ExprParser.NUM, 0); }
		public TerminalNode DECIMAL() { return getToken(ExprParser.DECIMAL, 0); }
		public TerminalNode CADENA() { return getToken(ExprParser.CADENA, 0); }
		public TerminalNode TRUE() { return getToken(ExprParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ExprParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(ExprParser.NULL, 0); }
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_valor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3298535407616L) != 0) || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & 7L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConsultaSelectContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(ExprParser.SELECT, 0); }
		public ListaSeleccionContext listaSeleccion() {
			return getRuleContext(ListaSeleccionContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ExprParser.FROM, 0); }
		public OrigenContext origen() {
			return getRuleContext(OrigenContext.class,0);
		}
		public TerminalNode PUNTO_COMA() { return getToken(ExprParser.PUNTO_COMA, 0); }
		public CondicionWhereContext condicionWhere() {
			return getRuleContext(CondicionWhereContext.class,0);
		}
		public AgrupamientoContext agrupamiento() {
			return getRuleContext(AgrupamientoContext.class,0);
		}
		public OrdenamientoContext ordenamiento() {
			return getRuleContext(OrdenamientoContext.class,0);
		}
		public LimiteContext limite() {
			return getRuleContext(LimiteContext.class,0);
		}
		public ConsultaSelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consultaSelect; }
	}

	public final ConsultaSelectContext consultaSelect() throws RecognitionException {
		ConsultaSelectContext _localctx = new ConsultaSelectContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_consultaSelect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(SELECT);
			setState(253);
			listaSeleccion();
			setState(254);
			match(FROM);
			setState(255);
			origen(0);
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(256);
				condicionWhere();
				}
			}

			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(259);
				agrupamiento();
				}
			}

			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(262);
				ordenamiento();
				}
			}

			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(265);
				limite();
				}
			}

			setState(268);
			match(PUNTO_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaSeleccionContext extends ParserRuleContext {
		public TerminalNode ASTERISCO() { return getToken(ExprParser.ASTERISCO, 0); }
		public List<ItemSeleccionContext> itemSeleccion() {
			return getRuleContexts(ItemSeleccionContext.class);
		}
		public ItemSeleccionContext itemSeleccion(int i) {
			return getRuleContext(ItemSeleccionContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(ExprParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ExprParser.COMA, i);
		}
		public ListaSeleccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaSeleccion; }
	}

	public final ListaSeleccionContext listaSeleccion() throws RecognitionException {
		ListaSeleccionContext _localctx = new ListaSeleccionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_listaSeleccion);
		int _la;
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASTERISCO:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				match(ASTERISCO);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				itemSeleccion();
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(272);
					match(COMA);
					setState(273);
					itemSeleccion();
					}
					}
					setState(278);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ItemSeleccionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}
		public TerminalNode PUNTO() { return getToken(ExprParser.PUNTO, 0); }
		public TerminalNode ASTERISCO() { return getToken(ExprParser.ASTERISCO, 0); }
		public ItemSeleccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemSeleccion; }
	}

	public final ItemSeleccionContext itemSeleccion() throws RecognitionException {
		ItemSeleccionContext _localctx = new ItemSeleccionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_itemSeleccion);
		try {
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				match(ID);
				setState(282);
				match(PUNTO);
				setState(283);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(285);
				match(ID);
				setState(286);
				match(PUNTO);
				setState(287);
				match(ASTERISCO);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrigenContext extends ParserRuleContext {
		public NombreTablaContext nombreTabla() {
			return getRuleContext(NombreTablaContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public OrigenContext origen() {
			return getRuleContext(OrigenContext.class,0);
		}
		public TerminalNode INNER() { return getToken(ExprParser.INNER, 0); }
		public TerminalNode JOIN() { return getToken(ExprParser.JOIN, 0); }
		public TerminalNode ON() { return getToken(ExprParser.ON, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode LEFT() { return getToken(ExprParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(ExprParser.RIGHT, 0); }
		public OrigenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_origen; }
	}

	public final OrigenContext origen() throws RecognitionException {
		return origen(0);
	}

	private OrigenContext origen(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OrigenContext _localctx = new OrigenContext(_ctx, _parentState);
		OrigenContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_origen, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(291);
			nombreTabla();
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(292);
				alias();
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(327);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(325);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new OrigenContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_origen);
						setState(295);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(296);
						match(INNER);
						setState(297);
						match(JOIN);
						setState(298);
						nombreTabla();
						setState(300);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==AS || _la==ID) {
							{
							setState(299);
							alias();
							}
						}

						setState(302);
						match(ON);
						setState(303);
						condicion(0);
						}
						break;
					case 2:
						{
						_localctx = new OrigenContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_origen);
						setState(305);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(306);
						match(LEFT);
						setState(307);
						match(JOIN);
						setState(308);
						nombreTabla();
						setState(310);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==AS || _la==ID) {
							{
							setState(309);
							alias();
							}
						}

						setState(312);
						match(ON);
						setState(313);
						condicion(0);
						}
						break;
					case 3:
						{
						_localctx = new OrigenContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_origen);
						setState(315);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(316);
						match(RIGHT);
						setState(317);
						match(JOIN);
						setState(318);
						nombreTabla();
						setState(320);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==AS || _la==ID) {
							{
							setState(319);
							alias();
							}
						}

						setState(322);
						match(ON);
						setState(323);
						condicion(0);
						}
						break;
					}
					} 
				}
				setState(329);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AliasContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(ExprParser.AS, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_alias);
		try {
			setState(333);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AS:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				match(AS);
				setState(331);
				match(ID);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionWhereContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(ExprParser.WHERE, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public CondicionWhereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionWhere; }
	}

	public final CondicionWhereContext condicionWhere() throws RecognitionException {
		CondicionWhereContext _localctx = new CondicionWhereContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_condicionWhere);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(WHERE);
			setState(336);
			condicion(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AgrupamientoContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(ExprParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(ExprParser.BY, 0); }
		public ListaIdsContext listaIds() {
			return getRuleContext(ListaIdsContext.class,0);
		}
		public TerminalNode HAVING() { return getToken(ExprParser.HAVING, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public AgrupamientoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_agrupamiento; }
	}

	public final AgrupamientoContext agrupamiento() throws RecognitionException {
		AgrupamientoContext _localctx = new AgrupamientoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_agrupamiento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(GROUP);
			setState(339);
			match(BY);
			setState(340);
			listaIds();
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(341);
				match(HAVING);
				setState(342);
				condicion(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public OperadorComparacionContext operadorComparacion() {
			return getRuleContext(OperadorComparacionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(ExprParser.NOT, 0); }
		public List<CondicionContext> condicion() {
			return getRuleContexts(CondicionContext.class);
		}
		public CondicionContext condicion(int i) {
			return getRuleContext(CondicionContext.class,i);
		}
		public TerminalNode IS() { return getToken(ExprParser.IS, 0); }
		public TerminalNode NULL() { return getToken(ExprParser.NULL, 0); }
		public TerminalNode BETWEEN() { return getToken(ExprParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(ExprParser.AND, 0); }
		public TerminalNode LIKE() { return getToken(ExprParser.LIKE, 0); }
		public TerminalNode CADENA() { return getToken(ExprParser.CADENA, 0); }
		public TerminalNode IN() { return getToken(ExprParser.IN, 0); }
		public TerminalNode PAR_IZQ() { return getToken(ExprParser.PAR_IZQ, 0); }
		public ListaValoresContext listaValores() {
			return getRuleContext(ListaValoresContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(ExprParser.PAR_DER, 0); }
		public TerminalNode OR() { return getToken(ExprParser.OR, 0); }
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
	}

	public final CondicionContext condicion() throws RecognitionException {
		return condicion(0);
	}

	private CondicionContext condicion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondicionContext _localctx = new CondicionContext(_ctx, _parentState);
		CondicionContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_condicion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(346);
				expresion(0);
				setState(347);
				operadorComparacion();
				setState(348);
				expresion(0);
				}
				break;
			case 2:
				{
				setState(350);
				match(NOT);
				setState(351);
				condicion(7);
				}
				break;
			case 3:
				{
				setState(352);
				expresion(0);
				setState(353);
				match(IS);
				setState(354);
				match(NULL);
				}
				break;
			case 4:
				{
				setState(356);
				expresion(0);
				setState(357);
				match(IS);
				setState(358);
				match(NOT);
				setState(359);
				match(NULL);
				}
				break;
			case 5:
				{
				setState(361);
				expresion(0);
				setState(362);
				match(BETWEEN);
				setState(363);
				expresion(0);
				setState(364);
				match(AND);
				setState(365);
				expresion(0);
				}
				break;
			case 6:
				{
				setState(367);
				expresion(0);
				setState(368);
				match(LIKE);
				setState(369);
				match(CADENA);
				}
				break;
			case 7:
				{
				setState(371);
				expresion(0);
				setState(372);
				match(IN);
				setState(373);
				match(PAR_IZQ);
				setState(374);
				listaValores();
				setState(375);
				match(PAR_DER);
				}
				break;
			case 8:
				{
				setState(377);
				match(PAR_IZQ);
				setState(378);
				condicion(0);
				setState(379);
				match(PAR_DER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(391);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(389);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new CondicionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condicion);
						setState(383);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(384);
						match(AND);
						setState(385);
						condicion(10);
						}
						break;
					case 2:
						{
						_localctx = new CondicionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condicion);
						setState(386);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(387);
						match(OR);
						setState(388);
						condicion(9);
						}
						break;
					}
					} 
				}
				setState(393);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionContext extends ParserRuleContext {
		public TerminalNode PAR_IZQ() { return getToken(ExprParser.PAR_IZQ, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode PAR_DER() { return getToken(ExprParser.PAR_DER, 0); }
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}
		public TerminalNode PUNTO() { return getToken(ExprParser.PUNTO, 0); }
		public TerminalNode NUM() { return getToken(ExprParser.NUM, 0); }
		public TerminalNode DECIMAL() { return getToken(ExprParser.DECIMAL, 0); }
		public TerminalNode CADENA() { return getToken(ExprParser.CADENA, 0); }
		public TerminalNode TRUE() { return getToken(ExprParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ExprParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(ExprParser.NULL, 0); }
		public TerminalNode ASTERISCO() { return getToken(ExprParser.ASTERISCO, 0); }
		public TerminalNode DIV() { return getToken(ExprParser.DIV, 0); }
		public TerminalNode MAS() { return getToken(ExprParser.MAS, 0); }
		public TerminalNode MENOS() { return getToken(ExprParser.MENOS, 0); }
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	}

	public final ExpresionContext expresion() throws RecognitionException {
		return expresion(0);
	}

	private ExpresionContext expresion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionContext _localctx = new ExpresionContext(_ctx, _parentState);
		ExpresionContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_expresion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(395);
				match(PAR_IZQ);
				setState(396);
				expresion(0);
				setState(397);
				match(PAR_DER);
				}
				break;
			case 2:
				{
				setState(399);
				match(ID);
				setState(400);
				match(PUNTO);
				setState(401);
				match(ID);
				}
				break;
			case 3:
				{
				setState(402);
				match(ID);
				}
				break;
			case 4:
				{
				setState(403);
				match(NUM);
				}
				break;
			case 5:
				{
				setState(404);
				match(DECIMAL);
				}
				break;
			case 6:
				{
				setState(405);
				match(CADENA);
				}
				break;
			case 7:
				{
				setState(406);
				match(TRUE);
				}
				break;
			case 8:
				{
				setState(407);
				match(FALSE);
				}
				break;
			case 9:
				{
				setState(408);
				match(NULL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(425);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(423);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(411);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(412);
						match(ASTERISCO);
						setState(413);
						expresion(5);
						}
						break;
					case 2:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(414);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(415);
						match(DIV);
						setState(416);
						expresion(4);
						}
						break;
					case 3:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(417);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(418);
						match(MAS);
						setState(419);
						expresion(3);
						}
						break;
					case 4:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(420);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(421);
						match(MENOS);
						setState(422);
						expresion(2);
						}
						break;
					}
					} 
				}
				setState(427);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperadorComparacionContext extends ParserRuleContext {
		public TerminalNode IGUAL() { return getToken(ExprParser.IGUAL, 0); }
		public TerminalNode DIFERENTE() { return getToken(ExprParser.DIFERENTE, 0); }
		public TerminalNode MENOR() { return getToken(ExprParser.MENOR, 0); }
		public TerminalNode MAYOR() { return getToken(ExprParser.MAYOR, 0); }
		public TerminalNode MENOR_IGUAL() { return getToken(ExprParser.MENOR_IGUAL, 0); }
		public TerminalNode MAYOR_IGUAL() { return getToken(ExprParser.MAYOR_IGUAL, 0); }
		public OperadorComparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorComparacion; }
	}

	public final OperadorComparacionContext operadorComparacion() throws RecognitionException {
		OperadorComparacionContext _localctx = new OperadorComparacionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_operadorComparacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			_la = _input.LA(1);
			if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 63L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrdenamientoContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(ExprParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(ExprParser.BY, 0); }
		public List<ItemOrdenContext> itemOrden() {
			return getRuleContexts(ItemOrdenContext.class);
		}
		public ItemOrdenContext itemOrden(int i) {
			return getRuleContext(ItemOrdenContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(ExprParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ExprParser.COMA, i);
		}
		public OrdenamientoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordenamiento; }
	}

	public final OrdenamientoContext ordenamiento() throws RecognitionException {
		OrdenamientoContext _localctx = new OrdenamientoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ordenamiento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(ORDER);
			setState(431);
			match(BY);
			setState(432);
			itemOrden();
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(433);
				match(COMA);
				setState(434);
				itemOrden();
				}
				}
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ItemOrdenContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}
		public TerminalNode ASC() { return getToken(ExprParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(ExprParser.DESC, 0); }
		public TerminalNode PUNTO() { return getToken(ExprParser.PUNTO, 0); }
		public ItemOrdenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemOrden; }
	}

	public final ItemOrdenContext itemOrden() throws RecognitionException {
		ItemOrdenContext _localctx = new ItemOrdenContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_itemOrden);
		int _la;
		try {
			setState(450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(440);
				match(ID);
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASC || _la==DESC) {
					{
					setState(441);
					_la = _input.LA(1);
					if ( !(_la==ASC || _la==DESC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(444);
				match(ID);
				setState(445);
				match(PUNTO);
				setState(446);
				match(ID);
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASC || _la==DESC) {
					{
					setState(447);
					_la = _input.LA(1);
					if ( !(_la==ASC || _la==DESC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LimiteContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(ExprParser.LIMIT, 0); }
		public List<TerminalNode> NUM() { return getTokens(ExprParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(ExprParser.NUM, i);
		}
		public TerminalNode OFFSET() { return getToken(ExprParser.OFFSET, 0); }
		public LimiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limite; }
	}

	public final LimiteContext limite() throws RecognitionException {
		LimiteContext _localctx = new LimiteContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_limite);
		try {
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(452);
				match(LIMIT);
				setState(453);
				match(NUM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				match(LIMIT);
				setState(455);
				match(NUM);
				setState(456);
				match(OFFSET);
				setState(457);
				match(NUM);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActualizarDatosContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(ExprParser.UPDATE, 0); }
		public NombreTablaContext nombreTabla() {
			return getRuleContext(NombreTablaContext.class,0);
		}
		public TerminalNode SET() { return getToken(ExprParser.SET, 0); }
		public ListaAsignacionesContext listaAsignaciones() {
			return getRuleContext(ListaAsignacionesContext.class,0);
		}
		public TerminalNode PUNTO_COMA() { return getToken(ExprParser.PUNTO_COMA, 0); }
		public CondicionWhereContext condicionWhere() {
			return getRuleContext(CondicionWhereContext.class,0);
		}
		public ActualizarDatosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualizarDatos; }
	}

	public final ActualizarDatosContext actualizarDatos() throws RecognitionException {
		ActualizarDatosContext _localctx = new ActualizarDatosContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_actualizarDatos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(UPDATE);
			setState(461);
			nombreTabla();
			setState(462);
			match(SET);
			setState(463);
			listaAsignaciones();
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(464);
				condicionWhere();
				}
			}

			setState(467);
			match(PUNTO_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaAsignacionesContext extends ParserRuleContext {
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(ExprParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ExprParser.COMA, i);
		}
		public ListaAsignacionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaAsignaciones; }
	}

	public final ListaAsignacionesContext listaAsignaciones() throws RecognitionException {
		ListaAsignacionesContext _localctx = new ListaAsignacionesContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_listaAsignaciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			asignacion();
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(470);
				match(COMA);
				setState(471);
				asignacion();
				}
				}
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(ExprParser.IGUAL, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(ID);
			setState(478);
			match(IGUAL);
			setState(479);
			expresion(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EliminarDatosContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(ExprParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(ExprParser.FROM, 0); }
		public NombreTablaContext nombreTabla() {
			return getRuleContext(NombreTablaContext.class,0);
		}
		public TerminalNode PUNTO_COMA() { return getToken(ExprParser.PUNTO_COMA, 0); }
		public CondicionWhereContext condicionWhere() {
			return getRuleContext(CondicionWhereContext.class,0);
		}
		public EliminarDatosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eliminarDatos; }
	}

	public final EliminarDatosContext eliminarDatos() throws RecognitionException {
		EliminarDatosContext _localctx = new EliminarDatosContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_eliminarDatos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(DELETE);
			setState(482);
			match(FROM);
			setState(483);
			nombreTabla();
			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(484);
				condicionWhere();
				}
			}

			setState(487);
			match(PUNTO_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CrearIndiceContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(ExprParser.CREATE, 0); }
		public TerminalNode INDEX() { return getToken(ExprParser.INDEX, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode ON() { return getToken(ExprParser.ON, 0); }
		public NombreTablaContext nombreTabla() {
			return getRuleContext(NombreTablaContext.class,0);
		}
		public TerminalNode PAR_IZQ() { return getToken(ExprParser.PAR_IZQ, 0); }
		public ListaIdsContext listaIds() {
			return getRuleContext(ListaIdsContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(ExprParser.PAR_DER, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(ExprParser.PUNTO_COMA, 0); }
		public TerminalNode UNIQUE() { return getToken(ExprParser.UNIQUE, 0); }
		public CrearIndiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crearIndice; }
	}

	public final CrearIndiceContext crearIndice() throws RecognitionException {
		CrearIndiceContext _localctx = new CrearIndiceContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_crearIndice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(CREATE);
			setState(491);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIQUE) {
				{
				setState(490);
				match(UNIQUE);
				}
			}

			setState(493);
			match(INDEX);
			setState(494);
			match(ID);
			setState(495);
			match(ON);
			setState(496);
			nombreTabla();
			setState(497);
			match(PAR_IZQ);
			setState(498);
			listaIds();
			setState(499);
			match(PAR_DER);
			setState(500);
			match(PUNTO_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CrearVistaContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(ExprParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(ExprParser.VIEW, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode AS() { return getToken(ExprParser.AS, 0); }
		public ConsultaSelectContext consultaSelect() {
			return getRuleContext(ConsultaSelectContext.class,0);
		}
		public CrearVistaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crearVista; }
	}

	public final CrearVistaContext crearVista() throws RecognitionException {
		CrearVistaContext _localctx = new CrearVistaContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_crearVista);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(CREATE);
			setState(503);
			match(VIEW);
			setState(504);
			match(ID);
			setState(505);
			match(AS);
			setState(506);
			consultaSelect();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EliminarTablaContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(ExprParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(ExprParser.TABLE, 0); }
		public NombreTablaContext nombreTabla() {
			return getRuleContext(NombreTablaContext.class,0);
		}
		public TerminalNode PUNTO_COMA() { return getToken(ExprParser.PUNTO_COMA, 0); }
		public EliminarTablaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eliminarTabla; }
	}

	public final EliminarTablaContext eliminarTabla() throws RecognitionException {
		EliminarTablaContext _localctx = new EliminarTablaContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_eliminarTabla);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(DROP);
			setState(509);
			match(TABLE);
			setState(510);
			nombreTabla();
			setState(511);
			match(PUNTO_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NombreTablaContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}
		public TerminalNode PUNTO() { return getToken(ExprParser.PUNTO, 0); }
		public NombreTablaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombreTabla; }
	}

	public final NombreTablaContext nombreTabla() throws RecognitionException {
		NombreTablaContext _localctx = new NombreTablaContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_nombreTabla);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			match(ID);
			setState(516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(514);
				match(PUNTO);
				setState(515);
				match(ID);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CrearProcedimientoContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(ExprParser.CREATE, 0); }
		public TerminalNode PROCEDURE() { return getToken(ExprParser.PROCEDURE, 0); }
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}
		public TerminalNode PAR_IZQ() { return getToken(ExprParser.PAR_IZQ, 0); }
		public TerminalNode PAR_DER() { return getToken(ExprParser.PAR_DER, 0); }
		public TerminalNode LANGUAGE() { return getToken(ExprParser.LANGUAGE, 0); }
		public TerminalNode AS() { return getToken(ExprParser.AS, 0); }
		public TerminalNode CADENA() { return getToken(ExprParser.CADENA, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(ExprParser.PUNTO_COMA, 0); }
		public TerminalNode OR() { return getToken(ExprParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(ExprParser.REPLACE, 0); }
		public CrearProcedimientoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crearProcedimiento; }
	}

	public final CrearProcedimientoContext crearProcedimiento() throws RecognitionException {
		CrearProcedimientoContext _localctx = new CrearProcedimientoContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_crearProcedimiento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			match(CREATE);
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(519);
				match(OR);
				setState(520);
				match(REPLACE);
				}
			}

			setState(523);
			match(PROCEDURE);
			setState(524);
			match(ID);
			setState(525);
			match(PAR_IZQ);
			setState(526);
			match(PAR_DER);
			setState(527);
			match(LANGUAGE);
			setState(528);
			match(ID);
			setState(529);
			match(AS);
			setState(530);
			match(CADENA);
			setState(531);
			match(PUNTO_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CrearTriggerContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(ExprParser.CREATE, 0); }
		public TerminalNode TRIGGER() { return getToken(ExprParser.TRIGGER, 0); }
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}
		public TerminalNode ON() { return getToken(ExprParser.ON, 0); }
		public NombreTablaContext nombreTabla() {
			return getRuleContext(NombreTablaContext.class,0);
		}
		public TerminalNode FOR() { return getToken(ExprParser.FOR, 0); }
		public TerminalNode EACH() { return getToken(ExprParser.EACH, 0); }
		public TerminalNode ROW() { return getToken(ExprParser.ROW, 0); }
		public TerminalNode EXECUTE() { return getToken(ExprParser.EXECUTE, 0); }
		public TerminalNode FUNCTION() { return getToken(ExprParser.FUNCTION, 0); }
		public TerminalNode PAR_IZQ() { return getToken(ExprParser.PAR_IZQ, 0); }
		public TerminalNode PAR_DER() { return getToken(ExprParser.PAR_DER, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(ExprParser.PUNTO_COMA, 0); }
		public TerminalNode BEFORE() { return getToken(ExprParser.BEFORE, 0); }
		public TerminalNode AFTER() { return getToken(ExprParser.AFTER, 0); }
		public TerminalNode INSERT() { return getToken(ExprParser.INSERT, 0); }
		public TerminalNode UPDATE() { return getToken(ExprParser.UPDATE, 0); }
		public TerminalNode DELETE() { return getToken(ExprParser.DELETE, 0); }
		public CrearTriggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crearTrigger; }
	}

	public final CrearTriggerContext crearTrigger() throws RecognitionException {
		CrearTriggerContext _localctx = new CrearTriggerContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_crearTrigger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			match(CREATE);
			setState(534);
			match(TRIGGER);
			setState(535);
			match(ID);
			setState(536);
			_la = _input.LA(1);
			if ( !(_la==BEFORE || _la==AFTER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(537);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 5136L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(538);
			match(ON);
			setState(539);
			nombreTabla();
			setState(540);
			match(FOR);
			setState(541);
			match(EACH);
			setState(542);
			match(ROW);
			setState(543);
			match(EXECUTE);
			setState(544);
			match(FUNCTION);
			setState(545);
			match(ID);
			setState(546);
			match(PAR_IZQ);
			setState(547);
			match(PAR_DER);
			setState(548);
			match(PUNTO_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return origen_sempred((OrigenContext)_localctx, predIndex);
		case 22:
			return condicion_sempred((CondicionContext)_localctx, predIndex);
		case 23:
			return expresion_sempred((ExpresionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean origen_sempred(OrigenContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean condicion_sempred(CondicionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001d\u0227\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001X\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002]\b\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"a\b\u0002\n\u0002\f\u0002d\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"t\b\u0004\n\u0004\f\u0004w\t\u0004\u0001\u0005\u0001\u0005\u0003\u0005"+
		"{\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0080\b\u0006"+
		"\n\u0006\f\u0006\u0083\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0092\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u0098\b\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u00b0\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00d2"+
		"\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00e9\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0005\f\u00ee\b\f\n\f\f\f\u00f1\t\f\u0001\r\u0001\r"+
		"\u0001\r\u0005\r\u00f6\b\r\n\r\f\r\u00f9\t\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0102"+
		"\b\u000f\u0001\u000f\u0003\u000f\u0105\b\u000f\u0001\u000f\u0003\u000f"+
		"\u0108\b\u000f\u0001\u000f\u0003\u000f\u010b\b\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0113"+
		"\b\u0010\n\u0010\f\u0010\u0116\t\u0010\u0003\u0010\u0118\b\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u0121\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u0126\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u012d\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0137"+
		"\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0141\b\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0005\u0012\u0146\b\u0012\n\u0012\f\u0012\u0149\t\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u014e\b\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u0158\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u017e\b\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016"+
		"\u0186\b\u0016\n\u0016\f\u0016\u0189\t\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u019a\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u01a8\b\u0017\n\u0017\f\u0017"+
		"\u01ab\t\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0005\u0019\u01b4\b\u0019\n\u0019\f\u0019\u01b7"+
		"\t\u0019\u0001\u001a\u0001\u001a\u0003\u001a\u01bb\b\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01c1\b\u001a\u0003\u001a"+
		"\u01c3\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u01cb\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0003\u001c\u01d2\b\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u01d9\b\u001d\n\u001d"+
		"\f\u001d\u01dc\t\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01e6\b\u001f"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0003 \u01ec\b \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#"+
		"\u0001#\u0003#\u0205\b#\u0001$\u0001$\u0001$\u0003$\u020a\b$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0000\u0003$,.&\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJ\u0000\u0006\u0001\u000012\u0003\u0000\u0013\u0013"+
		"()^`\u0001\u0000OT\u0001\u0000\u001e\u001f\u0001\u000078\u0003\u0000\u0004"+
		"\u0004\n\n\f\f\u0258\u0000L\u0001\u0000\u0000\u0000\u0002W\u0001\u0000"+
		"\u0000\u0000\u0004\\\u0001\u0000\u0000\u0000\u0006h\u0001\u0000\u0000"+
		"\u0000\bp\u0001\u0000\u0000\u0000\nz\u0001\u0000\u0000\u0000\f|\u0001"+
		"\u0000\u0000\u0000\u000e\u0091\u0001\u0000\u0000\u0000\u0010\u0097\u0001"+
		"\u0000\u0000\u0000\u0012\u00af\u0001\u0000\u0000\u0000\u0014\u00d1\u0001"+
		"\u0000\u0000\u0000\u0016\u00e8\u0001\u0000\u0000\u0000\u0018\u00ea\u0001"+
		"\u0000\u0000\u0000\u001a\u00f2\u0001\u0000\u0000\u0000\u001c\u00fa\u0001"+
		"\u0000\u0000\u0000\u001e\u00fc\u0001\u0000\u0000\u0000 \u0117\u0001\u0000"+
		"\u0000\u0000\"\u0120\u0001\u0000\u0000\u0000$\u0122\u0001\u0000\u0000"+
		"\u0000&\u014d\u0001\u0000\u0000\u0000(\u014f\u0001\u0000\u0000\u0000*"+
		"\u0152\u0001\u0000\u0000\u0000,\u017d\u0001\u0000\u0000\u0000.\u0199\u0001"+
		"\u0000\u0000\u00000\u01ac\u0001\u0000\u0000\u00002\u01ae\u0001\u0000\u0000"+
		"\u00004\u01c2\u0001\u0000\u0000\u00006\u01ca\u0001\u0000\u0000\u00008"+
		"\u01cc\u0001\u0000\u0000\u0000:\u01d5\u0001\u0000\u0000\u0000<\u01dd\u0001"+
		"\u0000\u0000\u0000>\u01e1\u0001\u0000\u0000\u0000@\u01e9\u0001\u0000\u0000"+
		"\u0000B\u01f6\u0001\u0000\u0000\u0000D\u01fc\u0001\u0000\u0000\u0000F"+
		"\u0201\u0001\u0000\u0000\u0000H\u0206\u0001\u0000\u0000\u0000J\u0215\u0001"+
		"\u0000\u0000\u0000LM\u0003\u0002\u0001\u0000MN\u0005\u0000\u0000\u0001"+
		"N\u0001\u0001\u0000\u0000\u0000OX\u0003\u0006\u0003\u0000PX\u0003\u0016"+
		"\u000b\u0000QX\u0003\u001e\u000f\u0000RX\u00038\u001c\u0000SX\u0003>\u001f"+
		"\u0000TX\u0003@ \u0000UX\u0003B!\u0000VX\u0003D\"\u0000WO\u0001\u0000"+
		"\u0000\u0000WP\u0001\u0000\u0000\u0000WQ\u0001\u0000\u0000\u0000WR\u0001"+
		"\u0000\u0000\u0000WS\u0001\u0000\u0000\u0000WT\u0001\u0000\u0000\u0000"+
		"WU\u0001\u0000\u0000\u0000WV\u0001\u0000\u0000\u0000X\u0003\u0001\u0000"+
		"\u0000\u0000Y]\u0005.\u0000\u0000Z[\u0005/\u0000\u0000[]\u00050\u0000"+
		"\u0000\\Y\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000]^\u0001\u0000"+
		"\u0000\u0000^b\u0005Z\u0000\u0000_a\u0003\u0002\u0001\u0000`_\u0001\u0000"+
		"\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001"+
		"\u0000\u0000\u0000ce\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000"+
		"ef\u0007\u0000\u0000\u0000fg\u0005Z\u0000\u0000g\u0005\u0001\u0000\u0000"+
		"\u0000hi\u0005\u0001\u0000\u0000ij\u0005\u0002\u0000\u0000jk\u0003F#\u0000"+
		"kl\u0005\\\u0000\u0000lm\u0003\b\u0004\u0000mn\u0005]\u0000\u0000no\u0005"+
		"Z\u0000\u0000o\u0007\u0001\u0000\u0000\u0000pu\u0003\n\u0005\u0000qr\u0005"+
		"[\u0000\u0000rt\u0003\n\u0005\u0000sq\u0001\u0000\u0000\u0000tw\u0001"+
		"\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000"+
		"v\t\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000x{\u0003\f\u0006"+
		"\u0000y{\u0003\u0010\b\u0000zx\u0001\u0000\u0000\u0000zy\u0001\u0000\u0000"+
		"\u0000{\u000b\u0001\u0000\u0000\u0000|}\u0005a\u0000\u0000}\u0081\u0003"+
		"\u0014\n\u0000~\u0080\u0003\u000e\u0007\u0000\u007f~\u0001\u0000\u0000"+
		"\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\r\u0001\u0000\u0000\u0000"+
		"\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0085\u0005\r\u0000\u0000\u0085"+
		"\u0092\u0005\u000e\u0000\u0000\u0086\u0087\u0005\u0012\u0000\u0000\u0087"+
		"\u0092\u0005\u0013\u0000\u0000\u0088\u0092\u0005\u0014\u0000\u0000\u0089"+
		"\u008a\u0005\u0015\u0000\u0000\u008a\u0092\u0003\u001c\u000e\u0000\u008b"+
		"\u008c\u0005\u0010\u0000\u0000\u008c\u008d\u0003F#\u0000\u008d\u008e\u0005"+
		"\\\u0000\u0000\u008e\u008f\u0005a\u0000\u0000\u008f\u0090\u0005]\u0000"+
		"\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091\u0084\u0001\u0000\u0000"+
		"\u0000\u0091\u0086\u0001\u0000\u0000\u0000\u0091\u0088\u0001\u0000\u0000"+
		"\u0000\u0091\u0089\u0001\u0000\u0000\u0000\u0091\u008b\u0001\u0000\u0000"+
		"\u0000\u0092\u000f\u0001\u0000\u0000\u0000\u0093\u0094\u0005\u0011\u0000"+
		"\u0000\u0094\u0095\u0005a\u0000\u0000\u0095\u0098\u0003\u0012\t\u0000"+
		"\u0096\u0098\u0003\u0012\t\u0000\u0097\u0093\u0001\u0000\u0000\u0000\u0097"+
		"\u0096\u0001\u0000\u0000\u0000\u0098\u0011\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0005\r\u0000\u0000\u009a\u009b\u0005\u000e\u0000\u0000\u009b\u009c"+
		"\u0005\\\u0000\u0000\u009c\u009d\u0003\u0018\f\u0000\u009d\u009e\u0005"+
		"]\u0000\u0000\u009e\u00b0\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u000f"+
		"\u0000\u0000\u00a0\u00a1\u0005\u000e\u0000\u0000\u00a1\u00a2\u0005\\\u0000"+
		"\u0000\u00a2\u00a3\u0003\u0018\f\u0000\u00a3\u00a4\u0005]\u0000\u0000"+
		"\u00a4\u00a5\u0005\u0010\u0000\u0000\u00a5\u00a6\u0003F#\u0000\u00a6\u00a7"+
		"\u0005\\\u0000\u0000\u00a7\u00a8\u0003\u0018\f\u0000\u00a8\u00a9\u0005"+
		"]\u0000\u0000\u00a9\u00b0\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\u0014"+
		"\u0000\u0000\u00ab\u00ac\u0005\\\u0000\u0000\u00ac\u00ad\u0003\u0018\f"+
		"\u0000\u00ad\u00ae\u0005]\u0000\u0000\u00ae\u00b0\u0001\u0000\u0000\u0000"+
		"\u00af\u0099\u0001\u0000\u0000\u0000\u00af\u009f\u0001\u0000\u0000\u0000"+
		"\u00af\u00aa\u0001\u0000\u0000\u0000\u00b0\u0013\u0001\u0000\u0000\u0000"+
		"\u00b1\u00d2\u0005>\u0000\u0000\u00b2\u00d2\u0005?\u0000\u0000\u00b3\u00d2"+
		"\u0005@\u0000\u0000\u00b4\u00d2\u0005A\u0000\u0000\u00b5\u00b6\u0005B"+
		"\u0000\u0000\u00b6\u00b7\u0005\\\u0000\u0000\u00b7\u00b8\u0005_\u0000"+
		"\u0000\u00b8\u00b9\u0005[\u0000\u0000\u00b9\u00ba\u0005_\u0000\u0000\u00ba"+
		"\u00d2\u0005]\u0000\u0000\u00bb\u00bc\u0005B\u0000\u0000\u00bc\u00bd\u0005"+
		"\\\u0000\u0000\u00bd\u00be\u0005_\u0000\u0000\u00be\u00d2\u0005]\u0000"+
		"\u0000\u00bf\u00d2\u0005C\u0000\u0000\u00c0\u00d2\u0005D\u0000\u0000\u00c1"+
		"\u00c2\u0005E\u0000\u0000\u00c2\u00c3\u0005\\\u0000\u0000\u00c3\u00c4"+
		"\u0005_\u0000\u0000\u00c4\u00d2\u0005]\u0000\u0000\u00c5\u00c6\u0005F"+
		"\u0000\u0000\u00c6\u00c7\u0005\\\u0000\u0000\u00c7\u00c8\u0005_\u0000"+
		"\u0000\u00c8\u00d2\u0005]\u0000\u0000\u00c9\u00d2\u0005G\u0000\u0000\u00ca"+
		"\u00d2\u0005H\u0000\u0000\u00cb\u00d2\u0005I\u0000\u0000\u00cc\u00d2\u0005"+
		"J\u0000\u0000\u00cd\u00d2\u0005K\u0000\u0000\u00ce\u00d2\u0005L\u0000"+
		"\u0000\u00cf\u00d2\u0005M\u0000\u0000\u00d0\u00d2\u0005N\u0000\u0000\u00d1"+
		"\u00b1\u0001\u0000\u0000\u0000\u00d1\u00b2\u0001\u0000\u0000\u0000\u00d1"+
		"\u00b3\u0001\u0000\u0000\u0000\u00d1\u00b4\u0001\u0000\u0000\u0000\u00d1"+
		"\u00b5\u0001\u0000\u0000\u0000\u00d1\u00bb\u0001\u0000\u0000\u0000\u00d1"+
		"\u00bf\u0001\u0000\u0000\u0000\u00d1\u00c0\u0001\u0000\u0000\u0000\u00d1"+
		"\u00c1\u0001\u0000\u0000\u0000\u00d1\u00c5\u0001\u0000\u0000\u0000\u00d1"+
		"\u00c9\u0001\u0000\u0000\u0000\u00d1\u00ca\u0001\u0000\u0000\u0000\u00d1"+
		"\u00cb\u0001\u0000\u0000\u0000\u00d1\u00cc\u0001\u0000\u0000\u0000\u00d1"+
		"\u00cd\u0001\u0000\u0000\u0000\u00d1\u00ce\u0001\u0000\u0000\u0000\u00d1"+
		"\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d2"+
		"\u0015\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005\u0004\u0000\u0000\u00d4"+
		"\u00d5\u0005\u0005\u0000\u0000\u00d5\u00d6\u0003F#\u0000\u00d6\u00d7\u0005"+
		"\\\u0000\u0000\u00d7\u00d8\u0003\u0018\f\u0000\u00d8\u00d9\u0005]\u0000"+
		"\u0000\u00d9\u00da\u0005\u0006\u0000\u0000\u00da\u00db\u0005\\\u0000\u0000"+
		"\u00db\u00dc\u0003\u001a\r\u0000\u00dc\u00dd\u0005]\u0000\u0000\u00dd"+
		"\u00de\u0005Z\u0000\u0000\u00de\u00e9\u0001\u0000\u0000\u0000\u00df\u00e0"+
		"\u0005\u0004\u0000\u0000\u00e0\u00e1\u0005\u0005\u0000\u0000\u00e1\u00e2"+
		"\u0003F#\u0000\u00e2\u00e3\u0005\u0006\u0000\u0000\u00e3\u00e4\u0005\\"+
		"\u0000\u0000\u00e4\u00e5\u0003\u001a\r\u0000\u00e5\u00e6\u0005]\u0000"+
		"\u0000\u00e6\u00e7\u0005Z\u0000\u0000\u00e7\u00e9\u0001\u0000\u0000\u0000"+
		"\u00e8\u00d3\u0001\u0000\u0000\u0000\u00e8\u00df\u0001\u0000\u0000\u0000"+
		"\u00e9\u0017\u0001\u0000\u0000\u0000\u00ea\u00ef\u0005a\u0000\u0000\u00eb"+
		"\u00ec\u0005[\u0000\u0000\u00ec\u00ee\u0005a\u0000\u0000\u00ed\u00eb\u0001"+
		"\u0000\u0000\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001"+
		"\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0\u0019\u0001"+
		"\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f2\u00f7\u0003"+
		"\u001c\u000e\u0000\u00f3\u00f4\u0005[\u0000\u0000\u00f4\u00f6\u0003\u001c"+
		"\u000e\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f6\u00f9\u0001\u0000"+
		"\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000"+
		"\u0000\u0000\u00f8\u001b\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000"+
		"\u0000\u0000\u00fa\u00fb\u0007\u0001\u0000\u0000\u00fb\u001d\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fd\u0005\u0007\u0000\u0000\u00fd\u00fe\u0003 \u0010"+
		"\u0000\u00fe\u00ff\u0005\b\u0000\u0000\u00ff\u0101\u0003$\u0012\u0000"+
		"\u0100\u0102\u0003(\u0014\u0000\u0101\u0100\u0001\u0000\u0000\u0000\u0101"+
		"\u0102\u0001\u0000\u0000\u0000\u0102\u0104\u0001\u0000\u0000\u0000\u0103"+
		"\u0105\u0003*\u0015\u0000\u0104\u0103\u0001\u0000\u0000\u0000\u0104\u0105"+
		"\u0001\u0000\u0000\u0000\u0105\u0107\u0001\u0000\u0000\u0000\u0106\u0108"+
		"\u00032\u0019\u0000\u0107\u0106\u0001\u0000\u0000\u0000\u0107\u0108\u0001"+
		"\u0000\u0000\u0000\u0108\u010a\u0001\u0000\u0000\u0000\u0109\u010b\u0003"+
		"6\u001b\u0000\u010a\u0109\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000"+
		"\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u010d\u0005Z\u0000"+
		"\u0000\u010d\u001f\u0001\u0000\u0000\u0000\u010e\u0118\u0005X\u0000\u0000"+
		"\u010f\u0114\u0003\"\u0011\u0000\u0110\u0111\u0005[\u0000\u0000\u0111"+
		"\u0113\u0003\"\u0011\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0113\u0116"+
		"\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0114\u0115"+
		"\u0001\u0000\u0000\u0000\u0115\u0118\u0001\u0000\u0000\u0000\u0116\u0114"+
		"\u0001\u0000\u0000\u0000\u0117\u010e\u0001\u0000\u0000\u0000\u0117\u010f"+
		"\u0001\u0000\u0000\u0000\u0118!\u0001\u0000\u0000\u0000\u0119\u011a\u0005"+
		"a\u0000\u0000\u011a\u011b\u0005Y\u0000\u0000\u011b\u0121\u0005a\u0000"+
		"\u0000\u011c\u0121\u0005a\u0000\u0000\u011d\u011e\u0005a\u0000\u0000\u011e"+
		"\u011f\u0005Y\u0000\u0000\u011f\u0121\u0005X\u0000\u0000\u0120\u0119\u0001"+
		"\u0000\u0000\u0000\u0120\u011c\u0001\u0000\u0000\u0000\u0120\u011d\u0001"+
		"\u0000\u0000\u0000\u0121#\u0001\u0000\u0000\u0000\u0122\u0123\u0006\u0012"+
		"\uffff\uffff\u0000\u0123\u0125\u0003F#\u0000\u0124\u0126\u0003&\u0013"+
		"\u0000\u0125\u0124\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000"+
		"\u0000\u0126\u0147\u0001\u0000\u0000\u0000\u0127\u0128\n\u0003\u0000\u0000"+
		"\u0128\u0129\u0005\u0016\u0000\u0000\u0129\u012a\u0005\u0019\u0000\u0000"+
		"\u012a\u012c\u0003F#\u0000\u012b\u012d\u0003&\u0013\u0000\u012c\u012b"+
		"\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u012e"+
		"\u0001\u0000\u0000\u0000\u012e\u012f\u0005\u001a\u0000\u0000\u012f\u0130"+
		"\u0003,\u0016\u0000\u0130\u0146\u0001\u0000\u0000\u0000\u0131\u0132\n"+
		"\u0002\u0000\u0000\u0132\u0133\u0005\u0017\u0000\u0000\u0133\u0134\u0005"+
		"\u0019\u0000\u0000\u0134\u0136\u0003F#\u0000\u0135\u0137\u0003&\u0013"+
		"\u0000\u0136\u0135\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000"+
		"\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138\u0139\u0005\u001a\u0000"+
		"\u0000\u0139\u013a\u0003,\u0016\u0000\u013a\u0146\u0001\u0000\u0000\u0000"+
		"\u013b\u013c\n\u0001\u0000\u0000\u013c\u013d\u0005\u0018\u0000\u0000\u013d"+
		"\u013e\u0005\u0019\u0000\u0000\u013e\u0140\u0003F#\u0000\u013f\u0141\u0003"+
		"&\u0013\u0000\u0140\u013f\u0001\u0000\u0000\u0000\u0140\u0141\u0001\u0000"+
		"\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000\u0142\u0143\u0005\u001a"+
		"\u0000\u0000\u0143\u0144\u0003,\u0016\u0000\u0144\u0146\u0001\u0000\u0000"+
		"\u0000\u0145\u0127\u0001\u0000\u0000\u0000\u0145\u0131\u0001\u0000\u0000"+
		"\u0000\u0145\u013b\u0001\u0000\u0000\u0000\u0146\u0149\u0001\u0000\u0000"+
		"\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000"+
		"\u0000\u0148%\u0001\u0000\u0000\u0000\u0149\u0147\u0001\u0000\u0000\u0000"+
		"\u014a\u014b\u0005\u001b\u0000\u0000\u014b\u014e\u0005a\u0000\u0000\u014c"+
		"\u014e\u0005a\u0000\u0000\u014d\u014a\u0001\u0000\u0000\u0000\u014d\u014c"+
		"\u0001\u0000\u0000\u0000\u014e\'\u0001\u0000\u0000\u0000\u014f\u0150\u0005"+
		"\t\u0000\u0000\u0150\u0151\u0003,\u0016\u0000\u0151)\u0001\u0000\u0000"+
		"\u0000\u0152\u0153\u0005,\u0000\u0000\u0153\u0154\u0005\u001d\u0000\u0000"+
		"\u0154\u0157\u0003\u0018\f\u0000\u0155\u0156\u0005-\u0000\u0000\u0156"+
		"\u0158\u0003,\u0016\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0157\u0158"+
		"\u0001\u0000\u0000\u0000\u0158+\u0001\u0000\u0000\u0000\u0159\u015a\u0006"+
		"\u0016\uffff\uffff\u0000\u015a\u015b\u0003.\u0017\u0000\u015b\u015c\u0003"+
		"0\u0018\u0000\u015c\u015d\u0003.\u0017\u0000\u015d\u017e\u0001\u0000\u0000"+
		"\u0000\u015e\u015f\u0005\u0012\u0000\u0000\u015f\u017e\u0003,\u0016\u0007"+
		"\u0160\u0161\u0003.\u0017\u0000\u0161\u0162\u0005$\u0000\u0000\u0162\u0163"+
		"\u0005\u0013\u0000\u0000\u0163\u017e\u0001\u0000\u0000\u0000\u0164\u0165"+
		"\u0003.\u0017\u0000\u0165\u0166\u0005$\u0000\u0000\u0166\u0167\u0005\u0012"+
		"\u0000\u0000\u0167\u0168\u0005\u0013\u0000\u0000\u0168\u017e\u0001\u0000"+
		"\u0000\u0000\u0169\u016a\u0003.\u0017\u0000\u016a\u016b\u0005&\u0000\u0000"+
		"\u016b\u016c\u0003.\u0017\u0000\u016c\u016d\u0005\"\u0000\u0000\u016d"+
		"\u016e\u0003.\u0017\u0000\u016e\u017e\u0001\u0000\u0000\u0000\u016f\u0170"+
		"\u0003.\u0017\u0000\u0170\u0171\u0005\'\u0000\u0000\u0171\u0172\u0005"+
		"`\u0000\u0000\u0172\u017e\u0001\u0000\u0000\u0000\u0173\u0174\u0003.\u0017"+
		"\u0000\u0174\u0175\u0005%\u0000\u0000\u0175\u0176\u0005\\\u0000\u0000"+
		"\u0176\u0177\u0003\u001a\r\u0000\u0177\u0178\u0005]\u0000\u0000\u0178"+
		"\u017e\u0001\u0000\u0000\u0000\u0179\u017a\u0005\\\u0000\u0000\u017a\u017b"+
		"\u0003,\u0016\u0000\u017b\u017c\u0005]\u0000\u0000\u017c\u017e\u0001\u0000"+
		"\u0000\u0000\u017d\u0159\u0001\u0000\u0000\u0000\u017d\u015e\u0001\u0000"+
		"\u0000\u0000\u017d\u0160\u0001\u0000\u0000\u0000\u017d\u0164\u0001\u0000"+
		"\u0000\u0000\u017d\u0169\u0001\u0000\u0000\u0000\u017d\u016f\u0001\u0000"+
		"\u0000\u0000\u017d\u0173\u0001\u0000\u0000\u0000\u017d\u0179\u0001\u0000"+
		"\u0000\u0000\u017e\u0187\u0001\u0000\u0000\u0000\u017f\u0180\n\t\u0000"+
		"\u0000\u0180\u0181\u0005\"\u0000\u0000\u0181\u0186\u0003,\u0016\n\u0182"+
		"\u0183\n\b\u0000\u0000\u0183\u0184\u0005#\u0000\u0000\u0184\u0186\u0003"+
		",\u0016\t\u0185\u017f\u0001\u0000\u0000\u0000\u0185\u0182\u0001\u0000"+
		"\u0000\u0000\u0186\u0189\u0001\u0000\u0000\u0000\u0187\u0185\u0001\u0000"+
		"\u0000\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188-\u0001\u0000\u0000"+
		"\u0000\u0189\u0187\u0001\u0000\u0000\u0000\u018a\u018b\u0006\u0017\uffff"+
		"\uffff\u0000\u018b\u018c\u0005\\\u0000\u0000\u018c\u018d\u0003.\u0017"+
		"\u0000\u018d\u018e\u0005]\u0000\u0000\u018e\u019a\u0001\u0000\u0000\u0000"+
		"\u018f\u0190\u0005a\u0000\u0000\u0190\u0191\u0005Y\u0000\u0000\u0191\u019a"+
		"\u0005a\u0000\u0000\u0192\u019a\u0005a\u0000\u0000\u0193\u019a\u0005_"+
		"\u0000\u0000\u0194\u019a\u0005^\u0000\u0000\u0195\u019a\u0005`\u0000\u0000"+
		"\u0196\u019a\u0005(\u0000\u0000\u0197\u019a\u0005)\u0000\u0000\u0198\u019a"+
		"\u0005\u0013\u0000\u0000\u0199\u018a\u0001\u0000\u0000\u0000\u0199\u018f"+
		"\u0001\u0000\u0000\u0000\u0199\u0192\u0001\u0000\u0000\u0000\u0199\u0193"+
		"\u0001\u0000\u0000\u0000\u0199\u0194\u0001\u0000\u0000\u0000\u0199\u0195"+
		"\u0001\u0000\u0000\u0000\u0199\u0196\u0001\u0000\u0000\u0000\u0199\u0197"+
		"\u0001\u0000\u0000\u0000\u0199\u0198\u0001\u0000\u0000\u0000\u019a\u01a9"+
		"\u0001\u0000\u0000\u0000\u019b\u019c\n\u0004\u0000\u0000\u019c\u019d\u0005"+
		"X\u0000\u0000\u019d\u01a8\u0003.\u0017\u0005\u019e\u019f\n\u0003\u0000"+
		"\u0000\u019f\u01a0\u0005W\u0000\u0000\u01a0\u01a8\u0003.\u0017\u0004\u01a1"+
		"\u01a2\n\u0002\u0000\u0000\u01a2\u01a3\u0005U\u0000\u0000\u01a3\u01a8"+
		"\u0003.\u0017\u0003\u01a4\u01a5\n\u0001\u0000\u0000\u01a5\u01a6\u0005"+
		"V\u0000\u0000\u01a6\u01a8\u0003.\u0017\u0002\u01a7\u019b\u0001\u0000\u0000"+
		"\u0000\u01a7\u019e\u0001\u0000\u0000\u0000\u01a7\u01a1\u0001\u0000\u0000"+
		"\u0000\u01a7\u01a4\u0001\u0000\u0000\u0000\u01a8\u01ab\u0001\u0000\u0000"+
		"\u0000\u01a9\u01a7\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000"+
		"\u0000\u01aa/\u0001\u0000\u0000\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000"+
		"\u01ac\u01ad\u0007\u0002\u0000\u0000\u01ad1\u0001\u0000\u0000\u0000\u01ae"+
		"\u01af\u0005\u001c\u0000\u0000\u01af\u01b0\u0005\u001d\u0000\u0000\u01b0"+
		"\u01b5\u00034\u001a\u0000\u01b1\u01b2\u0005[\u0000\u0000\u01b2\u01b4\u0003"+
		"4\u001a\u0000\u01b3\u01b1\u0001\u0000\u0000\u0000\u01b4\u01b7\u0001\u0000"+
		"\u0000\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b5\u01b6\u0001\u0000"+
		"\u0000\u0000\u01b63\u0001\u0000\u0000\u0000\u01b7\u01b5\u0001\u0000\u0000"+
		"\u0000\u01b8\u01ba\u0005a\u0000\u0000\u01b9\u01bb\u0007\u0003\u0000\u0000"+
		"\u01ba\u01b9\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000"+
		"\u01bb\u01c3\u0001\u0000\u0000\u0000\u01bc\u01bd\u0005a\u0000\u0000\u01bd"+
		"\u01be\u0005Y\u0000\u0000\u01be\u01c0\u0005a\u0000\u0000\u01bf\u01c1\u0007"+
		"\u0003\u0000\u0000\u01c0\u01bf\u0001\u0000\u0000\u0000\u01c0\u01c1\u0001"+
		"\u0000\u0000\u0000\u01c1\u01c3\u0001\u0000\u0000\u0000\u01c2\u01b8\u0001"+
		"\u0000\u0000\u0000\u01c2\u01bc\u0001\u0000\u0000\u0000\u01c35\u0001\u0000"+
		"\u0000\u0000\u01c4\u01c5\u0005 \u0000\u0000\u01c5\u01cb\u0005_\u0000\u0000"+
		"\u01c6\u01c7\u0005 \u0000\u0000\u01c7\u01c8\u0005_\u0000\u0000\u01c8\u01c9"+
		"\u0005!\u0000\u0000\u01c9\u01cb\u0005_\u0000\u0000\u01ca\u01c4\u0001\u0000"+
		"\u0000\u0000\u01ca\u01c6\u0001\u0000\u0000\u0000\u01cb7\u0001\u0000\u0000"+
		"\u0000\u01cc\u01cd\u0005\n\u0000\u0000\u01cd\u01ce\u0003F#\u0000\u01ce"+
		"\u01cf\u0005\u000b\u0000\u0000\u01cf\u01d1\u0003:\u001d\u0000\u01d0\u01d2"+
		"\u0003(\u0014\u0000\u01d1\u01d0\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001"+
		"\u0000\u0000\u0000\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3\u01d4\u0005"+
		"Z\u0000\u0000\u01d49\u0001\u0000\u0000\u0000\u01d5\u01da\u0003<\u001e"+
		"\u0000\u01d6\u01d7\u0005[\u0000\u0000\u01d7\u01d9\u0003<\u001e\u0000\u01d8"+
		"\u01d6\u0001\u0000\u0000\u0000\u01d9\u01dc\u0001\u0000\u0000\u0000\u01da"+
		"\u01d8\u0001\u0000\u0000\u0000\u01da\u01db\u0001\u0000\u0000\u0000\u01db"+
		";\u0001\u0000\u0000\u0000\u01dc\u01da\u0001\u0000\u0000\u0000\u01dd\u01de"+
		"\u0005a\u0000\u0000\u01de\u01df\u0005O\u0000\u0000\u01df\u01e0\u0003."+
		"\u0017\u0000\u01e0=\u0001\u0000\u0000\u0000\u01e1\u01e2\u0005\f\u0000"+
		"\u0000\u01e2\u01e3\u0005\b\u0000\u0000\u01e3\u01e5\u0003F#\u0000\u01e4"+
		"\u01e6\u0003(\u0014\u0000\u01e5\u01e4\u0001\u0000\u0000\u0000\u01e5\u01e6"+
		"\u0001\u0000\u0000\u0000\u01e6\u01e7\u0001\u0000\u0000\u0000\u01e7\u01e8"+
		"\u0005Z\u0000\u0000\u01e8?\u0001\u0000\u0000\u0000\u01e9\u01eb\u0005\u0001"+
		"\u0000\u0000\u01ea\u01ec\u0005\u0014\u0000\u0000\u01eb\u01ea\u0001\u0000"+
		"\u0000\u0000\u01eb\u01ec\u0001\u0000\u0000\u0000\u01ec\u01ed\u0001\u0000"+
		"\u0000\u0000\u01ed\u01ee\u0005*\u0000\u0000\u01ee\u01ef\u0005a\u0000\u0000"+
		"\u01ef\u01f0\u0005\u001a\u0000\u0000\u01f0\u01f1\u0003F#\u0000\u01f1\u01f2"+
		"\u0005\\\u0000\u0000\u01f2\u01f3\u0003\u0018\f\u0000\u01f3\u01f4\u0005"+
		"]\u0000\u0000\u01f4\u01f5\u0005Z\u0000\u0000\u01f5A\u0001\u0000\u0000"+
		"\u0000\u01f6\u01f7\u0005\u0001\u0000\u0000\u01f7\u01f8\u0005+\u0000\u0000"+
		"\u01f8\u01f9\u0005a\u0000\u0000\u01f9\u01fa\u0005\u001b\u0000\u0000\u01fa"+
		"\u01fb\u0003\u001e\u000f\u0000\u01fbC\u0001\u0000\u0000\u0000\u01fc\u01fd"+
		"\u0005\u0003\u0000\u0000\u01fd\u01fe\u0005\u0002\u0000\u0000\u01fe\u01ff"+
		"\u0003F#\u0000\u01ff\u0200\u0005Z\u0000\u0000\u0200E\u0001\u0000\u0000"+
		"\u0000\u0201\u0204\u0005a\u0000\u0000\u0202\u0203\u0005Y\u0000\u0000\u0203"+
		"\u0205\u0005a\u0000\u0000\u0204\u0202\u0001\u0000\u0000\u0000\u0204\u0205"+
		"\u0001\u0000\u0000\u0000\u0205G\u0001\u0000\u0000\u0000\u0206\u0209\u0005"+
		"\u0001\u0000\u0000\u0207\u0208\u0005#\u0000\u0000\u0208\u020a\u00054\u0000"+
		"\u0000\u0209\u0207\u0001\u0000\u0000\u0000\u0209\u020a\u0001\u0000\u0000"+
		"\u0000\u020a\u020b\u0001\u0000\u0000\u0000\u020b\u020c\u00053\u0000\u0000"+
		"\u020c\u020d\u0005a\u0000\u0000\u020d\u020e\u0005\\\u0000\u0000\u020e"+
		"\u020f\u0005]\u0000\u0000\u020f\u0210\u00055\u0000\u0000\u0210\u0211\u0005"+
		"a\u0000\u0000\u0211\u0212\u0005\u001b\u0000\u0000\u0212\u0213\u0005`\u0000"+
		"\u0000\u0213\u0214\u0005Z\u0000\u0000\u0214I\u0001\u0000\u0000\u0000\u0215"+
		"\u0216\u0005\u0001\u0000\u0000\u0216\u0217\u00056\u0000\u0000\u0217\u0218"+
		"\u0005a\u0000\u0000\u0218\u0219\u0007\u0004\u0000\u0000\u0219\u021a\u0007"+
		"\u0005\u0000\u0000\u021a\u021b\u0005\u001a\u0000\u0000\u021b\u021c\u0003"+
		"F#\u0000\u021c\u021d\u0005<\u0000\u0000\u021d\u021e\u0005=\u0000\u0000"+
		"\u021e\u021f\u00059\u0000\u0000\u021f\u0220\u0005:\u0000\u0000\u0220\u0221"+
		"\u0005;\u0000\u0000\u0221\u0222\u0005a\u0000\u0000\u0222\u0223\u0005\\"+
		"\u0000\u0000\u0223\u0224\u0005]\u0000\u0000\u0224\u0225\u0005Z\u0000\u0000"+
		"\u0225K\u0001\u0000\u0000\u0000-W\\buz\u0081\u0091\u0097\u00af\u00d1\u00e8"+
		"\u00ef\u00f7\u0101\u0104\u0107\u010a\u0114\u0117\u0120\u0125\u012c\u0136"+
		"\u0140\u0145\u0147\u014d\u0157\u017d\u0185\u0187\u0199\u01a7\u01a9\u01b5"+
		"\u01ba\u01c0\u01c2\u01ca\u01d1\u01da\u01e5\u01eb\u0204\u0209";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}