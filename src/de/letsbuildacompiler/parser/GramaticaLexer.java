// Generated from Gramatica.g4 by ANTLR 4.5
package de.letsbuildacompiler.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "INT_CONSTANT", "NULL_CONSTANT", "DOUBLE_CONSTANT", 
		"CLASS", "VOID", "TRUE", "FALSE", "BREAK", "IF", "ELSE", "FOR", "RETURN", 
		"NEW", "STRING", "INT", "DOUBLE", "WHILE", "BOOLEAN", "IDENT", "LPAREN", 
		"RPAREN", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "SEMICOLON", "COMMA", 
		"DOT", "ASSIGN", "GT", "LT", "EQ", "LE", "GE", "NEQ", "PLUS", "MINUS", 
		"STAR", "SLASH", "REM", "WHITESPACE"
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


	public GramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2.\u0113\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\6\5q\n\5\r\5\16\5r\3\6\3\6\3\6\3\6\3\6\3\7\6"+
		"\7{\n\7\r\7\16\7|\3\7\3\7\6\7\u0081\n\7\r\7\16\7\u0082\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\7\27\u00da\n\27\f\27\16\27\u00dd\13"+
		"\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3"+
		"\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'"+
		"\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\6-\u010e\n-\r-\16-\u010f\3-"+
		"\3-\2\2.\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.\3\2\6\3\2\62;\4\2C\\c|\5\2\62"+
		";C\\c|\5\2\13\f\17\17\"\"\u0117\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\3[\3\2"+
		"\2\2\5d\3\2\2\2\7g\3\2\2\2\tp\3\2\2\2\13t\3\2\2\2\rz\3\2\2\2\17\u0084"+
		"\3\2\2\2\21\u008a\3\2\2\2\23\u008f\3\2\2\2\25\u0094\3\2\2\2\27\u009a\3"+
		"\2\2\2\31\u00a0\3\2\2\2\33\u00a3\3\2\2\2\35\u00a8\3\2\2\2\37\u00ac\3\2"+
		"\2\2!\u00b3\3\2\2\2#\u00b7\3\2\2\2%\u00be\3\2\2\2\'\u00c2\3\2\2\2)\u00c9"+
		"\3\2\2\2+\u00cf\3\2\2\2-\u00d7\3\2\2\2/\u00de\3\2\2\2\61\u00e0\3\2\2\2"+
		"\63\u00e2\3\2\2\2\65\u00e4\3\2\2\2\67\u00e6\3\2\2\29\u00e8\3\2\2\2;\u00ea"+
		"\3\2\2\2=\u00ec\3\2\2\2?\u00ee\3\2\2\2A\u00f0\3\2\2\2C\u00f2\3\2\2\2E"+
		"\u00f4\3\2\2\2G\u00f6\3\2\2\2I\u00f9\3\2\2\2K\u00fc\3\2\2\2M\u00ff\3\2"+
		"\2\2O\u0102\3\2\2\2Q\u0104\3\2\2\2S\u0106\3\2\2\2U\u0108\3\2\2\2W\u010a"+
		"\3\2\2\2Y\u010d\3\2\2\2[\\\7r\2\2\\]\7t\2\2]^\7k\2\2^_\7p\2\2_`\7v\2\2"+
		"`a\7n\2\2ab\7p\2\2bc\7*\2\2c\4\3\2\2\2de\7\"\2\2ef\7*\2\2f\6\3\2\2\2g"+
		"h\7t\2\2hi\7g\2\2ij\7v\2\2jk\7w\2\2kl\7t\2\2lm\7p\2\2mn\7\"\2\2n\b\3\2"+
		"\2\2oq\t\2\2\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\n\3\2\2\2tu\7"+
		"p\2\2uv\7w\2\2vw\7n\2\2wx\7n\2\2x\f\3\2\2\2y{\t\2\2\2zy\3\2\2\2{|\3\2"+
		"\2\2|z\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\u0080\5? \2\177\u0081\t\2\2\2\u0080"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2"+
		"\2\u0083\16\3\2\2\2\u0084\u0085\7e\2\2\u0085\u0086\7n\2\2\u0086\u0087"+
		"\7c\2\2\u0087\u0088\7u\2\2\u0088\u0089\7u\2\2\u0089\20\3\2\2\2\u008a\u008b"+
		"\7x\2\2\u008b\u008c\7q\2\2\u008c\u008d\7k\2\2\u008d\u008e\7f\2\2\u008e"+
		"\22\3\2\2\2\u008f\u0090\7v\2\2\u0090\u0091\7t\2\2\u0091\u0092\7w\2\2\u0092"+
		"\u0093\7g\2\2\u0093\24\3\2\2\2\u0094\u0095\7h\2\2\u0095\u0096\7c\2\2\u0096"+
		"\u0097\7n\2\2\u0097\u0098\7u\2\2\u0098\u0099\7g\2\2\u0099\26\3\2\2\2\u009a"+
		"\u009b\7d\2\2\u009b\u009c\7t\2\2\u009c\u009d\7g\2\2\u009d\u009e\7c\2\2"+
		"\u009e\u009f\7m\2\2\u009f\30\3\2\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2\7"+
		"h\2\2\u00a2\32\3\2\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7n\2\2\u00a5\u00a6"+
		"\7u\2\2\u00a6\u00a7\7g\2\2\u00a7\34\3\2\2\2\u00a8\u00a9\7h\2\2\u00a9\u00aa"+
		"\7q\2\2\u00aa\u00ab\7t\2\2\u00ab\36\3\2\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae"+
		"\7g\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7w\2\2\u00b0\u00b1\7t\2\2\u00b1"+
		"\u00b2\7p\2\2\u00b2 \3\2\2\2\u00b3\u00b4\7p\2\2\u00b4\u00b5\7g\2\2\u00b5"+
		"\u00b6\7y\2\2\u00b6\"\3\2\2\2\u00b7\u00b8\7u\2\2\u00b8\u00b9\7v\2\2\u00b9"+
		"\u00ba\7t\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc\7p\2\2\u00bc\u00bd\7i\2\2"+
		"\u00bd$\3\2\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7p\2\2\u00c0\u00c1\7v\2"+
		"\2\u00c1&\3\2\2\2\u00c2\u00c3\7f\2\2\u00c3\u00c4\7q\2\2\u00c4\u00c5\7"+
		"w\2\2\u00c5\u00c6\7d\2\2\u00c6\u00c7\7n\2\2\u00c7\u00c8\7g\2\2\u00c8("+
		"\3\2\2\2\u00c9\u00ca\7y\2\2\u00ca\u00cb\7j\2\2\u00cb\u00cc\7k\2\2\u00cc"+
		"\u00cd\7n\2\2\u00cd\u00ce\7g\2\2\u00ce*\3\2\2\2\u00cf\u00d0\7d\2\2\u00d0"+
		"\u00d1\7q\2\2\u00d1\u00d2\7q\2\2\u00d2\u00d3\7n\2\2\u00d3\u00d4\7g\2\2"+
		"\u00d4\u00d5\7c\2\2\u00d5\u00d6\7p\2\2\u00d6,\3\2\2\2\u00d7\u00db\t\3"+
		"\2\2\u00d8\u00da\t\4\2\2\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc.\3\2\2\2\u00dd\u00db\3\2\2\2"+
		"\u00de\u00df\7*\2\2\u00df\60\3\2\2\2\u00e0\u00e1\7+\2\2\u00e1\62\3\2\2"+
		"\2\u00e2\u00e3\7}\2\2\u00e3\64\3\2\2\2\u00e4\u00e5\7\177\2\2\u00e5\66"+
		"\3\2\2\2\u00e6\u00e7\7]\2\2\u00e78\3\2\2\2\u00e8\u00e9\7_\2\2\u00e9:\3"+
		"\2\2\2\u00ea\u00eb\7=\2\2\u00eb<\3\2\2\2\u00ec\u00ed\7.\2\2\u00ed>\3\2"+
		"\2\2\u00ee\u00ef\7\60\2\2\u00ef@\3\2\2\2\u00f0\u00f1\7?\2\2\u00f1B\3\2"+
		"\2\2\u00f2\u00f3\7@\2\2\u00f3D\3\2\2\2\u00f4\u00f5\7>\2\2\u00f5F\3\2\2"+
		"\2\u00f6\u00f7\7?\2\2\u00f7\u00f8\7?\2\2\u00f8H\3\2\2\2\u00f9\u00fa\7"+
		">\2\2\u00fa\u00fb\7?\2\2\u00fbJ\3\2\2\2\u00fc\u00fd\7@\2\2\u00fd\u00fe"+
		"\7?\2\2\u00feL\3\2\2\2\u00ff\u0100\7#\2\2\u0100\u0101\7?\2\2\u0101N\3"+
		"\2\2\2\u0102\u0103\7-\2\2\u0103P\3\2\2\2\u0104\u0105\7/\2\2\u0105R\3\2"+
		"\2\2\u0106\u0107\7,\2\2\u0107T\3\2\2\2\u0108\u0109\7\61\2\2\u0109V\3\2"+
		"\2\2\u010a\u010b\7\'\2\2\u010bX\3\2\2\2\u010c\u010e\t\5\2\2\u010d\u010c"+
		"\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111\u0112\b-\2\2\u0112Z\3\2\2\2\b\2r|\u0082\u00db\u010f"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}