// Generated from csce322Homework01Part01.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class csce322Homework01Part01Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGIN=1, END=2, TITLE=3, BEGINTITLE=4, DOMINOBEGIN=5, DOMINOEND=6, NUMBER=7, 
		ENDROW=8, LISTBEGIN=9, LISTEND=10, COMMA=11, WS=12, ILLEGAL=13;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'"
	};
	public static final String[] ruleNames = {
		"BEGIN", "END", "TITLE", "BEGINTITLE", "DOMINOBEGIN", "DOMINOEND", "NUMBER", 
		"ENDROW", "LISTBEGIN", "LISTEND", "COMMA", "WS", "ILLEGAL"
	};


	public csce322Homework01Part01Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "csce322Homework01Part01.g4"; }

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
		case 0: BEGIN_action((RuleContext)_localctx, actionIndex); break;
		case 1: END_action((RuleContext)_localctx, actionIndex); break;
		case 2: TITLE_action((RuleContext)_localctx, actionIndex); break;
		case 4: DOMINOBEGIN_action((RuleContext)_localctx, actionIndex); break;
		case 5: DOMINOEND_action((RuleContext)_localctx, actionIndex); break;
		case 6: NUMBER_action((RuleContext)_localctx, actionIndex); break;
		case 7: ENDROW_action((RuleContext)_localctx, actionIndex); break;
		case 8: LISTBEGIN_action((RuleContext)_localctx, actionIndex); break;
		case 9: LISTEND_action((RuleContext)_localctx, actionIndex); break;
		case 12: ILLEGAL_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void ILLEGAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11: System.out.println("Notification: Problem on Line "+getLine());System.exit(0); break;
		}
	}
	private void NUMBER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6: System.out.println("Half: "+ getText()); break;
		case 7: System.out.println("Half: "+ getText()); break;
		}
	}
	private void ENDROW_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8: System.out.println("Conclude Row"); break;
		}
	}
	private void LISTEND_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10: System.out.println("Conclude List"); break;
		}
	}
	private void END_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: System.out.println("Conclude Section"); break;
		}
	}
	private void TITLE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: System.out.println("Portion: "+getText()); break;
		case 3: System.out.println("Portion: "+getText()); break;
		}
	}
	private void DOMINOBEGIN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4: System.out.println("Begin Domino"); break;
		}
	}
	private void BEGIN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: System.out.println("Begin Section"); break;
		}
	}
	private void LISTBEGIN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9: System.out.println("Begin List"); break;
		}
	}
	private void DOMINOEND_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5: System.out.println("Conclude Domino"); break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\17`\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\67\n"+
		"\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\bF\n\b\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\6\rT\n\r\r\r\16\rU\3\r\3"+
		"\r\3\16\6\16[\n\16\r\16\16\16\\\3\16\3\16\3\\\2\17\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\3\2\5\3\2\62;\3\2\63;\5\2"+
		"\13\f\17\17\"\"c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2\5\"\3\2\2\2\7\66"+
		"\3\2\2\2\t8\3\2\2\2\13:\3\2\2\2\r=\3\2\2\2\17E\3\2\2\2\21G\3\2\2\2\23"+
		"J\3\2\2\2\25M\3\2\2\2\27P\3\2\2\2\31S\3\2\2\2\33Z\3\2\2\2\35\36\7>\2\2"+
		"\36\37\7>\2\2\37 \3\2\2\2 !\b\2\2\2!\4\3\2\2\2\"#\7@\2\2#$\7@\2\2$%\3"+
		"\2\2\2%&\b\3\3\2&\6\3\2\2\2\'(\7V\2\2()\7t\2\2)*\7c\2\2*+\7k\2\2+,\7p"+
		"\2\2,-\7u\2\2-.\3\2\2\2.\67\b\4\4\2/\60\7J\2\2\60\61\7c\2\2\61\62\7p\2"+
		"\2\62\63\7f\2\2\63\64\7u\2\2\64\65\3\2\2\2\65\67\b\4\5\2\66\'\3\2\2\2"+
		"\66/\3\2\2\2\67\b\3\2\2\289\7>\2\29\n\3\2\2\2:;\7]\2\2;<\b\6\6\2<\f\3"+
		"\2\2\2=>\7_\2\2>?\b\7\7\2?\16\3\2\2\2@A\t\2\2\2AF\b\b\b\2BC\t\3\2\2CD"+
		"\t\2\2\2DF\b\b\t\2E@\3\2\2\2EB\3\2\2\2F\20\3\2\2\2GH\7%\2\2HI\b\t\n\2"+
		"I\22\3\2\2\2JK\7}\2\2KL\b\n\13\2L\24\3\2\2\2MN\7\177\2\2NO\b\13\f\2O\26"+
		"\3\2\2\2PQ\7.\2\2Q\30\3\2\2\2RT\t\4\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2"+
		"UV\3\2\2\2VW\3\2\2\2WX\b\r\r\2X\32\3\2\2\2Y[\13\2\2\2ZY\3\2\2\2[\\\3\2"+
		"\2\2\\]\3\2\2\2\\Z\3\2\2\2]^\3\2\2\2^_\b\16\16\2_\34\3\2\2\2\7\2\66EU"+
		"\\\17\3\2\2\3\3\3\3\4\4\3\4\5\3\6\6\3\7\7\3\b\b\3\b\t\3\t\n\3\n\13\3\13"+
		"\f\b\2\2\3\16\r";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}