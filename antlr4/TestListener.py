# Generated from Test.g4 by ANTLR 4.8
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .TestParser import TestParser
else:
    from TestParser import TestParser

# This class defines a complete listener for a parse tree produced by TestParser.


class TestListener(ParseTreeListener):

    # Enter a parse tree produced by TestParser#s.
    def enterS(self, ctx: TestParser.SContext):
        pass

    # Exit a parse tree produced by TestParser#s.
    def exitS(self, ctx: TestParser.SContext):
        pass

    # Enter a parse tree produced by TestParser#s_.
    def enterS_(self, ctx: TestParser.S_Context):
        pass

    # Exit a parse tree produced by TestParser#s_.
    def exitS_(self, ctx: TestParser.S_Context):
        pass

    # Enter a parse tree produced by TestParser#exp.
    def enterExp(self, ctx: TestParser.ExpContext):
        print(ctx.getText())
        pass

    # Exit a parse tree produced by TestParser#exp.
    def exitExp(self, ctx: TestParser.ExpContext):
        pass

    # Enter a parse tree produced by TestParser#op.
    def enterOp(self, ctx: TestParser.OpContext):
        pass

    # Exit a parse tree produced by TestParser#op.
    def exitOp(self, ctx: TestParser.OpContext):
        pass


del TestParser
