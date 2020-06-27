// Generated from Test.g4 by ANTLR 4.8
package target.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TestParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, ASM=29, ID=30, INT=31, WS=32, 
		COMMENT_LINE=33, COMMENT_BLOCK=34;
	public static final int
		RULE_s = 0, RULE_var_def = 1, RULE_exp = 2, RULE_asm = 3, RULE_code = 4, 
		RULE_codeblock = 5, RULE_if_def = 6, RULE_else_def = 7, RULE_while_def = 8, 
		RULE_control = 9, RULE_params = 10, RULE_function_def = 11, RULE_id = 12, 
		RULE_num = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "var_def", "exp", "asm", "code", "codeblock", "if_def", "else_def", 
			"while_def", "control", "params", "function_def", "id", "num"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "'='", "'('", "')'", "'!'", "'++'", "'--'", "'+'", "'-'", 
			"'&'", "'|'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'*'", "','", 
			"';'", "'{'", "'}'", "'if'", "'else'", "'while'", "'return'", "'continue'", 
			"'function'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "ASM", "ID", "INT", "WS", "COMMENT_LINE", 
			"COMMENT_BLOCK"
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
	public String getGrammarFileName() { return "Test.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TestParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TestParser.EOF, 0); }
		public List<Function_defContext> function_def() {
			return getRuleContexts(Function_defContext.class);
		}
		public Function_defContext function_def(int i) {
			return getRuleContext(Function_defContext.class,i);
		}
		public List<CodeblockContext> codeblock() {
			return getRuleContexts(CodeblockContext.class);
		}
		public CodeblockContext codeblock(int i) {
			return getRuleContext(CodeblockContext.class,i);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitS(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << ASM) | (1L << ID) | (1L << INT))) != 0)) {
				{
				setState(30);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__27:
					{
					setState(28);
					function_def();
					}
					break;
				case T__0:
				case T__2:
				case T__4:
				case T__7:
				case T__8:
				case T__17:
				case T__19:
				case T__20:
				case T__22:
				case T__24:
				case T__25:
				case T__26:
				case ASM:
				case ID:
				case INT:
					{
					setState(29);
					codeblock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35);
			match(EOF);
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

	public static class Var_defContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Var_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterVar_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitVar_def(this);
		}
	}

	public final Var_defContext var_def() throws RecognitionException {
		Var_defContext _localctx = new Var_defContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_var_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(T__0);
			setState(38);
			id();
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(39);
				match(T__1);
				setState(40);
				exp(0);
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

	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Op_add_subContext extends ExpContext {
		public ExpContext lhs;
		public Token op;
		public ExpContext rhs;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Op_add_subContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterOp_add_sub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitOp_add_sub(this);
		}
	}
	public static class Op_pointerContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Op_pointerContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterOp_pointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitOp_pointer(this);
		}
	}
	public static class Op_function_callContext extends ExpContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Op_function_callContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterOp_function_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitOp_function_call(this);
		}
	}
	public static class Op_ptr_assignContext extends ExpContext {
		public ExpContext lhs;
		public ExpContext rhs;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Op_ptr_assignContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterOp_ptr_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitOp_ptr_assign(this);
		}
	}
	public static class Op_orContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Op_orContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterOp_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitOp_or(this);
		}
	}
	public static class Op_notContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Op_notContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterOp_not(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitOp_not(this);
		}
	}
	public static class Exp_idContext extends ExpContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Exp_idContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterExp_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitExp_id(this);
		}
	}
	public static class Op_compContext extends ExpContext {
		public ExpContext lhs;
		public Token op;
		public ExpContext rhs;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Op_compContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterOp_comp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitOp_comp(this);
		}
	}
	public static class Op_signContext extends ExpContext {
		public Token op;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Op_signContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterOp_sign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitOp_sign(this);
		}
	}
	public static class Op_inc_decContext extends ExpContext {
		public Token op;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Op_inc_decContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterOp_inc_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitOp_inc_dec(this);
		}
	}
	public static class Op_andContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Op_andContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterOp_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitOp_and(this);
		}
	}
	public static class Exp_intContext extends ExpContext {
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public Exp_intContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterExp_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitExp_int(this);
		}
	}
	public static class Op_assignContext extends ExpContext {
		public IdContext lhs;
		public ExpContext rhs;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Op_assignContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterOp_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitOp_assign(this);
		}
	}
	public static class Exp_bracketContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Exp_bracketContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterExp_bracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitExp_bracket(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new Exp_intContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(44);
				num();
				}
				break;
			case 2:
				{
				_localctx = new Exp_idContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(45);
				id();
				}
				break;
			case 3:
				{
				_localctx = new Exp_bracketContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(46);
				match(T__2);
				setState(47);
				exp(0);
				setState(48);
				match(T__3);
				}
				break;
			case 4:
				{
				_localctx = new Op_notContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(50);
				match(T__4);
				setState(51);
				exp(11);
				}
				break;
			case 5:
				{
				_localctx = new Op_signContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(52);
				((Op_signContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__7 || _la==T__8) ) {
					((Op_signContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(53);
				exp(9);
				}
				break;
			case 6:
				{
				_localctx = new Op_ptr_assignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54);
				match(T__17);
				setState(55);
				((Op_ptr_assignContext)_localctx).lhs = exp(0);
				setState(56);
				match(T__1);
				setState(57);
				((Op_ptr_assignContext)_localctx).rhs = exp(4);
				}
				break;
			case 7:
				{
				_localctx = new Op_pointerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59);
				match(T__17);
				setState(60);
				exp(3);
				}
				break;
			case 8:
				{
				_localctx = new Op_assignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				((Op_assignContext)_localctx).lhs = id();
				setState(62);
				match(T__1);
				setState(63);
				((Op_assignContext)_localctx).rhs = exp(2);
				}
				break;
			case 9:
				{
				_localctx = new Op_function_callContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(65);
				id();
				setState(66);
				match(T__2);
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << T__17) | (1L << ID) | (1L << INT))) != 0)) {
					{
					setState(67);
					exp(0);
					setState(72);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__18) {
						{
						{
						setState(68);
						match(T__18);
						setState(69);
						exp(0);
						}
						}
						setState(74);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(77);
				match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(95);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new Op_andContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(81);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(82);
						match(T__9);
						setState(83);
						exp(9);
						}
						break;
					case 2:
						{
						_localctx = new Op_orContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(84);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(85);
						match(T__10);
						setState(86);
						exp(8);
						}
						break;
					case 3:
						{
						_localctx = new Op_add_subContext(new ExpContext(_parentctx, _parentState));
						((Op_add_subContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(87);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(88);
						((Op_add_subContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__7 || _la==T__8) ) {
							((Op_add_subContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(89);
						((Op_add_subContext)_localctx).rhs = exp(7);
						}
						break;
					case 4:
						{
						_localctx = new Op_compContext(new ExpContext(_parentctx, _parentState));
						((Op_compContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(90);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(91);
						((Op_compContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
							((Op_compContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(92);
						((Op_compContext)_localctx).rhs = exp(6);
						}
						break;
					case 5:
						{
						_localctx = new Op_inc_decContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(93);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(94);
						((Op_inc_decContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==T__6) ) {
							((Op_inc_decContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AsmContext extends ParserRuleContext {
		public TerminalNode ASM() { return getToken(TestParser.ASM, 0); }
		public AsmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterAsm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitAsm(this);
		}
	}

	public final AsmContext asm() throws RecognitionException {
		AsmContext _localctx = new AsmContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_asm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(ASM);
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

	public static class CodeContext extends ParserRuleContext {
		public Var_defContext var_def() {
			return getRuleContext(Var_defContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitCode(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_code);
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				var_def();
				}
				break;
			case T__2:
			case T__4:
			case T__7:
			case T__8:
			case T__17:
			case ID:
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				exp(0);
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

	public static class CodeblockContext extends ParserRuleContext {
		public ControlContext control() {
			return getRuleContext(ControlContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public List<CodeblockContext> codeblock() {
			return getRuleContexts(CodeblockContext.class);
		}
		public CodeblockContext codeblock(int i) {
			return getRuleContext(CodeblockContext.class,i);
		}
		public AsmContext asm() {
			return getRuleContext(AsmContext.class,0);
		}
		public CodeblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterCodeblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitCodeblock(this);
		}
	}

	public final CodeblockContext codeblock() throws RecognitionException {
		CodeblockContext _localctx = new CodeblockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_codeblock);
		int _la;
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
			case T__24:
			case T__25:
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				control();
				}
				break;
			case T__0:
			case T__2:
			case T__4:
			case T__7:
			case T__8:
			case T__17:
			case T__19:
			case ID:
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << T__17) | (1L << ID) | (1L << INT))) != 0)) {
					{
					setState(107);
					code();
					}
				}

				setState(110);
				match(T__19);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				match(T__20);
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << ASM) | (1L << ID) | (1L << INT))) != 0)) {
					{
					{
					setState(112);
					codeblock();
					}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(118);
				match(T__21);
				}
				break;
			case ASM:
				enterOuterAlt(_localctx, 4);
				{
				setState(119);
				asm();
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

	public static class If_defContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public If_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterIf_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitIf_def(this);
		}
	}

	public final If_defContext if_def() throws RecognitionException {
		If_defContext _localctx = new If_defContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__22);
			setState(123);
			match(T__2);
			setState(124);
			exp(0);
			setState(125);
			match(T__3);
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

	public static class Else_defContext extends ParserRuleContext {
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public Else_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterElse_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitElse_def(this);
		}
	}

	public final Else_defContext else_def() throws RecognitionException {
		Else_defContext _localctx = new Else_defContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_else_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__23);
			setState(128);
			codeblock();
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

	public static class While_defContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public While_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterWhile_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitWhile_def(this);
		}
	}

	public final While_defContext while_def() throws RecognitionException {
		While_defContext _localctx = new While_defContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_while_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__24);
			setState(131);
			match(T__2);
			setState(132);
			exp(0);
			setState(133);
			match(T__3);
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

	public static class ControlContext extends ParserRuleContext {
		public ControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_control; }
	 
		public ControlContext() { }
		public void copyFrom(ControlContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Ctrl_ifContext extends ControlContext {
		public If_defContext if_def() {
			return getRuleContext(If_defContext.class,0);
		}
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public Else_defContext else_def() {
			return getRuleContext(Else_defContext.class,0);
		}
		public Ctrl_ifContext(ControlContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterCtrl_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitCtrl_if(this);
		}
	}
	public static class Ctrl_whileContext extends ControlContext {
		public While_defContext while_def() {
			return getRuleContext(While_defContext.class,0);
		}
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public Ctrl_whileContext(ControlContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterCtrl_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitCtrl_while(this);
		}
	}
	public static class Ctrl_returnContext extends ControlContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Ctrl_returnContext(ControlContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterCtrl_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitCtrl_return(this);
		}
	}
	public static class Ctrl_continueContext extends ControlContext {
		public Ctrl_continueContext(ControlContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterCtrl_continue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitCtrl_continue(this);
		}
	}

	public final ControlContext control() throws RecognitionException {
		ControlContext _localctx = new ControlContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_control);
		try {
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				_localctx = new Ctrl_ifContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				if_def();
				setState(136);
				codeblock();
				setState(138);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(137);
					else_def();
					}
					break;
				}
				}
				break;
			case T__24:
				_localctx = new Ctrl_whileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				while_def();
				setState(141);
				codeblock();
				}
				break;
			case T__25:
				_localctx = new Ctrl_returnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				match(T__25);
				setState(145);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(144);
					exp(0);
					}
					break;
				}
				}
				break;
			case T__26:
				_localctx = new Ctrl_continueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(147);
				match(T__26);
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

	public static class ParamsContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(150);
			id();
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(151);
				match(T__18);
				setState(152);
				id();
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Function_defContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public Function_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterFunction_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitFunction_def(this);
		}
	}

	public final Function_defContext function_def() throws RecognitionException {
		Function_defContext _localctx = new Function_defContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__27);
			setState(159);
			id();
			setState(160);
			match(T__2);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(161);
				params();
				}
			}

			setState(164);
			match(T__3);
			setState(165);
			codeblock();
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TestParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(ID);
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

	public static class NumContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(TestParser.INT, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestListener ) ((TestListener)listener).exitNum(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(INT);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u00ae\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\7\2!\n\2\f\2\16\2$\13"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3,\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\7\4I\n\4\f\4\16\4L\13\4\5\4N\n\4\3\4\3\4\5\4R\n\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4b\n\4\f\4\16\4e\13\4\3\5\3"+
		"\5\3\6\3\6\5\6k\n\6\3\7\3\7\5\7o\n\7\3\7\3\7\3\7\7\7t\n\7\f\7\16\7w\13"+
		"\7\3\7\3\7\5\7{\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\5\13\u008d\n\13\3\13\3\13\3\13\3\13\3\13\5\13\u0094"+
		"\n\13\3\13\5\13\u0097\n\13\3\f\3\f\3\f\7\f\u009c\n\f\f\f\16\f\u009f\13"+
		"\f\3\r\3\r\3\r\3\r\5\r\u00a5\n\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17"+
		"\2\3\6\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\5\3\2\n\13\3\2\16\23\3"+
		"\2\b\t\2\u00be\2\"\3\2\2\2\4\'\3\2\2\2\6Q\3\2\2\2\bf\3\2\2\2\nj\3\2\2"+
		"\2\fz\3\2\2\2\16|\3\2\2\2\20\u0081\3\2\2\2\22\u0084\3\2\2\2\24\u0096\3"+
		"\2\2\2\26\u0098\3\2\2\2\30\u00a0\3\2\2\2\32\u00a9\3\2\2\2\34\u00ab\3\2"+
		"\2\2\36!\5\30\r\2\37!\5\f\7\2 \36\3\2\2\2 \37\3\2\2\2!$\3\2\2\2\" \3\2"+
		"\2\2\"#\3\2\2\2#%\3\2\2\2$\"\3\2\2\2%&\7\2\2\3&\3\3\2\2\2\'(\7\3\2\2("+
		"+\5\32\16\2)*\7\4\2\2*,\5\6\4\2+)\3\2\2\2+,\3\2\2\2,\5\3\2\2\2-.\b\4\1"+
		"\2.R\5\34\17\2/R\5\32\16\2\60\61\7\5\2\2\61\62\5\6\4\2\62\63\7\6\2\2\63"+
		"R\3\2\2\2\64\65\7\7\2\2\65R\5\6\4\r\66\67\t\2\2\2\67R\5\6\4\1389\7\24"+
		"\2\29:\5\6\4\2:;\7\4\2\2;<\5\6\4\6<R\3\2\2\2=>\7\24\2\2>R\5\6\4\5?@\5"+
		"\32\16\2@A\7\4\2\2AB\5\6\4\4BR\3\2\2\2CD\5\32\16\2DM\7\5\2\2EJ\5\6\4\2"+
		"FG\7\25\2\2GI\5\6\4\2HF\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KN\3\2\2"+
		"\2LJ\3\2\2\2ME\3\2\2\2MN\3\2\2\2NO\3\2\2\2OP\7\6\2\2PR\3\2\2\2Q-\3\2\2"+
		"\2Q/\3\2\2\2Q\60\3\2\2\2Q\64\3\2\2\2Q\66\3\2\2\2Q8\3\2\2\2Q=\3\2\2\2Q"+
		"?\3\2\2\2QC\3\2\2\2Rc\3\2\2\2ST\f\n\2\2TU\7\f\2\2Ub\5\6\4\13VW\f\t\2\2"+
		"WX\7\r\2\2Xb\5\6\4\nYZ\f\b\2\2Z[\t\2\2\2[b\5\6\4\t\\]\f\7\2\2]^\t\3\2"+
		"\2^b\5\6\4\b_`\f\f\2\2`b\t\4\2\2aS\3\2\2\2aV\3\2\2\2aY\3\2\2\2a\\\3\2"+
		"\2\2a_\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\7\3\2\2\2ec\3\2\2\2fg\7"+
		"\37\2\2g\t\3\2\2\2hk\5\4\3\2ik\5\6\4\2jh\3\2\2\2ji\3\2\2\2k\13\3\2\2\2"+
		"l{\5\24\13\2mo\5\n\6\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2p{\7\26\2\2qu\7\27"+
		"\2\2rt\5\f\7\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wu\3\2"+
		"\2\2x{\7\30\2\2y{\5\b\5\2zl\3\2\2\2zn\3\2\2\2zq\3\2\2\2zy\3\2\2\2{\r\3"+
		"\2\2\2|}\7\31\2\2}~\7\5\2\2~\177\5\6\4\2\177\u0080\7\6\2\2\u0080\17\3"+
		"\2\2\2\u0081\u0082\7\32\2\2\u0082\u0083\5\f\7\2\u0083\21\3\2\2\2\u0084"+
		"\u0085\7\33\2\2\u0085\u0086\7\5\2\2\u0086\u0087\5\6\4\2\u0087\u0088\7"+
		"\6\2\2\u0088\23\3\2\2\2\u0089\u008a\5\16\b\2\u008a\u008c\5\f\7\2\u008b"+
		"\u008d\5\20\t\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u0097\3"+
		"\2\2\2\u008e\u008f\5\22\n\2\u008f\u0090\5\f\7\2\u0090\u0097\3\2\2\2\u0091"+
		"\u0093\7\34\2\2\u0092\u0094\5\6\4\2\u0093\u0092\3\2\2\2\u0093\u0094\3"+
		"\2\2\2\u0094\u0097\3\2\2\2\u0095\u0097\7\35\2\2\u0096\u0089\3\2\2\2\u0096"+
		"\u008e\3\2\2\2\u0096\u0091\3\2\2\2\u0096\u0095\3\2\2\2\u0097\25\3\2\2"+
		"\2\u0098\u009d\5\32\16\2\u0099\u009a\7\25\2\2\u009a\u009c\5\32\16\2\u009b"+
		"\u0099\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2"+
		"\2\2\u009e\27\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\7\36\2\2\u00a1\u00a2"+
		"\5\32\16\2\u00a2\u00a4\7\5\2\2\u00a3\u00a5\5\26\f\2\u00a4\u00a3\3\2\2"+
		"\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\7\6\2\2\u00a7\u00a8"+
		"\5\f\7\2\u00a8\31\3\2\2\2\u00a9\u00aa\7 \2\2\u00aa\33\3\2\2\2\u00ab\u00ac"+
		"\7!\2\2\u00ac\35\3\2\2\2\23 \"+JMQacjnuz\u008c\u0093\u0096\u009d\u00a4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}