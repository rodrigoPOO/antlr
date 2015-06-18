// Generated from Gramatica.g4 by ANTLR 4.4
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
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, INT_CONSTANT=4, NULL_CONSTANT=5, DOUBLE_CONSTANT=6, 
		CLASS=7, VOID=8, TRUE=9, FALSE=10, BREAK=11, IF=12, ELSE=13, FOR=14, RETURN=15, 
		NEW=16, STRING=17, INT=18, DOUBLE=19, WHILE=20, BOOLEAN=21, IDENT=22, 
		LPAREN=23, RPAREN=24, LBRACE=25, RBRACE=26, LBRACKET=27, RBRACKET=28, 
		SEMICOLON=29, COMMA=30, DOT=31, ASSIGN=32, GT=33, LT=34, EQ=35, LE=36, 
		GE=37, NEQ=38, PLUS=39, MINUS=40, STAR=41, SLASH=42, REM=43, WHITESPACE=44;
	public static final String[] tokenNames = {
		"<INVALID>", "'return '", "' ('", "'println('", "INT_CONSTANT", "'null'", 
		"DOUBLE_CONSTANT", "'class'", "'void'", "'true'", "'false'", "'break'", 
		"'if'", "'else'", "'for'", "'return'", "'new'", "'string'", "'int'", "'double'", 
		"'while'", "'boolean'", "IDENT", "'('", "')'", "'{'", "'}'", "'['", "']'", 
		"';'", "','", "'.'", "'='", "'>'", "'<'", "'=='", "'<='", "'>='", "'!='", 
		"'+'", "'-'", "'*'", "'/'", "'%'", "WHITESPACE"
	};
	public static final int
		RULE_teste = 0, RULE_programDecl = 1, RULE_statement = 2, RULE_println = 3, 
		RULE_classe = 4, RULE_declclasse = 5, RULE_escopoclasse = 6, RULE_vardecl = 7, 
		RULE_tipoDeclarar = 8, RULE_vardeclatrib = 9, RULE_atrib = 10, RULE_lvalue = 11, 
		RULE_inicializarArranjo = 12, RULE_metoddecl = 13, RULE_paramlist = 14, 
		RULE_metodcall = 15, RULE_comandos = 16, RULE_comando1 = 17, RULE_escopometodo = 18, 
		RULE_parametro = 19, RULE_listaargumento = 20, RULE_comando = 21, RULE_expressao = 22, 
		RULE_term = 23, RULE_factor = 24, RULE_retorno = 25, RULE_ifstatement = 26, 
		RULE_forstatement = 27, RULE_whilestatement = 28, RULE_listacomandos = 29;
	public static final String[] ruleNames = {
		"teste", "programDecl", "statement", "println", "classe", "declclasse", 
		"escopoclasse", "vardecl", "tipoDeclarar", "vardeclatrib", "atrib", "lvalue", 
		"inicializarArranjo", "metoddecl", "paramlist", "metodcall", "comandos", 
		"comando1", "escopometodo", "parametro", "listaargumento", "comando", 
		"expressao", "term", "factor", "retorno", "ifstatement", "forstatement", 
		"whilestatement", "listacomandos"
	};

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

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
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60); programDecl();
				}
				}
				setState(63); 
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitMetodoDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramDeclContext programDecl() throws RecognitionException {
		ProgramDeclContext _localctx = new ProgramDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programDecl);
		try {
			setState(67);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new ComandoNormalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(65); statement();
				}
				break;
			case 2:
				_localctx = new MetodoDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(66); metoddecl();
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
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public EscopoclasseContext escopoclasse() {
			return getRuleContext(EscopoclasseContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
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
			setState(74);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69); println();
				setState(70); match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72); escopoclasse();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(73); expressao();
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
			setState(76); match(T__0);
			setState(77); ((PrintlnContext)_localctx).argument = expressao();
			setState(78); match(RPAREN);
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
			setState(80); declclasse();
			setState(82);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(81); classe();
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
		public EscopoclasseContext escopoclasse(int i) {
			return getRuleContext(EscopoclasseContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(GramaticaParser.RBRACE, 0); }
		public TerminalNode LBRACE() { return getToken(GramaticaParser.LBRACE, 0); }
		public TerminalNode CLASS() { return getToken(GramaticaParser.CLASS, 0); }
		public List<EscopoclasseContext> escopoclasse() {
			return getRuleContexts(EscopoclasseContext.class);
		}
		public TerminalNode IDENT() { return getToken(GramaticaParser.IDENT, 0); }
		public DeclclasseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declclasse; }
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
			setState(84); match(CLASS);
			setState(85); match(IDENT);
			setState(86); match(LBRACE);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << INT) | (1L << DOUBLE) | (1L << BOOLEAN) | (1L << IDENT))) != 0)) {
				{
				{
				setState(87); escopoclasse();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93); match(RBRACE);
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
		public TerminalNode SEMICOLON() { return getToken(GramaticaParser.SEMICOLON, 0); }
		public VardeclContext vardecl() {
			return getRuleContext(VardeclContext.class,0);
		}
		public VardeclatribContext vardeclatrib() {
			return getRuleContext(VardeclatribContext.class,0);
		}
		public InicializarArranjoContext inicializarArranjo() {
			return getRuleContext(InicializarArranjoContext.class,0);
		}
		public AtribContext atrib() {
			return getRuleContext(AtribContext.class,0);
		}
		public EscopoclasseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escopoclasse; }
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
			setState(107);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95); vardecl();
				setState(96); match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98); vardeclatrib();
				setState(99); match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(101); atrib();
				setState(102); match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(104); inicializarArranjo();
				setState(105); match(SEMICOLON);
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
		public List<TerminalNode> RBRACKET() { return getTokens(GramaticaParser.RBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(GramaticaParser.LBRACKET, i);
		}
		public TerminalNode RBRACKET(int i) {
			return getToken(GramaticaParser.RBRACKET, i);
		}
		public TipoDeclararContext tipoDeclarar() {
			return getRuleContext(TipoDeclararContext.class,0);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(GramaticaParser.LBRACKET); }
		public TerminalNode IDENT() { return getToken(GramaticaParser.IDENT, 0); }
		public DeclaracaoVariaveisContext(VardeclContext ctx) { copyFrom(ctx); }
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
			setState(109); ((DeclaracaoVariaveisContext)_localctx).tipo = tipoDeclarar();
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(110); match(LBRACKET);
				setState(111); match(RBRACKET);
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117); ((DeclaracaoVariaveisContext)_localctx).nomeVariavel = match(IDENT);
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
		public TerminalNode STRING() { return getToken(GramaticaParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(GramaticaParser.BOOLEAN, 0); }
		public TerminalNode INT() { return getToken(GramaticaParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(GramaticaParser.DOUBLE, 0); }
		public TipoDeclararContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoDeclarar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitTipoDeclarar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoDeclararContext tipoDeclarar() throws RecognitionException {
		TipoDeclararContext _localctx = new TipoDeclararContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tipoDeclarar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << INT) | (1L << DOUBLE) | (1L << BOOLEAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		public TermContext valor;
		public TerminalNode ASSIGN() { return getToken(GramaticaParser.ASSIGN, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TipoDeclararContext tipoDeclarar() {
			return getRuleContext(TipoDeclararContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(GramaticaParser.IDENT, 0); }
		public DeclararEAtribuirContext(VardeclatribContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDeclararEAtribuir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardeclatribContext vardeclatrib() throws RecognitionException {
		VardeclatribContext _localctx = new VardeclatribContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_vardeclatrib);
		try {
			_localctx = new DeclararEAtribuirContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(121); ((DeclararEAtribuirContext)_localctx).tipo = tipoDeclarar();
			setState(122); ((DeclararEAtribuirContext)_localctx).variavel = match(IDENT);
			setState(123); match(ASSIGN);
			setState(124); ((DeclararEAtribuirContext)_localctx).valor = term(0);
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
		public List<TerminalNode> RBRACKET() { return getTokens(GramaticaParser.RBRACKET); }
		public TerminalNode ASSIGN() { return getToken(GramaticaParser.ASSIGN, 0); }
		public TerminalNode LBRACKET(int i) {
			return getToken(GramaticaParser.LBRACKET, i);
		}
		public TerminalNode RBRACKET(int i) {
			return getToken(GramaticaParser.RBRACKET, i);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(GramaticaParser.LBRACKET); }
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode IDENT() { return getToken(GramaticaParser.IDENT, 0); }
		public AtribuicaoContext(AtribContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribContext atrib() throws RecognitionException {
		AtribContext _localctx = new AtribContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_atrib);
		int _la;
		try {
			_localctx = new AtribuicaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(126); ((AtribuicaoContext)_localctx).variavel = match(IDENT);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(127); match(LBRACKET);
				setState(128); expressao();
				setState(129); match(RBRACKET);
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136); match(ASSIGN);
			setState(137); ((AtribuicaoContext)_localctx).expr = expressao();
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
		public List<TerminalNode> RBRACKET() { return getTokens(GramaticaParser.RBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(GramaticaParser.LBRACKET, i);
		}
		public TerminalNode RBRACKET(int i) {
			return getToken(GramaticaParser.RBRACKET, i);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(GramaticaParser.LBRACKET); }
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode IDENT() { return getToken(GramaticaParser.IDENT, 0); }
		public CarregarValorContext(LvalueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitCarregarValor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_lvalue);
		try {
			int _alt;
			_localctx = new CarregarValorContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(139); ((CarregarValorContext)_localctx).identificador = match(IDENT);
			setState(146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(140); match(LBRACKET);
					setState(141); expressao();
					setState(142); match(RBRACKET);
					}
					} 
				}
				setState(148);
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
		public TipoDeclararContext tipo;
		public TipoDeclararContext tipoInstanciado;
		public List<TerminalNode> RBRACKET() { return getTokens(GramaticaParser.RBRACKET); }
		public TerminalNode ASSIGN() { return getToken(GramaticaParser.ASSIGN, 0); }
		public TerminalNode LBRACKET(int i) {
			return getToken(GramaticaParser.LBRACKET, i);
		}
		public TerminalNode RBRACKET(int i) {
			return getToken(GramaticaParser.RBRACKET, i);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public List<TipoDeclararContext> tipoDeclarar() {
			return getRuleContexts(TipoDeclararContext.class);
		}
		public TipoDeclararContext tipoDeclarar(int i) {
			return getRuleContext(TipoDeclararContext.class,i);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(GramaticaParser.LBRACKET); }
		public TerminalNode NEW() { return getToken(GramaticaParser.NEW, 0); }
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public InicializarArranjoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicializarArranjo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitInicializarArranjo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicializarArranjoContext inicializarArranjo() throws RecognitionException {
		InicializarArranjoContext _localctx = new InicializarArranjoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_inicializarArranjo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149); ((InicializarArranjoContext)_localctx).tipo = tipoDeclarar();
			setState(152); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(150); match(LBRACKET);
				setState(151); match(RBRACKET);
				}
				}
				setState(154); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LBRACKET );
			setState(156); match(ASSIGN);
			setState(157); match(NEW);
			setState(158); ((InicializarArranjoContext)_localctx).tipoInstanciado = tipoDeclarar();
			setState(163); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(159); match(LBRACKET);
				setState(160); expressao();
				setState(161); match(RBRACKET);
				}
				}
				setState(165); 
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
		public ParamlistContext paramlist() {
			return getRuleContext(ParamlistContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(GramaticaParser.IDENT, 0); }
		public MetoddeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metoddecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitMetoddecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetoddeclContext metoddecl() throws RecognitionException {
		MetoddeclContext _localctx = new MetoddeclContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_metoddecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167); ((MetoddeclContext)_localctx).type = match(INT);
			setState(168); ((MetoddeclContext)_localctx).nomeMetodo = match(IDENT);
			setState(169); match(T__1);
			setState(170); ((MetoddeclContext)_localctx).parametros = paramlist();
			setState(171); match(RPAREN);
			setState(172); match(LBRACE);
			setState(173); ((MetoddeclContext)_localctx).com = comandos();
			setState(174); match(T__2);
			setState(175); expressao();
			setState(176); match(SEMICOLON);
			setState(177); match(RBRACE);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitParamlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamlistContext paramlist() throws RecognitionException {
		ParamlistContext _localctx = new ParamlistContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_paramlist);
		int _la;
		try {
			setState(188);
			switch (_input.LA(1)) {
			case STRING:
			case INT:
			case DOUBLE:
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(179); ((ParamlistContext)_localctx).vardecl = vardecl();
				((ParamlistContext)_localctx).decl.add(((ParamlistContext)_localctx).vardecl);
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(180); match(COMMA);
					setState(181); ((ParamlistContext)_localctx).vardecl = vardecl();
					((ParamlistContext)_localctx).decl.add(((ParamlistContext)_localctx).vardecl);
					}
					}
					setState(186);
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
		public ListaargumentoContext listaargumento() {
			return getRuleContext(ListaargumentoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(GramaticaParser.IDENT, 0); }
		public MetodcallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metodcall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitMetodcall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetodcallContext metodcall() throws RecognitionException {
		MetodcallContext _localctx = new MetodcallContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_metodcall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190); ((MetodcallContext)_localctx).nomeMetodo = match(IDENT);
			setState(191); match(LPAREN);
			setState(192); ((MetodcallContext)_localctx).args = listaargumento();
			setState(193); match(RPAREN);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitComandos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_comandos);
		int _la;
		try {
			setState(202);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BREAK) | (1L << IF) | (1L << FOR) | (1L << STRING) | (1L << INT) | (1L << DOUBLE) | (1L << WHILE) | (1L << BOOLEAN) | (1L << IDENT) | (1L << SEMICOLON))) != 0)) {
					{
					{
					setState(195); comando1();
					}
					}
					setState(200);
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
		public TerminalNode SEMICOLON() { return getToken(GramaticaParser.SEMICOLON, 0); }
		public WhilestatementContext whilestatement() {
			return getRuleContext(WhilestatementContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(GramaticaParser.BREAK, 0); }
		public IfstatementContext ifstatement() {
			return getRuleContext(IfstatementContext.class,0);
		}
		public VardeclContext vardecl() {
			return getRuleContext(VardeclContext.class,0);
		}
		public VardeclatribContext vardeclatrib() {
			return getRuleContext(VardeclatribContext.class,0);
		}
		public ForstatementContext forstatement() {
			return getRuleContext(ForstatementContext.class,0);
		}
		public InicializarArranjoContext inicializarArranjo() {
			return getRuleContext(InicializarArranjoContext.class,0);
		}
		public AtribContext atrib() {
			return getRuleContext(AtribContext.class,0);
		}
		public Comando1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando1; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitComando1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comando1Context comando1() throws RecognitionException {
		Comando1Context _localctx = new Comando1Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_comando1);
		try {
			setState(222);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204); ifstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205); forstatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(206); match(BREAK);
				setState(207); match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(208); match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(209); vardecl();
				setState(210); match(SEMICOLON);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(212); atrib();
				setState(213); match(SEMICOLON);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(215); vardeclatrib();
				setState(216); match(SEMICOLON);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(218); inicializarArranjo();
				setState(219); match(SEMICOLON);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(221); whilestatement();
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
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GramaticaParser.RPAREN, 0); }
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public EscopometodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escopometodo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitEscopometodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscopometodoContext escopometodo() throws RecognitionException {
		EscopometodoContext _localctx = new EscopometodoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_escopometodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224); match(LPAREN);
			setState(226);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << INT) | (1L << DOUBLE) | (1L << BOOLEAN))) != 0)) {
				{
				setState(225); parametro();
				}
			}

			setState(228); match(RPAREN);
			setState(229); match(LBRACE);
			setState(230); comando();
			setState(231); match(RBRACE);
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
		public List<TerminalNode> RBRACKET() { return getTokens(GramaticaParser.RBRACKET); }
		public TerminalNode BOOLEAN(int i) {
			return getToken(GramaticaParser.BOOLEAN, i);
		}
		public TerminalNode RBRACKET(int i) {
			return getToken(GramaticaParser.RBRACKET, i);
		}
		public TerminalNode IDENT(int i) {
			return getToken(GramaticaParser.IDENT, i);
		}
		public List<TerminalNode> STRING() { return getTokens(GramaticaParser.STRING); }
		public List<TerminalNode> LBRACKET() { return getTokens(GramaticaParser.LBRACKET); }
		public List<TerminalNode> BOOLEAN() { return getTokens(GramaticaParser.BOOLEAN); }
		public List<TerminalNode> INT() { return getTokens(GramaticaParser.INT); }
		public List<TerminalNode> DOUBLE() { return getTokens(GramaticaParser.DOUBLE); }
		public List<TerminalNode> IDENT() { return getTokens(GramaticaParser.IDENT); }
		public TerminalNode COMMA(int i) {
			return getToken(GramaticaParser.COMMA, i);
		}
		public TerminalNode INT(int i) {
			return getToken(GramaticaParser.INT, i);
		}
		public TerminalNode LBRACKET(int i) {
			return getToken(GramaticaParser.LBRACKET, i);
		}
		public TerminalNode STRING(int i) {
			return getToken(GramaticaParser.STRING, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GramaticaParser.COMMA); }
		public TerminalNode DOUBLE(int i) {
			return getToken(GramaticaParser.DOUBLE, i);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(233);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << INT) | (1L << DOUBLE) | (1L << BOOLEAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(234); match(LBRACKET);
				setState(235); match(RBRACKET);
				}
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(241); match(IDENT);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(242); match(COMMA);
				setState(243);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << INT) | (1L << DOUBLE) | (1L << BOOLEAN))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACKET) {
					{
					{
					setState(244); match(LBRACKET);
					setState(245); match(RBRACKET);
					}
					}
					setState(250);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(251); match(IDENT);
				}
				}
				setState(256);
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
		public List<TerminalNode> COMMA() { return getTokens(GramaticaParser.COMMA); }
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(GramaticaParser.COMMA, i);
		}
		public ListaargumentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaargumento; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitListaargumento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaargumentoContext listaargumento() throws RecognitionException {
		ListaargumentoContext _localctx = new ListaargumentoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_listaargumento);
		int _la;
		try {
			setState(266);
			switch (_input.LA(1)) {
			case INT_CONSTANT:
			case NULL_CONSTANT:
			case DOUBLE_CONSTANT:
			case IDENT:
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(257); ((ListaargumentoContext)_localctx).expressao = expressao();
				((ListaargumentoContext)_localctx).exp.add(((ListaargumentoContext)_localctx).expressao);
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(258); match(COMMA);
					setState(259); ((ListaargumentoContext)_localctx).expressao = expressao();
					((ListaargumentoContext)_localctx).exp.add(((ListaargumentoContext)_localctx).expressao);
					}
					}
					setState(264);
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
		public TerminalNode SEMICOLON() { return getToken(GramaticaParser.SEMICOLON, 0); }
		public TerminalNode BREAK() { return getToken(GramaticaParser.BREAK, 0); }
		public TerminalNode LBRACE() { return getToken(GramaticaParser.LBRACE, 0); }
		public VardeclatribContext vardeclatrib() {
			return getRuleContext(VardeclatribContext.class,0);
		}
		public ForstatementContext forstatement() {
			return getRuleContext(ForstatementContext.class,0);
		}
		public ListacomandosContext listacomandos() {
			return getRuleContext(ListacomandosContext.class,0);
		}
		public WhilestatementContext whilestatement() {
			return getRuleContext(WhilestatementContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(GramaticaParser.RBRACE, 0); }
		public IfstatementContext ifstatement() {
			return getRuleContext(IfstatementContext.class,0);
		}
		public VardeclContext vardecl() {
			return getRuleContext(VardeclContext.class,0);
		}
		public InicializarArranjoContext inicializarArranjo() {
			return getRuleContext(InicializarArranjoContext.class,0);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public AtribContext atrib() {
			return getRuleContext(AtribContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitComando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_comando);
		try {
			setState(293);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(268); retorno();
				setState(269); match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(271); ifstatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(272); forstatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(273); match(LBRACE);
				setState(274); listacomandos();
				setState(275); match(RBRACE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(277); match(BREAK);
				setState(278); match(SEMICOLON);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(279); match(SEMICOLON);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(280); vardecl();
				setState(281); match(SEMICOLON);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(283); atrib();
				setState(284); match(SEMICOLON);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(286); vardeclatrib();
				setState(287); match(SEMICOLON);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(289); inicializarArranjo();
				setState(290); match(SEMICOLON);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(292); whilestatement();
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
	public static class ChamarMetodoContext extends ExpressaoContext {
		public MetodcallContext metodcall() {
			return getRuleContext(MetodcallContext.class,0);
		}
		public ChamarMetodoContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitChamarMetodo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MaiorContext extends ExpressaoContext {
		public TermContext esquerda;
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitMaior(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EquivalenteContext extends ExpressaoContext {
		public TermContext esquerda;
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitEquivalente(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MenorContext extends ExpressaoContext {
		public TermContext esquerda;
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitMenor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumexprContext extends ExpressaoContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public NumexprContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitNumexpr(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDiferente(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MenorOuEquivalenteContext extends ExpressaoContext {
		public TermContext esquerda;
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitMaiorOuEquivalente(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expressao);
		try {
			setState(321);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new NumexprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(295); term(0);
				}
				break;
			case 2:
				_localctx = new MenorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(296); ((MenorContext)_localctx).esquerda = term(0);
				setState(297); match(LT);
				setState(298); ((MenorContext)_localctx).direita = term(0);
				}
				break;
			case 3:
				_localctx = new MaiorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(300); ((MaiorContext)_localctx).esquerda = term(0);
				setState(301); match(GT);
				setState(302); ((MaiorContext)_localctx).direita = term(0);
				}
				break;
			case 4:
				_localctx = new MenorOuEquivalenteContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(304); ((MenorOuEquivalenteContext)_localctx).esquerda = term(0);
				setState(305); match(LE);
				setState(306); ((MenorOuEquivalenteContext)_localctx).direita = term(0);
				}
				break;
			case 5:
				_localctx = new MaiorOuEquivalenteContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(308); ((MaiorOuEquivalenteContext)_localctx).esquerda = term(0);
				setState(309); match(GE);
				setState(310); ((MaiorOuEquivalenteContext)_localctx).direita = term(0);
				}
				break;
			case 6:
				_localctx = new EquivalenteContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(312); ((EquivalenteContext)_localctx).esquerda = term(0);
				setState(313); match(EQ);
				setState(314); ((EquivalenteContext)_localctx).direita = term(0);
				}
				break;
			case 7:
				_localctx = new DiferenteContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(316); ((DiferenteContext)_localctx).esquerda = term(0);
				setState(317); match(NEQ);
				setState(318); ((DiferenteContext)_localctx).direita = term(0);
				}
				break;
			case 8:
				_localctx = new ChamarMetodoContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(320); metodcall();
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
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode STAR() { return getToken(GramaticaParser.STAR, 0); }
		public MultiplicacaoContext(TermContext ctx) { copyFrom(ctx); }
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitFator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModuloContext extends TermContext {
		public TermContext esquerda;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode REM() { return getToken(GramaticaParser.REM, 0); }
		public ModuloContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitModulo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SomaContext extends TermContext {
		public TermContext esquerda;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(GramaticaParser.PLUS, 0); }
		public SomaContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitSoma(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubtracaoContext extends TermContext {
		public TermContext esquerda;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(GramaticaParser.MINUS, 0); }
		public SubtracaoContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitSubtracao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivisaoContext extends TermContext {
		public TermContext esquerda;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode SLASH() { return getToken(GramaticaParser.SLASH, 0); }
		public DivisaoContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDivisao(this);
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
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new FatorContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(324); factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(343);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(341);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new DivisaoContext(new TermContext(_parentctx, _parentState));
						((DivisaoContext)_localctx).esquerda = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(326);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(327); match(SLASH);
						setState(328); ((DivisaoContext)_localctx).esquerda = term(7);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicacaoContext(new TermContext(_parentctx, _parentState));
						((MultiplicacaoContext)_localctx).esquerda = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(329);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(330); match(STAR);
						setState(331); ((MultiplicacaoContext)_localctx).esquerda = term(6);
						}
						break;
					case 3:
						{
						_localctx = new ModuloContext(new TermContext(_parentctx, _parentState));
						((ModuloContext)_localctx).esquerda = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(332);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(333); match(REM);
						setState(334); ((ModuloContext)_localctx).esquerda = term(5);
						}
						break;
					case 4:
						{
						_localctx = new SubtracaoContext(new TermContext(_parentctx, _parentState));
						((SubtracaoContext)_localctx).esquerda = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(335);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(336); match(MINUS);
						setState(337); ((SubtracaoContext)_localctx).esquerda = term(4);
						}
						break;
					case 5:
						{
						_localctx = new SomaContext(new TermContext(_parentctx, _parentState));
						((SomaContext)_localctx).esquerda = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(338);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(339); match(PLUS);
						setState(340); ((SomaContext)_localctx).esquerda = term(3);
						}
						break;
					}
					} 
				}
				setState(345);
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
	public static class NumeroRealContext extends FactorContext {
		public Token numero;
		public TerminalNode DOUBLE_CONSTANT() { return getToken(GramaticaParser.DOUBLE_CONSTANT, 0); }
		public NumeroRealContext(FactorContext ctx) { copyFrom(ctx); }
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitNumeroInteiro(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ChamarLvalueContext extends FactorContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public ChamarLvalueContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitChamarLvalue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParentesisContext extends FactorContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(GramaticaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GramaticaParser.RPAREN, 0); }
		public ParentesisContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitParentesis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_factor);
		try {
			setState(354);
			switch (_input.LA(1)) {
			case INT_CONSTANT:
				_localctx = new NumeroInteiroContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(346); ((NumeroInteiroContext)_localctx).numero = match(INT_CONSTANT);
				}
				break;
			case DOUBLE_CONSTANT:
				_localctx = new NumeroRealContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(347); ((NumeroRealContext)_localctx).numero = match(DOUBLE_CONSTANT);
				}
				break;
			case NULL_CONSTANT:
				_localctx = new NullContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(348); match(NULL_CONSTANT);
				}
				break;
			case IDENT:
				_localctx = new ChamarLvalueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(349); lvalue();
				}
				break;
			case LPAREN:
				_localctx = new ParentesisContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(350); match(LPAREN);
				setState(351); term(0);
				setState(352); match(RPAREN);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitRetorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356); match(RETURN);
			setState(357); expressao();
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
		public TerminalNode ELSE() { return getToken(GramaticaParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(GramaticaParser.IF, 0); }
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(GramaticaParser.LPAREN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GramaticaParser.RPAREN, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public IfstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitIfstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstatementContext ifstatement() throws RecognitionException {
		IfstatementContext _localctx = new IfstatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ifstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359); match(IF);
			setState(360); match(LPAREN);
			setState(361); expressao();
			setState(362); match(RPAREN);
			setState(363); comando();
			setState(366);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(364); match(ELSE);
				setState(365); comando();
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
		public List<TerminalNode> SEMICOLON() { return getTokens(GramaticaParser.SEMICOLON); }
		public TerminalNode LPAREN() { return getToken(GramaticaParser.LPAREN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FOR() { return getToken(GramaticaParser.FOR, 0); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(GramaticaParser.SEMICOLON, i);
		}
		public AtribContext atrib(int i) {
			return getRuleContext(AtribContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(GramaticaParser.RPAREN, 0); }
		public TerminalNode INT() { return getToken(GramaticaParser.INT, 0); }
		public List<AtribContext> atrib() {
			return getRuleContexts(AtribContext.class);
		}
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public ForstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitForstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForstatementContext forstatement() throws RecognitionException {
		ForstatementContext _localctx = new ForstatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_forstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368); match(FOR);
			setState(369); match(LPAREN);
			setState(370); match(INT);
			setState(371); atrib();
			setState(372); match(SEMICOLON);
			setState(373); expressao();
			setState(374); match(SEMICOLON);
			setState(375); atrib();
			setState(376); match(RPAREN);
			setState(377); comando();
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
		public TerminalNode LPAREN() { return getToken(GramaticaParser.LPAREN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GramaticaParser.RPAREN, 0); }
		public TerminalNode WHILE() { return getToken(GramaticaParser.WHILE, 0); }
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public WhilestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitWhilestatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhilestatementContext whilestatement() throws RecognitionException {
		WhilestatementContext _localctx = new WhilestatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_whilestatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379); match(WHILE);
			setState(380); match(LPAREN);
			setState(381); expressao();
			setState(382); match(RPAREN);
			setState(383); comando();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitListacomandos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListacomandosContext listacomandos() throws RecognitionException {
		ListacomandosContext _localctx = new ListacomandosContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_listacomandos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385); comando();
			setState(387);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BREAK) | (1L << IF) | (1L << FOR) | (1L << RETURN) | (1L << STRING) | (1L << INT) | (1L << DOUBLE) | (1L << WHILE) | (1L << BOOLEAN) | (1L << IDENT) | (1L << LBRACE) | (1L << SEMICOLON))) != 0)) {
				{
				setState(386); listacomandos();
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
		case 23: return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 6);
		case 1: return precpred(_ctx, 5);
		case 2: return precpred(_ctx, 4);
		case 3: return precpred(_ctx, 3);
		case 4: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3.\u0188\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\6\2@"+
		"\n\2\r\2\16\2A\3\3\3\3\5\3F\n\3\3\4\3\4\3\4\3\4\3\4\5\4M\n\4\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\5\6U\n\6\3\7\3\7\3\7\3\7\7\7[\n\7\f\7\16\7^\13\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bn\n\b\3\t\3\t\3"+
		"\t\7\ts\n\t\f\t\16\tv\13\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\7\f\u0086\n\f\f\f\16\f\u0089\13\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\7\r\u0093\n\r\f\r\16\r\u0096\13\r\3\16\3\16\3\16\6\16\u009b"+
		"\n\16\r\16\16\16\u009c\3\16\3\16\3\16\3\16\3\16\3\16\3\16\6\16\u00a6\n"+
		"\16\r\16\16\16\u00a7\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\7\20\u00b9\n\20\f\20\16\20\u00bc\13\20\3\20"+
		"\5\20\u00bf\n\20\3\21\3\21\3\21\3\21\3\21\3\22\7\22\u00c7\n\22\f\22\16"+
		"\22\u00ca\13\22\3\22\5\22\u00cd\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00e1\n\23"+
		"\3\24\3\24\5\24\u00e5\n\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\7\25"+
		"\u00ef\n\25\f\25\16\25\u00f2\13\25\3\25\3\25\3\25\3\25\3\25\7\25\u00f9"+
		"\n\25\f\25\16\25\u00fc\13\25\3\25\7\25\u00ff\n\25\f\25\16\25\u0102\13"+
		"\25\3\26\3\26\3\26\7\26\u0107\n\26\f\26\16\26\u010a\13\26\3\26\5\26\u010d"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0128"+
		"\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u0144\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0158\n\31\f\31\16\31\u015b\13\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0165\n\32\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0171\n\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\5\37\u0186\n\37\3\37\2\3\60 \2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<\2\3\4\2\23\25\27\27\u01a5\2?\3\2\2\2\4E\3"+
		"\2\2\2\6L\3\2\2\2\bN\3\2\2\2\nR\3\2\2\2\fV\3\2\2\2\16m\3\2\2\2\20o\3\2"+
		"\2\2\22y\3\2\2\2\24{\3\2\2\2\26\u0080\3\2\2\2\30\u008d\3\2\2\2\32\u0097"+
		"\3\2\2\2\34\u00a9\3\2\2\2\36\u00be\3\2\2\2 \u00c0\3\2\2\2\"\u00cc\3\2"+
		"\2\2$\u00e0\3\2\2\2&\u00e2\3\2\2\2(\u00eb\3\2\2\2*\u010c\3\2\2\2,\u0127"+
		"\3\2\2\2.\u0143\3\2\2\2\60\u0145\3\2\2\2\62\u0164\3\2\2\2\64\u0166\3\2"+
		"\2\2\66\u0169\3\2\2\28\u0172\3\2\2\2:\u017d\3\2\2\2<\u0183\3\2\2\2>@\5"+
		"\4\3\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\3\3\2\2\2CF\5\6\4\2DF"+
		"\5\34\17\2EC\3\2\2\2ED\3\2\2\2F\5\3\2\2\2GH\5\b\5\2HI\7\37\2\2IM\3\2\2"+
		"\2JM\5\16\b\2KM\5.\30\2LG\3\2\2\2LJ\3\2\2\2LK\3\2\2\2M\7\3\2\2\2NO\7\5"+
		"\2\2OP\5.\30\2PQ\7\32\2\2Q\t\3\2\2\2RT\5\f\7\2SU\5\n\6\2TS\3\2\2\2TU\3"+
		"\2\2\2U\13\3\2\2\2VW\7\t\2\2WX\7\30\2\2X\\\7\33\2\2Y[\5\16\b\2ZY\3\2\2"+
		"\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\7\34\2\2`\r"+
		"\3\2\2\2ab\5\20\t\2bc\7\37\2\2cn\3\2\2\2de\5\24\13\2ef\7\37\2\2fn\3\2"+
		"\2\2gh\5\26\f\2hi\7\37\2\2in\3\2\2\2jk\5\32\16\2kl\7\37\2\2ln\3\2\2\2"+
		"ma\3\2\2\2md\3\2\2\2mg\3\2\2\2mj\3\2\2\2n\17\3\2\2\2ot\5\22\n\2pq\7\35"+
		"\2\2qs\7\36\2\2rp\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3"+
		"\2\2\2wx\7\30\2\2x\21\3\2\2\2yz\t\2\2\2z\23\3\2\2\2{|\5\22\n\2|}\7\30"+
		"\2\2}~\7\"\2\2~\177\5\60\31\2\177\25\3\2\2\2\u0080\u0087\7\30\2\2\u0081"+
		"\u0082\7\35\2\2\u0082\u0083\5.\30\2\u0083\u0084\7\36\2\2\u0084\u0086\3"+
		"\2\2\2\u0085\u0081\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b\7\""+
		"\2\2\u008b\u008c\5.\30\2\u008c\27\3\2\2\2\u008d\u0094\7\30\2\2\u008e\u008f"+
		"\7\35\2\2\u008f\u0090\5.\30\2\u0090\u0091\7\36\2\2\u0091\u0093\3\2\2\2"+
		"\u0092\u008e\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095"+
		"\3\2\2\2\u0095\31\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u009a\5\22\n\2\u0098"+
		"\u0099\7\35\2\2\u0099\u009b\7\36\2\2\u009a\u0098\3\2\2\2\u009b\u009c\3"+
		"\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u009f\7\"\2\2\u009f\u00a0\7\22\2\2\u00a0\u00a5\5\22\n\2\u00a1\u00a2\7"+
		"\35\2\2\u00a2\u00a3\5.\30\2\u00a3\u00a4\7\36\2\2\u00a4\u00a6\3\2\2\2\u00a5"+
		"\u00a1\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2"+
		"\2\2\u00a8\33\3\2\2\2\u00a9\u00aa\7\24\2\2\u00aa\u00ab\7\30\2\2\u00ab"+
		"\u00ac\7\4\2\2\u00ac\u00ad\5\36\20\2\u00ad\u00ae\7\32\2\2\u00ae\u00af"+
		"\7\33\2\2\u00af\u00b0\5\"\22\2\u00b0\u00b1\7\3\2\2\u00b1\u00b2\5.\30\2"+
		"\u00b2\u00b3\7\37\2\2\u00b3\u00b4\7\34\2\2\u00b4\35\3\2\2\2\u00b5\u00ba"+
		"\5\20\t\2\u00b6\u00b7\7 \2\2\u00b7\u00b9\5\20\t\2\u00b8\u00b6\3\2\2\2"+
		"\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bf"+
		"\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be\u00b5\3\2\2\2\u00be"+
		"\u00bd\3\2\2\2\u00bf\37\3\2\2\2\u00c0\u00c1\7\30\2\2\u00c1\u00c2\7\31"+
		"\2\2\u00c2\u00c3\5*\26\2\u00c3\u00c4\7\32\2\2\u00c4!\3\2\2\2\u00c5\u00c7"+
		"\5$\23\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00cd\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cd\3\2"+
		"\2\2\u00cc\u00c8\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd#\3\2\2\2\u00ce\u00e1"+
		"\5\66\34\2\u00cf\u00e1\58\35\2\u00d0\u00d1\7\r\2\2\u00d1\u00e1\7\37\2"+
		"\2\u00d2\u00e1\7\37\2\2\u00d3\u00d4\5\20\t\2\u00d4\u00d5\7\37\2\2\u00d5"+
		"\u00e1\3\2\2\2\u00d6\u00d7\5\26\f\2\u00d7\u00d8\7\37\2\2\u00d8\u00e1\3"+
		"\2\2\2\u00d9\u00da\5\24\13\2\u00da\u00db\7\37\2\2\u00db\u00e1\3\2\2\2"+
		"\u00dc\u00dd\5\32\16\2\u00dd\u00de\7\37\2\2\u00de\u00e1\3\2\2\2\u00df"+
		"\u00e1\5:\36\2\u00e0\u00ce\3\2\2\2\u00e0\u00cf\3\2\2\2\u00e0\u00d0\3\2"+
		"\2\2\u00e0\u00d2\3\2\2\2\u00e0\u00d3\3\2\2\2\u00e0\u00d6\3\2\2\2\u00e0"+
		"\u00d9\3\2\2\2\u00e0\u00dc\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1%\3\2\2\2"+
		"\u00e2\u00e4\7\31\2\2\u00e3\u00e5\5(\25\2\u00e4\u00e3\3\2\2\2\u00e4\u00e5"+
		"\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\7\32\2\2\u00e7\u00e8\7\33\2\2"+
		"\u00e8\u00e9\5,\27\2\u00e9\u00ea\7\34\2\2\u00ea\'\3\2\2\2\u00eb\u00f0"+
		"\t\2\2\2\u00ec\u00ed\7\35\2\2\u00ed\u00ef\7\36\2\2\u00ee\u00ec\3\2\2\2"+
		"\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3"+
		"\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u0100\7\30\2\2\u00f4\u00f5\7 \2\2\u00f5"+
		"\u00fa\t\2\2\2\u00f6\u00f7\7\35\2\2\u00f7\u00f9\7\36\2\2\u00f8\u00f6\3"+
		"\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00ff\7\30\2\2\u00fe\u00f4\3"+
		"\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		")\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0108\5.\30\2\u0104\u0105\7 \2\2\u0105"+
		"\u0107\5.\30\2\u0106\u0104\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2"+
		"\2\2\u0108\u0109\3\2\2\2\u0109\u010d\3\2\2\2\u010a\u0108\3\2\2\2\u010b"+
		"\u010d\3\2\2\2\u010c\u0103\3\2\2\2\u010c\u010b\3\2\2\2\u010d+\3\2\2\2"+
		"\u010e\u010f\5\64\33\2\u010f\u0110\7\37\2\2\u0110\u0128\3\2\2\2\u0111"+
		"\u0128\5\66\34\2\u0112\u0128\58\35\2\u0113\u0114\7\33\2\2\u0114\u0115"+
		"\5<\37\2\u0115\u0116\7\34\2\2\u0116\u0128\3\2\2\2\u0117\u0118\7\r\2\2"+
		"\u0118\u0128\7\37\2\2\u0119\u0128\7\37\2\2\u011a\u011b\5\20\t\2\u011b"+
		"\u011c\7\37\2\2\u011c\u0128\3\2\2\2\u011d\u011e\5\26\f\2\u011e\u011f\7"+
		"\37\2\2\u011f\u0128\3\2\2\2\u0120\u0121\5\24\13\2\u0121\u0122\7\37\2\2"+
		"\u0122\u0128\3\2\2\2\u0123\u0124\5\32\16\2\u0124\u0125\7\37\2\2\u0125"+
		"\u0128\3\2\2\2\u0126\u0128\5:\36\2\u0127\u010e\3\2\2\2\u0127\u0111\3\2"+
		"\2\2\u0127\u0112\3\2\2\2\u0127\u0113\3\2\2\2\u0127\u0117\3\2\2\2\u0127"+
		"\u0119\3\2\2\2\u0127\u011a\3\2\2\2\u0127\u011d\3\2\2\2\u0127\u0120\3\2"+
		"\2\2\u0127\u0123\3\2\2\2\u0127\u0126\3\2\2\2\u0128-\3\2\2\2\u0129\u0144"+
		"\5\60\31\2\u012a\u012b\5\60\31\2\u012b\u012c\7$\2\2\u012c\u012d\5\60\31"+
		"\2\u012d\u0144\3\2\2\2\u012e\u012f\5\60\31\2\u012f\u0130\7#\2\2\u0130"+
		"\u0131\5\60\31\2\u0131\u0144\3\2\2\2\u0132\u0133\5\60\31\2\u0133\u0134"+
		"\7&\2\2\u0134\u0135\5\60\31\2\u0135\u0144\3\2\2\2\u0136\u0137\5\60\31"+
		"\2\u0137\u0138\7\'\2\2\u0138\u0139\5\60\31\2\u0139\u0144\3\2\2\2\u013a"+
		"\u013b\5\60\31\2\u013b\u013c\7%\2\2\u013c\u013d\5\60\31\2\u013d\u0144"+
		"\3\2\2\2\u013e\u013f\5\60\31\2\u013f\u0140\7(\2\2\u0140\u0141\5\60\31"+
		"\2\u0141\u0144\3\2\2\2\u0142\u0144\5 \21\2\u0143\u0129\3\2\2\2\u0143\u012a"+
		"\3\2\2\2\u0143\u012e\3\2\2\2\u0143\u0132\3\2\2\2\u0143\u0136\3\2\2\2\u0143"+
		"\u013a\3\2\2\2\u0143\u013e\3\2\2\2\u0143\u0142\3\2\2\2\u0144/\3\2\2\2"+
		"\u0145\u0146\b\31\1\2\u0146\u0147\5\62\32\2\u0147\u0159\3\2\2\2\u0148"+
		"\u0149\f\b\2\2\u0149\u014a\7,\2\2\u014a\u0158\5\60\31\t\u014b\u014c\f"+
		"\7\2\2\u014c\u014d\7+\2\2\u014d\u0158\5\60\31\b\u014e\u014f\f\6\2\2\u014f"+
		"\u0150\7-\2\2\u0150\u0158\5\60\31\7\u0151\u0152\f\5\2\2\u0152\u0153\7"+
		"*\2\2\u0153\u0158\5\60\31\6\u0154\u0155\f\4\2\2\u0155\u0156\7)\2\2\u0156"+
		"\u0158\5\60\31\5\u0157\u0148\3\2\2\2\u0157\u014b\3\2\2\2\u0157\u014e\3"+
		"\2\2\2\u0157\u0151\3\2\2\2\u0157\u0154\3\2\2\2\u0158\u015b\3\2\2\2\u0159"+
		"\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\61\3\2\2\2\u015b\u0159\3\2\2"+
		"\2\u015c\u0165\7\6\2\2\u015d\u0165\7\b\2\2\u015e\u0165\7\7\2\2\u015f\u0165"+
		"\5\30\r\2\u0160\u0161\7\31\2\2\u0161\u0162\5\60\31\2\u0162\u0163\7\32"+
		"\2\2\u0163\u0165\3\2\2\2\u0164\u015c\3\2\2\2\u0164\u015d\3\2\2\2\u0164"+
		"\u015e\3\2\2\2\u0164\u015f\3\2\2\2\u0164\u0160\3\2\2\2\u0165\63\3\2\2"+
		"\2\u0166\u0167\7\21\2\2\u0167\u0168\5.\30\2\u0168\65\3\2\2\2\u0169\u016a"+
		"\7\16\2\2\u016a\u016b\7\31\2\2\u016b\u016c\5.\30\2\u016c\u016d\7\32\2"+
		"\2\u016d\u0170\5,\27\2\u016e\u016f\7\17\2\2\u016f\u0171\5,\27\2\u0170"+
		"\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\67\3\2\2\2\u0172\u0173\7\20\2"+
		"\2\u0173\u0174\7\31\2\2\u0174\u0175\7\24\2\2\u0175\u0176\5\26\f\2\u0176"+
		"\u0177\7\37\2\2\u0177\u0178\5.\30\2\u0178\u0179\7\37\2\2\u0179\u017a\5"+
		"\26\f\2\u017a\u017b\7\32\2\2\u017b\u017c\5,\27\2\u017c9\3\2\2\2\u017d"+
		"\u017e\7\26\2\2\u017e\u017f\7\31\2\2\u017f\u0180\5.\30\2\u0180\u0181\7"+
		"\32\2\2\u0181\u0182\5,\27\2\u0182;\3\2\2\2\u0183\u0185\5,\27\2\u0184\u0186"+
		"\5<\37\2\u0185\u0184\3\2\2\2\u0185\u0186\3\2\2\2\u0186=\3\2\2\2\37AEL"+
		"T\\mt\u0087\u0094\u009c\u00a7\u00ba\u00be\u00c8\u00cc\u00e0\u00e4\u00f0"+
		"\u00fa\u0100\u0108\u010c\u0127\u0143\u0157\u0159\u0164\u0170\u0185";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}