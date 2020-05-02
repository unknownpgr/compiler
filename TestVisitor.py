# Generated from Test.g4 by ANTLR 4.8
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .TestParser import TestParser
else:
    from TestParser import TestParser

# This class defines a complete generic visitor for a parse tree produced by TestParser.

class TestVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by TestParser#s.
    def visitS(self, ctx:TestParser.SContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TestParser#variable_definition.
    def visitVariable_definition(self, ctx:TestParser.Variable_definitionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TestParser#number.
    def visitNumber(self, ctx:TestParser.NumberContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TestParser#function_call.
    def visitFunction_call(self, ctx:TestParser.Function_callContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TestParser#skip.
    def visitSkip(self, ctx:TestParser.SkipContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TestParser#id.
    def visitId(self, ctx:TestParser.IdContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TestParser#unary_operation.
    def visitUnary_operation(self, ctx:TestParser.Unary_operationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TestParser#binary_operation.
    def visitBinary_operation(self, ctx:TestParser.Binary_operationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TestParser#function_definition.
    def visitFunction_definition(self, ctx:TestParser.Function_definitionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TestParser#assign.
    def visitAssign(self, ctx:TestParser.AssignContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TestParser#type_.
    def visitType_(self, ctx:TestParser.Type_Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TestParser#id_.
    def visitId_(self, ctx:TestParser.Id_Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TestParser#type_int.
    def visitType_int(self, ctx:TestParser.Type_intContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TestParser#type_float.
    def visitType_float(self, ctx:TestParser.Type_floatContext):
        return self.visitChildren(ctx)



del TestParser