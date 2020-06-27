// Generated from Test.g4 by ANTLR 4.8
package target.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TestParser}.
 */
public interface TestListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TestParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(TestParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(TestParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#var_def}.
	 * @param ctx the parse tree
	 */
	void enterVar_def(TestParser.Var_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#var_def}.
	 * @param ctx the parse tree
	 */
	void exitVar_def(TestParser.Var_defContext ctx);
	/**
	 * Enter a parse tree produced by the {@code op_add_sub}
	 * labeled alternative in {@link TestParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterOp_add_sub(TestParser.Op_add_subContext ctx);
	/**
	 * Exit a parse tree produced by the {@code op_add_sub}
	 * labeled alternative in {@link TestParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitOp_add_sub(TestParser.Op_add_subContext ctx);
	/**
	 * Enter a parse tree produced by the {@code op_pointer}
	 * labeled alternative in {@link TestParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterOp_pointer(TestParser.Op_pointerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code op_pointer}
	 * labeled alternative in {@link TestParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitOp_pointer(TestParser.Op_pointerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code op_function_call}
	 * labeled alternative in {@link TestParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterOp_function_call(TestParser.Op_function_callContext ctx);
	/**
	 * Exit a parse tree produced by the {@code op_function_call}
	 * labeled alternative in {@link TestParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitOp_function_call(TestParser.Op_function_callContext ctx);
	/**
	 * Enter a parse tree produced by the {@code op_ptr_assign}
	 * labeled alternative in {@link TestParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterOp_ptr_assign(TestParser.Op_ptr_assignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code op_ptr_assign}
	 * labeled alternative in {@link TestParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitOp_ptr_assign(TestParser.Op_ptr_assignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code op_or}
	 * labeled alternative in {@link TestParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterOp_or(TestParser.Op_orContext ctx);
	/**
	 * Exit a parse tree produced by the {@code op_or}
	 * labeled alternative in {@link TestParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitOp_or(TestParser.Op_orContext ctx);
	/**
	 * Enter a parse tree produced by the {@code op_not}
	 * labeled alternative in {@link TestParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterOp_not(TestParser.Op_notContext ctx);
	/**
	 * Exit a parse tree produced by the {@code op_not}
	 * labeled alternative in {@link TestParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitOp_not(TestParser.Op_notContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exp_id}
	 * labeled alternative in {@link TestParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp_id(TestParser.Exp_idContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exp_id}
	 * labeled alternative in {@link TestParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp_id(TestParser.Exp_idContext ctx);
	/**
	 * Enter a parse tree produced by the {@code op_comp}
	 * labeled alternative in {@link TestParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterOp_comp(TestParser.Op_compContext ctx);
	/**
	 * Exit a parse tree produced by the {@code op_comp}
	 * labeled alternative in {@link TestParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitOp_comp(TestParser.Op_compContext ctx);
	/**
	 * Enter a parse tree produced by the {@code op_sign}
	 * labeled alternative in {@link TestParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterOp_sign(TestParser.Op_signContext ctx);
	/**
	 * Exit a parse tree produced by the {@code op_sign}
	 * labeled alternative in {@link TestParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitOp_sign(TestParser.Op_signContext ctx);
	/**
	 * Enter a parse tree produced by the {@code op_inc_dec}
	 * labeled alternative in {@link TestParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterOp_inc_dec(TestParser.Op_inc_decContext ctx);
	/**
	 * Exit a parse tree produced by the {@code op_inc_dec}
	 * labeled alternative in {@link TestParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitOp_inc_dec(TestParser.Op_inc_decContext ctx);
	/**
	 * Enter a parse tree produced by the {@code op_and}
	 * labeled alternative in {@link TestParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterOp_and(TestParser.Op_andContext ctx);
	/**
	 * Exit a parse tree produced by the {@code op_and}
	 * labeled alternative in {@link TestParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitOp_and(TestParser.Op_andContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exp_int}
	 * labeled alternative in {@link TestParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp_int(TestParser.Exp_intContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exp_int}
	 * labeled alternative in {@link TestParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp_int(TestParser.Exp_intContext ctx);
	/**
	 * Enter a parse tree produced by the {@code op_assign}
	 * labeled alternative in {@link TestParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterOp_assign(TestParser.Op_assignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code op_assign}
	 * labeled alternative in {@link TestParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitOp_assign(TestParser.Op_assignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exp_bracket}
	 * labeled alternative in {@link TestParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp_bracket(TestParser.Exp_bracketContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exp_bracket}
	 * labeled alternative in {@link TestParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp_bracket(TestParser.Exp_bracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#asm}.
	 * @param ctx the parse tree
	 */
	void enterAsm(TestParser.AsmContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#asm}.
	 * @param ctx the parse tree
	 */
	void exitAsm(TestParser.AsmContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(TestParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(TestParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#codeblock}.
	 * @param ctx the parse tree
	 */
	void enterCodeblock(TestParser.CodeblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#codeblock}.
	 * @param ctx the parse tree
	 */
	void exitCodeblock(TestParser.CodeblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#if_def}.
	 * @param ctx the parse tree
	 */
	void enterIf_def(TestParser.If_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#if_def}.
	 * @param ctx the parse tree
	 */
	void exitIf_def(TestParser.If_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#else_def}.
	 * @param ctx the parse tree
	 */
	void enterElse_def(TestParser.Else_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#else_def}.
	 * @param ctx the parse tree
	 */
	void exitElse_def(TestParser.Else_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#while_def}.
	 * @param ctx the parse tree
	 */
	void enterWhile_def(TestParser.While_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#while_def}.
	 * @param ctx the parse tree
	 */
	void exitWhile_def(TestParser.While_defContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ctrl_if}
	 * labeled alternative in {@link TestParser#control}.
	 * @param ctx the parse tree
	 */
	void enterCtrl_if(TestParser.Ctrl_ifContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ctrl_if}
	 * labeled alternative in {@link TestParser#control}.
	 * @param ctx the parse tree
	 */
	void exitCtrl_if(TestParser.Ctrl_ifContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ctrl_while}
	 * labeled alternative in {@link TestParser#control}.
	 * @param ctx the parse tree
	 */
	void enterCtrl_while(TestParser.Ctrl_whileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ctrl_while}
	 * labeled alternative in {@link TestParser#control}.
	 * @param ctx the parse tree
	 */
	void exitCtrl_while(TestParser.Ctrl_whileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ctrl_return}
	 * labeled alternative in {@link TestParser#control}.
	 * @param ctx the parse tree
	 */
	void enterCtrl_return(TestParser.Ctrl_returnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ctrl_return}
	 * labeled alternative in {@link TestParser#control}.
	 * @param ctx the parse tree
	 */
	void exitCtrl_return(TestParser.Ctrl_returnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ctrl_continue}
	 * labeled alternative in {@link TestParser#control}.
	 * @param ctx the parse tree
	 */
	void enterCtrl_continue(TestParser.Ctrl_continueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ctrl_continue}
	 * labeled alternative in {@link TestParser#control}.
	 * @param ctx the parse tree
	 */
	void exitCtrl_continue(TestParser.Ctrl_continueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(TestParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(TestParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#function_def}.
	 * @param ctx the parse tree
	 */
	void enterFunction_def(TestParser.Function_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#function_def}.
	 * @param ctx the parse tree
	 */
	void exitFunction_def(TestParser.Function_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(TestParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(TestParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(TestParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(TestParser.NumContext ctx);
}