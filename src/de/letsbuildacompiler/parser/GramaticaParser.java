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
		T__0=1, T__1=2, T__2=3, INT_CONSTANT=4, NULL_CONSTANT=5, DOUBLE_CONSTANT=6, 
		CLASS=7, VOID=8, TRUE=9, FALSE=10, BREAK=11, IF=12, ELSE=13, FOR=14, RETURN=15, 
		NEW=16, STRING=17, INT=18, DOUBLE=19, WHILE=20, BOOLEAN=21, IDENT=22, 
		LPAREN=23, RPAREN=24, LBRACE=25, RBRACE=26, LBRACKET=27, RBRACKET=28, 
		SEMICOLON=29, COMMA=30, DOT=31, ASSIGN=32, GT=33, LT=34, EQ=35, LE=36, 
		GE=37, NEQ=38, PLUS=39, MINUS=40, STAR=41, SLASH=42, REM=43, WHITESPACE=44;
	public static final int
		RULE_teste = 0, RULE_programDecl = 1, RULE_statement = 2, RULE_println = 3, 
		RULE_classe = 4, RULE_declclasse = 5, RULE_escopoclasse = 6, RULE_vardecl = 7, 
		RULE_vardeclatrib = 8, RULE_atrib = 9, RULE_lvalue = 10, RULE_inicializarArranjo = 11, 
		RULE_metoddecl = 12, RULE_paramlist = 13, RULE_metodcall = 14, RULE_comandos = 15, 
		RULE_comando1 = 16, RULE_escopometodo = 17, RULE_parametro = 18, RULE_listaargumento = 19, 
		RULE_comando = 20, RULE_expressao = 21, RULE_term = 22, RULE_factor = 23, 
		RULE_retorno = 24, RULE_ifstatement = 25, RULE_forstatement = 26, RULE_whilestatement = 27, 
		RULE_listacomandos = 28;
	public static final String[] ruleNames = {
		"teste", "programDecl", "statement", "println", "classe", "declclasse", 
		"escopoclasse", "vardecl", "vardeclatrib", "atrib", "lvalue", "inicializarArranjo", 
		"metoddecl", "paramlist", "metodcall", "comandos", "comando1", "escopometodo", 
		"parametro", "listaargumento", "comando", "expressao", "term", "factor", 
		"retorno", "ifstatement", "forstatement", "whilestatement", "listacomandos"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'println('", "' ('", "'return '", null, "'null'", null, "'class'", 
		"'void'", "'true'", "'false'", "'break'", "'if'", "'else'", "'for'", "'return'", 
		"'new'", "'string'", "'int'", "'double'", "'while'", "'boolean'", null, 
		"'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='", 
		"'>'", "'<'", "'=='", "'<='", "'>='", "'!='", "'+'", "'-'", "'*'", "'/'", 
		"'%'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "INT_CONSTANT", "NULL_CONSTANT", "DOUBLE_CONSTANT", 
		"CLASS", "VOID", "TRUE", "FALSE", "BREAK", "IF", "ELSE", "FOR", "RETURN", 
		"NEW", "STRING", "INT", "DOUBLE", "WHILE", "BOOLEAN", "IDENT", "LPAREN", 
		"RPAREN", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "SEMICOLON", "COMMA", 
		"DOT", "ASSIGN", "GT", "LT", "EQ", "LE", "GE", "NEQ", "PLUS", "MINUS", 
		"STAR", "SLASH", "REM", "WHITESPACE"
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
			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(58);
				programDecl();
				}
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << INT_CONSTANT) | (1L << NULL_CONSTANT) | (1L << DOUBLE_CONSTANT) | (1L << STRING) | (1L << INT) | (1L << DOUBLE) | (1L << BOOLEAN) | (1L << IDENT) | (1L << LPAREN))) != 0) );
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
			setState(65);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new ComandoNormalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				statement();
				}
				break;
			case 2:
				_localctx = new MetodoDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
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
		public EscopoclasseContext escopoclasse() {
			return getRuleContext(EscopoclasseContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
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
			setState(72);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				println();
				setState(68);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				escopoclasse();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				expressao();
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
		enterRule(_localctx, 6, RULE_println);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__0);
			setState(75);
			((PrintlnContext)_localctx).argument = expressao();
			setState(76);
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
		enterRule(_localctx, 8, RULE_classe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			declclasse();
			setState(80);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(79);
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
		enterRule(_localctx, 10, RULE_declclasse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(CLASS);
			setState(83);
			match(IDENT);
			setState(84);
			match(LBRACE);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << INT) | (1L << DOUBLE) | (1L << BOOLEAN) | (1L << IDENT))) != 0)) {
				{
				{
				setState(85);
				escopoclasse();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
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
		public InicializarArranjoContext inicializarArranjo() {
			return getRuleContext(InicializarArranjoContext.class,0);
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
		enterRule(_localctx, 12, RULE_escopoclasse);
		try {
			setState(105);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				vardecl();
				setState(94);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				vardeclatrib();
				setState(97);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				atrib();
				setState(100);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				inicializarArranjo();
				setState(103);
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
		public Token nomeVariavel;
		public TerminalNode INT() { return getToken(GramaticaParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(GramaticaParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(GramaticaParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(GramaticaParser.BOOLEAN, 0); }
		public TerminalNode IDENT() { return getToken(GramaticaParser.IDENT, 0); }
		public List<TerminalNode> LBRACKET() { return getTokens(GramaticaParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(GramaticaParser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(GramaticaParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(GramaticaParser.RBRACKET, i);
		}
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
		enterRule(_localctx, 14, RULE_vardecl);
		int _la;
		try {
			_localctx = new DeclaracaoVariaveisContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << INT) | (1L << DOUBLE) | (1L << BOOLEAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(108);
				match(LBRACKET);
				setState(109);
				match(RBRACKET);
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
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
		public Token variavel;
		public TermContext valor;
		public TerminalNode ASSIGN() { return getToken(GramaticaParser.ASSIGN, 0); }
		public TerminalNode INT() { return getToken(GramaticaParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(GramaticaParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(GramaticaParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(GramaticaParser.BOOLEAN, 0); }
		public List<TerminalNode> IDENT() { return getTokens(GramaticaParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(GramaticaParser.IDENT, i);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
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
		enterRule(_localctx, 16, RULE_vardeclatrib);
		int _la;
		try {
			_localctx = new DeclararEAtribuirContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << INT) | (1L << DOUBLE) | (1L << BOOLEAN) | (1L << IDENT))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(118);
			((DeclararEAtribuirContext)_localctx).variavel = match(IDENT);
			setState(119);
			match(ASSIGN);
			setState(120);
			((DeclararEAtribuirContext)_localctx).valor = term(0);
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
		public ExpressaoContext expr;
		public TerminalNode ASSIGN() { return getToken(GramaticaParser.ASSIGN, 0); }
		public TerminalNode IDENT() { return getToken(GramaticaParser.IDENT, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(GramaticaParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(GramaticaParser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(GramaticaParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(GramaticaParser.RBRACKET, i);
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
		enterRule(_localctx, 18, RULE_atrib);
		int _la;
		try {
			_localctx = new AtribuicaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			((AtribuicaoContext)_localctx).variavel = match(IDENT);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(123);
				match(LBRACKET);
				setState(124);
				expressao();
				setState(125);
				match(RBRACKET);
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
			match(ASSIGN);
			setState(133);
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
		public List<TerminalNode> LBRACKET() { return getTokens(GramaticaParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(GramaticaParser.LBRACKET, i);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(GramaticaParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(GramaticaParser.RBRACKET, i);
		}
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
		enterRule(_localctx, 20, RULE_lvalue);
		try {
			int _alt;
			_localctx = new CarregarValorContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			((CarregarValorContext)_localctx).identificador = match(IDENT);
			setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(136);
					match(LBRACKET);
					setState(137);
					expressao();
					setState(138);
					match(RBRACKET);
					}
					} 
				}
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class InicializarArranjoContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(GramaticaParser.ASSIGN, 0); }
		public TerminalNode NEW() { return getToken(GramaticaParser.NEW, 0); }
		public List<TerminalNode> INT() { return getTokens(GramaticaParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GramaticaParser.INT, i);
		}
		public List<TerminalNode> DOUBLE() { return getTokens(GramaticaParser.DOUBLE); }
		public TerminalNode DOUBLE(int i) {
			return getToken(GramaticaParser.DOUBLE, i);
		}
		public List<TerminalNode> STRING() { return getTokens(GramaticaParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(GramaticaParser.STRING, i);
		}
		public List<TerminalNode> BOOLEAN() { return getTokens(GramaticaParser.BOOLEAN); }
		public TerminalNode BOOLEAN(int i) {
			return getToken(GramaticaParser.BOOLEAN, i);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(GramaticaParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(GramaticaParser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(GramaticaParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(GramaticaParser.RBRACKET, i);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public InicializarArranjoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicializarArranjo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterInicializarArranjo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitInicializarArranjo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitInicializarArranjo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicializarArranjoContext inicializarArranjo() throws RecognitionException {
		InicializarArranjoContext _localctx = new InicializarArranjoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_inicializarArranjo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << INT) | (1L << DOUBLE) | (1L << BOOLEAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(148); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(146);
				match(LBRACKET);
				setState(147);
				match(RBRACKET);
				}
				}
				setState(150); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LBRACKET );
			setState(152);
			match(ASSIGN);
			setState(153);
			match(NEW);
			setState(154);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << INT) | (1L << DOUBLE) | (1L << BOOLEAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(159); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(155);
				match(LBRACKET);
				setState(156);
				expressao();
				setState(157);
				match(RBRACKET);
				}
				}
				setState(161); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LBRACKET );
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
		enterRule(_localctx, 24, RULE_metoddecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			((MetoddeclContext)_localctx).type = match(INT);
			setState(164);
			((MetoddeclContext)_localctx).nomeMetodo = match(IDENT);
			setState(165);
			match(T__1);
			setState(166);
			((MetoddeclContext)_localctx).parametros = paramlist();
			setState(167);
			match(RPAREN);
			setState(168);
			match(LBRACE);
			setState(169);
			((MetoddeclContext)_localctx).com = comandos();
			setState(170);
			match(T__2);
			setState(171);
			expressao();
			setState(172);
			match(SEMICOLON);
			setState(173);
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
		enterRule(_localctx, 26, RULE_paramlist);
		int _la;
		try {
			setState(184);
			switch (_input.LA(1)) {
			case STRING:
			case INT:
			case DOUBLE:
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				((ParamlistContext)_localctx).vardecl = vardecl();
				((ParamlistContext)_localctx).decl.add(((ParamlistContext)_localctx).vardecl);
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(176);
					match(COMMA);
					setState(177);
					((ParamlistContext)_localctx).vardecl = vardecl();
					((ParamlistContext)_localctx).decl.add(((ParamlistContext)_localctx).vardecl);
					}
					}
					setState(182);
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
		enterRule(_localctx, 28, RULE_metodcall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			((MetodcallContext)_localctx).nomeMetodo = match(IDENT);
			setState(187);
			match(LPAREN);
			setState(188);
			((MetodcallContext)_localctx).args = listaargumento();
			setState(189);
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
		enterRule(_localctx, 30, RULE_comandos);
		int _la;
		try {
			setState(198);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BREAK) | (1L << IF) | (1L << FOR) | (1L << STRING) | (1L << INT) | (1L << DOUBLE) | (1L << WHILE) | (1L << BOOLEAN) | (1L << IDENT) | (1L << SEMICOLON))) != 0)) {
					{
					{
					setState(191);
					comando1();
					}
					}
					setState(196);
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
		public TerminalNode BREAK() { return getToken(GramaticaParser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(GramaticaParser.SEMICOLON, 0); }
		public VardeclContext vardecl() {
			return getRuleContext(VardeclContext.class,0);
		}
		public AtribContext atrib() {
			return getRuleContext(AtribContext.class,0);
		}
		public VardeclatribContext vardeclatrib() {
			return getRuleContext(VardeclatribContext.class,0);
		}
		public InicializarArranjoContext inicializarArranjo() {
			return getRuleContext(InicializarArranjoContext.class,0);
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
		enterRule(_localctx, 32, RULE_comando1);
		try {
			setState(218);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				ifstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				forstatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				match(BREAK);
				setState(203);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(204);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(205);
				vardecl();
				setState(206);
				match(SEMICOLON);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(208);
				atrib();
				setState(209);
				match(SEMICOLON);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(211);
				vardeclatrib();
				setState(212);
				match(SEMICOLON);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(214);
				inicializarArranjo();
				setState(215);
				match(SEMICOLON);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(217);
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
		enterRule(_localctx, 34, RULE_escopometodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(LPAREN);
			setState(222);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << INT) | (1L << DOUBLE) | (1L << BOOLEAN))) != 0)) {
				{
				setState(221);
				parametro();
				}
			}

			setState(224);
			match(RPAREN);
			setState(225);
			match(LBRACE);
			setState(226);
			comando();
			setState(227);
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
		public List<TerminalNode> STRING() { return getTokens(GramaticaParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(GramaticaParser.STRING, i);
		}
		public List<TerminalNode> BOOLEAN() { return getTokens(GramaticaParser.BOOLEAN); }
		public TerminalNode BOOLEAN(int i) {
			return getToken(GramaticaParser.BOOLEAN, i);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(GramaticaParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(GramaticaParser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(GramaticaParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(GramaticaParser.RBRACKET, i);
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
		enterRule(_localctx, 36, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(229);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << INT) | (1L << DOUBLE) | (1L << BOOLEAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(230);
				match(LBRACKET);
				setState(231);
				match(RBRACKET);
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(237);
			match(IDENT);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(238);
				match(COMMA);
				setState(239);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << INT) | (1L << DOUBLE) | (1L << BOOLEAN))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACKET) {
					{
					{
					setState(240);
					match(LBRACKET);
					setState(241);
					match(RBRACKET);
					}
					}
					setState(246);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(247);
				match(IDENT);
				}
				}
				setState(252);
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
		enterRule(_localctx, 38, RULE_listaargumento);
		int _la;
		try {
			setState(262);
			switch (_input.LA(1)) {
			case INT_CONSTANT:
			case NULL_CONSTANT:
			case DOUBLE_CONSTANT:
			case IDENT:
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				((ListaargumentoContext)_localctx).expressao = expressao();
				((ListaargumentoContext)_localctx).exp.add(((ListaargumentoContext)_localctx).expressao);
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(254);
					match(COMMA);
					setState(255);
					((ListaargumentoContext)_localctx).expressao = expressao();
					((ListaargumentoContext)_localctx).exp.add(((ListaargumentoContext)_localctx).expressao);
					}
					}
					setState(260);
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
		public TerminalNode BREAK() { return getToken(GramaticaParser.BREAK, 0); }
		public VardeclContext vardecl() {
			return getRuleContext(VardeclContext.class,0);
		}
		public AtribContext atrib() {
			return getRuleContext(AtribContext.class,0);
		}
		public VardeclatribContext vardeclatrib() {
			return getRuleContext(VardeclatribContext.class,0);
		}
		public InicializarArranjoContext inicializarArranjo() {
			return getRuleContext(InicializarArranjoContext.class,0);
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
		enterRule(_localctx, 40, RULE_comando);
		try {
			setState(289);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				retorno();
				setState(265);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				ifstatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(268);
				forstatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(269);
				match(LBRACE);
				setState(270);
				listacomandos();
				setState(271);
				match(RBRACE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(273);
				match(BREAK);
				setState(274);
				match(SEMICOLON);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(275);
				match(SEMICOLON);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(276);
				vardecl();
				setState(277);
				match(SEMICOLON);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(279);
				atrib();
				setState(280);
				match(SEMICOLON);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(282);
				vardeclatrib();
				setState(283);
				match(SEMICOLON);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(285);
				inicializarArranjo();
				setState(286);
				match(SEMICOLON);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(288);
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
		public TermContext direita;
		public TerminalNode EQ() { return getToken(GramaticaParser.EQ, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
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
		public TermContext direita;
		public TerminalNode LE() { return getToken(GramaticaParser.LE, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
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
		public TermContext direita;
		public TerminalNode GE() { return getToken(GramaticaParser.GE, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
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
		public TermContext direita;
		public TerminalNode NEQ() { return getToken(GramaticaParser.NEQ, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
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
		public TermContext direita;
		public TerminalNode LT() { return getToken(GramaticaParser.LT, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
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
		public TermContext direita;
		public TerminalNode GT() { return getToken(GramaticaParser.GT, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
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
		enterRule(_localctx, 42, RULE_expressao);
		try {
			setState(317);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new NumexprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				term(0);
				}
				break;
			case 2:
				_localctx = new MenorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				((MenorContext)_localctx).esquerda = term(0);
				setState(293);
				match(LT);
				setState(294);
				((MenorContext)_localctx).direita = term(0);
				}
				break;
			case 3:
				_localctx = new MaiorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
				((MaiorContext)_localctx).esquerda = term(0);
				setState(297);
				match(GT);
				setState(298);
				((MaiorContext)_localctx).direita = term(0);
				}
				break;
			case 4:
				_localctx = new MenorOuEquivalenteContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(300);
				((MenorOuEquivalenteContext)_localctx).esquerda = term(0);
				setState(301);
				match(LE);
				setState(302);
				((MenorOuEquivalenteContext)_localctx).direita = term(0);
				}
				break;
			case 5:
				_localctx = new MaiorOuEquivalenteContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(304);
				((MaiorOuEquivalenteContext)_localctx).esquerda = term(0);
				setState(305);
				match(GE);
				setState(306);
				((MaiorOuEquivalenteContext)_localctx).direita = term(0);
				}
				break;
			case 6:
				_localctx = new EquivalenteContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(308);
				((EquivalenteContext)_localctx).esquerda = term(0);
				setState(309);
				match(EQ);
				setState(310);
				((EquivalenteContext)_localctx).direita = term(0);
				}
				break;
			case 7:
				_localctx = new DiferenteContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(312);
				((DiferenteContext)_localctx).esquerda = term(0);
				setState(313);
				match(NEQ);
				setState(314);
				((DiferenteContext)_localctx).direita = term(0);
				}
				break;
			case 8:
				_localctx = new ChamarMetodoContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(316);
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
		public TerminalNode STAR() { return getToken(GramaticaParser.STAR, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
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
		public TerminalNode MINUS() { return getToken(GramaticaParser.MINUS, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
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
		public TerminalNode PLUS() { return getToken(GramaticaParser.PLUS, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
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
		public TerminalNode SLASH() { return getToken(GramaticaParser.SLASH, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
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
		public TerminalNode REM() { return getToken(GramaticaParser.REM, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new FatorContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(320);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(339);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(337);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new DivisaoContext(new TermContext(_parentctx, _parentState));
						((DivisaoContext)_localctx).esquerda = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(322);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(323);
						match(SLASH);
						setState(324);
						((DivisaoContext)_localctx).esquerda = term(7);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicacaoContext(new TermContext(_parentctx, _parentState));
						((MultiplicacaoContext)_localctx).esquerda = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(325);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(326);
						match(STAR);
						setState(327);
						((MultiplicacaoContext)_localctx).esquerda = term(6);
						}
						break;
					case 3:
						{
						_localctx = new ModuloContext(new TermContext(_parentctx, _parentState));
						((ModuloContext)_localctx).esquerda = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(328);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(329);
						match(REM);
						setState(330);
						((ModuloContext)_localctx).esquerda = term(5);
						}
						break;
					case 4:
						{
						_localctx = new SubtracaoContext(new TermContext(_parentctx, _parentState));
						((SubtracaoContext)_localctx).esquerda = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(331);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(332);
						match(MINUS);
						setState(333);
						((SubtracaoContext)_localctx).esquerda = term(4);
						}
						break;
					case 5:
						{
						_localctx = new SomaContext(new TermContext(_parentctx, _parentState));
						((SomaContext)_localctx).esquerda = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(334);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(335);
						match(PLUS);
						setState(336);
						((SomaContext)_localctx).esquerda = term(3);
						}
						break;
					}
					} 
				}
				setState(341);
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
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
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
	public static class NullContext extends FactorContext {
		public TerminalNode NULL_CONSTANT() { return getToken(GramaticaParser.NULL_CONSTANT, 0); }
		public NullContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitNull(this);
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
		enterRule(_localctx, 46, RULE_factor);
		try {
			setState(350);
			switch (_input.LA(1)) {
			case INT_CONSTANT:
				_localctx = new NumeroInteiroContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				((NumeroInteiroContext)_localctx).numero = match(INT_CONSTANT);
				}
				break;
			case DOUBLE_CONSTANT:
				_localctx = new NumeroRealContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				((NumeroRealContext)_localctx).numero = match(DOUBLE_CONSTANT);
				}
				break;
			case NULL_CONSTANT:
				_localctx = new NullContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(344);
				match(NULL_CONSTANT);
				}
				break;
			case IDENT:
				_localctx = new ChamarLvalueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(345);
				lvalue();
				}
				break;
			case LPAREN:
				_localctx = new ParentesisContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(346);
				match(LPAREN);
				setState(347);
				term(0);
				setState(348);
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
		enterRule(_localctx, 48, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(RETURN);
			setState(353);
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
		public TerminalNode IF() { return getToken(GramaticaParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(GramaticaParser.LPAREN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GramaticaParser.RPAREN, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(GramaticaParser.ELSE, 0); }
		public IfstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterIfstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitIfstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitIfstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstatementContext ifstatement() throws RecognitionException {
		IfstatementContext _localctx = new IfstatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ifstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(IF);
			setState(356);
			match(LPAREN);
			setState(357);
			expressao();
			setState(358);
			match(RPAREN);
			setState(359);
			comando();
			setState(362);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(360);
				match(ELSE);
				setState(361);
				comando();
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
		enterRule(_localctx, 52, RULE_forstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(FOR);
			setState(365);
			match(LPAREN);
			setState(366);
			match(INT);
			setState(367);
			atrib();
			setState(368);
			match(SEMICOLON);
			setState(369);
			expressao();
			setState(370);
			match(SEMICOLON);
			setState(371);
			atrib();
			setState(372);
			match(RPAREN);
			setState(373);
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
		public TerminalNode WHILE() { return getToken(GramaticaParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(GramaticaParser.LPAREN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GramaticaParser.RPAREN, 0); }
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
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
		enterRule(_localctx, 54, RULE_whilestatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(WHILE);
			setState(376);
			match(LPAREN);
			setState(377);
			expressao();
			setState(378);
			match(RPAREN);
			setState(379);
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
		enterRule(_localctx, 56, RULE_listacomandos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			comando();
			setState(383);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BREAK) | (1L << IF) | (1L << FOR) | (1L << RETURN) | (1L << STRING) | (1L << INT) | (1L << DOUBLE) | (1L << WHILE) | (1L << BOOLEAN) | (1L << IDENT) | (1L << LBRACE) | (1L << SEMICOLON))) != 0)) {
				{
				setState(382);
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
		case 22:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3.\u0184\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\6\2>\n\2\r\2\16"+
		"\2?\3\3\3\3\5\3D\n\3\3\4\3\4\3\4\3\4\3\4\5\4K\n\4\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\5\6S\n\6\3\7\3\7\3\7\3\7\7\7Y\n\7\f\7\16\7\\\13\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bl\n\b\3\t\3\t\3\t\7\tq\n\t"+
		"\f\t\16\tt\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\7"+
		"\13\u0082\n\13\f\13\16\13\u0085\13\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\7\f\u008f\n\f\f\f\16\f\u0092\13\f\3\r\3\r\3\r\6\r\u0097\n\r\r\r\16"+
		"\r\u0098\3\r\3\r\3\r\3\r\3\r\3\r\3\r\6\r\u00a2\n\r\r\r\16\r\u00a3\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\7\17\u00b5\n\17\f\17\16\17\u00b8\13\17\3\17\5\17\u00bb\n\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\7\21\u00c3\n\21\f\21\16\21\u00c6\13\21\3\21\5\21"+
		"\u00c9\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00dd\n\22\3\23\3\23\5\23\u00e1\n"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\7\24\u00eb\n\24\f\24\16\24"+
		"\u00ee\13\24\3\24\3\24\3\24\3\24\3\24\7\24\u00f5\n\24\f\24\16\24\u00f8"+
		"\13\24\3\24\7\24\u00fb\n\24\f\24\16\24\u00fe\13\24\3\25\3\25\3\25\7\25"+
		"\u0103\n\25\f\25\16\25\u0106\13\25\3\25\5\25\u0109\n\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0124\n\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0140\n\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\7\30\u0154\n\30\f\30\16\30\u0157\13\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\5\31\u0161\n\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u016d\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\5\36\u0182\n\36"+
		"\3\36\2\3.\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:\2\4\4\2\23\25\27\27\4\2\23\25\27\30\u01a2\2=\3\2\2\2\4C\3\2\2\2"+
		"\6J\3\2\2\2\bL\3\2\2\2\nP\3\2\2\2\fT\3\2\2\2\16k\3\2\2\2\20m\3\2\2\2\22"+
		"w\3\2\2\2\24|\3\2\2\2\26\u0089\3\2\2\2\30\u0093\3\2\2\2\32\u00a5\3\2\2"+
		"\2\34\u00ba\3\2\2\2\36\u00bc\3\2\2\2 \u00c8\3\2\2\2\"\u00dc\3\2\2\2$\u00de"+
		"\3\2\2\2&\u00e7\3\2\2\2(\u0108\3\2\2\2*\u0123\3\2\2\2,\u013f\3\2\2\2."+
		"\u0141\3\2\2\2\60\u0160\3\2\2\2\62\u0162\3\2\2\2\64\u0165\3\2\2\2\66\u016e"+
		"\3\2\2\28\u0179\3\2\2\2:\u017f\3\2\2\2<>\5\4\3\2=<\3\2\2\2>?\3\2\2\2?"+
		"=\3\2\2\2?@\3\2\2\2@\3\3\2\2\2AD\5\6\4\2BD\5\32\16\2CA\3\2\2\2CB\3\2\2"+
		"\2D\5\3\2\2\2EF\5\b\5\2FG\7\37\2\2GK\3\2\2\2HK\5\16\b\2IK\5,\27\2JE\3"+
		"\2\2\2JH\3\2\2\2JI\3\2\2\2K\7\3\2\2\2LM\7\3\2\2MN\5,\27\2NO\7\32\2\2O"+
		"\t\3\2\2\2PR\5\f\7\2QS\5\n\6\2RQ\3\2\2\2RS\3\2\2\2S\13\3\2\2\2TU\7\t\2"+
		"\2UV\7\30\2\2VZ\7\33\2\2WY\5\16\b\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3"+
		"\2\2\2[]\3\2\2\2\\Z\3\2\2\2]^\7\34\2\2^\r\3\2\2\2_`\5\20\t\2`a\7\37\2"+
		"\2al\3\2\2\2bc\5\22\n\2cd\7\37\2\2dl\3\2\2\2ef\5\24\13\2fg\7\37\2\2gl"+
		"\3\2\2\2hi\5\30\r\2ij\7\37\2\2jl\3\2\2\2k_\3\2\2\2kb\3\2\2\2ke\3\2\2\2"+
		"kh\3\2\2\2l\17\3\2\2\2mr\t\2\2\2no\7\35\2\2oq\7\36\2\2pn\3\2\2\2qt\3\2"+
		"\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uv\7\30\2\2v\21\3\2\2\2wx"+
		"\t\3\2\2xy\7\30\2\2yz\7\"\2\2z{\5.\30\2{\23\3\2\2\2|\u0083\7\30\2\2}~"+
		"\7\35\2\2~\177\5,\27\2\177\u0080\7\36\2\2\u0080\u0082\3\2\2\2\u0081}\3"+
		"\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\7\"\2\2\u0087\u0088\5,"+
		"\27\2\u0088\25\3\2\2\2\u0089\u0090\7\30\2\2\u008a\u008b\7\35\2\2\u008b"+
		"\u008c\5,\27\2\u008c\u008d\7\36\2\2\u008d\u008f\3\2\2\2\u008e\u008a\3"+
		"\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\27\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0096\t\2\2\2\u0094\u0095\7\35\2"+
		"\2\u0095\u0097\7\36\2\2\u0096\u0094\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\7\""+
		"\2\2\u009b\u009c\7\22\2\2\u009c\u00a1\t\2\2\2\u009d\u009e\7\35\2\2\u009e"+
		"\u009f\5,\27\2\u009f\u00a0\7\36\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009d\3"+
		"\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\31\3\2\2\2\u00a5\u00a6\7\24\2\2\u00a6\u00a7\7\30\2\2\u00a7\u00a8\7\4"+
		"\2\2\u00a8\u00a9\5\34\17\2\u00a9\u00aa\7\32\2\2\u00aa\u00ab\7\33\2\2\u00ab"+
		"\u00ac\5 \21\2\u00ac\u00ad\7\5\2\2\u00ad\u00ae\5,\27\2\u00ae\u00af\7\37"+
		"\2\2\u00af\u00b0\7\34\2\2\u00b0\33\3\2\2\2\u00b1\u00b6\5\20\t\2\u00b2"+
		"\u00b3\7 \2\2\u00b3\u00b5\5\20\t\2\u00b4\u00b2\3\2\2\2\u00b5\u00b8\3\2"+
		"\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00bb\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b1\3\2\2\2\u00ba\u00b9\3\2"+
		"\2\2\u00bb\35\3\2\2\2\u00bc\u00bd\7\30\2\2\u00bd\u00be\7\31\2\2\u00be"+
		"\u00bf\5(\25\2\u00bf\u00c0\7\32\2\2\u00c0\37\3\2\2\2\u00c1\u00c3\5\"\22"+
		"\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5"+
		"\3\2\2\2\u00c5\u00c9\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8"+
		"\u00c4\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9!\3\2\2\2\u00ca\u00dd\5\64\33"+
		"\2\u00cb\u00dd\5\66\34\2\u00cc\u00cd\7\r\2\2\u00cd\u00dd\7\37\2\2\u00ce"+
		"\u00dd\7\37\2\2\u00cf\u00d0\5\20\t\2\u00d0\u00d1\7\37\2\2\u00d1\u00dd"+
		"\3\2\2\2\u00d2\u00d3\5\24\13\2\u00d3\u00d4\7\37\2\2\u00d4\u00dd\3\2\2"+
		"\2\u00d5\u00d6\5\22\n\2\u00d6\u00d7\7\37\2\2\u00d7\u00dd\3\2\2\2\u00d8"+
		"\u00d9\5\30\r\2\u00d9\u00da\7\37\2\2\u00da\u00dd\3\2\2\2\u00db\u00dd\5"+
		"8\35\2\u00dc\u00ca\3\2\2\2\u00dc\u00cb\3\2\2\2\u00dc\u00cc\3\2\2\2\u00dc"+
		"\u00ce\3\2\2\2\u00dc\u00cf\3\2\2\2\u00dc\u00d2\3\2\2\2\u00dc\u00d5\3\2"+
		"\2\2\u00dc\u00d8\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd#\3\2\2\2\u00de\u00e0"+
		"\7\31\2\2\u00df\u00e1\5&\24\2\u00e0\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2"+
		"\u00e1\u00e2\3\2\2\2\u00e2\u00e3\7\32\2\2\u00e3\u00e4\7\33\2\2\u00e4\u00e5"+
		"\5*\26\2\u00e5\u00e6\7\34\2\2\u00e6%\3\2\2\2\u00e7\u00ec\t\2\2\2\u00e8"+
		"\u00e9\7\35\2\2\u00e9\u00eb\7\36\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ee\3"+
		"\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ef\u00fc\7\30\2\2\u00f0\u00f1\7 \2\2\u00f1\u00f6\t\2"+
		"\2\2\u00f2\u00f3\7\35\2\2\u00f3\u00f5\7\36\2\2\u00f4\u00f2\3\2\2\2\u00f5"+
		"\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2"+
		"\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fb\7\30\2\2\u00fa\u00f0\3\2\2\2\u00fb"+
		"\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\'\3\2\2\2"+
		"\u00fe\u00fc\3\2\2\2\u00ff\u0104\5,\27\2\u0100\u0101\7 \2\2\u0101\u0103"+
		"\5,\27\2\u0102\u0100\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104"+
		"\u0105\3\2\2\2\u0105\u0109\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0109\3\2"+
		"\2\2\u0108\u00ff\3\2\2\2\u0108\u0107\3\2\2\2\u0109)\3\2\2\2\u010a\u010b"+
		"\5\62\32\2\u010b\u010c\7\37\2\2\u010c\u0124\3\2\2\2\u010d\u0124\5\64\33"+
		"\2\u010e\u0124\5\66\34\2\u010f\u0110\7\33\2\2\u0110\u0111\5:\36\2\u0111"+
		"\u0112\7\34\2\2\u0112\u0124\3\2\2\2\u0113\u0114\7\r\2\2\u0114\u0124\7"+
		"\37\2\2\u0115\u0124\7\37\2\2\u0116\u0117\5\20\t\2\u0117\u0118\7\37\2\2"+
		"\u0118\u0124\3\2\2\2\u0119\u011a\5\24\13\2\u011a\u011b\7\37\2\2\u011b"+
		"\u0124\3\2\2\2\u011c\u011d\5\22\n\2\u011d\u011e\7\37\2\2\u011e\u0124\3"+
		"\2\2\2\u011f\u0120\5\30\r\2\u0120\u0121\7\37\2\2\u0121\u0124\3\2\2\2\u0122"+
		"\u0124\58\35\2\u0123\u010a\3\2\2\2\u0123\u010d\3\2\2\2\u0123\u010e\3\2"+
		"\2\2\u0123\u010f\3\2\2\2\u0123\u0113\3\2\2\2\u0123\u0115\3\2\2\2\u0123"+
		"\u0116\3\2\2\2\u0123\u0119\3\2\2\2\u0123\u011c\3\2\2\2\u0123\u011f\3\2"+
		"\2\2\u0123\u0122\3\2\2\2\u0124+\3\2\2\2\u0125\u0140\5.\30\2\u0126\u0127"+
		"\5.\30\2\u0127\u0128\7$\2\2\u0128\u0129\5.\30\2\u0129\u0140\3\2\2\2\u012a"+
		"\u012b\5.\30\2\u012b\u012c\7#\2\2\u012c\u012d\5.\30\2\u012d\u0140\3\2"+
		"\2\2\u012e\u012f\5.\30\2\u012f\u0130\7&\2\2\u0130\u0131\5.\30\2\u0131"+
		"\u0140\3\2\2\2\u0132\u0133\5.\30\2\u0133\u0134\7\'\2\2\u0134\u0135\5."+
		"\30\2\u0135\u0140\3\2\2\2\u0136\u0137\5.\30\2\u0137\u0138\7%\2\2\u0138"+
		"\u0139\5.\30\2\u0139\u0140\3\2\2\2\u013a\u013b\5.\30\2\u013b\u013c\7("+
		"\2\2\u013c\u013d\5.\30\2\u013d\u0140\3\2\2\2\u013e\u0140\5\36\20\2\u013f"+
		"\u0125\3\2\2\2\u013f\u0126\3\2\2\2\u013f\u012a\3\2\2\2\u013f\u012e\3\2"+
		"\2\2\u013f\u0132\3\2\2\2\u013f\u0136\3\2\2\2\u013f\u013a\3\2\2\2\u013f"+
		"\u013e\3\2\2\2\u0140-\3\2\2\2\u0141\u0142\b\30\1\2\u0142\u0143\5\60\31"+
		"\2\u0143\u0155\3\2\2\2\u0144\u0145\f\b\2\2\u0145\u0146\7,\2\2\u0146\u0154"+
		"\5.\30\t\u0147\u0148\f\7\2\2\u0148\u0149\7+\2\2\u0149\u0154\5.\30\b\u014a"+
		"\u014b\f\6\2\2\u014b\u014c\7-\2\2\u014c\u0154\5.\30\7\u014d\u014e\f\5"+
		"\2\2\u014e\u014f\7*\2\2\u014f\u0154\5.\30\6\u0150\u0151\f\4\2\2\u0151"+
		"\u0152\7)\2\2\u0152\u0154\5.\30\5\u0153\u0144\3\2\2\2\u0153\u0147\3\2"+
		"\2\2\u0153\u014a\3\2\2\2\u0153\u014d\3\2\2\2\u0153\u0150\3\2\2\2\u0154"+
		"\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156/\3\2\2\2"+
		"\u0157\u0155\3\2\2\2\u0158\u0161\7\6\2\2\u0159\u0161\7\b\2\2\u015a\u0161"+
		"\7\7\2\2\u015b\u0161\5\26\f\2\u015c\u015d\7\31\2\2\u015d\u015e\5.\30\2"+
		"\u015e\u015f\7\32\2\2\u015f\u0161\3\2\2\2\u0160\u0158\3\2\2\2\u0160\u0159"+
		"\3\2\2\2\u0160\u015a\3\2\2\2\u0160\u015b\3\2\2\2\u0160\u015c\3\2\2\2\u0161"+
		"\61\3\2\2\2\u0162\u0163\7\21\2\2\u0163\u0164\5,\27\2\u0164\63\3\2\2\2"+
		"\u0165\u0166\7\16\2\2\u0166\u0167\7\31\2\2\u0167\u0168\5,\27\2\u0168\u0169"+
		"\7\32\2\2\u0169\u016c\5*\26\2\u016a\u016b\7\17\2\2\u016b\u016d\5*\26\2"+
		"\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\65\3\2\2\2\u016e\u016f"+
		"\7\20\2\2\u016f\u0170\7\31\2\2\u0170\u0171\7\24\2\2\u0171\u0172\5\24\13"+
		"\2\u0172\u0173\7\37\2\2\u0173\u0174\5,\27\2\u0174\u0175\7\37\2\2\u0175"+
		"\u0176\5\24\13\2\u0176\u0177\7\32\2\2\u0177\u0178\5*\26\2\u0178\67\3\2"+
		"\2\2\u0179\u017a\7\26\2\2\u017a\u017b\7\31\2\2\u017b\u017c\5,\27\2\u017c"+
		"\u017d\7\32\2\2\u017d\u017e\5*\26\2\u017e9\3\2\2\2\u017f\u0181\5*\26\2"+
		"\u0180\u0182\5:\36\2\u0181\u0180\3\2\2\2\u0181\u0182\3\2\2\2\u0182;\3"+
		"\2\2\2\37?CJRZkr\u0083\u0090\u0098\u00a3\u00b6\u00ba\u00c4\u00c8\u00dc"+
		"\u00e0\u00ec\u00f6\u00fc\u0104\u0108\u0123\u013f\u0153\u0155\u0160\u016c"+
		"\u0181";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}