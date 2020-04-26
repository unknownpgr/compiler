# Generated from Test.g4 by ANTLR 4.8
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13")
        buf.write("%\4\2\t\2\4\3\t\3\4\4\t\4\3\2\3\2\3\2\3\2\3\2\5\2\16\n")
        buf.write("\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\31\n\3\3\3")
        buf.write("\3\3\3\3\7\3\36\n\3\f\3\16\3!\13\3\3\4\3\4\3\4\2\3\4\5")
        buf.write("\2\4\6\2\3\3\2\6\t\2%\2\r\3\2\2\2\4\30\3\2\2\2\6\"\3\2")
        buf.write("\2\2\b\16\5\4\3\2\t\n\5\4\3\2\n\13\5\2\2\2\13\16\3\2\2")
        buf.write("\2\f\16\3\2\2\2\r\b\3\2\2\2\r\t\3\2\2\2\r\f\3\2\2\2\16")
        buf.write("\3\3\2\2\2\17\20\b\3\1\2\20\21\7\n\2\2\21\22\5\6\4\2\22")
        buf.write("\23\5\4\3\5\23\31\3\2\2\2\24\25\7\3\2\2\25\26\5\4\3\2")
        buf.write("\26\27\7\4\2\2\27\31\3\2\2\2\30\17\3\2\2\2\30\24\3\2\2")
        buf.write("\2\31\37\3\2\2\2\32\33\f\3\2\2\33\34\7\5\2\2\34\36\5\4")
        buf.write("\3\4\35\32\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2")
        buf.write("\2 \5\3\2\2\2!\37\3\2\2\2\"#\t\2\2\2#\7\3\2\2\2\5\r\30")
        buf.write("\37")
        return buf.getvalue()


class TestParser ( Parser ):

    grammarFileName = "Test.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'('", "')'", "';'", "'+'", "'-'", "'*'", 
                     "'/'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "NUM", "WS" ]

    RULE_s = 0
    RULE_exp = 1
    RULE_op = 2

    ruleNames =  [ "s", "exp", "op" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    NUM=8
    WS=9

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.8")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class SContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def exp(self):
            return self.getTypedRuleContext(TestParser.ExpContext,0)


        def s(self):
            return self.getTypedRuleContext(TestParser.SContext,0)


        def getRuleIndex(self):
            return TestParser.RULE_s

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterS" ):
                listener.enterS(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitS" ):
                listener.exitS(self)




    def s(self):

        localctx = TestParser.SContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_s)
        try:
            self.state = 11
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,0,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 6
                self.exp(0)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 7
                self.exp(0)
                self.state = 8
                self.s()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)

                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExpContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NUM(self):
            return self.getToken(TestParser.NUM, 0)

        def op(self):
            return self.getTypedRuleContext(TestParser.OpContext,0)


        def exp(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(TestParser.ExpContext)
            else:
                return self.getTypedRuleContext(TestParser.ExpContext,i)


        def getRuleIndex(self):
            return TestParser.RULE_exp

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExp" ):
                listener.enterExp(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExp" ):
                listener.exitExp(self)



    def exp(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = TestParser.ExpContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 2
        self.enterRecursionRule(localctx, 2, self.RULE_exp, _p)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 22
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [TestParser.NUM]:
                self.state = 14
                self.match(TestParser.NUM)
                self.state = 15
                self.op()
                self.state = 16
                self.exp(3)
                pass
            elif token in [TestParser.T__0]:
                self.state = 18
                self.match(TestParser.T__0)
                self.state = 19
                self.exp(0)
                self.state = 20
                self.match(TestParser.T__1)
                pass
            else:
                raise NoViableAltException(self)

            self._ctx.stop = self._input.LT(-1)
            self.state = 29
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,2,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    localctx = TestParser.ExpContext(self, _parentctx, _parentState)
                    self.pushNewRecursionContext(localctx, _startState, self.RULE_exp)
                    self.state = 24
                    if not self.precpred(self._ctx, 1):
                        from antlr4.error.Errors import FailedPredicateException
                        raise FailedPredicateException(self, "self.precpred(self._ctx, 1)")
                    self.state = 25
                    self.match(TestParser.T__2)
                    self.state = 26
                    self.exp(2) 
                self.state = 31
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,2,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx


    class OpContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return TestParser.RULE_op

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterOp" ):
                listener.enterOp(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitOp" ):
                listener.exitOp(self)




    def op(self):

        localctx = TestParser.OpContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_op)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 32
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << TestParser.T__3) | (1 << TestParser.T__4) | (1 << TestParser.T__5) | (1 << TestParser.T__6))) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx



    def sempred(self, localctx:RuleContext, ruleIndex:int, predIndex:int):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[1] = self.exp_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def exp_sempred(self, localctx:ExpContext, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 1)
         




