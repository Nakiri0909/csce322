// Generated from csce322Homework01Part02.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class csce322Homework01Part02Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGIN=1, END=2, TRAINS=3, HANDS=4, BEGINTITLE=5, DOMINOBEGIN=6, DOMINOEND=7, 
		NUMBER=8, ENDROW=9, LISTBEGIN=10, LISTEND=11, COMMA=12, WS=13, ILLEGAL=14;
	public static final String[] tokenNames = {
		"<INVALID>", "'<<'", "'>>'", "'Trains'", "'Hands'", "'<'", "'['", "']'", 
		"NUMBER", "'#'", "'{'", "'}'", "','", "WS", "ILLEGAL"
	};
	public static final int
		RULE_dominoes = 0, RULE_trains = 1, RULE_list = 2, RULE_domino = 3, RULE_playlist = 4, 
		RULE_playdomino = 5, RULE_hands = 6, RULE_semantics = 7, RULE_extra = 8;
	public static final String[] ruleNames = {
		"dominoes", "trains", "list", "domino", "playlist", "playdomino", "hands", 
		"semantics", "extra"
	};

	@Override
	public String getGrammarFileName() { return "csce322Homework01Part02.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public csce322Homework01Part02Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DominoesContext extends ParserRuleContext {
		public ExtraContext extra() {
			return getRuleContext(ExtraContext.class,0);
		}
		public SemanticsContext semantics() {
			return getRuleContext(SemanticsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(csce322Homework01Part02Parser.EOF, 0); }
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
			if ( listener instanceof csce322Homework01Part02Listener ) ((csce322Homework01Part02Listener)listener).enterDominoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322Homework01Part02Listener ) ((csce322Homework01Part02Listener)listener).exitDominoes(this);
		}
	}

	public final DominoesContext dominoes() throws RecognitionException {
		DominoesContext _localctx = new DominoesContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_dominoes);
		try {
			setState(30);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(18); trains();
				setState(19); hands();
				setState(20); extra();
				setState(21); semantics();
				setState(22); match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(24); hands();
				setState(25); trains();
				setState(26); extra();
				setState(27); semantics();
				setState(28); match(EOF);
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
		public TerminalNode BEGINTITLE() { return getToken(csce322Homework01Part02Parser.BEGINTITLE, 0); }
		public TerminalNode TRAINS() { return getToken(csce322Homework01Part02Parser.TRAINS, 0); }
		public List<TerminalNode> ENDROW() { return getTokens(csce322Homework01Part02Parser.ENDROW); }
		public TerminalNode ENDROW(int i) {
			return getToken(csce322Homework01Part02Parser.ENDROW, i);
		}
		public TerminalNode BEGIN() { return getToken(csce322Homework01Part02Parser.BEGIN, 0); }
		public TerminalNode END() { return getToken(csce322Homework01Part02Parser.END, 0); }
		public List<PlaylistContext> playlist() {
			return getRuleContexts(PlaylistContext.class);
		}
		public PlaylistContext playlist(int i) {
			return getRuleContext(PlaylistContext.class,i);
		}
		public TrainsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trains; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322Homework01Part02Listener ) ((csce322Homework01Part02Listener)listener).enterTrains(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322Homework01Part02Listener ) ((csce322Homework01Part02Listener)listener).exitTrains(this);
		}
	}

	public final TrainsContext trains() throws RecognitionException {
		TrainsContext _localctx = new TrainsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_trains);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32); match(BEGINTITLE);
			setState(33); match(TRAINS);
			setState(34); match(BEGIN);
			setState(35); playlist();
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDROW) {
				{
				{
				setState(36); match(ENDROW);
				setState(37); playlist();
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43); match(END);
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
		public TerminalNode LISTEND() { return getToken(csce322Homework01Part02Parser.LISTEND, 0); }
		public TerminalNode LISTBEGIN() { return getToken(csce322Homework01Part02Parser.LISTBEGIN, 0); }
		public List<DominoContext> domino() {
			return getRuleContexts(DominoContext.class);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322Homework01Part02Listener ) ((csce322Homework01Part02Listener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322Homework01Part02Listener ) ((csce322Homework01Part02Listener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); match(LISTBEGIN);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOMINOBEGIN) {
				{
				{
				setState(46); domino();
				handdominoes++;
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54); match(LISTEND);
			players++;
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
		public TerminalNode DOMINOEND() { return getToken(csce322Homework01Part02Parser.DOMINOEND, 0); }
		public TerminalNode NUMBER(int i) {
			return getToken(csce322Homework01Part02Parser.NUMBER, i);
		}
		public TerminalNode COMMA() { return getToken(csce322Homework01Part02Parser.COMMA, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(csce322Homework01Part02Parser.NUMBER); }
		public TerminalNode DOMINOBEGIN() { return getToken(csce322Homework01Part02Parser.DOMINOBEGIN, 0); }
		public DominoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322Homework01Part02Listener ) ((csce322Homework01Part02Listener)listener).enterDomino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322Homework01Part02Listener ) ((csce322Homework01Part02Listener)listener).exitDomino(this);
		}
	}

	public final DominoContext domino() throws RecognitionException {
		DominoContext _localctx = new DominoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_domino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); match(DOMINOBEGIN);
			setState(58); match(NUMBER);
			setState(59); match(COMMA);
			setState(60); match(NUMBER);
			setState(61); match(DOMINOEND);
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

	public static class PlaylistContext extends ParserRuleContext {
		public TerminalNode LISTEND() { return getToken(csce322Homework01Part02Parser.LISTEND, 0); }
		public TerminalNode LISTBEGIN() { return getToken(csce322Homework01Part02Parser.LISTBEGIN, 0); }
		public List<PlaydominoContext> playdomino() {
			return getRuleContexts(PlaydominoContext.class);
		}
		public PlaydominoContext playdomino(int i) {
			return getRuleContext(PlaydominoContext.class,i);
		}
		public PlaylistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_playlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322Homework01Part02Listener ) ((csce322Homework01Part02Listener)listener).enterPlaylist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322Homework01Part02Listener ) ((csce322Homework01Part02Listener)listener).exitPlaylist(this);
		}
	}

	public final PlaylistContext playlist() throws RecognitionException {
		PlaylistContext _localctx = new PlaylistContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_playlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); match(LISTBEGIN);
			play[num]=0;
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOMINOBEGIN) {
				{
				{
				setState(65); playdomino();
				playdominoes++;play[num]++;
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73); match(LISTEND);
			num++;
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

	public static class PlaydominoContext extends ParserRuleContext {
		public TerminalNode DOMINOEND() { return getToken(csce322Homework01Part02Parser.DOMINOEND, 0); }
		public TerminalNode NUMBER(int i) {
			return getToken(csce322Homework01Part02Parser.NUMBER, i);
		}
		public TerminalNode COMMA() { return getToken(csce322Homework01Part02Parser.COMMA, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(csce322Homework01Part02Parser.NUMBER); }
		public TerminalNode DOMINOBEGIN() { return getToken(csce322Homework01Part02Parser.DOMINOBEGIN, 0); }
		public PlaydominoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_playdomino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322Homework01Part02Listener ) ((csce322Homework01Part02Listener)listener).enterPlaydomino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322Homework01Part02Listener ) ((csce322Homework01Part02Listener)listener).exitPlaydomino(this);
		}
	}

	public final PlaydominoContext playdomino() throws RecognitionException {
		PlaydominoContext _localctx = new PlaydominoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_playdomino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); match(DOMINOBEGIN);
			setState(77); match(NUMBER);
			setState(78); match(COMMA);
			setState(79); match(NUMBER);
			setState(80); match(DOMINOEND);
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
		public TerminalNode BEGINTITLE() { return getToken(csce322Homework01Part02Parser.BEGINTITLE, 0); }
		public List<TerminalNode> ENDROW() { return getTokens(csce322Homework01Part02Parser.ENDROW); }
		public TerminalNode HANDS() { return getToken(csce322Homework01Part02Parser.HANDS, 0); }
		public TerminalNode ENDROW(int i) {
			return getToken(csce322Homework01Part02Parser.ENDROW, i);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public TerminalNode BEGIN() { return getToken(csce322Homework01Part02Parser.BEGIN, 0); }
		public TerminalNode END() { return getToken(csce322Homework01Part02Parser.END, 0); }
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public HandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322Homework01Part02Listener ) ((csce322Homework01Part02Listener)listener).enterHands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322Homework01Part02Listener ) ((csce322Homework01Part02Listener)listener).exitHands(this);
		}
	}

	public final HandsContext hands() throws RecognitionException {
		HandsContext _localctx = new HandsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_hands);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); match(BEGINTITLE);
			setState(83); match(HANDS);
			setState(84); match(BEGIN);
			setState(85); list();
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDROW) {
				{
				{
				setState(86); match(ENDROW);
				setState(87); list();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93); match(END);
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

	public static class SemanticsContext extends ParserRuleContext {
		public SemanticsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semantics; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322Homework01Part02Listener ) ((csce322Homework01Part02Listener)listener).enterSemantics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322Homework01Part02Listener ) ((csce322Homework01Part02Listener)listener).exitSemantics(this);
		}
	}

	public final SemanticsContext semantics() throws RecognitionException {
		SemanticsContext _localctx = new SemanticsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_semantics);
		try {
			enterOuterAlt(_localctx, 1);
			{

				hands=(players<3 || players >10);
				dominoes=handdominoes+playdominoes;
				played=(playdominoes > 0.2*dominoes);
				if(hands){
					System.out.println("Notification : Semantic Problem 1");
					semantic=false;
				}
				if(played){
					System.out.println("Notification : Semantic Problem 2");
					semantic=false;
				}
				if(more){
					System.out.println("Notification : Semantic Problem 3");
					semantic=false;
				}
				if(semantic){
				System.out.println(playdominoes+" dominoes have been played");
				
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

	public static class ExtraContext extends ParserRuleContext {
		public ExtraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extra; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322Homework01Part02Listener ) ((csce322Homework01Part02Listener)listener).enterExtra(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322Homework01Part02Listener ) ((csce322Homework01Part02Listener)listener).exitExtra(this);
		}
	}

	public final ExtraContext extra() throws RecognitionException {
		ExtraContext _localctx = new ExtraContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_extra);
		try {
			enterOuterAlt(_localctx, 1);
			{

				for(int i=0;i<num;i++){
					for(int j=i+1;j<num;j++){
						if(play[i]<(play[j]-1) || play[i]>(play[j]+1)){
							more=true;
						}
					}
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\20f\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2!\n\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\7\3)\n\3\f\3\16\3,\13\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4\64\n\4\f\4\16\4\67"+
		"\13\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6G\n\6"+
		"\f\6\16\6J\13\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\7\b[\n\b\f\b\16\b^\13\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\2\2\13\2\4"+
		"\6\b\n\f\16\20\22\2\2a\2 \3\2\2\2\4\"\3\2\2\2\6/\3\2\2\2\b;\3\2\2\2\n"+
		"A\3\2\2\2\fN\3\2\2\2\16T\3\2\2\2\20a\3\2\2\2\22c\3\2\2\2\24\25\5\4\3\2"+
		"\25\26\5\16\b\2\26\27\5\22\n\2\27\30\5\20\t\2\30\31\7\2\2\3\31!\3\2\2"+
		"\2\32\33\5\16\b\2\33\34\5\4\3\2\34\35\5\22\n\2\35\36\5\20\t\2\36\37\7"+
		"\2\2\3\37!\3\2\2\2 \24\3\2\2\2 \32\3\2\2\2!\3\3\2\2\2\"#\7\7\2\2#$\7\5"+
		"\2\2$%\7\3\2\2%*\5\n\6\2&\'\7\13\2\2\')\5\n\6\2(&\3\2\2\2),\3\2\2\2*("+
		"\3\2\2\2*+\3\2\2\2+-\3\2\2\2,*\3\2\2\2-.\7\4\2\2.\5\3\2\2\2/\65\7\f\2"+
		"\2\60\61\5\b\5\2\61\62\b\4\1\2\62\64\3\2\2\2\63\60\3\2\2\2\64\67\3\2\2"+
		"\2\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\65\3\2\2\289\7\r\2\29:\b"+
		"\4\1\2:\7\3\2\2\2;<\7\b\2\2<=\7\n\2\2=>\7\16\2\2>?\7\n\2\2?@\7\t\2\2@"+
		"\t\3\2\2\2AB\7\f\2\2BH\b\6\1\2CD\5\f\7\2DE\b\6\1\2EG\3\2\2\2FC\3\2\2\2"+
		"GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IK\3\2\2\2JH\3\2\2\2KL\7\r\2\2LM\b\6\1\2"+
		"M\13\3\2\2\2NO\7\b\2\2OP\7\n\2\2PQ\7\16\2\2QR\7\n\2\2RS\7\t\2\2S\r\3\2"+
		"\2\2TU\7\7\2\2UV\7\6\2\2VW\7\3\2\2W\\\5\6\4\2XY\7\13\2\2Y[\5\6\4\2ZX\3"+
		"\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\7\4\2\2"+
		"`\17\3\2\2\2ab\b\t\1\2b\21\3\2\2\2cd\b\n\1\2d\23\3\2\2\2\7 *\65H\\";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}