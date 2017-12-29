// Generated from D:/code/test_antlr/xxx\Expr.g4 by ANTLR 4.7
package Expr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprParser extends Parser {
	static {
		RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION);
	}

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
			new PredictionContextCache();
	public static final int
			T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
			T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, T__14 = 15, T__15 = 16, SMALLER = 17,
			BIGGER = 18, EQUAL = 19, MUL = 20, DIV = 21, ADD = 22, SUB = 23, ID = 24, INT = 25, NEWLINE = 26,
			WS = 27;
	public static final int
			RULE_prog = 0, RULE_stat = 1, RULE_array = 2, RULE_printExpr = 3, RULE_assign = 4,
			RULE_ifStatement = 5, RULE_forStatment = 6, RULE_whileStatment = 7, RULE_blockStatement = 8,
			RULE_scopeStatment = 9, RULE_functionDefExpr = 10, RULE_functionCallExpr = 11,
			RULE_expr = 12;
	public static final String[] ruleNames = {
			"prog", "stat", "array", "printExpr", "assign", "ifStatement", "forStatment",
			"whileStatment", "blockStatement", "scopeStatment", "functionDefExpr",
			"functionCallExpr", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
			null, "';'", "'['", "','", "']'", "'new'", "'print'", "'='", "'if'", "'('",
			"')'", "'else'", "'for'", "'while'", "'{'", "'}'", "'def'", "'<'", "'>'",
			"'=='", "'*'", "'/'", "'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
			null, null, null, null, null, null, null, null, null, null, null, null,
			null, null, null, null, null, "SMALLER", "BIGGER", "EQUAL", "MUL", "DIV",
			"ADD", "SUB", "ID", "INT", "NEWLINE", "WS"
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
	public String getGrammarFileName() {
		return "Expr.g4";
	}

	@Override
	public String[] getRuleNames() {
		return ruleNames;
	}

	@Override
	public String getSerializedATN() {
		return _serializedATN;
	}

	@Override
	public ATN getATN() {
		return _ATN;
	}

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}

		public StatContext stat(int i) {
			return getRuleContext(StatContext.class, i);
		}

		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_prog;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterProg(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitProg(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor) return ((ExprVisitor<? extends T>) visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(26);
							stat();
						}
					}
					setState(29);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << ID) | (1L << INT))) != 0));
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public AssignContext assign() {
			return getRuleContext(AssignContext.class, 0);
		}

		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class, 0);
		}

		public ForStatmentContext forStatment() {
			return getRuleContext(ForStatmentContext.class, 0);
		}

		public WhileStatmentContext whileStatment() {
			return getRuleContext(WhileStatmentContext.class, 0);
		}

		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class, 0);
		}

		public PrintExprContext printExpr() {
			return getRuleContext(PrintExprContext.class, 0);
		}

		public FunctionDefExprContext functionDefExpr() {
			return getRuleContext(FunctionDefExprContext.class, 0);
		}

		public FunctionCallExprContext functionCallExpr() {
			return getRuleContext(FunctionCallExprContext.class, 0);
		}

		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_stat;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterStat(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitStat(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor) return ((ExprVisitor<? extends T>) visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(46);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
				case 1:
					enterOuterAlt(_localctx, 1);
				{
					setState(31);
					expr(0);
					setState(32);
					match(T__0);
				}
				break;
				case 2:
					enterOuterAlt(_localctx, 2);
				{
					setState(34);
					assign();
					setState(35);
					match(T__0);
				}
				break;
				case 3:
					enterOuterAlt(_localctx, 3);
				{
					setState(37);
					ifStatement();
				}
				break;
				case 4:
					enterOuterAlt(_localctx, 4);
				{
					setState(38);
					forStatment();
				}
				break;
				case 5:
					enterOuterAlt(_localctx, 5);
				{
					setState(39);
					whileStatment();
				}
				break;
				case 6:
					enterOuterAlt(_localctx, 6);
				{
					setState(40);
					blockStatement();
				}
				break;
				case 7:
					enterOuterAlt(_localctx, 7);
				{
					setState(41);
					printExpr();
				}
				break;
				case 8:
					enterOuterAlt(_localctx, 8);
				{
					setState(42);
					functionDefExpr();
				}
				break;
				case 9:
					enterOuterAlt(_localctx, 9);
				{
					setState(43);
					functionCallExpr();
					setState(44);
					match(T__0);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_array;
		}

		public ArrayContext() {
		}

		public void copyFrom(ArrayContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class ArrayInitContext extends ArrayContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public ArrayInitContext(ArrayContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterArrayInit(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitArrayInit(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor) return ((ExprVisitor<? extends T>) visitor).visitArrayInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class NewArrayContext extends ArrayContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public NewArrayContext(ArrayContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterNewArray(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitNewArray(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor) return ((ExprVisitor<? extends T>) visitor).visitNewArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_array);
		int _la;
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T__1:
					_localctx = new ArrayInitContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(48);
					match(T__1);
					setState(57);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << ID) | (1L << INT))) != 0)) {
						{
							setState(49);
							expr(0);
							setState(54);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la == T__2) {
								{
									{
										setState(50);
										match(T__2);
										setState(51);
										expr(0);
									}
								}
								setState(56);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
						}
					}

					setState(59);
					match(T__3);
				}
				break;
				case T__4:
					_localctx = new NewArrayContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(60);
					match(T__4);
					setState(61);
					match(T__1);
					setState(62);
					expr(0);
					setState(63);
					match(T__3);
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public PrintExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_printExpr;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterPrintExpr(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitPrintExpr(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor) return ((ExprVisitor<? extends T>) visitor).visitPrintExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintExprContext printExpr() throws RecognitionException {
		PrintExprContext _localctx = new PrintExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_printExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(67);
				match(T__5);
				setState(68);
				expr(0);
				setState(69);
				match(T__0);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_assign;
		}

		public AssignContext() {
		}

		public void copyFrom(AssignContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class AssignArrayContext extends AssignContext {
		public TerminalNode ID() {
			return getToken(ExprParser.ID, 0);
		}

		public ArrayContext array() {
			return getRuleContext(ArrayContext.class, 0);
		}

		public AssignArrayContext(AssignContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterAssignArray(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitAssignArray(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor) return ((ExprVisitor<? extends T>) visitor).visitAssignArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class AssignExprContext extends AssignContext {
		public TerminalNode ID() {
			return getToken(ExprParser.ID, 0);
		}

		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public AssignExprContext(AssignContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterAssignExpr(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitAssignExpr(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor) return ((ExprVisitor<? extends T>) visitor).visitAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class AssignArrayIndexContext extends AssignContext {
		public TerminalNode ID() {
			return getToken(ExprParser.ID, 0);
		}

		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public AssignArrayIndexContext(AssignContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterAssignArrayIndex(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitAssignArrayIndex(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor) return ((ExprVisitor<? extends T>) visitor).visitAssignArrayIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assign);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 5, _ctx)) {
				case 1:
					_localctx = new AssignExprContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(71);
					match(ID);
					setState(72);
					match(T__6);
					setState(73);
					expr(0);
				}
				break;
				case 2:
					_localctx = new AssignArrayContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(74);
					match(ID);
					setState(75);
					match(T__6);
					setState(76);
					array();
				}
				break;
				case 3:
					_localctx = new AssignArrayIndexContext(_localctx);
					enterOuterAlt(_localctx, 3);
				{
					setState(77);
					match(ID);
					setState(78);
					match(T__1);
					setState(79);
					expr(0);
					setState(80);
					match(T__3);
					setState(81);
					match(T__6);
					setState(82);
					expr(0);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}

		public StatContext stat(int i) {
			return getRuleContext(StatContext.class, i);
		}

		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_ifStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterIfStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitIfStatement(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor) return ((ExprVisitor<? extends T>) visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(86);
				match(T__7);
				setState(87);
				match(T__8);
				setState(88);
				expr(0);
				setState(89);
				match(T__9);
				setState(90);
				stat();
				setState(93);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
					case 1: {
						setState(91);
						match(T__10);
						setState(92);
						stat();
					}
					break;
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatmentContext extends ParserRuleContext {
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}

		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class, i);
		}

		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public StatContext stat() {
			return getRuleContext(StatContext.class, 0);
		}

		public ForStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_forStatment;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterForStatment(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitForStatment(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor) return ((ExprVisitor<? extends T>) visitor).visitForStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatmentContext forStatment() throws RecognitionException {
		ForStatmentContext _localctx = new ForStatmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_forStatment);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(95);
				match(T__11);
				setState(96);
				match(T__8);
				setState(97);
				assign();
				setState(98);
				match(T__0);
				setState(99);
				expr(0);
				setState(100);
				match(T__0);
				setState(101);
				assign();
				setState(102);
				match(T__9);
				setState(103);
				stat();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatmentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public StatContext stat() {
			return getRuleContext(StatContext.class, 0);
		}

		public WhileStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_whileStatment;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterWhileStatment(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitWhileStatment(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor) return ((ExprVisitor<? extends T>) visitor).visitWhileStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatmentContext whileStatment() throws RecognitionException {
		WhileStatmentContext _localctx = new WhileStatmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_whileStatment);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(105);
				match(T__12);
				setState(106);
				match(T__8);
				setState(107);
				expr(0);
				setState(108);
				match(T__9);
				setState(109);
				stat();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}

		public StatContext stat(int i) {
			return getRuleContext(StatContext.class, i);
		}

		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_blockStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterBlockStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitBlockStatement(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor) return ((ExprVisitor<? extends T>) visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(111);
				match(T__13);
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << ID) | (1L << INT))) != 0)) {
					{
						{
							setState(112);
							stat();
						}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(118);
				match(T__14);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScopeStatmentContext extends ParserRuleContext {
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class, 0);
		}

		public ScopeStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_scopeStatment;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterScopeStatment(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitScopeStatment(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor) return ((ExprVisitor<? extends T>) visitor).visitScopeStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScopeStatmentContext scopeStatment() throws RecognitionException {
		ScopeStatmentContext _localctx = new ScopeStatmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_scopeStatment);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(120);
				blockStatement();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefExprContext extends ParserRuleContext {
		public List<TerminalNode> ID() {
			return getTokens(ExprParser.ID);
		}

		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}

		public ScopeStatmentContext scopeStatment() {
			return getRuleContext(ScopeStatmentContext.class, 0);
		}

		public FunctionDefExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_functionDefExpr;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterFunctionDefExpr(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitFunctionDefExpr(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor) return ((ExprVisitor<? extends T>) visitor).visitFunctionDefExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefExprContext functionDefExpr() throws RecognitionException {
		FunctionDefExprContext _localctx = new FunctionDefExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionDefExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(122);
				match(T__15);
				setState(123);
				match(ID);
				setState(124);
				match(T__8);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == ID) {
					{
						setState(125);
						match(ID);
						setState(130);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la == T__2) {
							{
								{
									setState(126);
									match(T__2);
									setState(127);
									match(ID);
								}
							}
							setState(132);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
					}
				}

				setState(135);
				match(T__9);
				setState(136);
				scopeStatment();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallExprContext extends ParserRuleContext {
		public TerminalNode ID() {
			return getToken(ExprParser.ID, 0);
		}

		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public FunctionCallExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_functionCallExpr;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterFunctionCallExpr(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitFunctionCallExpr(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor) return ((ExprVisitor<? extends T>) visitor).visitFunctionCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallExprContext functionCallExpr() throws RecognitionException {
		FunctionCallExprContext _localctx = new FunctionCallExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionCallExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(138);
				match(ID);
				setState(139);
				match(T__8);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << ID) | (1L << INT))) != 0)) {
					{
						setState(140);
						expr(0);
						setState(145);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la == T__2) {
							{
								{
									setState(141);
									match(T__2);
									setState(142);
									expr(0);
								}
							}
							setState(147);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
					}
				}

				setState(150);
				match(T__9);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_expr;
		}

		public ExprContext() {
		}

		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class ParensContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public ParensContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterParens(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitParens(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor) return ((ExprVisitor<? extends T>) visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class MulDivContext extends ExprContext {
		public Token op;

		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public MulDivContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterMulDiv(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitMulDiv(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor) return ((ExprVisitor<? extends T>) visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class AddSubContext extends ExprContext {
		public Token op;

		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public AddSubContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterAddSub(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitAddSub(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor) return ((ExprVisitor<? extends T>) visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ArrayNumContext extends ExprContext {
		public TerminalNode ID() {
			return getToken(ExprParser.ID, 0);
		}

		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public ArrayNumContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterArrayNum(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitArrayNum(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor) return ((ExprVisitor<? extends T>) visitor).visitArrayNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class CmpContext extends ExprContext {
		public Token op;

		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public CmpContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterCmp(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitCmp(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor) return ((ExprVisitor<? extends T>) visitor).visitCmp(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class IdContext extends ExprContext {
		public TerminalNode ID() {
			return getToken(ExprParser.ID, 0);
		}

		public IdContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterId(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitId(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor) return ((ExprVisitor<? extends T>) visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class IntContext extends ExprContext {
		public TerminalNode INT() {
			return getToken(ExprParser.INT, 0);
		}

		public IntContext(ExprContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).enterInt(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof ExprListener) ((ExprListener) listener).exitInt(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof ExprVisitor) return ((ExprVisitor<? extends T>) visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(164);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 12, _ctx)) {
					case 1: {
						_localctx = new ArrayNumContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;

						setState(153);
						match(ID);
						setState(154);
						match(T__1);
						setState(155);
						expr(0);
						setState(156);
						match(T__3);
					}
					break;
					case 2: {
						_localctx = new ParensContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(158);
						match(T__8);
						setState(159);
						expr(0);
						setState(160);
						match(T__9);
					}
					break;
					case 3: {
						_localctx = new IntContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(162);
						match(INT);
					}
					break;
					case 4: {
						_localctx = new IdContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(163);
						match(ID);
					}
					break;
				}
				_ctx.stop = _input.LT(-1);
				setState(177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 14, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null) triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(175);
							_errHandler.sync(this);
							switch (getInterpreter().adaptivePredict(_input, 13, _ctx)) {
								case 1: {
									_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(166);
									if (!(precpred(_ctx, 5)))
										throw new FailedPredicateException(this, "precpred(_ctx, 5)");
									setState(167);
									((MulDivContext) _localctx).op = _input.LT(1);
									_la = _input.LA(1);
									if (!(_la == MUL || _la == DIV)) {
										((MulDivContext) _localctx).op = (Token) _errHandler.recoverInline(this);
									} else {
										if (_input.LA(1) == Token.EOF) matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
									setState(168);
									expr(6);
								}
								break;
								case 2: {
									_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(169);
									if (!(precpred(_ctx, 4)))
										throw new FailedPredicateException(this, "precpred(_ctx, 4)");
									setState(170);
									((AddSubContext) _localctx).op = _input.LT(1);
									_la = _input.LA(1);
									if (!(_la == ADD || _la == SUB)) {
										((AddSubContext) _localctx).op = (Token) _errHandler.recoverInline(this);
									} else {
										if (_input.LA(1) == Token.EOF) matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
									setState(171);
									expr(5);
								}
								break;
								case 3: {
									_localctx = new CmpContext(new ExprContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_expr);
									setState(172);
									if (!(precpred(_ctx, 3)))
										throw new FailedPredicateException(this, "precpred(_ctx, 3)");
									setState(173);
									((CmpContext) _localctx).op = _input.LT(1);
									_la = _input.LA(1);
									if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SMALLER) | (1L << BIGGER) | (1L << EQUAL))) != 0))) {
										((CmpContext) _localctx).op = (Token) _errHandler.recoverInline(this);
									} else {
										if (_input.LA(1) == Token.EOF) matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
									setState(174);
									expr(4);
								}
								break;
							}
						}
					}
					setState(179);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 14, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
			case 12:
				return expr_sempred((ExprContext) _localctx, predIndex);
		}
		return true;
	}

	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
			case 0:
				return precpred(_ctx, 5);
			case 1:
				return precpred(_ctx, 4);
			case 2:
				return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
			"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u00b7\4\2\t\2" +
					"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
					"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\6\2\36\n\2\r\2\16\2\37\3\3\3\3\3\3" +
					"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\61\n\3\3\4\3\4\3" +
					"\4\3\4\7\4\67\n\4\f\4\16\4:\13\4\5\4<\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4" +
					"D\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6" +
					"\3\6\5\6W\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7`\n\7\3\b\3\b\3\b\3\b\3\b" +
					"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\7\nt\n\n\f\n\16\n" +
					"w\13\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0083\n\f\f\f\16" +
					"\f\u0086\13\f\5\f\u0088\n\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\7\r\u0092" +
					"\n\r\f\r\16\r\u0095\13\r\5\r\u0097\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16" +
					"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00a7\n\16\3\16\3\16\3\16\3\16" +
					"\3\16\3\16\3\16\3\16\3\16\7\16\u00b2\n\16\f\16\16\16\u00b5\13\16\3\16" +
					"\2\3\32\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\5\3\2\26\27\3\2\30\31\3" +
					"\2\23\25\2\u00c3\2\35\3\2\2\2\4\60\3\2\2\2\6C\3\2\2\2\bE\3\2\2\2\nV\3" +
					"\2\2\2\fX\3\2\2\2\16a\3\2\2\2\20k\3\2\2\2\22q\3\2\2\2\24z\3\2\2\2\26|" +
					"\3\2\2\2\30\u008c\3\2\2\2\32\u00a6\3\2\2\2\34\36\5\4\3\2\35\34\3\2\2\2" +
					"\36\37\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \3\3\2\2\2!\"\5\32\16\2\"#\7" +
					"\3\2\2#\61\3\2\2\2$%\5\n\6\2%&\7\3\2\2&\61\3\2\2\2\'\61\5\f\7\2(\61\5" +
					"\16\b\2)\61\5\20\t\2*\61\5\22\n\2+\61\5\b\5\2,\61\5\26\f\2-.\5\30\r\2" +
					"./\7\3\2\2/\61\3\2\2\2\60!\3\2\2\2\60$\3\2\2\2\60\'\3\2\2\2\60(\3\2\2" +
					"\2\60)\3\2\2\2\60*\3\2\2\2\60+\3\2\2\2\60,\3\2\2\2\60-\3\2\2\2\61\5\3" +
					"\2\2\2\62;\7\4\2\2\638\5\32\16\2\64\65\7\5\2\2\65\67\5\32\16\2\66\64\3" +
					"\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29<\3\2\2\2:8\3\2\2\2;\63\3\2\2" +
					"\2;<\3\2\2\2<=\3\2\2\2=D\7\6\2\2>?\7\7\2\2?@\7\4\2\2@A\5\32\16\2AB\7\6" +
					"\2\2BD\3\2\2\2C\62\3\2\2\2C>\3\2\2\2D\7\3\2\2\2EF\7\b\2\2FG\5\32\16\2" +
					"GH\7\3\2\2H\t\3\2\2\2IJ\7\32\2\2JK\7\t\2\2KW\5\32\16\2LM\7\32\2\2MN\7" +
					"\t\2\2NW\5\6\4\2OP\7\32\2\2PQ\7\4\2\2QR\5\32\16\2RS\7\6\2\2ST\7\t\2\2" +
					"TU\5\32\16\2UW\3\2\2\2VI\3\2\2\2VL\3\2\2\2VO\3\2\2\2W\13\3\2\2\2XY\7\n" +
					"\2\2YZ\7\13\2\2Z[\5\32\16\2[\\\7\f\2\2\\_\5\4\3\2]^\7\r\2\2^`\5\4\3\2" +
					"_]\3\2\2\2_`\3\2\2\2`\r\3\2\2\2ab\7\16\2\2bc\7\13\2\2cd\5\n\6\2de\7\3" +
					"\2\2ef\5\32\16\2fg\7\3\2\2gh\5\n\6\2hi\7\f\2\2ij\5\4\3\2j\17\3\2\2\2k" +
					"l\7\17\2\2lm\7\13\2\2mn\5\32\16\2no\7\f\2\2op\5\4\3\2p\21\3\2\2\2qu\7" +
					"\20\2\2rt\5\4\3\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wu" +
					"\3\2\2\2xy\7\21\2\2y\23\3\2\2\2z{\5\22\n\2{\25\3\2\2\2|}\7\22\2\2}~\7" +
					"\32\2\2~\u0087\7\13\2\2\177\u0084\7\32\2\2\u0080\u0081\7\5\2\2\u0081\u0083" +
					"\7\32\2\2\u0082\u0080\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2" +
					"\u0084\u0085\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0087\177" +
					"\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\7\f\2\2\u008a" +
					"\u008b\5\24\13\2\u008b\27\3\2\2\2\u008c\u008d\7\32\2\2\u008d\u0096\7\13" +
					"\2\2\u008e\u0093\5\32\16\2\u008f\u0090\7\5\2\2\u0090\u0092\5\32\16\2\u0091" +
					"\u008f\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2" +
					"\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u008e\3\2\2\2\u0096" +
					"\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\7\f\2\2\u0099\31\3\2\2" +
					"\2\u009a\u009b\b\16\1\2\u009b\u009c\7\32\2\2\u009c\u009d\7\4\2\2\u009d" +
					"\u009e\5\32\16\2\u009e\u009f\7\6\2\2\u009f\u00a7\3\2\2\2\u00a0\u00a1\7" +
					"\13\2\2\u00a1\u00a2\5\32\16\2\u00a2\u00a3\7\f\2\2\u00a3\u00a7\3\2\2\2" +
					"\u00a4\u00a7\7\33\2\2\u00a5\u00a7\7\32\2\2\u00a6\u009a\3\2\2\2\u00a6\u00a0" +
					"\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00b3\3\2\2\2\u00a8" +
					"\u00a9\f\7\2\2\u00a9\u00aa\t\2\2\2\u00aa\u00b2\5\32\16\b\u00ab\u00ac\f" +
					"\6\2\2\u00ac\u00ad\t\3\2\2\u00ad\u00b2\5\32\16\7\u00ae\u00af\f\5\2\2\u00af" +
					"\u00b0\t\4\2\2\u00b0\u00b2\5\32\16\6\u00b1\u00a8\3\2\2\2\u00b1\u00ab\3" +
					"\2\2\2\u00b1\u00ae\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3" +
					"\u00b4\3\2\2\2\u00b4\33\3\2\2\2\u00b5\u00b3\3\2\2\2\21\37\608;CV_u\u0084" +
					"\u0087\u0093\u0096\u00a6\u00b1\u00b3";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());

	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}