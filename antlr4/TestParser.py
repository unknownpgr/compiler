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
        buf.write(")\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\3\3\3")
        buf.write("\3\3\3\3\3\3\3\3\5\3\24\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5")
        buf.write("\4\34\n\4\3\4\3\4\3\4\3\4\7\4\"\n\4\f\4\16\4%\13\4\3\5")
        buf.write("\3\5\3\5\2\3\6\6\2\4\6\b\2\3\3\2\6\t\2(\2\n\3\2\2\2\4")
        buf.write("\23\3\2\2\2\6\33\3\2\2\2\b&\3\2\2\2\n\13\5\4\3\2\13\f")
        buf.write("\7\2\2\3\f\3\3\2\2\2\r\24\5\6\4\2\16\17\5\6\4\2\17\20")
        buf.write("\7\3\2\2\20\21\5\6\4\2\21\24\3\2\2\2\22\24\3\2\2\2\23")
        buf.write("\r\3\2\2\2\23\16\3\2\2\2\23\22\3\2\2\2\24\5\3\2\2\2\25")
        buf.write("\26\b\4\1\2\26\34\7\n\2\2\27\30\7\4\2\2\30\31\5\6\4\2")
        buf.write("\31\32\7\5\2\2\32\34\3\2\2\2\33\25\3\2\2\2\33\27\3\2\2")
        buf.write("\2\34#\3\2\2\2\35\36\f\4\2\2\36\37\5\b\5\2\37 \5\6\4\5")
        buf.write(" \"\3\2\2\2!\35\3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2")
        buf.write("$\7\3\2\2\2%#\3\2\2\2&\'\t\2\2\2\'\t\3\2\2\2\5\23\33#")
        return buf.getvalue()


class TestParser ( Parser ):

    grammarFileName = "Test.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "';'", "'('", "')'", "'*'", "'+'", "'-'", 
                     "'/'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "NUM", "WS" ]

    RULE_s = 0
    RULE_s_ = 1
    RULE_exp = 2
    RULE_op = 3

    ruleNames =  [ "s", "s_", "exp", "op" ]

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

        def s_(self):
            return self.getTypedRuleContext(TestParser.S_Context,0)


        def EOF(self):
            return self.getToken(TestParser.EOF, 0)

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
            self.enterOuterAlt(localctx, 1)
            self.state = 8
            self.s_()
            self.state = 9
            self.match(TestParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class S_Context(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def exp(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(TestParser.ExpContext)
            else:
                return self.getTypedRuleContext(TestParser.ExpContext,i)


        def getRuleIndex(self):
            return TestParser.RULE_s_

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterS_" ):
                listener.enterS_(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitS_" ):
                listener.exitS_(self)




    def s_(self):

        localctx = TestParser.S_Context(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_s_)
        try:
            self.state = 17
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,0,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 11
                self.exp(0)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 12
                self.exp(0)
                self.state = 13
                self.match(TestParser.T__0)
                self.state = 14
                self.exp(0)
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

        def exp(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(TestParser.ExpContext)
            else:
                return self.getTypedRuleContext(TestParser.ExpContext,i)


        def op(self):
            return self.getTypedRuleContext(TestParser.OpContext,0)


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
        _startState = 4
        self.enterRecursionRule(localctx, 4, self.RULE_exp, _p)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 25
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [TestParser.NUM]:
                self.state = 20
                self.match(TestParser.NUM)
                pass
            elif token in [TestParser.T__1]:
                self.state = 21
                self.match(TestParser.T__1)
                self.state = 22
                self.exp(0)
                self.state = 23
                self.match(TestParser.T__2)
                pass
            else:
                raise NoViableAltException(self)

            self._ctx.stop = self._input.LT(-1)
            self.state = 33
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,2,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    localctx = TestParser.ExpContext(self, _parentctx, _parentState)
                    self.pushNewRecursionContext(localctx, _startState, self.RULE_exp)
                    self.state = 27
                    if not self.precpred(self._ctx, 2):
                        from antlr4.error.Errors import FailedPredicateException
                        raise FailedPredicateException(self, "self.precpred(self._ctx, 2)")
                    self.state = 28
                    self.op()
                    self.state = 29
                    self.exp(3) 
                self.state = 35
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
        self.enterRule(localctx, 6, self.RULE_op)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 36
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
        self._predicates[2] = self.exp_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def exp_sempred(self, localctx:ExpContext, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 2)
         




