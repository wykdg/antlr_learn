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
            T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, SMALLER = 14, BIGGER = 15, EQUAL = 16,
            MUL = 17, DIV = 18, ADD = 19, SUB = 20, ID = 21, INT = 22, NEWLINE = 23, WS = 24;
    public static final int
            RULE_prog = 0, RULE_stat = 1, RULE_printExpr = 2, RULE_assign = 3, RULE_ifStatement = 4,
            RULE_forStatment = 5, RULE_whileStatment = 6, RULE_blockStatement = 7,
            RULE_scopeStatment = 8, RULE_functionDefExpr = 9, RULE_functionCallExpr = 10,
            RULE_expr = 11;
    public static final String[] ruleNames = {
            "prog", "stat", "printExpr", "assign", "ifStatement", "forStatment", "whileStatment",
            "blockStatement", "scopeStatment", "functionDefExpr", "functionCallExpr",
            "expr"
    };

    private static final String[] _LITERAL_NAMES = {
            null, "';'", "'print'", "'='", "'if'", "'('", "')'", "'else'", "'for'",
            "'while'", "'{'", "'}'", "'def'", "','", "'<'", "'>'", "'=='", "'*'",
            "'/'", "'+'", "'-'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, "SMALLER", "BIGGER", "EQUAL", "MUL", "DIV", "ADD", "SUB",
            "ID", "INT", "NEWLINE", "WS"
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
                setState(25);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(24);
                            stat();
                        }
                    }
                    setState(27);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << ID) | (1L << INT))) != 0));
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
            setState(44);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(29);
                    expr(0);
                    setState(30);
                    match(T__0);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(32);
                    assign();
                    setState(33);
                    match(T__0);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(35);
                    ifStatement();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(36);
                    forStatment();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(37);
                    whileStatment();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(38);
                    blockStatement();
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(39);
                    printExpr();
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(40);
                    functionDefExpr();
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(41);
                    functionCallExpr();
                    setState(42);
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
        enterRule(_localctx, 4, RULE_printExpr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(46);
                match(T__1);
                setState(47);
                expr(0);
                setState(48);
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
        public TerminalNode ID() {
            return getToken(ExprParser.ID, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public AssignContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_assign;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ExprListener) ((ExprListener) listener).enterAssign(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ExprListener) ((ExprListener) listener).exitAssign(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ExprVisitor) return ((ExprVisitor<? extends T>) visitor).visitAssign(this);
            else return visitor.visitChildren(this);
        }
    }

    public final AssignContext assign() throws RecognitionException {
        AssignContext _localctx = new AssignContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_assign);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(50);
                match(ID);
                setState(51);
                match(T__2);
                setState(52);
                expr(0);
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
        enterRule(_localctx, 8, RULE_ifStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(54);
                match(T__3);
                setState(55);
                match(T__4);
                setState(56);
                expr(0);
                setState(57);
                match(T__5);
                setState(58);
                stat();
                setState(61);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
                    case 1: {
                        setState(59);
                        match(T__6);
                        setState(60);
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
        enterRule(_localctx, 10, RULE_forStatment);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(63);
                match(T__7);
                setState(64);
                match(T__4);
                setState(65);
                assign();
                setState(66);
                match(T__0);
                setState(67);
                expr(0);
                setState(68);
                match(T__0);
                setState(69);
                assign();
                setState(70);
                match(T__5);
                setState(71);
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
        enterRule(_localctx, 12, RULE_whileStatment);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(73);
                match(T__8);
                setState(74);
                match(T__4);
                setState(75);
                expr(0);
                setState(76);
                match(T__5);
                setState(77);
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
        enterRule(_localctx, 14, RULE_blockStatement);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(79);
                match(T__9);
                setState(83);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << ID) | (1L << INT))) != 0)) {
                    {
                        {
                            setState(80);
                            stat();
                        }
                    }
                    setState(85);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(86);
                match(T__10);
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
        enterRule(_localctx, 16, RULE_scopeStatment);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(88);
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
        enterRule(_localctx, 18, RULE_functionDefExpr);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(90);
                match(T__11);
                setState(91);
                match(ID);
                setState(92);
                match(T__4);
                setState(101);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == ID) {
                    {
                        setState(97);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 4, _ctx);
                        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                            if (_alt == 1) {
                                {
                                    {
                                        setState(93);
                                        match(ID);
                                        setState(94);
                                        match(T__12);
                                    }
                                }
                            }
                            setState(99);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 4, _ctx);
                        }
                        setState(100);
                        match(ID);
                    }
                }

                setState(103);
                match(T__5);
                setState(104);
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
        enterRule(_localctx, 20, RULE_functionCallExpr);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(106);
                match(ID);
                setState(107);
                match(T__4);
                setState(108);
                expr(0);
                setState(113);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__12) {
                    {
                        {
                            setState(109);
                            match(T__12);
                            setState(110);
                            expr(0);
                        }
                    }
                    setState(115);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(116);
                match(T__5);
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
        int _startState = 22;
        enterRecursionRule(_localctx, 22, RULE_expr, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(125);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case INT: {
                        _localctx = new IntContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(119);
                        match(INT);
                    }
                    break;
                    case ID: {
                        _localctx = new IdContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(120);
                        match(ID);
                    }
                    break;
                    case T__4: {
                        _localctx = new ParensContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(121);
                        match(T__4);
                        setState(122);
                        expr(0);
                        setState(123);
                        match(T__5);
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                _ctx.stop = _input.LT(-1);
                setState(138);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 9, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(136);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 8, _ctx)) {
                                case 1: {
                                    _localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(127);
                                    if (!(precpred(_ctx, 6)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 6)");
                                    setState(128);
                                    ((MulDivContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == MUL || _la == DIV)) {
                                        ((MulDivContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(129);
                                    expr(7);
                                }
                                break;
                                case 2: {
                                    _localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(130);
                                    if (!(precpred(_ctx, 5)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 5)");
                                    setState(131);
                                    ((AddSubContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == ADD || _la == SUB)) {
                                        ((AddSubContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(132);
                                    expr(6);
                                }
                                break;
                                case 3: {
                                    _localctx = new CmpContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(133);
                                    if (!(precpred(_ctx, 4)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                                    setState(134);
                                    ((CmpContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SMALLER) | (1L << BIGGER) | (1L << EQUAL))) != 0))) {
                                        ((CmpContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(135);
                                    expr(5);
                                }
                                break;
                            }
                        }
                    }
                    setState(140);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 9, _ctx);
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
            case 11:
                return expr_sempred((ExprContext) _localctx, predIndex);
        }
        return true;
    }

    private boolean expr_sempred(ExprContext _localctx, int predIndex) {
        switch (predIndex) {
            case 0:
                return precpred(_ctx, 6);
            case 1:
                return precpred(_ctx, 5);
            case 2:
                return precpred(_ctx, 4);
        }
        return true;
    }

    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\u0090\4\2\t\2" +
                    "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
                    "\t\13\4\f\t\f\4\r\t\r\3\2\6\2\34\n\2\r\2\16\2\35\3\3\3\3\3\3\3\3\3\3\3" +
                    "\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3/\n\3\3\4\3\4\3\4\3\4\3\5\3" +
                    "\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6@\n\6\3\7\3\7\3\7\3\7\3\7\3" +
                    "\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\7\tT\n\t\f\t\16\tW" +
                    "\13\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\7\13b\n\13\f\13\16\13e" +
                    "\13\13\3\13\5\13h\n\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\7\fr\n\f\f\f" +
                    "\16\fu\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0080\n\r\3\r\3\r" +
                    "\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u008b\n\r\f\r\16\r\u008e\13\r\3\r\2\3" +
                    "\30\16\2\4\6\b\n\f\16\20\22\24\26\30\2\5\3\2\23\24\3\2\25\26\3\2\20\22" +
                    "\2\u0096\2\33\3\2\2\2\4.\3\2\2\2\6\60\3\2\2\2\b\64\3\2\2\2\n8\3\2\2\2" +
                    "\fA\3\2\2\2\16K\3\2\2\2\20Q\3\2\2\2\22Z\3\2\2\2\24\\\3\2\2\2\26l\3\2\2" +
                    "\2\30\177\3\2\2\2\32\34\5\4\3\2\33\32\3\2\2\2\34\35\3\2\2\2\35\33\3\2" +
                    "\2\2\35\36\3\2\2\2\36\3\3\2\2\2\37 \5\30\r\2 !\7\3\2\2!/\3\2\2\2\"#\5" +
                    "\b\5\2#$\7\3\2\2$/\3\2\2\2%/\5\n\6\2&/\5\f\7\2\'/\5\16\b\2(/\5\20\t\2" +
                    ")/\5\6\4\2*/\5\24\13\2+,\5\26\f\2,-\7\3\2\2-/\3\2\2\2.\37\3\2\2\2.\"\3" +
                    "\2\2\2.%\3\2\2\2.&\3\2\2\2.\'\3\2\2\2.(\3\2\2\2.)\3\2\2\2.*\3\2\2\2.+" +
                    "\3\2\2\2/\5\3\2\2\2\60\61\7\4\2\2\61\62\5\30\r\2\62\63\7\3\2\2\63\7\3" +
                    "\2\2\2\64\65\7\27\2\2\65\66\7\5\2\2\66\67\5\30\r\2\67\t\3\2\2\289\7\6" +
                    "\2\29:\7\7\2\2:;\5\30\r\2;<\7\b\2\2<?\5\4\3\2=>\7\t\2\2>@\5\4\3\2?=\3" +
                    "\2\2\2?@\3\2\2\2@\13\3\2\2\2AB\7\n\2\2BC\7\7\2\2CD\5\b\5\2DE\7\3\2\2E" +
                    "F\5\30\r\2FG\7\3\2\2GH\5\b\5\2HI\7\b\2\2IJ\5\4\3\2J\r\3\2\2\2KL\7\13\2" +
                    "\2LM\7\7\2\2MN\5\30\r\2NO\7\b\2\2OP\5\4\3\2P\17\3\2\2\2QU\7\f\2\2RT\5" +
                    "\4\3\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\7" +
                    "\r\2\2Y\21\3\2\2\2Z[\5\20\t\2[\23\3\2\2\2\\]\7\16\2\2]^\7\27\2\2^g\7\7" +
                    "\2\2_`\7\27\2\2`b\7\17\2\2a_\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3" +
                    "\2\2\2ec\3\2\2\2fh\7\27\2\2gc\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\7\b\2\2jk" +
                    "\5\22\n\2k\25\3\2\2\2lm\7\27\2\2mn\7\7\2\2ns\5\30\r\2op\7\17\2\2pr\5\30" +
                    "\r\2qo\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\7\b" +
                    "\2\2w\27\3\2\2\2xy\b\r\1\2y\u0080\7\30\2\2z\u0080\7\27\2\2{|\7\7\2\2|" +
                    "}\5\30\r\2}~\7\b\2\2~\u0080\3\2\2\2\177x\3\2\2\2\177z\3\2\2\2\177{\3\2" +
                    "\2\2\u0080\u008c\3\2\2\2\u0081\u0082\f\b\2\2\u0082\u0083\t\2\2\2\u0083" +
                    "\u008b\5\30\r\t\u0084\u0085\f\7\2\2\u0085\u0086\t\3\2\2\u0086\u008b\5" +
                    "\30\r\b\u0087\u0088\f\6\2\2\u0088\u0089\t\4\2\2\u0089\u008b\5\30\r\7\u008a" +
                    "\u0081\3\2\2\2\u008a\u0084\3\2\2\2\u008a\u0087\3\2\2\2\u008b\u008e\3\2" +
                    "\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\31\3\2\2\2\u008e\u008c" +
                    "\3\2\2\2\f\35.?Ucgs\177\u008a\u008c";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}