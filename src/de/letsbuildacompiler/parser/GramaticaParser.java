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
		RULE_metoddecl = 12, RULE_escopometodo = 13, RULE_parametro = 14, RULE_listaargumento = 15, 
		RULE_comando = 16, RULE_expressao = 17, RULE_metodcall = 18, RULE_term = 19, 
		RULE_factor = 20, RULE_retorno = 21, RULE_ifstatement = 22, RULE_forstatement = 23, 
		RULE_whilestatement = 24, RULE_listacomandos = 25;
	public static final String[] ruleNames = {
		"teste", "programDecl", "statement", "println", "classe", "declclasse", 
		"escopoclasse", "vardecl", "vardeclatrib", "atrib", "lvalue", "inicializarArranjo", 
		"metoddecl", "escopometodo", "parametro", "listaargumento", "comando", 
		"expressao", "metodcall", "term", "factor", "retorno", "ifstatement", 
		"forstatement", "whilestatement", "listacomandos"
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
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52);
				programDecl();
				}
				}
				setState(55); 
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
			setState(59);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new ComandoNormalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				statement();
				}
				break;
			case 2:
				_localctx = new MetodoDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
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
			setState(66);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				println();
				setState(62);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				escopoclasse();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
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
			setState(68);
			match(T__0);
			setState(69);
			((PrintlnContext)_localctx).argument = expressao();
			setState(70);
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
			setState(72);
			declclasse();
			setState(74);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(73);
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
			setState(76);
			match(CLASS);
			setState(77);
			match(IDENT);
			setState(78);
			match(LBRACE);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << INT) | (1L << DOUBLE) | (1L << BOOLEAN) | (1L << IDENT))) != 0)) {
				{
				{
				setState(79);
				escopoclasse();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
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
			setState(99);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				vardecl();
				setState(88);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				vardeclatrib();
				setState(91);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				atrib();
				setState(94);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(96);
				inicializarArranjo();
				setState(97);
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
			setState(101);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << INT) | (1L << DOUBLE) | (1L << BOOLEAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(102);
				match(LBRACKET);
				setState(103);
				match(RBRACKET);
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
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
			setState(111);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << INT) | (1L << DOUBLE) | (1L << BOOLEAN) | (1L << IDENT))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(112);
			((DeclararEAtribuirContext)_localctx).variavel = match(IDENT);
			setState(113);
			match(ASSIGN);
			setState(114);
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
			setState(116);
			((AtribuicaoContext)_localctx).variavel = match(IDENT);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(117);
				match(LBRACKET);
				setState(118);
				expressao();
				setState(119);
				match(RBRACKET);
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
			match(ASSIGN);
			setState(127);
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
			setState(129);
			((CarregarValorContext)_localctx).identificador = match(IDENT);
			setState(136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(130);
					match(LBRACKET);
					setState(131);
					expressao();
					setState(132);
					match(RBRACKET);
					}
					} 
				}
				setState(138);
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
			setState(139);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << INT) | (1L << DOUBLE) | (1L << BOOLEAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(142); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(140);
				match(LBRACKET);
				setState(141);
				match(RBRACKET);
				}
				}
				setState(144); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LBRACKET );
			setState(146);
			match(ASSIGN);
			setState(147);
			match(NEW);
			setState(148);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << INT) | (1L << DOUBLE) | (1L << BOOLEAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(153); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(149);
				match(LBRACKET);
				setState(150);
				expressao();
				setState(151);
				match(RBRACKET);
				}
				}
				setState(155); 
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
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(GramaticaParser.IDENT, 0); }
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
			setState(157);
			((MetoddeclContext)_localctx).type = match(INT);
			setState(158);
			((MetoddeclContext)_localctx).nomeMetodo = match(IDENT);
			setState(159);
			match(T__1);
			setState(160);
			match(RPAREN);
			setState(161);
			match(LBRACE);
			setState(162);
			match(T__2);
			setState(163);
			expressao();
			setState(164);
			match(SEMICOLON);
			setState(165);
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
		enterRule(_localctx, 26, RULE_escopometodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(LPAREN);
			setState(169);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << INT) | (1L << DOUBLE) | (1L << BOOLEAN))) != 0)) {
				{
				setState(168);
				parametro();
				}
			}

			setState(171);
			match(RPAREN);
			setState(172);
			match(LBRACE);
			setState(173);
			comando();
			setState(174);
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
		enterRule(_localctx, 28, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(176);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << INT) | (1L << DOUBLE) | (1L << BOOLEAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(177);
				match(LBRACKET);
				setState(178);
				match(RBRACKET);
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(184);
			match(IDENT);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(185);
				match(COMMA);
				setState(186);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << INT) | (1L << DOUBLE) | (1L << BOOLEAN))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACKET) {
					{
					{
					setState(187);
					match(LBRACKET);
					setState(188);
					match(RBRACKET);
					}
					}
					setState(193);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(194);
				match(IDENT);
				}
				}
				setState(199);
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
		enterRule(_localctx, 30, RULE_listaargumento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			expressao();
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(201);
				match(COMMA);
				setState(202);
				expressao();
				}
				}
				setState(207);
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
		enterRule(_localctx, 32, RULE_comando);
		try {
			setState(233);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				retorno();
				setState(209);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				ifstatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				forstatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(213);
				match(LBRACE);
				setState(214);
				listacomandos();
				setState(215);
				match(RBRACE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(217);
				match(BREAK);
				setState(218);
				match(SEMICOLON);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(219);
				match(SEMICOLON);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(220);
				vardecl();
				setState(221);
				match(SEMICOLON);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(223);
				atrib();
				setState(224);
				match(SEMICOLON);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(226);
				vardeclatrib();
				setState(227);
				match(SEMICOLON);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(229);
				inicializarArranjo();
				setState(230);
				match(SEMICOLON);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(232);
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
		enterRule(_localctx, 34, RULE_expressao);
		try {
			setState(261);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new NumexprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				term(0);
				}
				break;
			case 2:
				_localctx = new MenorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				((MenorContext)_localctx).esquerda = term(0);
				setState(237);
				match(LT);
				setState(238);
				((MenorContext)_localctx).direita = term(0);
				}
				break;
			case 3:
				_localctx = new MaiorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				((MaiorContext)_localctx).esquerda = term(0);
				setState(241);
				match(GT);
				setState(242);
				((MaiorContext)_localctx).direita = term(0);
				}
				break;
			case 4:
				_localctx = new MenorOuEquivalenteContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(244);
				((MenorOuEquivalenteContext)_localctx).esquerda = term(0);
				setState(245);
				match(LE);
				setState(246);
				((MenorOuEquivalenteContext)_localctx).direita = term(0);
				}
				break;
			case 5:
				_localctx = new MaiorOuEquivalenteContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(248);
				((MaiorOuEquivalenteContext)_localctx).esquerda = term(0);
				setState(249);
				match(GE);
				setState(250);
				((MaiorOuEquivalenteContext)_localctx).direita = term(0);
				}
				break;
			case 6:
				_localctx = new EquivalenteContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(252);
				((EquivalenteContext)_localctx).esquerda = term(0);
				setState(253);
				match(EQ);
				setState(254);
				((EquivalenteContext)_localctx).direita = term(0);
				}
				break;
			case 7:
				_localctx = new DiferenteContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(256);
				((DiferenteContext)_localctx).esquerda = term(0);
				setState(257);
				match(NEQ);
				setState(258);
				((DiferenteContext)_localctx).direita = term(0);
				}
				break;
			case 8:
				_localctx = new ChamarMetodoContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(260);
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

	public static class MetodcallContext extends ParserRuleContext {
		public Token nomeMetodo;
		public TerminalNode IDENT() { return getToken(GramaticaParser.IDENT, 0); }
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
		enterRule(_localctx, 36, RULE_metodcall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			((MetodcallContext)_localctx).nomeMetodo = match(IDENT);
			setState(264);
			match(LPAREN);
			setState(265);
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new FatorContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(268);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(287);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(285);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new DivisaoContext(new TermContext(_parentctx, _parentState));
						((DivisaoContext)_localctx).esquerda = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(270);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(271);
						match(SLASH);
						setState(272);
						((DivisaoContext)_localctx).esquerda = term(7);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicacaoContext(new TermContext(_parentctx, _parentState));
						((MultiplicacaoContext)_localctx).esquerda = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(273);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(274);
						match(STAR);
						setState(275);
						((MultiplicacaoContext)_localctx).esquerda = term(6);
						}
						break;
					case 3:
						{
						_localctx = new ModuloContext(new TermContext(_parentctx, _parentState));
						((ModuloContext)_localctx).esquerda = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(276);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(277);
						match(REM);
						setState(278);
						((ModuloContext)_localctx).esquerda = term(5);
						}
						break;
					case 4:
						{
						_localctx = new SubtracaoContext(new TermContext(_parentctx, _parentState));
						((SubtracaoContext)_localctx).esquerda = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(279);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(280);
						match(MINUS);
						setState(281);
						((SubtracaoContext)_localctx).esquerda = term(4);
						}
						break;
					case 5:
						{
						_localctx = new SomaContext(new TermContext(_parentctx, _parentState));
						((SomaContext)_localctx).esquerda = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(282);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(283);
						match(PLUS);
						setState(284);
						((SomaContext)_localctx).esquerda = term(3);
						}
						break;
					}
					} 
				}
				setState(289);
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
		enterRule(_localctx, 40, RULE_factor);
		try {
			setState(298);
			switch (_input.LA(1)) {
			case INT_CONSTANT:
				_localctx = new NumeroInteiroContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				((NumeroInteiroContext)_localctx).numero = match(INT_CONSTANT);
				}
				break;
			case DOUBLE_CONSTANT:
				_localctx = new NumeroRealContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				((NumeroRealContext)_localctx).numero = match(DOUBLE_CONSTANT);
				}
				break;
			case NULL_CONSTANT:
				_localctx = new NullContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(292);
				match(NULL_CONSTANT);
				}
				break;
			case IDENT:
				_localctx = new ChamarLvalueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(293);
				lvalue();
				}
				break;
			case LPAREN:
				_localctx = new ParentesisContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(294);
				match(LPAREN);
				setState(295);
				term(0);
				setState(296);
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
		enterRule(_localctx, 42, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(RETURN);
			setState(301);
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
		enterRule(_localctx, 44, RULE_ifstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(IF);
			setState(304);
			match(LPAREN);
			setState(305);
			expressao();
			setState(306);
			match(RPAREN);
			setState(307);
			comando();
			setState(310);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(308);
				match(ELSE);
				setState(309);
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
		enterRule(_localctx, 46, RULE_forstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(FOR);
			setState(313);
			match(LPAREN);
			setState(314);
			match(INT);
			setState(315);
			atrib();
			setState(316);
			match(SEMICOLON);
			setState(317);
			expressao();
			setState(318);
			match(SEMICOLON);
			setState(319);
			atrib();
			setState(320);
			match(RPAREN);
			setState(321);
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
		enterRule(_localctx, 48, RULE_whilestatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(WHILE);
			setState(324);
			match(LPAREN);
			setState(325);
			expressao();
			setState(326);
			match(RPAREN);
			setState(327);
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
		enterRule(_localctx, 50, RULE_listacomandos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			comando();
			setState(331);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BREAK) | (1L << IF) | (1L << FOR) | (1L << RETURN) | (1L << STRING) | (1L << INT) | (1L << DOUBLE) | (1L << WHILE) | (1L << BOOLEAN) | (1L << IDENT) | (1L << LBRACE) | (1L << SEMICOLON))) != 0)) {
				{
				setState(330);
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
		case 19:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3.\u0150\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\6\28\n\2\r\2\16\29\3\3\3\3\5\3>\n\3\3\4\3\4\3"+
		"\4\3\4\3\4\5\4E\n\4\3\5\3\5\3\5\3\5\3\6\3\6\5\6M\n\6\3\7\3\7\3\7\3\7\7"+
		"\7S\n\7\f\7\16\7V\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\bf\n\b\3\t\3\t\3\t\7\tk\n\t\f\t\16\tn\13\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\7\13|\n\13\f\13\16\13\177\13\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\7\f\u0089\n\f\f\f\16\f\u008c\13\f"+
		"\3\r\3\r\3\r\6\r\u0091\n\r\r\r\16\r\u0092\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\6\r\u009c\n\r\r\r\16\r\u009d\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\5\17\u00ac\n\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\7\20\u00b6\n\20\f\20\16\20\u00b9\13\20\3\20\3\20\3\20\3\20\3\20"+
		"\7\20\u00c0\n\20\f\20\16\20\u00c3\13\20\3\20\7\20\u00c6\n\20\f\20\16\20"+
		"\u00c9\13\20\3\21\3\21\3\21\7\21\u00ce\n\21\f\21\16\21\u00d1\13\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00ec\n\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0108\n\23"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0120\n\25\f\25\16\25\u0123"+
		"\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u012d\n\26\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0139\n\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\5\33\u014e\n\33\3\33\2\3(\34\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\2\4\4\2\23\25\27\27\4\2\23\25\27\30\u0164"+
		"\2\67\3\2\2\2\4=\3\2\2\2\6D\3\2\2\2\bF\3\2\2\2\nJ\3\2\2\2\fN\3\2\2\2\16"+
		"e\3\2\2\2\20g\3\2\2\2\22q\3\2\2\2\24v\3\2\2\2\26\u0083\3\2\2\2\30\u008d"+
		"\3\2\2\2\32\u009f\3\2\2\2\34\u00a9\3\2\2\2\36\u00b2\3\2\2\2 \u00ca\3\2"+
		"\2\2\"\u00eb\3\2\2\2$\u0107\3\2\2\2&\u0109\3\2\2\2(\u010d\3\2\2\2*\u012c"+
		"\3\2\2\2,\u012e\3\2\2\2.\u0131\3\2\2\2\60\u013a\3\2\2\2\62\u0145\3\2\2"+
		"\2\64\u014b\3\2\2\2\668\5\4\3\2\67\66\3\2\2\289\3\2\2\29\67\3\2\2\29:"+
		"\3\2\2\2:\3\3\2\2\2;>\5\6\4\2<>\5\32\16\2=;\3\2\2\2=<\3\2\2\2>\5\3\2\2"+
		"\2?@\5\b\5\2@A\7\37\2\2AE\3\2\2\2BE\5\16\b\2CE\5$\23\2D?\3\2\2\2DB\3\2"+
		"\2\2DC\3\2\2\2E\7\3\2\2\2FG\7\3\2\2GH\5$\23\2HI\7\32\2\2I\t\3\2\2\2JL"+
		"\5\f\7\2KM\5\n\6\2LK\3\2\2\2LM\3\2\2\2M\13\3\2\2\2NO\7\t\2\2OP\7\30\2"+
		"\2PT\7\33\2\2QS\5\16\b\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2"+
		"\2\2VT\3\2\2\2WX\7\34\2\2X\r\3\2\2\2YZ\5\20\t\2Z[\7\37\2\2[f\3\2\2\2\\"+
		"]\5\22\n\2]^\7\37\2\2^f\3\2\2\2_`\5\24\13\2`a\7\37\2\2af\3\2\2\2bc\5\30"+
		"\r\2cd\7\37\2\2df\3\2\2\2eY\3\2\2\2e\\\3\2\2\2e_\3\2\2\2eb\3\2\2\2f\17"+
		"\3\2\2\2gl\t\2\2\2hi\7\35\2\2ik\7\36\2\2jh\3\2\2\2kn\3\2\2\2lj\3\2\2\2"+
		"lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\7\30\2\2p\21\3\2\2\2qr\t\3\2\2rs\7\30"+
		"\2\2st\7\"\2\2tu\5(\25\2u\23\3\2\2\2v}\7\30\2\2wx\7\35\2\2xy\5$\23\2y"+
		"z\7\36\2\2z|\3\2\2\2{w\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080"+
		"\3\2\2\2\177}\3\2\2\2\u0080\u0081\7\"\2\2\u0081\u0082\5$\23\2\u0082\25"+
		"\3\2\2\2\u0083\u008a\7\30\2\2\u0084\u0085\7\35\2\2\u0085\u0086\5$\23\2"+
		"\u0086\u0087\7\36\2\2\u0087\u0089\3\2\2\2\u0088\u0084\3\2\2\2\u0089\u008c"+
		"\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\27\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008d\u0090\t\2\2\2\u008e\u008f\7\35\2\2\u008f\u0091\7"+
		"\36\2\2\u0090\u008e\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\7\"\2\2\u0095\u0096\7\22"+
		"\2\2\u0096\u009b\t\2\2\2\u0097\u0098\7\35\2\2\u0098\u0099\5$\23\2\u0099"+
		"\u009a\7\36\2\2\u009a\u009c\3\2\2\2\u009b\u0097\3\2\2\2\u009c\u009d\3"+
		"\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\31\3\2\2\2\u009f"+
		"\u00a0\7\24\2\2\u00a0\u00a1\7\30\2\2\u00a1\u00a2\7\4\2\2\u00a2\u00a3\7"+
		"\32\2\2\u00a3\u00a4\7\33\2\2\u00a4\u00a5\7\5\2\2\u00a5\u00a6\5$\23\2\u00a6"+
		"\u00a7\7\37\2\2\u00a7\u00a8\7\34\2\2\u00a8\33\3\2\2\2\u00a9\u00ab\7\31"+
		"\2\2\u00aa\u00ac\5\36\20\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00ae\7\32\2\2\u00ae\u00af\7\33\2\2\u00af\u00b0\5"+
		"\"\22\2\u00b0\u00b1\7\34\2\2\u00b1\35\3\2\2\2\u00b2\u00b7\t\2\2\2\u00b3"+
		"\u00b4\7\35\2\2\u00b4\u00b6\7\36\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b9\3"+
		"\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00ba\u00c7\7\30\2\2\u00bb\u00bc\7 \2\2\u00bc\u00c1\t\2"+
		"\2\2\u00bd\u00be\7\35\2\2\u00be\u00c0\7\36\2\2\u00bf\u00bd\3\2\2\2\u00c0"+
		"\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2"+
		"\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c6\7\30\2\2\u00c5\u00bb\3\2\2\2\u00c6"+
		"\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\37\3\2\2"+
		"\2\u00c9\u00c7\3\2\2\2\u00ca\u00cf\5$\23\2\u00cb\u00cc\7 \2\2\u00cc\u00ce"+
		"\5$\23\2\u00cd\u00cb\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0!\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\5,\27\2"+
		"\u00d3\u00d4\7\37\2\2\u00d4\u00ec\3\2\2\2\u00d5\u00ec\5.\30\2\u00d6\u00ec"+
		"\5\60\31\2\u00d7\u00d8\7\33\2\2\u00d8\u00d9\5\64\33\2\u00d9\u00da\7\34"+
		"\2\2\u00da\u00ec\3\2\2\2\u00db\u00dc\7\r\2\2\u00dc\u00ec\7\37\2\2\u00dd"+
		"\u00ec\7\37\2\2\u00de\u00df\5\20\t\2\u00df\u00e0\7\37\2\2\u00e0\u00ec"+
		"\3\2\2\2\u00e1\u00e2\5\24\13\2\u00e2\u00e3\7\37\2\2\u00e3\u00ec\3\2\2"+
		"\2\u00e4\u00e5\5\22\n\2\u00e5\u00e6\7\37\2\2\u00e6\u00ec\3\2\2\2\u00e7"+
		"\u00e8\5\30\r\2\u00e8\u00e9\7\37\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00ec\5"+
		"\62\32\2\u00eb\u00d2\3\2\2\2\u00eb\u00d5\3\2\2\2\u00eb\u00d6\3\2\2\2\u00eb"+
		"\u00d7\3\2\2\2\u00eb\u00db\3\2\2\2\u00eb\u00dd\3\2\2\2\u00eb\u00de\3\2"+
		"\2\2\u00eb\u00e1\3\2\2\2\u00eb\u00e4\3\2\2\2\u00eb\u00e7\3\2\2\2\u00eb"+
		"\u00ea\3\2\2\2\u00ec#\3\2\2\2\u00ed\u0108\5(\25\2\u00ee\u00ef\5(\25\2"+
		"\u00ef\u00f0\7$\2\2\u00f0\u00f1\5(\25\2\u00f1\u0108\3\2\2\2\u00f2\u00f3"+
		"\5(\25\2\u00f3\u00f4\7#\2\2\u00f4\u00f5\5(\25\2\u00f5\u0108\3\2\2\2\u00f6"+
		"\u00f7\5(\25\2\u00f7\u00f8\7&\2\2\u00f8\u00f9\5(\25\2\u00f9\u0108\3\2"+
		"\2\2\u00fa\u00fb\5(\25\2\u00fb\u00fc\7\'\2\2\u00fc\u00fd\5(\25\2\u00fd"+
		"\u0108\3\2\2\2\u00fe\u00ff\5(\25\2\u00ff\u0100\7%\2\2\u0100\u0101\5(\25"+
		"\2\u0101\u0108\3\2\2\2\u0102\u0103\5(\25\2\u0103\u0104\7(\2\2\u0104\u0105"+
		"\5(\25\2\u0105\u0108\3\2\2\2\u0106\u0108\5&\24\2\u0107\u00ed\3\2\2\2\u0107"+
		"\u00ee\3\2\2\2\u0107\u00f2\3\2\2\2\u0107\u00f6\3\2\2\2\u0107\u00fa\3\2"+
		"\2\2\u0107\u00fe\3\2\2\2\u0107\u0102\3\2\2\2\u0107\u0106\3\2\2\2\u0108"+
		"%\3\2\2\2\u0109\u010a\7\30\2\2\u010a\u010b\7\31\2\2\u010b\u010c\7\32\2"+
		"\2\u010c\'\3\2\2\2\u010d\u010e\b\25\1\2\u010e\u010f\5*\26\2\u010f\u0121"+
		"\3\2\2\2\u0110\u0111\f\b\2\2\u0111\u0112\7,\2\2\u0112\u0120\5(\25\t\u0113"+
		"\u0114\f\7\2\2\u0114\u0115\7+\2\2\u0115\u0120\5(\25\b\u0116\u0117\f\6"+
		"\2\2\u0117\u0118\7-\2\2\u0118\u0120\5(\25\7\u0119\u011a\f\5\2\2\u011a"+
		"\u011b\7*\2\2\u011b\u0120\5(\25\6\u011c\u011d\f\4\2\2\u011d\u011e\7)\2"+
		"\2\u011e\u0120\5(\25\5\u011f\u0110\3\2\2\2\u011f\u0113\3\2\2\2\u011f\u0116"+
		"\3\2\2\2\u011f\u0119\3\2\2\2\u011f\u011c\3\2\2\2\u0120\u0123\3\2\2\2\u0121"+
		"\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122)\3\2\2\2\u0123\u0121\3\2\2\2"+
		"\u0124\u012d\7\6\2\2\u0125\u012d\7\b\2\2\u0126\u012d\7\7\2\2\u0127\u012d"+
		"\5\26\f\2\u0128\u0129\7\31\2\2\u0129\u012a\5(\25\2\u012a\u012b\7\32\2"+
		"\2\u012b\u012d\3\2\2\2\u012c\u0124\3\2\2\2\u012c\u0125\3\2\2\2\u012c\u0126"+
		"\3\2\2\2\u012c\u0127\3\2\2\2\u012c\u0128\3\2\2\2\u012d+\3\2\2\2\u012e"+
		"\u012f\7\21\2\2\u012f\u0130\5$\23\2\u0130-\3\2\2\2\u0131\u0132\7\16\2"+
		"\2\u0132\u0133\7\31\2\2\u0133\u0134\5$\23\2\u0134\u0135\7\32\2\2\u0135"+
		"\u0138\5\"\22\2\u0136\u0137\7\17\2\2\u0137\u0139\5\"\22\2\u0138\u0136"+
		"\3\2\2\2\u0138\u0139\3\2\2\2\u0139/\3\2\2\2\u013a\u013b\7\20\2\2\u013b"+
		"\u013c\7\31\2\2\u013c\u013d\7\24\2\2\u013d\u013e\5\24\13\2\u013e\u013f"+
		"\7\37\2\2\u013f\u0140\5$\23\2\u0140\u0141\7\37\2\2\u0141\u0142\5\24\13"+
		"\2\u0142\u0143\7\32\2\2\u0143\u0144\5\"\22\2\u0144\61\3\2\2\2\u0145\u0146"+
		"\7\26\2\2\u0146\u0147\7\31\2\2\u0147\u0148\5$\23\2\u0148\u0149\7\32\2"+
		"\2\u0149\u014a\5\"\22\2\u014a\63\3\2\2\2\u014b\u014d\5\"\22\2\u014c\u014e"+
		"\5\64\33\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e\65\3\2\2\2\31"+
		"9=DLTel}\u008a\u0092\u009d\u00ab\u00b7\u00c1\u00c7\u00cf\u00eb\u0107\u011f"+
		"\u0121\u012c\u0138\u014d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}