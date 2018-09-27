// Generated from csce322Homework01Part02.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class csce322Homework01Part02Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGIN=1, END=2, TRAINS=3, HANDS=4, BEGINTITLE=5, DOMINOBEGIN=6, DOMINOEND=7, 
		NUMBER=8, ENDROW=9, LISTBEGIN=10, LISTEND=11, COMMA=12, WS=13, ILLEGAL=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'"
	};
	public static final String[] ruleNames = {
		"BEGIN", "END", "TRAINS", "HANDS", "BEGINTITLE", "DOMINOBEGIN", "DOMINOEND", 
		"NUMBER", "ENDROW", "LISTBEGIN", "LISTEND", "COMMA", "WS", "ILLEGAL"
	};


		boolean hands;
		boolean played;
		boolean semantic=true;
		boolean more=false;
		int playdominoes=0;
		int players=0;
		int handdominoes=0;
		int dominoes;
		int player1=0;
		int other=0;
		int[] play = new int [20];
		int num=0;


	public csce322Homework01Part02Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "csce322Homework01Part02.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 13: ILLEGAL_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void ILLEGAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: System.out.println("Notification: Problem on Line "+getLine());System.exit(0); break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\20S\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\t\5\t<\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\6\16G\n\16"+
		"\r\16\16\16H\3\16\3\16\3\17\6\17N\n\17\r\17\16\17O\3\17\3\17\3O\2\20\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\3"+
		"\2\5\3\2\62;\3\2\63;\5\2\13\f\17\17\"\"U\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\3\37\3\2\2\2\5\"\3\2\2\2\7%\3\2\2\2\t,\3\2\2\2\13\62\3\2\2\2"+
		"\r\64\3\2\2\2\17\66\3\2\2\2\21;\3\2\2\2\23=\3\2\2\2\25?\3\2\2\2\27A\3"+
		"\2\2\2\31C\3\2\2\2\33F\3\2\2\2\35M\3\2\2\2\37 \7>\2\2 !\7>\2\2!\4\3\2"+
		"\2\2\"#\7@\2\2#$\7@\2\2$\6\3\2\2\2%&\7V\2\2&\'\7t\2\2\'(\7c\2\2()\7k\2"+
		"\2)*\7p\2\2*+\7u\2\2+\b\3\2\2\2,-\7J\2\2-.\7c\2\2./\7p\2\2/\60\7f\2\2"+
		"\60\61\7u\2\2\61\n\3\2\2\2\62\63\7>\2\2\63\f\3\2\2\2\64\65\7]\2\2\65\16"+
		"\3\2\2\2\66\67\7_\2\2\67\20\3\2\2\28<\t\2\2\29:\t\3\2\2:<\t\2\2\2;8\3"+
		"\2\2\2;9\3\2\2\2<\22\3\2\2\2=>\7%\2\2>\24\3\2\2\2?@\7}\2\2@\26\3\2\2\2"+
		"AB\7\177\2\2B\30\3\2\2\2CD\7.\2\2D\32\3\2\2\2EG\t\4\2\2FE\3\2\2\2GH\3"+
		"\2\2\2HF\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\b\16\2\2K\34\3\2\2\2LN\13\2\2\2"+
		"ML\3\2\2\2NO\3\2\2\2OP\3\2\2\2OM\3\2\2\2PQ\3\2\2\2QR\b\17\3\2R\36\3\2"+
		"\2\2\6\2;HO\4\b\2\2\3\17\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}