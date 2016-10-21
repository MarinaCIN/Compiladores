// Generated from Projeto.g4 by ANTLR 4.5.3
package autogenerated;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProjetoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, INT=6, ID=7, SY=8, WS=9;
	public static final int
		RULE_pgm = 0, RULE_dir = 1, RULE_cod = 2;
	public static final String[] ruleNames = {
		"pgm", "dir", "cod"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#define'", "'#undef'", "'#ifdef'", "'#endif'", "'#ifndef'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "INT", "ID", "SY", "WS"
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
	public String getGrammarFileName() { return "Projeto.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ProjetoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PgmContext extends ParserRuleContext {
		public PgmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pgm; }
	 
		public PgmContext() { }
		public void copyFrom(PgmContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgramContext extends PgmContext {
		public List<DirContext> dir() {
			return getRuleContexts(DirContext.class);
		}
		public DirContext dir(int i) {
			return getRuleContext(DirContext.class,i);
		}
		public List<CodContext> cod() {
			return getRuleContexts(CodContext.class);
		}
		public CodContext cod(int i) {
			return getRuleContext(CodContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(ProjetoParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ProjetoParser.WS, i);
		}
		public ProgramContext(PgmContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjetoVisitor ) return ((ProjetoVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PgmContext pgm() throws RecognitionException {
		PgmContext _localctx = new PgmContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_pgm);
		int _la;
		try {
			_localctx = new ProgramContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << INT) | (1L << ID) | (1L << SY) | (1L << WS))) != 0)) {
				{
				setState(9);
				switch (_input.LA(1)) {
				case T__0:
				case T__1:
				case T__2:
				case T__4:
					{
					setState(6);
					dir();
					}
					break;
				case INT:
				case ID:
				case SY:
					{
					setState(7);
					cod();
					}
					break;
				case WS:
					{
					setState(8);
					match(WS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(13);
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

	public static class DirContext extends ParserRuleContext {
		public DirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dir; }
	 
		public DirContext() { }
		public void copyFrom(DirContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UndefineContext extends DirContext {
		public List<TerminalNode> WS() { return getTokens(ProjetoParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ProjetoParser.WS, i);
		}
		public TerminalNode ID() { return getToken(ProjetoParser.ID, 0); }
		public UndefineContext(DirContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjetoVisitor ) return ((ProjetoVisitor<? extends T>)visitor).visitUndefine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefineBinContext extends DirContext {
		public List<TerminalNode> WS() { return getTokens(ProjetoParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ProjetoParser.WS, i);
		}
		public TerminalNode ID() { return getToken(ProjetoParser.ID, 0); }
		public TerminalNode INT() { return getToken(ProjetoParser.INT, 0); }
		public DefineBinContext(DirContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjetoVisitor ) return ((ProjetoVisitor<? extends T>)visitor).visitDefineBin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfDefinedContext extends DirContext {
		public List<TerminalNode> WS() { return getTokens(ProjetoParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ProjetoParser.WS, i);
		}
		public TerminalNode ID() { return getToken(ProjetoParser.ID, 0); }
		public PgmContext pgm() {
			return getRuleContext(PgmContext.class,0);
		}
		public IfDefinedContext(DirContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjetoVisitor ) return ((ProjetoVisitor<? extends T>)visitor).visitIfDefined(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefineUnContext extends DirContext {
		public List<TerminalNode> WS() { return getTokens(ProjetoParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ProjetoParser.WS, i);
		}
		public TerminalNode ID() { return getToken(ProjetoParser.ID, 0); }
		public DefineUnContext(DirContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjetoVisitor ) return ((ProjetoVisitor<? extends T>)visitor).visitDefineUn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfNotDefinedContext extends DirContext {
		public List<TerminalNode> WS() { return getTokens(ProjetoParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(ProjetoParser.WS, i);
		}
		public TerminalNode ID() { return getToken(ProjetoParser.ID, 0); }
		public PgmContext pgm() {
			return getRuleContext(PgmContext.class,0);
		}
		public IfNotDefinedContext(DirContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjetoVisitor ) return ((ProjetoVisitor<? extends T>)visitor).visitIfNotDefined(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirContext dir() throws RecognitionException {
		DirContext _localctx = new DirContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dir);
		try {
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new DefineBinContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				match(T__0);
				setState(15);
				match(WS);
				setState(16);
				match(ID);
				setState(17);
				match(WS);
				setState(18);
				match(INT);
				setState(19);
				match(WS);
				}
				break;
			case 2:
				_localctx = new DefineUnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(20);
				match(T__0);
				setState(21);
				match(WS);
				setState(22);
				match(ID);
				setState(23);
				match(WS);
				}
				break;
			case 3:
				_localctx = new UndefineContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(24);
				match(T__1);
				setState(25);
				match(WS);
				setState(26);
				match(ID);
				setState(27);
				match(WS);
				}
				break;
			case 4:
				_localctx = new IfDefinedContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(28);
				match(T__2);
				setState(29);
				match(WS);
				setState(30);
				match(ID);
				setState(31);
				match(WS);
				setState(32);
				pgm();
				setState(33);
				match(T__3);
				setState(34);
				match(WS);
				}
				break;
			case 5:
				_localctx = new IfNotDefinedContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(36);
				match(T__4);
				setState(37);
				match(WS);
				setState(38);
				match(ID);
				setState(39);
				match(WS);
				setState(40);
				pgm();
				setState(41);
				match(T__3);
				setState(42);
				match(WS);
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

	public static class CodContext extends ParserRuleContext {
		public CodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cod; }
	 
		public CodContext() { }
		public void copyFrom(CodContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TextNumberContext extends CodContext {
		public TerminalNode INT() { return getToken(ProjetoParser.INT, 0); }
		public TerminalNode WS() { return getToken(ProjetoParser.WS, 0); }
		public TextNumberContext(CodContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjetoVisitor ) return ((ProjetoVisitor<? extends T>)visitor).visitTextNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TextSymbolContext extends CodContext {
		public TerminalNode SY() { return getToken(ProjetoParser.SY, 0); }
		public TerminalNode WS() { return getToken(ProjetoParser.WS, 0); }
		public TextSymbolContext(CodContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjetoVisitor ) return ((ProjetoVisitor<? extends T>)visitor).visitTextSymbol(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TextIDContext extends CodContext {
		public TerminalNode ID() { return getToken(ProjetoParser.ID, 0); }
		public TerminalNode WS() { return getToken(ProjetoParser.WS, 0); }
		public TextIDContext(CodContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProjetoVisitor ) return ((ProjetoVisitor<? extends T>)visitor).visitTextID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodContext cod() throws RecognitionException {
		CodContext _localctx = new CodContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cod);
		try {
			setState(52);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new TextIDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				match(ID);
				setState(47);
				match(WS);
				}
				break;
			case INT:
				_localctx = new TextNumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				match(INT);
				setState(49);
				match(WS);
				}
				break;
			case SY:
				_localctx = new TextSymbolContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				match(SY);
				setState(51);
				match(WS);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\139\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\3\2\7\2\f\n\2\f\2\16\2\17\13\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3/\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4\67"+
		"\n\4\3\4\2\2\5\2\4\6\2\2>\2\r\3\2\2\2\4.\3\2\2\2\6\66\3\2\2\2\b\f\5\4"+
		"\3\2\t\f\5\6\4\2\n\f\7\13\2\2\13\b\3\2\2\2\13\t\3\2\2\2\13\n\3\2\2\2\f"+
		"\17\3\2\2\2\r\13\3\2\2\2\r\16\3\2\2\2\16\3\3\2\2\2\17\r\3\2\2\2\20\21"+
		"\7\3\2\2\21\22\7\13\2\2\22\23\7\t\2\2\23\24\7\13\2\2\24\25\7\b\2\2\25"+
		"/\7\13\2\2\26\27\7\3\2\2\27\30\7\13\2\2\30\31\7\t\2\2\31/\7\13\2\2\32"+
		"\33\7\4\2\2\33\34\7\13\2\2\34\35\7\t\2\2\35/\7\13\2\2\36\37\7\5\2\2\37"+
		" \7\13\2\2 !\7\t\2\2!\"\7\13\2\2\"#\5\2\2\2#$\7\6\2\2$%\7\13\2\2%/\3\2"+
		"\2\2&\'\7\7\2\2\'(\7\13\2\2()\7\t\2\2)*\7\13\2\2*+\5\2\2\2+,\7\6\2\2,"+
		"-\7\13\2\2-/\3\2\2\2.\20\3\2\2\2.\26\3\2\2\2.\32\3\2\2\2.\36\3\2\2\2."+
		"&\3\2\2\2/\5\3\2\2\2\60\61\7\t\2\2\61\67\7\13\2\2\62\63\7\b\2\2\63\67"+
		"\7\13\2\2\64\65\7\n\2\2\65\67\7\13\2\2\66\60\3\2\2\2\66\62\3\2\2\2\66"+
		"\64\3\2\2\2\67\7\3\2\2\2\6\13\r.\66";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}