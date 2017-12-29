// Generated from D:/code/test_antlr/xxx\Expr.g4 by ANTLR 4.7
package Expr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprLexer extends Lexer {
    static {
        RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
            T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, T__14 = 15, T__15 = 16, T__16 = 17,
            SMALLER = 18, BIGGER = 19, EQUAL = 20, MUL = 21, DIV = 22, ADD = 23, SUB = 24, ID = 25,
            INT = 26, NEWLINE = 27, WS = 28;
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };

    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    public static final String[] ruleNames = {
            "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8",
            "T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16",
            "SMALLER", "BIGGER", "EQUAL", "MUL", "DIV", "ADD", "SUB", "ID", "INT",
            "NEWLINE", "WS"
    };

    private static final String[] _LITERAL_NAMES = {
            null, "';'", "'['", "','", "']'", "'new'", "'print'", "'='", "'if'", "'('",
            "')'", "'else'", "'for'", "'while'", "'{'", "'}'", "'def'", "'return'",
            "'<'", "'>'", "'=='", "'*'", "'/'", "'+'", "'-'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, "SMALLER", "BIGGER", "EQUAL", "MUL",
            "DIV", "ADD", "SUB", "ID", "INT", "NEWLINE", "WS"
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


    public ExprLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
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
    public String[] getChannelNames() {
        return channelNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u0099\b\1\4\2" +
                    "\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4" +
                    "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22" +
                    "\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31" +
                    "\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\4\3\4" +
                    "\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3" +
                    "\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3" +
                    "\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3" +
                    "\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3" +
                    "\27\3\30\3\30\3\31\3\31\3\32\6\32\u0085\n\32\r\32\16\32\u0086\3\33\6\33" +
                    "\u008a\n\33\r\33\16\33\u008b\3\34\5\34\u008f\n\34\3\34\3\34\3\35\6\35" +
                    "\u0094\n\35\r\35\16\35\u0095\3\35\3\35\2\2\36\3\3\5\4\7\5\t\6\13\7\r\b" +
                    "\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26" +
                    "+\27-\30/\31\61\32\63\33\65\34\67\359\36\3\2\5\4\2C\\c|\3\2\62;\4\2\13" +
                    "\13\"\"\2\u009c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3" +
                    "\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2" +
                    "\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3" +
                    "\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2" +
                    "\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2" +
                    "9\3\2\2\2\3;\3\2\2\2\5=\3\2\2\2\7?\3\2\2\2\tA\3\2\2\2\13C\3\2\2\2\rG\3" +
                    "\2\2\2\17M\3\2\2\2\21O\3\2\2\2\23R\3\2\2\2\25T\3\2\2\2\27V\3\2\2\2\31" +
                    "[\3\2\2\2\33_\3\2\2\2\35e\3\2\2\2\37g\3\2\2\2!i\3\2\2\2#m\3\2\2\2%t\3" +
                    "\2\2\2\'v\3\2\2\2)x\3\2\2\2+{\3\2\2\2-}\3\2\2\2/\177\3\2\2\2\61\u0081" +
                    "\3\2\2\2\63\u0084\3\2\2\2\65\u0089\3\2\2\2\67\u008e\3\2\2\29\u0093\3\2" +
                    "\2\2;<\7=\2\2<\4\3\2\2\2=>\7]\2\2>\6\3\2\2\2?@\7.\2\2@\b\3\2\2\2AB\7_" +
                    "\2\2B\n\3\2\2\2CD\7p\2\2DE\7g\2\2EF\7y\2\2F\f\3\2\2\2GH\7r\2\2HI\7t\2" +
                    "\2IJ\7k\2\2JK\7p\2\2KL\7v\2\2L\16\3\2\2\2MN\7?\2\2N\20\3\2\2\2OP\7k\2" +
                    "\2PQ\7h\2\2Q\22\3\2\2\2RS\7*\2\2S\24\3\2\2\2TU\7+\2\2U\26\3\2\2\2VW\7" +
                    "g\2\2WX\7n\2\2XY\7u\2\2YZ\7g\2\2Z\30\3\2\2\2[\\\7h\2\2\\]\7q\2\2]^\7t" +
                    "\2\2^\32\3\2\2\2_`\7y\2\2`a\7j\2\2ab\7k\2\2bc\7n\2\2cd\7g\2\2d\34\3\2" +
                    "\2\2ef\7}\2\2f\36\3\2\2\2gh\7\177\2\2h \3\2\2\2ij\7f\2\2jk\7g\2\2kl\7" +
                    "h\2\2l\"\3\2\2\2mn\7t\2\2no\7g\2\2op\7v\2\2pq\7w\2\2qr\7t\2\2rs\7p\2\2" +
                    "s$\3\2\2\2tu\7>\2\2u&\3\2\2\2vw\7@\2\2w(\3\2\2\2xy\7?\2\2yz\7?\2\2z*\3" +
                    "\2\2\2{|\7,\2\2|,\3\2\2\2}~\7\61\2\2~.\3\2\2\2\177\u0080\7-\2\2\u0080" +
                    "\60\3\2\2\2\u0081\u0082\7/\2\2\u0082\62\3\2\2\2\u0083\u0085\t\2\2\2\u0084" +
                    "\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2" +
                    "\2\2\u0087\64\3\2\2\2\u0088\u008a\t\3\2\2\u0089\u0088\3\2\2\2\u008a\u008b" +
                    "\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\66\3\2\2\2\u008d" +
                    "\u008f\7\17\2\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3" +
                    "\2\2\2\u0090\u0091\7\f\2\2\u00918\3\2\2\2\u0092\u0094\t\4\2\2\u0093\u0092" +
                    "\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096" +
                    "\u0097\3\2\2\2\u0097\u0098\b\35\2\2\u0098:\3\2\2\2\7\2\u0086\u008b\u008e" +
                    "\u0095\3\b\2\2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}