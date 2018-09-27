// Generated from csce322Homework01Part01.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class csce322Homework01Part01Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGIN=1, END=2, TITLE=3, BEGINTITLE=4, DOMINOBEGIN=5, DOMINOEND=6, NUMBER=7, 
		ENDROW=8, LISTBEGIN=9, LISTEND=10, COMMA=11, WS=12, ILLEGAL=13;
	public static final String[] tokenNames = {
		"<INVALID>", "'<<'", "'>>'", "TITLE", "'<'", "'['", "']'", "NUMBER", "'#'", 
		"'{'", "'}'", "','", "WS", "ILLEGAL"
	};
	public static final int
		RULE_dominoes = 0, RULE_trains = 1, RULE_list = 2, RULE_domino = 3, RULE_hands = 4, 
		RULE_end = 5;
	public static final String[] ruleNames = {
		"dominoes", "trains", "list", "domino", "hands", "end"
	};

	@Override
	public String getGrammarFileName() { return "csce322Homework01Part01.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public csce322Homework01Part01Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DominoesContext extends ParserRuleContext {
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public TerminalNode EOF() { return getToken(csce322Homework01Part01Parser.EOF, 0); }
		public TrainsContext trains() {
			return getRuleContext(TrainsContext.class,0);
		}
		public HandsContext hands() {
			return getRuleContext(HandsContext.class,0);
		}
		public DominoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dominoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322Homework01Part01Listener ) ((csce322Homework01Part01Listener)listener).enterDominoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322Homework01Part01Listener ) ((csce322Homework01Part01Listener)listener).exitDominoes(this);
		}
	}

	public final DominoesContext dominoes() throws RecognitionException {
		DominoesContext _localctx = new DominoesContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_dominoes);
		try {
			setState(22);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(12); trains();
				setState(13); hands();
				setState(14); end();
				setState(15); match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(17); hands();
				setState(18); trains();
				setState(19); end();
				setState(20); match(EOF);
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

	public static class TrainsContext extends ParserRuleContext {
		public TerminalNode BEGINTITLE() { return getToken(csce322Homework01Part01Parser.BEGINTITLE, 0); }
		public TerminalNode TITLE() { return getToken(csce322Homework01Part01Parser.TITLE, 0); }
		public List<TerminalNode> ENDROW() { return getTokens(csce322Homework01Part01Parser.ENDROW); }
		public TerminalNode ENDROW(int i) {
			return getToken(csce322Homework01Part01Parser.ENDROW, i);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public TerminalNode BEGIN() { return getToken(csce322Homework01Part01Parser.BEGIN, 0); }
		public TerminalNode END() { return getToken(csce322Homework01Part01Parser.END, 0); }
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public TrainsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trains; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322Homework01Part01Listener ) ((csce322Homework01Part01Listener)listener).enterTrains(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322Homework01Part01Listener ) ((csce322Homework01Part01Listener)listener).exitTrains(this);
		}
	}

	public final TrainsContext trains() throws RecognitionException {
		TrainsContext _localctx = new TrainsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_trains);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24); match(BEGINTITLE);
			setState(25); match(TITLE);
			setState(26); match(BEGIN);
			setState(27); list();
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDROW) {
				{
				{
				setState(28); match(ENDROW);
				setState(29); list();
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35); match(END);
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

	public static class ListContext extends ParserRuleContext {
		public DominoContext domino(int i) {
			return getRuleContext(DominoContext.class,i);
		}
		public TerminalNode LISTEND() { return getToken(csce322Homework01Part01Parser.LISTEND, 0); }
		public TerminalNode LISTBEGIN() { return getToken(csce322Homework01Part01Parser.LISTBEGIN, 0); }
		public List<DominoContext> domino() {
			return getRuleContexts(DominoContext.class);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322Homework01Part01Listener ) ((csce322Homework01Part01Listener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322Homework01Part01Listener ) ((csce322Homework01Part01Listener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); match(LISTBEGIN);
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOMINOBEGIN) {
				{
				{
				setState(38); domino();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44); match(LISTEND);
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

	public static class DominoContext extends ParserRuleContext {
		public TerminalNode DOMINOEND() { return getToken(csce322Homework01Part01Parser.DOMINOEND, 0); }
		public TerminalNode NUMBER(int i) {
			return getToken(csce322Homework01Part01Parser.NUMBER, i);
		}
		public TerminalNode COMMA() { return getToken(csce322Homework01Part01Parser.COMMA, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(csce322Homework01Part01Parser.NUMBER); }
		public TerminalNode DOMINOBEGIN() { return getToken(csce322Homework01Part01Parser.DOMINOBEGIN, 0); }
		public DominoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322Homework01Part01Listener ) ((csce322Homework01Part01Listener)listener).enterDomino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322Homework01Part01Listener ) ((csce322Homework01Part01Listener)listener).exitDomino(this);
		}
	}

	public final DominoContext domino() throws RecognitionException {
		DominoContext _localctx = new DominoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_domino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46); match(DOMINOBEGIN);
			setState(47); match(NUMBER);
			setState(48); match(COMMA);
			setState(49); match(NUMBER);
			setState(50); match(DOMINOEND);
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

	public static class HandsContext extends ParserRuleContext {
		public TerminalNode BEGINTITLE() { return getToken(csce322Homework01Part01Parser.BEGINTITLE, 0); }
		public TerminalNode TITLE() { return getToken(csce322Homework01Part01Parser.TITLE, 0); }
		public List<TerminalNode> ENDROW() { return getTokens(csce322Homework01Part01Parser.ENDROW); }
		public TerminalNode ENDROW(int i) {
			return getToken(csce322Homework01Part01Parser.ENDROW, i);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public TerminalNode BEGIN() { return getToken(csce322Homework01Part01Parser.BEGIN, 0); }
		public TerminalNode END() { return getToken(csce322Homework01Part01Parser.END, 0); }
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public HandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322Homework01Part01Listener ) ((csce322Homework01Part01Listener)listener).enterHands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322Homework01Part01Listener ) ((csce322Homework01Part01Listener)listener).exitHands(this);
		}
	}

	public final HandsContext hands() throws RecognitionException {
		HandsContext _localctx = new HandsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_hands);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52); match(BEGINTITLE);
			setState(53); match(TITLE);
			setState(54); match(BEGIN);
			setState(55); list();
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDROW) {
				{
				{
				setState(56); match(ENDROW);
				setState(57); list();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63); match(END);
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

	public static class EndContext extends ParserRuleContext {
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322Homework01Part01Listener ) ((csce322Homework01Part01Listener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322Homework01Part01Listener ) ((csce322Homework01Part01Listener)listener).exitEnd(this);
		}
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			System.out.println("Conclude File");
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\17F\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\5\2\31\n\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3!\n\3\f\3\16\3$\13\3\3\3\3"+
		"\3\3\4\3\4\7\4*\n\4\f\4\16\4-\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\7\6=\n\6\f\6\16\6@\13\6\3\6\3\6\3\7\3\7\3\7\2\2\b"+
		"\2\4\6\b\n\f\2\2C\2\30\3\2\2\2\4\32\3\2\2\2\6\'\3\2\2\2\b\60\3\2\2\2\n"+
		"\66\3\2\2\2\fC\3\2\2\2\16\17\5\4\3\2\17\20\5\n\6\2\20\21\5\f\7\2\21\22"+
		"\7\2\2\3\22\31\3\2\2\2\23\24\5\n\6\2\24\25\5\4\3\2\25\26\5\f\7\2\26\27"+
		"\7\2\2\3\27\31\3\2\2\2\30\16\3\2\2\2\30\23\3\2\2\2\31\3\3\2\2\2\32\33"+
		"\7\6\2\2\33\34\7\5\2\2\34\35\7\3\2\2\35\"\5\6\4\2\36\37\7\n\2\2\37!\5"+
		"\6\4\2 \36\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#%\3\2\2\2$\"\3\2\2"+
		"\2%&\7\4\2\2&\5\3\2\2\2\'+\7\13\2\2(*\5\b\5\2)(\3\2\2\2*-\3\2\2\2+)\3"+
		"\2\2\2+,\3\2\2\2,.\3\2\2\2-+\3\2\2\2./\7\f\2\2/\7\3\2\2\2\60\61\7\7\2"+
		"\2\61\62\7\t\2\2\62\63\7\r\2\2\63\64\7\t\2\2\64\65\7\b\2\2\65\t\3\2\2"+
		"\2\66\67\7\6\2\2\678\7\5\2\289\7\3\2\29>\5\6\4\2:;\7\n\2\2;=\5\6\4\2<"+
		":\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2\2AB\7\4\2\2"+
		"B\13\3\2\2\2CD\b\7\1\2D\r\3\2\2\2\6\30\"+>";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}