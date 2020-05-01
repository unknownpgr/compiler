# Generated from Test.g4 by ANTLR 4.8
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .TestParser import TestParser
else:
    from TestParser import TestParser

# This class defines a complete listener for a parse tree produced by TestParser.
class TestListener(ParseTreeListener):

    # Enter a parse tree produced by TestParser#s.
    def enterS(self, ctx:TestParser.SContext):
        pass

    # Exit a parse tree produced by TestParser#s.
    def exitS(self, ctx:TestParser.SContext):
        pass


    # Enter a parse tree produced by TestParser#variable_definition.
    def enterVariable_definition(self, ctx:TestParser.Variable_definitionContext):
        pass

    # Exit a parse tree produced by TestParser#variable_definition.
    def exitVariable_definition(self, ctx:TestParser.Variable_definitionContext):
        pass


    # Enter a parse tree produced by TestParser#number.
    def enterNumber(self, ctx:TestParser.NumberContext):
        pass

    # Exit a parse tree produced by TestParser#number.
    def exitNumber(self, ctx:TestParser.NumberContext):
        pass


    # Enter a parse tree produced by TestParser#function_call.
    def enterFunction_call(self, ctx:TestParser.Function_callContext):
        pass

    # Exit a parse tree produced by TestParser#function_call.
    def exitFunction_call(self, ctx:TestParser.Function_callContext):
        pass


    # Enter a parse tree produced by TestParser#skip.
    def enterSkip(self, ctx:TestParser.SkipContext):
        pass

    # Exit a parse tree produced by TestParser#skip.
    def exitSkip(self, ctx:TestParser.SkipContext):
        pass


    # Enter a parse tree produced by TestParser#id.
    def enterId(self, ctx:TestParser.IdContext):
        pass

    # Exit a parse tree produced by TestParser#id.
    def exitId(self, ctx:TestParser.IdContext):
        pass


    # Enter a parse tree produced by TestParser#unary_operation.
    def enterUnary_operation(self, ctx:TestParser.Unary_operationContext):
        pass

    # Exit a parse tree produced by TestParser#unary_operation.
    def exitUnary_operation(self, ctx:TestParser.Unary_operationContext):
        pass


    # Enter a parse tree produced by TestParser#binary_operation.
    def enterBinary_operation(self, ctx:TestParser.Binary_operationContext):
        pass

    # Exit a parse tree produced by TestParser#binary_operation.
    def exitBinary_operation(self, ctx:TestParser.Binary_operationContext):
        pass


    # Enter a parse tree produced by TestParser#function_definition.
    def enterFunction_definition(self, ctx:TestParser.Function_definitionContext):
        pass

    # Exit a parse tree produced by TestParser#function_definition.
    def exitFunction_definition(self, ctx:TestParser.Function_definitionContext):
        pass


    # Enter a parse tree produced by TestParser#assign.
    def enterAssign(self, ctx:TestParser.AssignContext):
        pass

    # Exit a parse tree produced by TestParser#assign.
    def exitAssign(self, ctx:TestParser.AssignContext):
        pass


    # Enter a parse tree produced by TestParser#def_var.
    def enterDef_var(self, ctx:TestParser.Def_varContext):
        pass

    # Exit a parse tree produced by TestParser#def_var.
    def exitDef_var(self, ctx:TestParser.Def_varContext):
        pass


    # Enter a parse tree produced by TestParser#def_func.
    def enterDef_func(self, ctx:TestParser.Def_funcContext):
        pass

    # Exit a parse tree produced by TestParser#def_func.
    def exitDef_func(self, ctx:TestParser.Def_funcContext):
        pass


    # Enter a parse tree produced by TestParser#func_param.
    def enterFunc_param(self, ctx:TestParser.Func_paramContext):
        pass

    # Exit a parse tree produced by TestParser#func_param.
    def exitFunc_param(self, ctx:TestParser.Func_paramContext):
        pass


    # Enter a parse tree produced by TestParser#type_.
    def enterType_(self, ctx:TestParser.Type_Context):
        pass

    # Exit a parse tree produced by TestParser#type_.
    def exitType_(self, ctx:TestParser.Type_Context):
        pass


    # Enter a parse tree produced by TestParser#id_.
    def enterId_(self, ctx:TestParser.Id_Context):
        pass

    # Exit a parse tree produced by TestParser#id_.
    def exitId_(self, ctx:TestParser.Id_Context):
        pass


    # Enter a parse tree produced by TestParser#op_uni_1.
    def enterOp_uni_1(self, ctx:TestParser.Op_uni_1Context):
        pass

    # Exit a parse tree produced by TestParser#op_uni_1.
    def exitOp_uni_1(self, ctx:TestParser.Op_uni_1Context):
        pass


    # Enter a parse tree produced by TestParser#op_bin_1.
    def enterOp_bin_1(self, ctx:TestParser.Op_bin_1Context):
        pass

    # Exit a parse tree produced by TestParser#op_bin_1.
    def exitOp_bin_1(self, ctx:TestParser.Op_bin_1Context):
        pass


    # Enter a parse tree produced by TestParser#op_bin_2.
    def enterOp_bin_2(self, ctx:TestParser.Op_bin_2Context):
        pass

    # Exit a parse tree produced by TestParser#op_bin_2.
    def exitOp_bin_2(self, ctx:TestParser.Op_bin_2Context):
        pass


    # Enter a parse tree produced by TestParser#num.
    def enterNum(self, ctx:TestParser.NumContext):
        pass

    # Exit a parse tree produced by TestParser#num.
    def exitNum(self, ctx:TestParser.NumContext):
        pass


    # Enter a parse tree produced by TestParser#int_.
    def enterInt_(self, ctx:TestParser.Int_Context):
        pass

    # Exit a parse tree produced by TestParser#int_.
    def exitInt_(self, ctx:TestParser.Int_Context):
        pass


    # Enter a parse tree produced by TestParser#float_.
    def enterFloat_(self, ctx:TestParser.Float_Context):
        pass

    # Exit a parse tree produced by TestParser#float_.
    def exitFloat_(self, ctx:TestParser.Float_Context):
        pass



del TestParser