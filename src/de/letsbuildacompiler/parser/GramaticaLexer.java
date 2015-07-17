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
		T__0=1, T__1=2, T__2=3, T__3=4, INT_CONSTANT=5, DOUBLE_CONSTANT=6, CLASS=7, 
		VOID=8, BREAK=9, IF=10, ELSE=11, FOR=12, RETURN=13, INT=14, DOUBLE=15, 
		TEXTO=16, WHILE=17, IDENT=18, STRING=19, LPAREN=20, RPAREN=21, LBRACE=22, 
		RBRACE=23, SEMICOLON=24, COMMA=25, DOT=26, ASSIGN=27, GT=28, LT=29, EQ=30, 
		LE=31, GE=32, NEQ=33, PLUS=34, MINUS=35, STAR=36, SLASH=37, REM=38, WHITESPACE=39;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "INT_CONSTANT", "DOUBLE_CONSTANT", "CLASS", 
		"VOID", "BREAK", "IF", "ELSE", "FOR", "RETURN", "INT", "DOUBLE", "TEXTO", 
		"WHILE", "IDENT", "STRING", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "SEMICOLON", 
		"COMMA", "DOT", "ASSIGN", "GT", "LT", "EQ", "LE", "GE", "NEQ", "PLUS", 
		"MINUS", "STAR", "SLASH", "REM", "WHITESPACE"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2)\u00f9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\6\6n\n\6\r\6\16\6o\3\7\6\7s\n\7\r\7\16\7t\3\7\3"+
		"\7\6\7y\n\7\r\7\16\7z\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\7\23\u00bb\n\23\f\23\16\23\u00be\13\23\3"+
		"\24\3\24\7\24\u00c2\n\24\f\24\16\24\u00c5\13\24\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3"+
		"\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#"+
		"\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\6(\u00f4\n(\r(\16(\u00f5\3(\3(\3\u00c3\2"+
		")\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)\3\2\6\3\2\62;\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\17"+
		"\17\"\"\u00fe\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\3Q\3\2\2\2\5"+
		"Z\3\2\2\2\7a\3\2\2\2\td\3\2\2\2\13m\3\2\2\2\rr\3\2\2\2\17|\3\2\2\2\21"+
		"\u0082\3\2\2\2\23\u0087\3\2\2\2\25\u008d\3\2\2\2\27\u0090\3\2\2\2\31\u0095"+
		"\3\2\2\2\33\u0099\3\2\2\2\35\u00a0\3\2\2\2\37\u00a4\3\2\2\2!\u00ab\3\2"+
		"\2\2#\u00b2\3\2\2\2%\u00b8\3\2\2\2\'\u00bf\3\2\2\2)\u00c8\3\2\2\2+\u00ca"+
		"\3\2\2\2-\u00cc\3\2\2\2/\u00ce\3\2\2\2\61\u00d0\3\2\2\2\63\u00d2\3\2\2"+
		"\2\65\u00d4\3\2\2\2\67\u00d6\3\2\2\29\u00d8\3\2\2\2;\u00da\3\2\2\2=\u00dc"+
		"\3\2\2\2?\u00df\3\2\2\2A\u00e2\3\2\2\2C\u00e5\3\2\2\2E\u00e8\3\2\2\2G"+
		"\u00ea\3\2\2\2I\u00ec\3\2\2\2K\u00ee\3\2\2\2M\u00f0\3\2\2\2O\u00f3\3\2"+
		"\2\2QR\7r\2\2RS\7t\2\2ST\7k\2\2TU\7p\2\2UV\7v\2\2VW\7n\2\2WX\7p\2\2XY"+
		"\7*\2\2Y\4\3\2\2\2Z[\7r\2\2[\\\7t\2\2\\]\7k\2\2]^\7p\2\2^_\7v\2\2_`\7"+
		"*\2\2`\6\3\2\2\2ab\7\"\2\2bc\7*\2\2c\b\3\2\2\2de\7t\2\2ef\7g\2\2fg\7v"+
		"\2\2gh\7w\2\2hi\7t\2\2ij\7p\2\2jk\7\"\2\2k\n\3\2\2\2ln\t\2\2\2ml\3\2\2"+
		"\2no\3\2\2\2om\3\2\2\2op\3\2\2\2p\f\3\2\2\2qs\t\2\2\2rq\3\2\2\2st\3\2"+
		"\2\2tr\3\2\2\2tu\3\2\2\2uv\3\2\2\2vx\5\65\33\2wy\t\2\2\2xw\3\2\2\2yz\3"+
		"\2\2\2zx\3\2\2\2z{\3\2\2\2{\16\3\2\2\2|}\7e\2\2}~\7n\2\2~\177\7c\2\2\177"+
		"\u0080\7u\2\2\u0080\u0081\7u\2\2\u0081\20\3\2\2\2\u0082\u0083\7x\2\2\u0083"+
		"\u0084\7q\2\2\u0084\u0085\7k\2\2\u0085\u0086\7f\2\2\u0086\22\3\2\2\2\u0087"+
		"\u0088\7d\2\2\u0088\u0089\7t\2\2\u0089\u008a\7g\2\2\u008a\u008b\7c\2\2"+
		"\u008b\u008c\7m\2\2\u008c\24\3\2\2\2\u008d\u008e\7k\2\2\u008e\u008f\7"+
		"h\2\2\u008f\26\3\2\2\2\u0090\u0091\7g\2\2\u0091\u0092\7n\2\2\u0092\u0093"+
		"\7u\2\2\u0093\u0094\7g\2\2\u0094\30\3\2\2\2\u0095\u0096\7h\2\2\u0096\u0097"+
		"\7q\2\2\u0097\u0098\7t\2\2\u0098\32\3\2\2\2\u0099\u009a\7t\2\2\u009a\u009b"+
		"\7g\2\2\u009b\u009c\7v\2\2\u009c\u009d\7w\2\2\u009d\u009e\7t\2\2\u009e"+
		"\u009f\7p\2\2\u009f\34\3\2\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2\7p\2\2\u00a2"+
		"\u00a3\7v\2\2\u00a3\36\3\2\2\2\u00a4\u00a5\7F\2\2\u00a5\u00a6\7Q\2\2\u00a6"+
		"\u00a7\7W\2\2\u00a7\u00a8\7D\2\2\u00a8\u00a9\7N\2\2\u00a9\u00aa\7G\2\2"+
		"\u00aa \3\2\2\2\u00ab\u00ac\7U\2\2\u00ac\u00ad\7v\2\2\u00ad\u00ae\7t\2"+
		"\2\u00ae\u00af\7k\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1\7i\2\2\u00b1\"\3"+
		"\2\2\2\u00b2\u00b3\7y\2\2\u00b3\u00b4\7j\2\2\u00b4\u00b5\7k\2\2\u00b5"+
		"\u00b6\7n\2\2\u00b6\u00b7\7g\2\2\u00b7$\3\2\2\2\u00b8\u00bc\t\3\2\2\u00b9"+
		"\u00bb\t\4\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2"+
		"\2\2\u00bc\u00bd\3\2\2\2\u00bd&\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c3"+
		"\7$\2\2\u00c0\u00c2\13\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c3\3\2"+
		"\2\2\u00c6\u00c7\7$\2\2\u00c7(\3\2\2\2\u00c8\u00c9\7*\2\2\u00c9*\3\2\2"+
		"\2\u00ca\u00cb\7+\2\2\u00cb,\3\2\2\2\u00cc\u00cd\7}\2\2\u00cd.\3\2\2\2"+
		"\u00ce\u00cf\7\177\2\2\u00cf\60\3\2\2\2\u00d0\u00d1\7=\2\2\u00d1\62\3"+
		"\2\2\2\u00d2\u00d3\7.\2\2\u00d3\64\3\2\2\2\u00d4\u00d5\7\60\2\2\u00d5"+
		"\66\3\2\2\2\u00d6\u00d7\7?\2\2\u00d78\3\2\2\2\u00d8\u00d9\7@\2\2\u00d9"+
		":\3\2\2\2\u00da\u00db\7>\2\2\u00db<\3\2\2\2\u00dc\u00dd\7?\2\2\u00dd\u00de"+
		"\7?\2\2\u00de>\3\2\2\2\u00df\u00e0\7>\2\2\u00e0\u00e1\7?\2\2\u00e1@\3"+
		"\2\2\2\u00e2\u00e3\7@\2\2\u00e3\u00e4\7?\2\2\u00e4B\3\2\2\2\u00e5\u00e6"+
		"\7#\2\2\u00e6\u00e7\7?\2\2\u00e7D\3\2\2\2\u00e8\u00e9\7-\2\2\u00e9F\3"+
		"\2\2\2\u00ea\u00eb\7/\2\2\u00ebH\3\2\2\2\u00ec\u00ed\7,\2\2\u00edJ\3\2"+
		"\2\2\u00ee\u00ef\7\61\2\2\u00efL\3\2\2\2\u00f0\u00f1\7\'\2\2\u00f1N\3"+
		"\2\2\2\u00f2\u00f4\t\5\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\b("+
		"\2\2\u00f8P\3\2\2\2\t\2otz\u00bc\u00c3\u00f5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}