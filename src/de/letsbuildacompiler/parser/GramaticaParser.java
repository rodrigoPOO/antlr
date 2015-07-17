// Generated from Gramatica.g4 by ANTLR 4.5
package de.letsbuildacompiler.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, INT_CONSTANT=5, DOUBLE_CONSTANT=6, CLASS=7, 
		VOID=8, BREAK=9, IF=10, ELSE=11, FOR=12, RETURN=13, INT=14, DOUBLE=15, 
		TEXTO=16, WHILE=17, IDENT=18, STRING=19, LPAREN=20, RPAREN=21, LBRACE=22, 
		RBRACE=23, SEMICOLON=24, COMMA=25, DOT=26, ASSIGN=27, GT=28, LT=29, EQ=30, 
		LE=31, GE=32, NEQ=33, PLUS=34, MINUS=35, STAR=36, SLASH=37, REM=38, WHITESPACE=39;
	public static final int
		RULE_teste = 0, RULE_programDecl = 1, RULE_statement = 2, RULE_gambi = 3, 
		RULE_println = 4, RULE_print = 5, RULE_classe = 6, RULE_declclasse = 7, 
		RULE_escopoclasse = 8, RULE_vardecl = 9, RULE_tipoDeclarar = 10, RULE_vardeclatrib = 11, 
		RULE_atrib = 12, RULE_lvalue = 13, RULE_metoddecl = 14, RULE_paramlist = 15, 
		RULE_metodcall = 16, RULE_comandos = 17, RULE_comando1 = 18, RULE_escopometodo = 19, 
		RULE_parametro = 20, RULE_listaargumento = 21, RULE_comando = 22, RULE_expressao = 23, 
		RULE_term = 24, RULE_factor = 25, RULE_retorno = 26, RULE_ifstatement = 27, 
		RULE_forstatement = 28, RULE_whilestatement = 29, RULE_listacomandos = 30;
	public static final String[] ruleNames = {
		"teste", "programDecl", "statement", "gambi", "println", "print", "classe", 
		"declclasse", "escopoclasse", "vardecl", "tipoDeclarar", "vardeclatrib", 
		"atrib", "lvalue", "metoddecl", "paramlist", "metodcall", "comandos", 
		"comando1", "escopometodo", "parametro", "listaargumento", "comando", 
		"expressao", "term", "factor", "retorno", "ifstatement", "forstatement", 
		"whilestatement", "listacomandos"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'println('", "'print('", "' ('", "'return '", null, null, "'class'", 
		"'void'", "'break'", "'if'", "'else'", "'for'", "'return'", "'int'", "'DOUBLE'", 
		"'String'", "'while'", null, null, "'('", "')'", "'{'", "'}'", "';'", 
		"','", "'.'", "'='", "'>'", "'<'", "'=='", "'<='", "'>='", "'!='", "'+'", 
		"'-'", "'*'", "'/'", "'%'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "INT_CONSTANT", "DOUBLE_CONSTANT", "CLASS", 
		"VOID", "BREAK", "IF", "ELSE", "FOR", "RETURN", "INT", "DOUBLE", "TEXTO", 
		"WHILE", "IDENT", "STRING", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "SEMICOLON", 
		"COMMA", "DOT", "ASSIGN", "GT", "LT", "EQ", "LE", "GE", "NEQ", "PLUS", 
		"MINUS", "STAR", "SLASH", "REM", "WHITESPACE"
	};
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
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TesteContext extends ParserRuleContext {
		public List<ProgramDeclContext> programDecl() {
			return getRuleContexts(ProgramDeclContext.class);
		}
		public ProgramDeclContext programDecl(int i) {
			return getRuleContext(ProgramDeclContext.class,i);
		}
		public TesteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_teste; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTeste(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTeste(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitTeste(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TesteContext teste() throws RecognitionException {
		TesteContext _localctx = new TesteContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_teste);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(62);
				programDecl();
				}
				}
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << INT_CONSTANT) | (1L << DOUBLE_CONSTANT) | (1L << IF) | (1L << INT) | (1L << DOUBLE) | (1L << TEXTO) | (1L << WHILE) | (1L << IDENT) | (1L << STRING) | (1L << LPAREN))) != 0) );
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

	public static class ProgramDeclContext extends ParserRuleContext {
		public ProgramDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programDecl; }
	 
		public ProgramDeclContext() { }
		public void copyFrom(ProgramDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComandoNormalContext extends ProgramDeclContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ComandoNormalContext(ProgramDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterComandoNormal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitComandoNormal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitComandoNormal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MetodoDeclContext extends ProgramDeclContext {
		public MetoddeclContext metoddecl() {
			return getRuleContext(MetoddeclContext.class,0);
		}
		public MetodoDeclContext(ProgramDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterMetodoDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitMetodoDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitMetodoDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramDeclContext programDecl() throws RecognitionException {
		ProgramDeclContext _localctx = new ProgramDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programDecl);
		try {
			setState(69);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new ComandoNormalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				statement();
				}
				break;
			case 2:
				_localctx = new MetodoDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				metoddecl();
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

	public static class StatementContext extends ParserRuleContext {
		public PrintlnContext println() {
			return getRuleContext(PrintlnContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public EscopoclasseContext escopoclasse() {
			return getRuleContext(EscopoclasseContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public IfstatementContext ifstatement() {
			return getRuleContext(IfstatementContext.class,0);
		}
		public WhilestatementContext whilestatement() {
			return getRuleContext(WhilestatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(81);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				println();
				setState(72);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				print();
				setState(75);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				escopoclasse();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
				expressao();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(79);
				ifstatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(80);
				whilestatement();
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

	public static class GambiContext extends ParserRuleContext {
		public PrintlnContext println() {
			return getRuleContext(PrintlnContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public EscopoclasseContext escopoclasse() {
			return getRuleContext(EscopoclasseContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public IfstatementContext ifstatement() {
			return getRuleContext(IfstatementContext.class,0);
		}
		public WhilestatementContext whilestatement() {
			return getRuleContext(WhilestatementContext.class,0);
		}
		public GambiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gambi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterGambi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitGambi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitGambi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GambiContext gambi() throws RecognitionException {
		GambiContext _localctx = new GambiContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_gambi);
		try {
			setState(93);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				println();
				setState(84);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				print();
				setState(87);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				escopoclasse();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				expressao();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(91);
				ifstatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(92);
				whilestatement();
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

	public static class PrintlnContext extends ParserRuleContext {
		public ExpressaoContext argument;
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public PrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterPrintln(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitPrintln(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitPrintln(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintlnContext println() throws RecognitionException {
		PrintlnContext _localctx = new PrintlnContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_println);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__0);
			setState(96);
			((PrintlnContext)_localctx).argument = expressao();
			setState(97);
			match(RPAREN);
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

	public static class PrintContext extends ParserRuleContext {
		public ExpressaoContext argument;
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(T__1);
			setState(100);
			((PrintContext)_localctx).argument = expressao();
			setState(101);
			match(RPAREN);
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

	public static class ClasseContext extends ParserRuleContext {
		public DeclclasseContext declclasse() {
			return getRuleContext(DeclclasseContext.class,0);
		}
		public ClasseContext classe() {
			return getRuleContext(ClasseContext.class,0);
		}
		public ClasseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterClasse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitClasse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitClasse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClasseContext classe() throws RecognitionException {
		ClasseContext _localctx = new ClasseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			declclasse();
			setState(105);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(104);
				classe();
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

	public static class DeclclasseContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(GramaticaParser.CLASS, 0); }
		public TerminalNode IDENT() { return getToken(GramaticaParser.IDENT, 0); }
		public TerminalNode LBRACE() { return getToken(GramaticaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(GramaticaParser.RBRACE, 0); }
		public List<EscopoclasseContext> escopoclasse() {
			return getRuleContexts(EscopoclasseContext.class);
		}
		public EscopoclasseContext escopoclasse(int i) {
			return getRuleContext(EscopoclasseContext.class,i);
		}
		public DeclclasseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declclasse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDeclclasse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDeclclasse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDeclclasse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclclasseContext declclasse() throws RecognitionException {
		DeclclasseContext _localctx = new DeclclasseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declclasse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(CLASS);
			setState(108);
			match(IDENT);
			setState(109);
			match(LBRACE);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << TEXTO) | (1L << IDENT))) != 0)) {
				{
				{
				setState(110);
				escopoclasse();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
			match(RBRACE);
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

	public static class EscopoclasseContext extends ParserRuleContext {
		public VardeclContext vardecl() {
			return getRuleContext(VardeclContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GramaticaParser.SEMICOLON, 0); }
		public VardeclatribContext vardeclatrib() {
			return getRuleContext(VardeclatribContext.class,0);
		}
		public AtribContext atrib() {
			return getRuleContext(AtribContext.class,0);
		}
		public EscopoclasseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escopoclasse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterEscopoclasse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitEscopoclasse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitEscopoclasse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscopoclasseContext escopoclasse() throws RecognitionException {
		EscopoclasseContext _localctx = new EscopoclasseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_escopoclasse);
		try {
			setState(127);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				vardecl();
				setState(119);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				vardeclatrib();
				setState(122);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				atrib();
				setState(125);
				match(SEMICOLON);
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

	public static class VardeclContext extends ParserRuleContext {
		public VardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl; }
	 
		public VardeclContext() { }
		public void copyFrom(VardeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclaracaoVariaveisContext extends VardeclContext {
		public TipoDeclararContext tipo;
		public Token nomeVariavel;
		public TipoDeclararContext tipoDeclarar() {
			return getRuleContext(TipoDeclararContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(GramaticaParser.IDENT, 0); }
		public DeclaracaoVariaveisContext(VardeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDeclaracaoVariaveis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDeclaracaoVariaveis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDeclaracaoVariaveis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardeclContext vardecl() throws RecognitionException {
		VardeclContext _localctx = new VardeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_vardecl);
		try {
			_localctx = new DeclaracaoVariaveisContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			((DeclaracaoVariaveisContext)_localctx).tipo = tipoDeclarar();
			setState(130);
			((DeclaracaoVariaveisContext)_localctx).nomeVariavel = match(IDENT);
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

	public static class TipoDeclararContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GramaticaParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(GramaticaParser.DOUBLE, 0); }
		public TerminalNode TEXTO() { return getToken(GramaticaParser.TEXTO, 0); }
		public TipoDeclararContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoDeclarar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTipoDeclarar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTipoDeclarar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitTipoDeclarar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoDeclararContext tipoDeclarar() throws RecognitionException {
		TipoDeclararContext _localctx = new TipoDeclararContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tipoDeclarar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << TEXTO))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class VardeclatribContext extends ParserRuleContext {
		public VardeclatribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardeclatrib; }
	 
		public VardeclatribContext() { }
		public void copyFrom(VardeclatribContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclararEAtribuirContext extends VardeclatribContext {
		public TipoDeclararContext tipo;
		public Token variavel;
		public Token operacao;
		public ExpressaoContext valor;
		public TipoDeclararContext tipoDeclarar() {
			return getRuleContext(TipoDeclararContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(GramaticaParser.IDENT, 0); }
		public TerminalNode ASSIGN() { return getToken(GramaticaParser.ASSIGN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public DeclararEAtribuirContext(VardeclatribContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDeclararEAtribuir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDeclararEAtribuir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDeclararEAtribuir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardeclatribContext vardeclatrib() throws RecognitionException {
		VardeclatribContext _localctx = new VardeclatribContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_vardeclatrib);
		try {
			_localctx = new DeclararEAtribuirContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			((DeclararEAtribuirContext)_localctx).tipo = tipoDeclarar();
			setState(135);
			((DeclararEAtribuirContext)_localctx).variavel = match(IDENT);
			setState(136);
			((DeclararEAtribuirContext)_localctx).operacao = match(ASSIGN);
			setState(137);
			((DeclararEAtribuirContext)_localctx).valor = expressao();
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

	public static class AtribContext extends ParserRuleContext {
		public AtribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrib; }
	 
		public AtribContext() { }
		public void copyFrom(AtribContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AtribuicaoContext extends AtribContext {
		public Token variavel;
		public Token operacao;
		public ExpressaoContext expr;
		public TerminalNode IDENT() { return getToken(GramaticaParser.IDENT, 0); }
		public TerminalNode ASSIGN() { return getToken(GramaticaParser.ASSIGN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public AtribuicaoContext(AtribContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribContext atrib() throws RecognitionException {
		AtribContext _localctx = new AtribContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_atrib);
		try {
			_localctx = new AtribuicaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			((AtribuicaoContext)_localctx).variavel = match(IDENT);
			setState(140);
			((AtribuicaoContext)_localctx).operacao = match(ASSIGN);
			setState(141);
			((AtribuicaoContext)_localctx).expr = expressao();
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

	public static class LvalueContext extends ParserRuleContext {
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
	 
		public LvalueContext() { }
		public void copyFrom(LvalueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CarregarValorContext extends LvalueContext {
		public Token identificador;
		public TerminalNode IDENT() { return getToken(GramaticaParser.IDENT, 0); }
		public CarregarValorContext(LvalueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCarregarValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCarregarValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitCarregarValor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_lvalue);
		try {
			_localctx = new CarregarValorContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			((CarregarValorContext)_localctx).identificador = match(IDENT);
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

	public static class MetoddeclContext extends ParserRuleContext {
		public Token type;
		public Token nomeMetodo;
		public ParamlistContext parametros;
		public ComandosContext com;
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(GramaticaParser.IDENT, 0); }
		public ParamlistContext paramlist() {
			return getRuleContext(ParamlistContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public MetoddeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metoddecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterMetoddecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitMetoddecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitMetoddecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetoddeclContext metoddecl() throws RecognitionException {
		MetoddeclContext _localctx = new MetoddeclContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_metoddecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			((MetoddeclContext)_localctx).type = match(INT);
			setState(146);
			((MetoddeclContext)_localctx).nomeMetodo = match(IDENT);
			setState(147);
			match(T__2);
			setState(148);
			((MetoddeclContext)_localctx).parametros = paramlist();
			setState(149);
			match(RPAREN);
			setState(150);
			match(LBRACE);
			setState(151);
			((MetoddeclContext)_localctx).com = comandos();
			setState(152);
			match(T__3);
			setState(153);
			expressao();
			setState(154);
			match(SEMICOLON);
			setState(155);
			match(RBRACE);
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

	public static class ParamlistContext extends ParserRuleContext {
		public VardeclContext vardecl;
		public List<VardeclContext> decl = new ArrayList<VardeclContext>();
		public List<VardeclContext> vardecl() {
			return getRuleContexts(VardeclContext.class);
		}
		public VardeclContext vardecl(int i) {
			return getRuleContext(VardeclContext.class,i);
		}
		public ParamlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterParamlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitParamlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitParamlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamlistContext paramlist() throws RecognitionException {
		ParamlistContext _localctx = new ParamlistContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_paramlist);
		int _la;
		try {
			setState(166);
			switch (_input.LA(1)) {
			case INT:
			case DOUBLE:
			case TEXTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				((ParamlistContext)_localctx).vardecl = vardecl();
				((ParamlistContext)_localctx).decl.add(((ParamlistContext)_localctx).vardecl);
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(158);
					match(COMMA);
					setState(159);
					((ParamlistContext)_localctx).vardecl = vardecl();
					((ParamlistContext)_localctx).decl.add(((ParamlistContext)_localctx).vardecl);
					}
					}
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class MetodcallContext extends ParserRuleContext {
		public Token nomeMetodo;
		public ListaargumentoContext args;
		public TerminalNode IDENT() { return getToken(GramaticaParser.IDENT, 0); }
		public ListaargumentoContext listaargumento() {
			return getRuleContext(ListaargumentoContext.class,0);
		}
		public MetodcallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metodcall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterMetodcall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitMetodcall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitMetodcall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetodcallContext metodcall() throws RecognitionException {
		MetodcallContext _localctx = new MetodcallContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_metodcall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			((MetodcallContext)_localctx).nomeMetodo = match(IDENT);
			setState(169);
			match(LPAREN);
			setState(170);
			((MetodcallContext)_localctx).args = listaargumento();
			setState(171);
			match(RPAREN);
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

	public static class ComandosContext extends ParserRuleContext {
		public List<Comando1Context> comando1() {
			return getRuleContexts(Comando1Context.class);
		}
		public Comando1Context comando1(int i) {
			return getRuleContext(Comando1Context.class,i);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitComandos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitComandos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comandos);
		int _la;
		try {
			setState(180);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << INT) | (1L << DOUBLE) | (1L << TEXTO) | (1L << WHILE) | (1L << IDENT))) != 0)) {
					{
					{
					setState(173);
					comando1();
					}
					}
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Comando1Context extends ParserRuleContext {
		public IfstatementContext ifstatement() {
			return getRuleContext(IfstatementContext.class,0);
		}
		public ForstatementContext forstatement() {
			return getRuleContext(ForstatementContext.class,0);
		}
		public VardeclContext vardecl() {
			return getRuleContext(VardeclContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GramaticaParser.SEMICOLON, 0); }
		public AtribContext atrib() {
			return getRuleContext(AtribContext.class,0);
		}
		public VardeclatribContext vardeclatrib() {
			return getRuleContext(VardeclatribContext.class,0);
		}
		public WhilestatementContext whilestatement() {
			return getRuleContext(WhilestatementContext.class,0);
		}
		public Comando1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterComando1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitComando1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitComando1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comando1Context comando1() throws RecognitionException {
		Comando1Context _localctx = new Comando1Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_comando1);
		try {
			setState(194);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				ifstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				forstatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				vardecl();
				setState(185);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(187);
				atrib();
				setState(188);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(190);
				vardeclatrib();
				setState(191);
				match(SEMICOLON);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(193);
				whilestatement();
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

	public static class EscopometodoContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(GramaticaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GramaticaParser.RPAREN, 0); }
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public EscopometodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escopometodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterEscopometodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitEscopometodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitEscopometodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscopometodoContext escopometodo() throws RecognitionException {
		EscopometodoContext _localctx = new EscopometodoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_escopometodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(LPAREN);
			setState(198);
			_la = _input.LA(1);
			if (_la==INT || _la==DOUBLE) {
				{
				setState(197);
				parametro();
				}
			}

			setState(200);
			match(RPAREN);
			setState(201);
			match(LBRACE);
			setState(202);
			comando();
			setState(203);
			match(RBRACE);
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

	public static class ParametroContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(GramaticaParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(GramaticaParser.IDENT, i);
		}
		public List<TerminalNode> INT() { return getTokens(GramaticaParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GramaticaParser.INT, i);
		}
		public List<TerminalNode> DOUBLE() { return getTokens(GramaticaParser.DOUBLE); }
		public TerminalNode DOUBLE(int i) {
			return getToken(GramaticaParser.DOUBLE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GramaticaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GramaticaParser.COMMA, i);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(205);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DOUBLE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(206);
			match(IDENT);
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(207);
				match(COMMA);
				setState(208);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==DOUBLE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(209);
				match(IDENT);
				}
				}
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ListaargumentoContext extends ParserRuleContext {
		public ExpressaoContext expressao;
		public List<ExpressaoContext> exp = new ArrayList<ExpressaoContext>();
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GramaticaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GramaticaParser.COMMA, i);
		}
		public ListaargumentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaargumento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterListaargumento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitListaargumento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitListaargumento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaargumentoContext listaargumento() throws RecognitionException {
		ListaargumentoContext _localctx = new ListaargumentoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_listaargumento);
		int _la;
		try {
			setState(224);
			switch (_input.LA(1)) {
			case INT_CONSTANT:
			case DOUBLE_CONSTANT:
			case IDENT:
			case STRING:
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				((ListaargumentoContext)_localctx).expressao = expressao();
				((ListaargumentoContext)_localctx).exp.add(((ListaargumentoContext)_localctx).expressao);
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(216);
					match(COMMA);
					setState(217);
					((ListaargumentoContext)_localctx).expressao = expressao();
					((ListaargumentoContext)_localctx).exp.add(((ListaargumentoContext)_localctx).expressao);
					}
					}
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ComandoContext extends ParserRuleContext {
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GramaticaParser.SEMICOLON, 0); }
		public IfstatementContext ifstatement() {
			return getRuleContext(IfstatementContext.class,0);
		}
		public ForstatementContext forstatement() {
			return getRuleContext(ForstatementContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(GramaticaParser.LBRACE, 0); }
		public ListacomandosContext listacomandos() {
			return getRuleContext(ListacomandosContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(GramaticaParser.RBRACE, 0); }
		public VardeclContext vardecl() {
			return getRuleContext(VardeclContext.class,0);
		}
		public AtribContext atrib() {
			return getRuleContext(AtribContext.class,0);
		}
		public VardeclatribContext vardeclatrib() {
			return getRuleContext(VardeclatribContext.class,0);
		}
		public WhilestatementContext whilestatement() {
			return getRuleContext(WhilestatementContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitComando(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitComando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_comando);
		try {
			setState(245);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				retorno();
				setState(227);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				ifstatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				forstatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(231);
				match(LBRACE);
				setState(232);
				listacomandos();
				setState(233);
				match(RBRACE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(235);
				vardecl();
				setState(236);
				match(SEMICOLON);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(238);
				atrib();
				setState(239);
				match(SEMICOLON);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(241);
				vardeclatrib();
				setState(242);
				match(SEMICOLON);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(244);
				whilestatement();
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

	public static class ExpressaoContext extends ParserRuleContext {
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
	 
		public ExpressaoContext() { }
		public void copyFrom(ExpressaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EquivalenteContext extends ExpressaoContext {
		public TermContext esquerda;
		public Token operacao;
		public TermContext direita;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode EQ() { return getToken(GramaticaParser.EQ, 0); }
		public EquivalenteContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterEquivalente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitEquivalente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitEquivalente(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MenorOuEquivalenteContext extends ExpressaoContext {
		public TermContext esquerda;
		public Token operacao;
		public TermContext direita;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode LE() { return getToken(GramaticaParser.LE, 0); }
		public MenorOuEquivalenteContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterMenorOuEquivalente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitMenorOuEquivalente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitMenorOuEquivalente(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MaiorOuEquivalenteContext extends ExpressaoContext {
		public TermContext esquerda;
		public Token operacao;
		public TermContext direita;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode GE() { return getToken(GramaticaParser.GE, 0); }
		public MaiorOuEquivalenteContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterMaiorOuEquivalente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitMaiorOuEquivalente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitMaiorOuEquivalente(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ChamarMetodoContext extends ExpressaoContext {
		public MetodcallContext metodcall() {
			return getRuleContext(MetodcallContext.class,0);
		}
		public ChamarMetodoContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterChamarMetodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitChamarMetodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitChamarMetodo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DiferenteContext extends ExpressaoContext {
		public TermContext esquerda;
		public Token operacao;
		public TermContext direita;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode NEQ() { return getToken(GramaticaParser.NEQ, 0); }
		public DiferenteContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDiferente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDiferente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDiferente(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumexprContext extends ExpressaoContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public NumexprContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterNumexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitNumexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitNumexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MenorContext extends ExpressaoContext {
		public TermContext esquerda;
		public Token operacao;
		public TermContext direita;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode LT() { return getToken(GramaticaParser.LT, 0); }
		public MenorContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterMenor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitMenor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitMenor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MaiorContext extends ExpressaoContext {
		public TermContext esquerda;
		public Token operacao;
		public TermContext direita;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode GT() { return getToken(GramaticaParser.GT, 0); }
		public MaiorContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterMaior(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitMaior(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitMaior(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expressao);
		try {
			setState(273);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new NumexprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				term(0);
				}
				break;
			case 2:
				_localctx = new MenorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				((MenorContext)_localctx).esquerda = term(0);
				setState(249);
				((MenorContext)_localctx).operacao = match(LT);
				setState(250);
				((MenorContext)_localctx).direita = term(0);
				}
				break;
			case 3:
				_localctx = new MaiorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				((MaiorContext)_localctx).esquerda = term(0);
				setState(253);
				((MaiorContext)_localctx).operacao = match(GT);
				setState(254);
				((MaiorContext)_localctx).direita = term(0);
				}
				break;
			case 4:
				_localctx = new MenorOuEquivalenteContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(256);
				((MenorOuEquivalenteContext)_localctx).esquerda = term(0);
				setState(257);
				((MenorOuEquivalenteContext)_localctx).operacao = match(LE);
				setState(258);
				((MenorOuEquivalenteContext)_localctx).direita = term(0);
				}
				break;
			case 5:
				_localctx = new MaiorOuEquivalenteContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(260);
				((MaiorOuEquivalenteContext)_localctx).esquerda = term(0);
				setState(261);
				((MaiorOuEquivalenteContext)_localctx).operacao = match(GE);
				setState(262);
				((MaiorOuEquivalenteContext)_localctx).direita = term(0);
				}
				break;
			case 6:
				_localctx = new EquivalenteContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(264);
				((EquivalenteContext)_localctx).esquerda = term(0);
				setState(265);
				((EquivalenteContext)_localctx).operacao = match(EQ);
				setState(266);
				((EquivalenteContext)_localctx).direita = term(0);
				}
				break;
			case 7:
				_localctx = new DiferenteContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(268);
				((DiferenteContext)_localctx).esquerda = term(0);
				setState(269);
				((DiferenteContext)_localctx).operacao = match(NEQ);
				setState(270);
				((DiferenteContext)_localctx).direita = term(0);
				}
				break;
			case 8:
				_localctx = new ChamarMetodoContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(272);
				metodcall();
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

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultiplicacaoContext extends TermContext {
		public TermContext esquerda;
		public Token operacao;
		public TermContext direita;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode STAR() { return getToken(GramaticaParser.STAR, 0); }
		public MultiplicacaoContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterMultiplicacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitMultiplicacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitMultiplicacao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FatorContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FatorContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitFator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubtracaoContext extends TermContext {
		public TermContext esquerda;
		public Token operacao;
		public TermContext direita;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(GramaticaParser.MINUS, 0); }
		public SubtracaoContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSubtracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSubtracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitSubtracao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SomaContext extends TermContext {
		public TermContext esquerda;
		public Token operacao;
		public TermContext direita;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(GramaticaParser.PLUS, 0); }
		public SomaContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSoma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSoma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitSoma(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivisaoContext extends TermContext {
		public TermContext esquerda;
		public Token operacao;
		public TermContext direita;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode SLASH() { return getToken(GramaticaParser.SLASH, 0); }
		public DivisaoContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDivisao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDivisao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDivisao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModuloContext extends TermContext {
		public TermContext esquerda;
		public Token operacao;
		public TermContext direita;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode REM() { return getToken(GramaticaParser.REM, 0); }
		public ModuloContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterModulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitModulo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitModulo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new FatorContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(276);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(295);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(293);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new DivisaoContext(new TermContext(_parentctx, _parentState));
						((DivisaoContext)_localctx).esquerda = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(278);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(279);
						((DivisaoContext)_localctx).operacao = match(SLASH);
						setState(280);
						((DivisaoContext)_localctx).direita = term(7);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicacaoContext(new TermContext(_parentctx, _parentState));
						((MultiplicacaoContext)_localctx).esquerda = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(281);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(282);
						((MultiplicacaoContext)_localctx).operacao = match(STAR);
						setState(283);
						((MultiplicacaoContext)_localctx).direita = term(6);
						}
						break;
					case 3:
						{
						_localctx = new ModuloContext(new TermContext(_parentctx, _parentState));
						((ModuloContext)_localctx).esquerda = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(284);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(285);
						((ModuloContext)_localctx).operacao = match(REM);
						setState(286);
						((ModuloContext)_localctx).direita = term(5);
						}
						break;
					case 4:
						{
						_localctx = new SubtracaoContext(new TermContext(_parentctx, _parentState));
						((SubtracaoContext)_localctx).esquerda = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(287);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(288);
						((SubtracaoContext)_localctx).operacao = match(MINUS);
						setState(289);
						((SubtracaoContext)_localctx).direita = term(4);
						}
						break;
					case 5:
						{
						_localctx = new SomaContext(new TermContext(_parentctx, _parentState));
						((SomaContext)_localctx).esquerda = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(290);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(291);
						((SomaContext)_localctx).operacao = match(PLUS);
						setState(292);
						((SomaContext)_localctx).direita = term(3);
						}
						break;
					}
					} 
				}
				setState(297);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParentesisContext extends FactorContext {
		public TerminalNode LPAREN() { return getToken(GramaticaParser.LPAREN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GramaticaParser.RPAREN, 0); }
		public ParentesisContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterParentesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitParentesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitParentesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ChamarLvalueContext extends FactorContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public ChamarLvalueContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterChamarLvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitChamarLvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitChamarLvalue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends FactorContext {
		public Token txt;
		public TerminalNode STRING() { return getToken(GramaticaParser.STRING, 0); }
		public StringContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumeroRealContext extends FactorContext {
		public Token numero;
		public TerminalNode DOUBLE_CONSTANT() { return getToken(GramaticaParser.DOUBLE_CONSTANT, 0); }
		public NumeroRealContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterNumeroReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitNumeroReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitNumeroReal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumeroInteiroContext extends FactorContext {
		public Token numero;
		public TerminalNode INT_CONSTANT() { return getToken(GramaticaParser.INT_CONSTANT, 0); }
		public NumeroInteiroContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterNumeroInteiro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitNumeroInteiro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitNumeroInteiro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_factor);
		try {
			setState(306);
			switch (_input.LA(1)) {
			case INT_CONSTANT:
				_localctx = new NumeroInteiroContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				((NumeroInteiroContext)_localctx).numero = match(INT_CONSTANT);
				}
				break;
			case DOUBLE_CONSTANT:
				_localctx = new NumeroRealContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				((NumeroRealContext)_localctx).numero = match(DOUBLE_CONSTANT);
				}
				break;
			case STRING:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
				((StringContext)_localctx).txt = match(STRING);
				}
				break;
			case IDENT:
				_localctx = new ChamarLvalueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(301);
				lvalue();
				}
				break;
			case LPAREN:
				_localctx = new ParentesisContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(302);
				match(LPAREN);
				setState(303);
				expressao();
				setState(304);
				match(RPAREN);
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

	public static class RetornoContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(GramaticaParser.RETURN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitRetorno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitRetorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(RETURN);
			setState(309);
			expressao();
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

	public static class IfstatementContext extends ParserRuleContext {
		public IfstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstatement; }
	 
		public IfstatementContext() { }
		public void copyFrom(IfstatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfCompletoContext extends IfstatementContext {
		public TerminalNode IF() { return getToken(GramaticaParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(GramaticaParser.LPAREN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GramaticaParser.RPAREN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(GramaticaParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(GramaticaParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(GramaticaParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(GramaticaParser.RBRACE, i);
		}
		public TerminalNode ELSE() { return getToken(GramaticaParser.ELSE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<GambiContext> gambi() {
			return getRuleContexts(GambiContext.class);
		}
		public GambiContext gambi(int i) {
			return getRuleContext(GambiContext.class,i);
		}
		public IfCompletoContext(IfstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterIfCompleto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitIfCompleto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitIfCompleto(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfIncompletoContext extends IfstatementContext {
		public TerminalNode IF() { return getToken(GramaticaParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(GramaticaParser.LPAREN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GramaticaParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(GramaticaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(GramaticaParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfIncompletoContext(IfstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterIfIncompleto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitIfIncompleto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitIfIncompleto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstatementContext ifstatement() throws RecognitionException {
		IfstatementContext _localctx = new IfstatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_ifstatement);
		int _la;
		try {
			setState(343);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new IfIncompletoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				match(IF);
				setState(312);
				match(LPAREN);
				setState(313);
				expressao();
				setState(314);
				match(RPAREN);
				setState(315);
				match(LBRACE);
				setState(317); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(316);
					statement();
					}
					}
					setState(319); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << INT_CONSTANT) | (1L << DOUBLE_CONSTANT) | (1L << IF) | (1L << INT) | (1L << DOUBLE) | (1L << TEXTO) | (1L << WHILE) | (1L << IDENT) | (1L << STRING) | (1L << LPAREN))) != 0) );
				setState(321);
				match(RBRACE);
				}
				break;
			case 2:
				_localctx = new IfCompletoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				match(IF);
				setState(324);
				match(LPAREN);
				setState(325);
				expressao();
				setState(326);
				match(RPAREN);
				setState(327);
				match(LBRACE);
				setState(329); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(328);
					statement();
					}
					}
					setState(331); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << INT_CONSTANT) | (1L << DOUBLE_CONSTANT) | (1L << IF) | (1L << INT) | (1L << DOUBLE) | (1L << TEXTO) | (1L << WHILE) | (1L << IDENT) | (1L << STRING) | (1L << LPAREN))) != 0) );
				setState(333);
				match(RBRACE);
				setState(334);
				match(ELSE);
				setState(335);
				match(LBRACE);
				setState(337); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(336);
					gambi();
					}
					}
					setState(339); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << INT_CONSTANT) | (1L << DOUBLE_CONSTANT) | (1L << IF) | (1L << INT) | (1L << DOUBLE) | (1L << TEXTO) | (1L << WHILE) | (1L << IDENT) | (1L << STRING) | (1L << LPAREN))) != 0) );
				setState(341);
				match(RBRACE);
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

	public static class ForstatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(GramaticaParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(GramaticaParser.LPAREN, 0); }
		public TerminalNode INT() { return getToken(GramaticaParser.INT, 0); }
		public List<AtribContext> atrib() {
			return getRuleContexts(AtribContext.class);
		}
		public AtribContext atrib(int i) {
			return getRuleContext(AtribContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(GramaticaParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(GramaticaParser.SEMICOLON, i);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GramaticaParser.RPAREN, 0); }
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public ForstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterForstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitForstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitForstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForstatementContext forstatement() throws RecognitionException {
		ForstatementContext _localctx = new ForstatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_forstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(FOR);
			setState(346);
			match(LPAREN);
			setState(347);
			match(INT);
			setState(348);
			atrib();
			setState(349);
			match(SEMICOLON);
			setState(350);
			expressao();
			setState(351);
			match(SEMICOLON);
			setState(352);
			atrib();
			setState(353);
			match(RPAREN);
			setState(354);
			comando();
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

	public static class WhilestatementContext extends ParserRuleContext {
		public StatementContext comand;
		public TerminalNode WHILE() { return getToken(GramaticaParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(GramaticaParser.LPAREN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GramaticaParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(GramaticaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(GramaticaParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhilestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterWhilestatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitWhilestatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitWhilestatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhilestatementContext whilestatement() throws RecognitionException {
		WhilestatementContext _localctx = new WhilestatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_whilestatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(WHILE);
			setState(357);
			match(LPAREN);
			setState(358);
			expressao();
			setState(359);
			match(RPAREN);
			setState(360);
			match(LBRACE);
			setState(362); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(361);
				((WhilestatementContext)_localctx).comand = statement();
				}
				}
				setState(364); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << INT_CONSTANT) | (1L << DOUBLE_CONSTANT) | (1L << IF) | (1L << INT) | (1L << DOUBLE) | (1L << TEXTO) | (1L << WHILE) | (1L << IDENT) | (1L << STRING) | (1L << LPAREN))) != 0) );
			setState(366);
			match(RBRACE);
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

	public static class ListacomandosContext extends ParserRuleContext {
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public ListacomandosContext listacomandos() {
			return getRuleContext(ListacomandosContext.class,0);
		}
		public ListacomandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listacomandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterListacomandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitListacomandos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitListacomandos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListacomandosContext listacomandos() throws RecognitionException {
		ListacomandosContext _localctx = new ListacomandosContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_listacomandos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			comando();
			setState(370);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << RETURN) | (1L << INT) | (1L << DOUBLE) | (1L << TEXTO) | (1L << WHILE) | (1L << IDENT) | (1L << LBRACE))) != 0)) {
				{
				setState(369);
				listacomandos();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 24:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u0177\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\6\2B\n\2\r\2\16\2C\3\3\3\3\5\3H\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4T\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5`\n\5\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\5\bl\n\b\3\t\3\t\3\t\3\t\7\tr\n\t\f"+
		"\t\16\tu\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0082\n"+
		"\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\7\21\u00a3\n\21\f\21\16\21\u00a6\13\21\3\21\5\21\u00a9\n\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\7\23\u00b1\n\23\f\23\16\23\u00b4\13\23"+
		"\3\23\5\23\u00b7\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u00c5\n\24\3\25\3\25\5\25\u00c9\n\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\26\3\26\7\26\u00d5\n\26\f\26\16\26\u00d8\13"+
		"\26\3\27\3\27\3\27\7\27\u00dd\n\27\f\27\16\27\u00e0\13\27\3\27\5\27\u00e3"+
		"\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00f8\n\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0114\n\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\7\32\u0128\n\32\f\32\16\32\u012b\13\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\5\33\u0135\n\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\6\35\u0140\n\35\r\35\16\35\u0141\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\6\35\u014c\n\35\r\35\16\35\u014d\3\35\3\35\3\35\3\35\6\35\u0154\n"+
		"\35\r\35\16\35\u0155\3\35\3\35\5\35\u015a\n\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\6\37\u016d"+
		"\n\37\r\37\16\37\u016e\3\37\3\37\3 \3 \5 \u0175\n \3 \2\3\62!\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>\2\4\3\2\20\22"+
		"\3\2\20\21\u0191\2A\3\2\2\2\4G\3\2\2\2\6S\3\2\2\2\b_\3\2\2\2\na\3\2\2"+
		"\2\fe\3\2\2\2\16i\3\2\2\2\20m\3\2\2\2\22\u0081\3\2\2\2\24\u0083\3\2\2"+
		"\2\26\u0086\3\2\2\2\30\u0088\3\2\2\2\32\u008d\3\2\2\2\34\u0091\3\2\2\2"+
		"\36\u0093\3\2\2\2 \u00a8\3\2\2\2\"\u00aa\3\2\2\2$\u00b6\3\2\2\2&\u00c4"+
		"\3\2\2\2(\u00c6\3\2\2\2*\u00cf\3\2\2\2,\u00e2\3\2\2\2.\u00f7\3\2\2\2\60"+
		"\u0113\3\2\2\2\62\u0115\3\2\2\2\64\u0134\3\2\2\2\66\u0136\3\2\2\28\u0159"+
		"\3\2\2\2:\u015b\3\2\2\2<\u0166\3\2\2\2>\u0172\3\2\2\2@B\5\4\3\2A@\3\2"+
		"\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\3\3\2\2\2EH\5\6\4\2FH\5\36\20\2GE"+
		"\3\2\2\2GF\3\2\2\2H\5\3\2\2\2IJ\5\n\6\2JK\7\32\2\2KT\3\2\2\2LM\5\f\7\2"+
		"MN\7\32\2\2NT\3\2\2\2OT\5\22\n\2PT\5\60\31\2QT\58\35\2RT\5<\37\2SI\3\2"+
		"\2\2SL\3\2\2\2SO\3\2\2\2SP\3\2\2\2SQ\3\2\2\2SR\3\2\2\2T\7\3\2\2\2UV\5"+
		"\n\6\2VW\7\32\2\2W`\3\2\2\2XY\5\f\7\2YZ\7\32\2\2Z`\3\2\2\2[`\5\22\n\2"+
		"\\`\5\60\31\2]`\58\35\2^`\5<\37\2_U\3\2\2\2_X\3\2\2\2_[\3\2\2\2_\\\3\2"+
		"\2\2_]\3\2\2\2_^\3\2\2\2`\t\3\2\2\2ab\7\3\2\2bc\5\60\31\2cd\7\27\2\2d"+
		"\13\3\2\2\2ef\7\4\2\2fg\5\60\31\2gh\7\27\2\2h\r\3\2\2\2ik\5\20\t\2jl\5"+
		"\16\b\2kj\3\2\2\2kl\3\2\2\2l\17\3\2\2\2mn\7\t\2\2no\7\24\2\2os\7\30\2"+
		"\2pr\5\22\n\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2"+
		"\2\2vw\7\31\2\2w\21\3\2\2\2xy\5\24\13\2yz\7\32\2\2z\u0082\3\2\2\2{|\5"+
		"\30\r\2|}\7\32\2\2}\u0082\3\2\2\2~\177\5\32\16\2\177\u0080\7\32\2\2\u0080"+
		"\u0082\3\2\2\2\u0081x\3\2\2\2\u0081{\3\2\2\2\u0081~\3\2\2\2\u0082\23\3"+
		"\2\2\2\u0083\u0084\5\26\f\2\u0084\u0085\7\24\2\2\u0085\25\3\2\2\2\u0086"+
		"\u0087\t\2\2\2\u0087\27\3\2\2\2\u0088\u0089\5\26\f\2\u0089\u008a\7\24"+
		"\2\2\u008a\u008b\7\35\2\2\u008b\u008c\5\60\31\2\u008c\31\3\2\2\2\u008d"+
		"\u008e\7\24\2\2\u008e\u008f\7\35\2\2\u008f\u0090\5\60\31\2\u0090\33\3"+
		"\2\2\2\u0091\u0092\7\24\2\2\u0092\35\3\2\2\2\u0093\u0094\7\20\2\2\u0094"+
		"\u0095\7\24\2\2\u0095\u0096\7\5\2\2\u0096\u0097\5 \21\2\u0097\u0098\7"+
		"\27\2\2\u0098\u0099\7\30\2\2\u0099\u009a\5$\23\2\u009a\u009b\7\6\2\2\u009b"+
		"\u009c\5\60\31\2\u009c\u009d\7\32\2\2\u009d\u009e\7\31\2\2\u009e\37\3"+
		"\2\2\2\u009f\u00a4\5\24\13\2\u00a0\u00a1\7\33\2\2\u00a1\u00a3\5\24\13"+
		"\2\u00a2\u00a0\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5"+
		"\3\2\2\2\u00a5\u00a9\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8"+
		"\u009f\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9!\3\2\2\2\u00aa\u00ab\7\24\2\2"+
		"\u00ab\u00ac\7\26\2\2\u00ac\u00ad\5,\27\2\u00ad\u00ae\7\27\2\2\u00ae#"+
		"\3\2\2\2\u00af\u00b1\5&\24\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b7\3\2\2\2\u00b4\u00b2\3\2"+
		"\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b2\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7"+
		"%\3\2\2\2\u00b8\u00c5\58\35\2\u00b9\u00c5\5:\36\2\u00ba\u00bb\5\24\13"+
		"\2\u00bb\u00bc\7\32\2\2\u00bc\u00c5\3\2\2\2\u00bd\u00be\5\32\16\2\u00be"+
		"\u00bf\7\32\2\2\u00bf\u00c5\3\2\2\2\u00c0\u00c1\5\30\r\2\u00c1\u00c2\7"+
		"\32\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c5\5<\37\2\u00c4\u00b8\3\2\2\2\u00c4"+
		"\u00b9\3\2\2\2\u00c4\u00ba\3\2\2\2\u00c4\u00bd\3\2\2\2\u00c4\u00c0\3\2"+
		"\2\2\u00c4\u00c3\3\2\2\2\u00c5\'\3\2\2\2\u00c6\u00c8\7\26\2\2\u00c7\u00c9"+
		"\5*\26\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00cb\7\27\2\2\u00cb\u00cc\7\30\2\2\u00cc\u00cd\5.\30\2\u00cd\u00ce\7"+
		"\31\2\2\u00ce)\3\2\2\2\u00cf\u00d0\t\3\2\2\u00d0\u00d6\7\24\2\2\u00d1"+
		"\u00d2\7\33\2\2\u00d2\u00d3\t\3\2\2\u00d3\u00d5\7\24\2\2\u00d4\u00d1\3"+
		"\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"+\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00de\5\60\31\2\u00da\u00db\7\33\2"+
		"\2\u00db\u00dd\5\60\31\2\u00dc\u00da\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e3\3\2\2\2\u00e0\u00de\3\2"+
		"\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00d9\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3"+
		"-\3\2\2\2\u00e4\u00e5\5\66\34\2\u00e5\u00e6\7\32\2\2\u00e6\u00f8\3\2\2"+
		"\2\u00e7\u00f8\58\35\2\u00e8\u00f8\5:\36\2\u00e9\u00ea\7\30\2\2\u00ea"+
		"\u00eb\5> \2\u00eb\u00ec\7\31\2\2\u00ec\u00f8\3\2\2\2\u00ed\u00ee\5\24"+
		"\13\2\u00ee\u00ef\7\32\2\2\u00ef\u00f8\3\2\2\2\u00f0\u00f1\5\32\16\2\u00f1"+
		"\u00f2\7\32\2\2\u00f2\u00f8\3\2\2\2\u00f3\u00f4\5\30\r\2\u00f4\u00f5\7"+
		"\32\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f8\5<\37\2\u00f7\u00e4\3\2\2\2\u00f7"+
		"\u00e7\3\2\2\2\u00f7\u00e8\3\2\2\2\u00f7\u00e9\3\2\2\2\u00f7\u00ed\3\2"+
		"\2\2\u00f7\u00f0\3\2\2\2\u00f7\u00f3\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8"+
		"/\3\2\2\2\u00f9\u0114\5\62\32\2\u00fa\u00fb\5\62\32\2\u00fb\u00fc\7\37"+
		"\2\2\u00fc\u00fd\5\62\32\2\u00fd\u0114\3\2\2\2\u00fe\u00ff\5\62\32\2\u00ff"+
		"\u0100\7\36\2\2\u0100\u0101\5\62\32\2\u0101\u0114\3\2\2\2\u0102\u0103"+
		"\5\62\32\2\u0103\u0104\7!\2\2\u0104\u0105\5\62\32\2\u0105\u0114\3\2\2"+
		"\2\u0106\u0107\5\62\32\2\u0107\u0108\7\"\2\2\u0108\u0109\5\62\32\2\u0109"+
		"\u0114\3\2\2\2\u010a\u010b\5\62\32\2\u010b\u010c\7 \2\2\u010c\u010d\5"+
		"\62\32\2\u010d\u0114\3\2\2\2\u010e\u010f\5\62\32\2\u010f\u0110\7#\2\2"+
		"\u0110\u0111\5\62\32\2\u0111\u0114\3\2\2\2\u0112\u0114\5\"\22\2\u0113"+
		"\u00f9\3\2\2\2\u0113\u00fa\3\2\2\2\u0113\u00fe\3\2\2\2\u0113\u0102\3\2"+
		"\2\2\u0113\u0106\3\2\2\2\u0113\u010a\3\2\2\2\u0113\u010e\3\2\2\2\u0113"+
		"\u0112\3\2\2\2\u0114\61\3\2\2\2\u0115\u0116\b\32\1\2\u0116\u0117\5\64"+
		"\33\2\u0117\u0129\3\2\2\2\u0118\u0119\f\b\2\2\u0119\u011a\7\'\2\2\u011a"+
		"\u0128\5\62\32\t\u011b\u011c\f\7\2\2\u011c\u011d\7&\2\2\u011d\u0128\5"+
		"\62\32\b\u011e\u011f\f\6\2\2\u011f\u0120\7(\2\2\u0120\u0128\5\62\32\7"+
		"\u0121\u0122\f\5\2\2\u0122\u0123\7%\2\2\u0123\u0128\5\62\32\6\u0124\u0125"+
		"\f\4\2\2\u0125\u0126\7$\2\2\u0126\u0128\5\62\32\5\u0127\u0118\3\2\2\2"+
		"\u0127\u011b\3\2\2\2\u0127\u011e\3\2\2\2\u0127\u0121\3\2\2\2\u0127\u0124"+
		"\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"\63\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u0135\7\7\2\2\u012d\u0135\7\b\2"+
		"\2\u012e\u0135\7\25\2\2\u012f\u0135\5\34\17\2\u0130\u0131\7\26\2\2\u0131"+
		"\u0132\5\60\31\2\u0132\u0133\7\27\2\2\u0133\u0135\3\2\2\2\u0134\u012c"+
		"\3\2\2\2\u0134\u012d\3\2\2\2\u0134\u012e\3\2\2\2\u0134\u012f\3\2\2\2\u0134"+
		"\u0130\3\2\2\2\u0135\65\3\2\2\2\u0136\u0137\7\17\2\2\u0137\u0138\5\60"+
		"\31\2\u0138\67\3\2\2\2\u0139\u013a\7\f\2\2\u013a\u013b\7\26\2\2\u013b"+
		"\u013c\5\60\31\2\u013c\u013d\7\27\2\2\u013d\u013f\7\30\2\2\u013e\u0140"+
		"\5\6\4\2\u013f\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u013f\3\2\2\2\u0141"+
		"\u0142\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\7\31\2\2\u0144\u015a\3"+
		"\2\2\2\u0145\u0146\7\f\2\2\u0146\u0147\7\26\2\2\u0147\u0148\5\60\31\2"+
		"\u0148\u0149\7\27\2\2\u0149\u014b\7\30\2\2\u014a\u014c\5\6\4\2\u014b\u014a"+
		"\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014f\u0150\7\31\2\2\u0150\u0151\7\r\2\2\u0151\u0153\7"+
		"\30\2\2\u0152\u0154\5\b\5\2\u0153\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155"+
		"\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\7\31"+
		"\2\2\u0158\u015a\3\2\2\2\u0159\u0139\3\2\2\2\u0159\u0145\3\2\2\2\u015a"+
		"9\3\2\2\2\u015b\u015c\7\16\2\2\u015c\u015d\7\26\2\2\u015d\u015e\7\20\2"+
		"\2\u015e\u015f\5\32\16\2\u015f\u0160\7\32\2\2\u0160\u0161\5\60\31\2\u0161"+
		"\u0162\7\32\2\2\u0162\u0163\5\32\16\2\u0163\u0164\7\27\2\2\u0164\u0165"+
		"\5.\30\2\u0165;\3\2\2\2\u0166\u0167\7\23\2\2\u0167\u0168\7\26\2\2\u0168"+
		"\u0169\5\60\31\2\u0169\u016a\7\27\2\2\u016a\u016c\7\30\2\2\u016b\u016d"+
		"\5\6\4\2\u016c\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016c\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\7\31\2\2\u0171=\3\2\2\2"+
		"\u0172\u0174\5.\30\2\u0173\u0175\5> \2\u0174\u0173\3\2\2\2\u0174\u0175"+
		"\3\2\2\2\u0175?\3\2\2\2\35CGS_ks\u0081\u00a4\u00a8\u00b2\u00b6\u00c4\u00c8"+
		"\u00d6\u00de\u00e2\u00f7\u0113\u0127\u0129\u0134\u0141\u014d\u0155\u0159"+
		"\u016e\u0174";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}