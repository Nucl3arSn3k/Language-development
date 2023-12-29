// Generated from YourGrammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class YourGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WINDMILL=1, DISPLAY=2, BREEZE=3, ZEPHYR=4, MATCHES=5, TWIRL=6, SWIRL=7, 
		IDENTIFIER=8, INTEGER=9, WHITESPACE=10, EQ=11, LPAREN=12, RPAREN=13, LBRACE=14, 
		RBRACE=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WINDMILL", "DISPLAY", "BREEZE", "ZEPHYR", "MATCHES", "TWIRL", "SWIRL", 
			"IDENTIFIER", "INTEGER", "WHITESPACE", "EQ", "LPAREN", "RPAREN", "LBRACE", 
			"RBRACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'WINDMILL'", "'DISPLAY'", "'BREEZE'", "'ZEPHYR'", "'MATCHES'", 
			"'TWIRL'", "'SWIRL'", null, null, null, "'='", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WINDMILL", "DISPLAY", "BREEZE", "ZEPHYR", "MATCHES", "TWIRL", 
			"SWIRL", "IDENTIFIER", "INTEGER", "WHITESPACE", "EQ", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE"
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


	public YourGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "YourGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u000fo\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0005\u0007U\b"+
		"\u0007\n\u0007\f\u0007X\t\u0007\u0001\b\u0004\b[\b\b\u000b\b\f\b\\\u0001"+
		"\t\u0004\t`\b\t\u000b\t\f\ta\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0000"+
		"\u0000\u000f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u0001\u0000\u0004\u0003\u0000AZ__az\u0004\u000009A"+
		"Z__az\u0001\u000009\u0003\u0000\t\n\r\r  q\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0001"+
		"\u001f\u0001\u0000\u0000\u0000\u0003(\u0001\u0000\u0000\u0000\u00050\u0001"+
		"\u0000\u0000\u0000\u00077\u0001\u0000\u0000\u0000\t>\u0001\u0000\u0000"+
		"\u0000\u000bF\u0001\u0000\u0000\u0000\rL\u0001\u0000\u0000\u0000\u000f"+
		"R\u0001\u0000\u0000\u0000\u0011Z\u0001\u0000\u0000\u0000\u0013_\u0001"+
		"\u0000\u0000\u0000\u0015e\u0001\u0000\u0000\u0000\u0017g\u0001\u0000\u0000"+
		"\u0000\u0019i\u0001\u0000\u0000\u0000\u001bk\u0001\u0000\u0000\u0000\u001d"+
		"m\u0001\u0000\u0000\u0000\u001f \u0005W\u0000\u0000 !\u0005I\u0000\u0000"+
		"!\"\u0005N\u0000\u0000\"#\u0005D\u0000\u0000#$\u0005M\u0000\u0000$%\u0005"+
		"I\u0000\u0000%&\u0005L\u0000\u0000&\'\u0005L\u0000\u0000\'\u0002\u0001"+
		"\u0000\u0000\u0000()\u0005D\u0000\u0000)*\u0005I\u0000\u0000*+\u0005S"+
		"\u0000\u0000+,\u0005P\u0000\u0000,-\u0005L\u0000\u0000-.\u0005A\u0000"+
		"\u0000./\u0005Y\u0000\u0000/\u0004\u0001\u0000\u0000\u000001\u0005B\u0000"+
		"\u000012\u0005R\u0000\u000023\u0005E\u0000\u000034\u0005E\u0000\u0000"+
		"45\u0005Z\u0000\u000056\u0005E\u0000\u00006\u0006\u0001\u0000\u0000\u0000"+
		"78\u0005Z\u0000\u000089\u0005E\u0000\u00009:\u0005P\u0000\u0000:;\u0005"+
		"H\u0000\u0000;<\u0005Y\u0000\u0000<=\u0005R\u0000\u0000=\b\u0001\u0000"+
		"\u0000\u0000>?\u0005M\u0000\u0000?@\u0005A\u0000\u0000@A\u0005T\u0000"+
		"\u0000AB\u0005C\u0000\u0000BC\u0005H\u0000\u0000CD\u0005E\u0000\u0000"+
		"DE\u0005S\u0000\u0000E\n\u0001\u0000\u0000\u0000FG\u0005T\u0000\u0000"+
		"GH\u0005W\u0000\u0000HI\u0005I\u0000\u0000IJ\u0005R\u0000\u0000JK\u0005"+
		"L\u0000\u0000K\f\u0001\u0000\u0000\u0000LM\u0005S\u0000\u0000MN\u0005"+
		"W\u0000\u0000NO\u0005I\u0000\u0000OP\u0005R\u0000\u0000PQ\u0005L\u0000"+
		"\u0000Q\u000e\u0001\u0000\u0000\u0000RV\u0007\u0000\u0000\u0000SU\u0007"+
		"\u0001\u0000\u0000TS\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000"+
		"VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000W\u0010\u0001\u0000"+
		"\u0000\u0000XV\u0001\u0000\u0000\u0000Y[\u0007\u0002\u0000\u0000ZY\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000"+
		"\\]\u0001\u0000\u0000\u0000]\u0012\u0001\u0000\u0000\u0000^`\u0007\u0003"+
		"\u0000\u0000_^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000a_\u0001"+
		"\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000"+
		"cd\u0006\t\u0000\u0000d\u0014\u0001\u0000\u0000\u0000ef\u0005=\u0000\u0000"+
		"f\u0016\u0001\u0000\u0000\u0000gh\u0005(\u0000\u0000h\u0018\u0001\u0000"+
		"\u0000\u0000ij\u0005)\u0000\u0000j\u001a\u0001\u0000\u0000\u0000kl\u0005"+
		"{\u0000\u0000l\u001c\u0001\u0000\u0000\u0000mn\u0005}\u0000\u0000n\u001e"+
		"\u0001\u0000\u0000\u0000\u0004\u0000V\\a\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}