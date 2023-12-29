// Generated from YourGrammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class YourGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WINDMILL=1, DISPLAY=2, BREEZE=3, ZEPHYR=4, MATCHES=5, TWIRL=6, SWIRL=7, 
		IDENTIFIER=8, INTEGER=9, WHITESPACE=10, EQ=11, LPAREN=12, RPAREN=13, LBRACE=14, 
		RBRACE=15;
	public static final int
		RULE_program = 0, RULE_windmill_statement = 1, RULE_block_statements = 2, 
		RULE_statement = 3, RULE_assignment_statement = 4, RULE_equivalence_statement = 5, 
		RULE_print_statement = 6, RULE_function_call = 7, RULE_gust_expression = 8, 
		RULE_whirl_term = 9, RULE_whirl_factor = 10, RULE_identifier = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "windmill_statement", "block_statements", "statement", "assignment_statement", 
			"equivalence_statement", "print_statement", "function_call", "gust_expression", 
			"whirl_term", "whirl_factor", "identifier"
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

	@Override
	public String getGrammarFileName() { return "YourGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public YourGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<Windmill_statementContext> windmill_statement() {
			return getRuleContexts(Windmill_statementContext.class);
		}
		public Windmill_statementContext windmill_statement(int i) {
			return getRuleContext(Windmill_statementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YourGrammarListener ) ((YourGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YourGrammarListener ) ((YourGrammarListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WINDMILL) {
				{
				{
				setState(24);
				windmill_statement();
				}
				}
				setState(29);
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
	public static class Windmill_statementContext extends ParserRuleContext {
		public TerminalNode WINDMILL() { return getToken(YourGrammarParser.WINDMILL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(YourGrammarParser.LBRACE, 0); }
		public Block_statementsContext block_statements() {
			return getRuleContext(Block_statementsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(YourGrammarParser.RBRACE, 0); }
		public Windmill_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windmill_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YourGrammarListener ) ((YourGrammarListener)listener).enterWindmill_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YourGrammarListener ) ((YourGrammarListener)listener).exitWindmill_statement(this);
		}
	}

	public final Windmill_statementContext windmill_statement() throws RecognitionException {
		Windmill_statementContext _localctx = new Windmill_statementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_windmill_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(WINDMILL);
			setState(31);
			identifier();
			setState(32);
			match(LBRACE);
			setState(33);
			block_statements();
			setState(34);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Block_statementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Block_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YourGrammarListener ) ((YourGrammarListener)listener).enterBlock_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YourGrammarListener ) ((YourGrammarListener)listener).exitBlock_statements(this);
		}
	}

	public final Block_statementsContext block_statements() throws RecognitionException {
		Block_statementsContext _localctx = new Block_statementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4868L) != 0)) {
				{
				{
				setState(36);
				statement();
				}
				}
				setState(41);
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
	public static class StatementContext extends ParserRuleContext {
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public Equivalence_statementContext equivalence_statement() {
			return getRuleContext(Equivalence_statementContext.class,0);
		}
		public Print_statementContext print_statement() {
			return getRuleContext(Print_statementContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YourGrammarListener ) ((YourGrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YourGrammarListener ) ((YourGrammarListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				assignment_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				equivalence_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				print_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(45);
				function_call();
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
	public static class Assignment_statementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(YourGrammarParser.EQ, 0); }
		public Gust_expressionContext gust_expression() {
			return getRuleContext(Gust_expressionContext.class,0);
		}
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YourGrammarListener ) ((YourGrammarListener)listener).enterAssignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YourGrammarListener ) ((YourGrammarListener)listener).exitAssignment_statement(this);
		}
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			identifier();
			setState(49);
			match(EQ);
			setState(50);
			gust_expression();
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
	public static class Equivalence_statementContext extends ParserRuleContext {
		public List<Gust_expressionContext> gust_expression() {
			return getRuleContexts(Gust_expressionContext.class);
		}
		public Gust_expressionContext gust_expression(int i) {
			return getRuleContext(Gust_expressionContext.class,i);
		}
		public TerminalNode MATCHES() { return getToken(YourGrammarParser.MATCHES, 0); }
		public Equivalence_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equivalence_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YourGrammarListener ) ((YourGrammarListener)listener).enterEquivalence_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YourGrammarListener ) ((YourGrammarListener)listener).exitEquivalence_statement(this);
		}
	}

	public final Equivalence_statementContext equivalence_statement() throws RecognitionException {
		Equivalence_statementContext _localctx = new Equivalence_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_equivalence_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			gust_expression();
			setState(53);
			match(MATCHES);
			setState(54);
			gust_expression();
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
	public static class Print_statementContext extends ParserRuleContext {
		public TerminalNode DISPLAY() { return getToken(YourGrammarParser.DISPLAY, 0); }
		public Gust_expressionContext gust_expression() {
			return getRuleContext(Gust_expressionContext.class,0);
		}
		public Print_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YourGrammarListener ) ((YourGrammarListener)listener).enterPrint_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YourGrammarListener ) ((YourGrammarListener)listener).exitPrint_statement(this);
		}
	}

	public final Print_statementContext print_statement() throws RecognitionException {
		Print_statementContext _localctx = new Print_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_print_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(DISPLAY);
			setState(57);
			gust_expression();
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
	public static class Function_callContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(YourGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(YourGrammarParser.RPAREN, 0); }
		public List<Gust_expressionContext> gust_expression() {
			return getRuleContexts(Gust_expressionContext.class);
		}
		public Gust_expressionContext gust_expression(int i) {
			return getRuleContext(Gust_expressionContext.class,i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YourGrammarListener ) ((YourGrammarListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YourGrammarListener ) ((YourGrammarListener)listener).exitFunction_call(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			identifier();
			setState(60);
			match(LPAREN);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4864L) != 0)) {
				{
				{
				setState(61);
				gust_expression();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Gust_expressionContext extends ParserRuleContext {
		public List<Whirl_termContext> whirl_term() {
			return getRuleContexts(Whirl_termContext.class);
		}
		public Whirl_termContext whirl_term(int i) {
			return getRuleContext(Whirl_termContext.class,i);
		}
		public List<TerminalNode> BREEZE() { return getTokens(YourGrammarParser.BREEZE); }
		public TerminalNode BREEZE(int i) {
			return getToken(YourGrammarParser.BREEZE, i);
		}
		public List<TerminalNode> ZEPHYR() { return getTokens(YourGrammarParser.ZEPHYR); }
		public TerminalNode ZEPHYR(int i) {
			return getToken(YourGrammarParser.ZEPHYR, i);
		}
		public List<Equivalence_statementContext> equivalence_statement() {
			return getRuleContexts(Equivalence_statementContext.class);
		}
		public Equivalence_statementContext equivalence_statement(int i) {
			return getRuleContext(Equivalence_statementContext.class,i);
		}
		public Gust_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gust_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YourGrammarListener ) ((YourGrammarListener)listener).enterGust_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YourGrammarListener ) ((YourGrammarListener)listener).exitGust_expression(this);
		}
	}

	public final Gust_expressionContext gust_expression() throws RecognitionException {
		Gust_expressionContext _localctx = new Gust_expressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_gust_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			whirl_term();
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(75);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case BREEZE:
						{
						setState(70);
						match(BREEZE);
						setState(71);
						whirl_term();
						}
						break;
					case ZEPHYR:
						{
						setState(72);
						match(ZEPHYR);
						setState(73);
						whirl_term();
						}
						break;
					case IDENTIFIER:
					case INTEGER:
					case LPAREN:
						{
						setState(74);
						equivalence_statement();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
	public static class Whirl_termContext extends ParserRuleContext {
		public List<Whirl_factorContext> whirl_factor() {
			return getRuleContexts(Whirl_factorContext.class);
		}
		public Whirl_factorContext whirl_factor(int i) {
			return getRuleContext(Whirl_factorContext.class,i);
		}
		public List<TerminalNode> TWIRL() { return getTokens(YourGrammarParser.TWIRL); }
		public TerminalNode TWIRL(int i) {
			return getToken(YourGrammarParser.TWIRL, i);
		}
		public List<TerminalNode> SWIRL() { return getTokens(YourGrammarParser.SWIRL); }
		public TerminalNode SWIRL(int i) {
			return getToken(YourGrammarParser.SWIRL, i);
		}
		public Whirl_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whirl_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YourGrammarListener ) ((YourGrammarListener)listener).enterWhirl_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YourGrammarListener ) ((YourGrammarListener)listener).exitWhirl_term(this);
		}
	}

	public final Whirl_termContext whirl_term() throws RecognitionException {
		Whirl_termContext _localctx = new Whirl_termContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whirl_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			whirl_factor();
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TWIRL || _la==SWIRL) {
				{
				setState(85);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TWIRL:
					{
					setState(81);
					match(TWIRL);
					setState(82);
					whirl_factor();
					}
					break;
				case SWIRL:
					{
					setState(83);
					match(SWIRL);
					setState(84);
					whirl_factor();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(89);
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
	public static class Whirl_factorContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(YourGrammarParser.INTEGER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(YourGrammarParser.LPAREN, 0); }
		public Gust_expressionContext gust_expression() {
			return getRuleContext(Gust_expressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(YourGrammarParser.RPAREN, 0); }
		public Whirl_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whirl_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YourGrammarListener ) ((YourGrammarListener)listener).enterWhirl_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YourGrammarListener ) ((YourGrammarListener)listener).exitWhirl_factor(this);
		}
	}

	public final Whirl_factorContext whirl_factor() throws RecognitionException {
		Whirl_factorContext _localctx = new Whirl_factorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_whirl_factor);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(INTEGER);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				identifier();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				match(LPAREN);
				setState(93);
				gust_expression();
				setState(94);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(YourGrammarParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YourGrammarListener ) ((YourGrammarListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YourGrammarListener ) ((YourGrammarListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(IDENTIFIER);
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

	public static final String _serializedATN =
		"\u0004\u0001\u000fe\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0005\u0000\u001a\b\u0000\n\u0000\f\u0000\u001d\t\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0005\u0002&\b\u0002\n\u0002\f\u0002)\t\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003/\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007?\b\u0007\n\u0007\f\u0007B\t\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\bL\b\b\n\b\f\b"+
		"O\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\tV\b\t\n\t\f\tY\t"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\na\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0000\u0000\f\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0000e\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0002\u001e\u0001\u0000\u0000\u0000\u0004\'\u0001\u0000\u0000"+
		"\u0000\u0006.\u0001\u0000\u0000\u0000\b0\u0001\u0000\u0000\u0000\n4\u0001"+
		"\u0000\u0000\u0000\f8\u0001\u0000\u0000\u0000\u000e;\u0001\u0000\u0000"+
		"\u0000\u0010E\u0001\u0000\u0000\u0000\u0012P\u0001\u0000\u0000\u0000\u0014"+
		"`\u0001\u0000\u0000\u0000\u0016b\u0001\u0000\u0000\u0000\u0018\u001a\u0003"+
		"\u0002\u0001\u0000\u0019\u0018\u0001\u0000\u0000\u0000\u001a\u001d\u0001"+
		"\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001"+
		"\u0000\u0000\u0000\u001c\u0001\u0001\u0000\u0000\u0000\u001d\u001b\u0001"+
		"\u0000\u0000\u0000\u001e\u001f\u0005\u0001\u0000\u0000\u001f \u0003\u0016"+
		"\u000b\u0000 !\u0005\u000e\u0000\u0000!\"\u0003\u0004\u0002\u0000\"#\u0005"+
		"\u000f\u0000\u0000#\u0003\u0001\u0000\u0000\u0000$&\u0003\u0006\u0003"+
		"\u0000%$\u0001\u0000\u0000\u0000&)\u0001\u0000\u0000\u0000\'%\u0001\u0000"+
		"\u0000\u0000\'(\u0001\u0000\u0000\u0000(\u0005\u0001\u0000\u0000\u0000"+
		")\'\u0001\u0000\u0000\u0000*/\u0003\b\u0004\u0000+/\u0003\n\u0005\u0000"+
		",/\u0003\f\u0006\u0000-/\u0003\u000e\u0007\u0000.*\u0001\u0000\u0000\u0000"+
		".+\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000.-\u0001\u0000\u0000"+
		"\u0000/\u0007\u0001\u0000\u0000\u000001\u0003\u0016\u000b\u000012\u0005"+
		"\u000b\u0000\u000023\u0003\u0010\b\u00003\t\u0001\u0000\u0000\u000045"+
		"\u0003\u0010\b\u000056\u0005\u0005\u0000\u000067\u0003\u0010\b\u00007"+
		"\u000b\u0001\u0000\u0000\u000089\u0005\u0002\u0000\u00009:\u0003\u0010"+
		"\b\u0000:\r\u0001\u0000\u0000\u0000;<\u0003\u0016\u000b\u0000<@\u0005"+
		"\f\u0000\u0000=?\u0003\u0010\b\u0000>=\u0001\u0000\u0000\u0000?B\u0001"+
		"\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000"+
		"AC\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000CD\u0005\r\u0000\u0000"+
		"D\u000f\u0001\u0000\u0000\u0000EM\u0003\u0012\t\u0000FG\u0005\u0003\u0000"+
		"\u0000GL\u0003\u0012\t\u0000HI\u0005\u0004\u0000\u0000IL\u0003\u0012\t"+
		"\u0000JL\u0003\n\u0005\u0000KF\u0001\u0000\u0000\u0000KH\u0001\u0000\u0000"+
		"\u0000KJ\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001\u0000"+
		"\u0000\u0000MN\u0001\u0000\u0000\u0000N\u0011\u0001\u0000\u0000\u0000"+
		"OM\u0001\u0000\u0000\u0000PW\u0003\u0014\n\u0000QR\u0005\u0006\u0000\u0000"+
		"RV\u0003\u0014\n\u0000ST\u0005\u0007\u0000\u0000TV\u0003\u0014\n\u0000"+
		"UQ\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000"+
		"\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000X\u0013\u0001"+
		"\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000Za\u0005\t\u0000\u0000[a\u0003"+
		"\u0016\u000b\u0000\\]\u0005\f\u0000\u0000]^\u0003\u0010\b\u0000^_\u0005"+
		"\r\u0000\u0000_a\u0001\u0000\u0000\u0000`Z\u0001\u0000\u0000\u0000`[\u0001"+
		"\u0000\u0000\u0000`\\\u0001\u0000\u0000\u0000a\u0015\u0001\u0000\u0000"+
		"\u0000bc\u0005\b\u0000\u0000c\u0017\u0001\u0000\u0000\u0000\t\u001b\'"+
		".@KMUW`";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}