package main;

import java.util.HashMap;
import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import target.generated.TestListener;
import target.generated.TestParser.AsmContext;
import target.generated.TestParser.CodeContext;
import target.generated.TestParser.CodeblockContext;
import target.generated.TestParser.Ctrl_continueContext;
import target.generated.TestParser.Ctrl_ifContext;
import target.generated.TestParser.Ctrl_returnContext;
import target.generated.TestParser.Ctrl_whileContext;
import target.generated.TestParser.Else_defContext;
import target.generated.TestParser.Exp_bracketContext;
import target.generated.TestParser.Exp_idContext;
import target.generated.TestParser.Exp_intContext;
import target.generated.TestParser.Function_defContext;
import target.generated.TestParser.IdContext;
import target.generated.TestParser.If_defContext;
import target.generated.TestParser.NumContext;
import target.generated.TestParser.Op_add_subContext;
import target.generated.TestParser.Op_andContext;
import target.generated.TestParser.Op_assignContext;
import target.generated.TestParser.Op_compContext;
import target.generated.TestParser.Op_function_callContext;
import target.generated.TestParser.Op_inc_decContext;
import target.generated.TestParser.Op_notContext;
import target.generated.TestParser.Op_orContext;
import target.generated.TestParser.Op_pointerContext;
import target.generated.TestParser.Op_ptr_assignContext;
import target.generated.TestParser.Op_signContext;
import target.generated.TestParser.ParamsContext;
import target.generated.TestParser.SContext;
import target.generated.TestParser.Var_defContext;
import target.generated.TestParser.While_defContext;

public class HackListener implements TestListener {

	final static int REG_RET = 16;
	final static int VAR_POS = 17;

	String code = "";

	private Stack<String> expStack = new Stack<String>();
	private Stack<String> ifCtrStack = new Stack<String>();
	private Stack<String> whileCtrStack = new Stack<String>();
	private HashMap<String, Integer> vars = new HashMap<String, Integer>();
	private HashMap<String, Func> func = new HashMap<String, Func>();
	private Func current = null;

	// Generate unique label for JMP command.
	Counter cC = new Counter("c");
	Counter vC = new Counter("v");

	class Func {
		String name; // Name of function
		String label; // Goto label of function

		private String localCode = "";

		public Func(String name) {
			current = this;
			log("Function " + name);
			this.name = name;
			this.label = cC.get();
			w("(" + label + ")");
			func.put(name, this);
		}

		public void call() throws Exception {
			String ret = cC.get();
			w("@" + ret);
			w("D=A");
			w("@" + REG_RET);
			w("M=D");
			w("@" + label);
			w("0;JMP");
			w("(" + ret + ")");
		}

		public void exitFunction() {
			log("Return");
			w("@" + REG_RET);
			w("A=M");
			w("0;JMP");
		}

		public String getCode() {
			return localCode;
		}
	}

	public String getGeneratedCode() {
		String output = this.code;
		for (String functionName : func.keySet()) {
			output += "\n//===========================================\n" + func.get(functionName).getCode() + "\n";
		}
		return output;
	}

	// =======================[ Wrapper functions ]=======================

	private void ref(String name) {
		int position = vars.get(name);
		w("@" + position);
	}

	public void w(String s) {
		if (current != null)
			current.localCode += s + "\n";
		else
			code += s + "\n";
	}

	public void log(String s) {
		if (current != null)
			current.localCode += "//" + s + "\n";
		else
			code += "//" + s + "\n";
	}

	private String v(String name) {
		int position = VAR_POS + vars.size();
		if (name == null) {
			name = vC.get();
		}
		vars.put(name, position);
		return name;
	}

	private String v() {
		return v(null);
	}

	private void err(Exception e, ParserRuleContext context) {
		String msg = e.getMessage() + " at " + context.start.getLine() + ":" + context.start.getCharPositionInLine();
		System.err.println(msg);
		log("\t[ Error ] : " + msg);
		e.printStackTrace();
	}

	// =======================[ Listener Body ]=======================

	public HackListener() throws Exception {
	}

	@Override
	public void enterEveryRule(ParserRuleContext arg0) {
	}

	@Override
	public void exitEveryRule(ParserRuleContext arg0) {
	}

	@Override
	public void visitErrorNode(ErrorNode arg0) {
	}

	@Override
	public void visitTerminal(TerminalNode arg0) {
	}

	@Override
	public void enterS(SContext ctx) {
	}

	@Override
	public void exitS(SContext ctx) {
		log("Exit every process");
		w("@2");
		w("D=A");
		w("(FIN)");
		w("@FIN");
		w("A=A+D");
		w("0;JMP");
	}

	@Override
	public void enterVar_def(Var_defContext ctx) {
	}

	@Override
	public void exitVar_def(Var_defContext ctx) {
		try {
			String name = ctx.id().getText();
			v(name);
			if (ctx.exp() != null) {
				ref(expStack.pop());
				w("D=M");
				ref(name);
				w("M=D");
			}
		} catch (Exception e) {
			err(e, ctx);
		}
	}

	@Override
	public void enterOp_add_sub(Op_add_subContext ctx) {
	}

	@Override
	public void exitOp_add_sub(Op_add_subContext ctx) {
		try {
			// 왼쪽부터 순회하기 때문에, 스택에는 오른쪽이 먼저 들어가있다.
			log("Add");
			String ret = v();
			String rhs = expStack.pop();
			String lhs = expStack.pop();

			ref(lhs);
			w("D=M");

			ref(rhs);
			w("D=D" + ctx.op.getText() + "M");

			ref(ret);
			w("M=D");

			expStack.push(ret);
		} catch (Exception e) {
			err(e, ctx);
		}
	}

	@Override
	public void enterOp_sign(Op_signContext ctx) {
	}

	@Override
	public void exitOp_sign(Op_signContext ctx) {
		try {
			if (ctx.op.getText().equals("+"))
				return;
			log("Sign");
			// 여기서 메모리를 단순히 뒤집어서는 안 된다. 왜냐하면 (-x)+(-x)같은 구문이 있을 수 있기 때문이다.
			String ret = v();
			ref(expStack.pop());
			w("D=M");
			ref(ret);
			w("M=-D");
			expStack.push(ret);
		} catch (Exception e) {
			err(e, ctx);
		}
	}

	@Override
	public void enterExp_int(Exp_intContext ctx) {
	}

	@Override
	public void exitExp_int(Exp_intContext ctx) {
		try {
			log("Int");
			String ret = v();

			int value = Integer.parseInt(ctx.getText());
			if (value > 32767) { // 32767 = 2^15-1
				w("@" + (65536 - value));
				w("D=-A");
			} else {
				w("@" + value);
				w("D=A");
			}
			ref(ret);
			w("M=D");
			expStack.push(ret);
		} catch (Exception e) {
			err(e, ctx);
		}
	}

	@Override
	public void enterOp_function_call(Op_function_callContext ctx) {
	}

	@Override
	public void exitOp_function_call(Op_function_callContext ctx) {
		try {
			// Get function
			Func function = func.get(ctx.id().getText());
			function.call();
		} catch (Exception e) {
			err(e, ctx);
		}
	}

	@Override
	public void enterOp_assign(Op_assignContext ctx) {
	}

	@Override
	public void exitOp_assign(Op_assignContext ctx) {
		try {
			log("Assign");
			String name = ctx.id().getText();

			ref(expStack.pop());
			w("D=M");

			ref(name);
			w("M=D");
		} catch (Exception e) {
			err(e, ctx);
		}
	}

	@Override
	public void enterExp_bracket(Exp_bracketContext ctx) {
	}

	@Override
	public void exitExp_bracket(Exp_bracketContext ctx) {
	}

	@Override
	public void enterCode(CodeContext ctx) {
		log("\t\t" + ctx.getText());
		if (!expStack.isEmpty()) {
			System.err.println("Exp stack is not empty before start code " + ctx.getText());
			while (!expStack.isEmpty()) {
				System.err.println("    " + expStack.pop());
			}
		}
	}

	@Override
	public void exitCode(CodeContext ctx) {
		expStack.clear();
//		vC.clear();
	}

	@Override
	public void enterCodeblock(CodeblockContext ctx) {
	}

	@Override
	public void exitCodeblock(CodeblockContext ctx) {
	}

	// =======================[ IF-ELSE ]=======================

	@Override
	public void enterCtrl_if(Ctrl_ifContext ctx) {
	}

	@Override
	public void enterIf_def(If_defContext ctx) {
	}

	@Override
	public void exitIf_def(If_defContext ctx) {
		try {
			log("If");

			// if 구문의 끝으로 점프한다.
			String endIf = cC.get();

			// 점프하는 곳에서 쓸 수 있도록 stack에 push한다.
			ifCtrStack.push(endIf);

			ref(expStack.pop());
			w("D=M"); // D is jump condition
			w("@" + endIf); // A is place to jump if false.
			w("D;JEQ"); // If D is false, then jump.
			// If D is true, then just carry on.
		} catch (Exception e) {
			err(e, ctx);
		}
	}

	@Override
	public void enterElse_def(Else_defContext ctx) {
		// 이 부분까지 코드가 진행됐다는 것은, else가 존재한다는 의미이다.
		// 그러므로 만약 if가 거짓이라면, 여기로 점프해야만 한다.
		// 만약 코드가 참이라서 if가 실행되었다면, else 구문의 끝으로 점프해야 한다.
		String endIf = ifCtrStack.pop();
		String exitElse = cC.get();
		// 점프하는 곳에서 쓸 수 있도록 stack에 push한다.
		ifCtrStack.push(exitElse);

		// else가 끝나는 곳으로 점프하도록 한다.
		w("@" + exitElse);
		w("0;JMP");

		// 만약 if가 거짓이었을 경우, 위 점프 구문을 skip하고 바로 여기로 넘어오므로, else 구문이 실행된다.
		w("(" + endIf + ")");

		// 이때, ctrStack에는 exitElse만이 남는다.
	}

	@Override
	public void exitElse_def(Else_defContext ctx) {
		// 어차피 exitCtrl_if와 같으므로, 생략한다.
	}

	@Override
	public void exitCtrl_if(Ctrl_ifContext ctx) {
		// 만약 else 구문이 없을 경우, ctrStack에는 endIf가 들어있고, 있을 경우 exitElse가 들어있다.
		// 그런데 else 구문이 없을 경우, endIf==exitElse이므로 정상적으로 기능한다.
		w("(" + ifCtrStack.pop() + ")");
	}

	// =======================[ While ]=======================

	@Override
	public void enterCtrl_while(Ctrl_whileContext ctx) {
	}

	@Override
	public void enterWhile_def(While_defContext ctx) {
		log("Prepare while");
		String startLabel = cC.get();
		whileCtrStack.push(startLabel);
		w("(" + startLabel + ")");
	}

	@Override
	public void exitWhile_def(While_defContext ctx) {
		try {
			String exitLabel = cC.get();
			log("While condition");
			ref(expStack.pop());
			w("D=M"); // D is jump condition
			w("@" + exitLabel); // A is place to jump if false.
			w("D;JEQ");
			whileCtrStack.push(exitLabel);
		} catch (Exception e) {
			err(e, ctx);
		}
	}

	@Override
	public void enterCtrl_continue(Ctrl_continueContext ctx) {
	}

	@Override
	public void exitCtrl_continue(Ctrl_continueContext ctx) {
		// Get exit label
		String exitLabel = whileCtrStack.get(whileCtrStack.size() - 2);

		// Go to exit
		w("@" + exitLabel);
		w("0;JMP");
	}

	@Override
	public void exitCtrl_while(Ctrl_whileContext ctx) {
		String exitLabel = whileCtrStack.pop();
		String startLabel = whileCtrStack.pop();

		log("Go back to start");
		w("@" + startLabel);
		w("0;JMP");
		log("Exit while loop");
		w("(" + exitLabel + ")");
	}

	@Override
	public void enterCtrl_return(Ctrl_returnContext ctx) {
		try {
			if (expStack.size() > 0) {
				while (!expStack.isEmpty()) {
					System.err.println("    " + expStack.pop());
				}
				throw new Exception("Expression stack is not empty before return.");
			}
		} catch (Exception e) {
			err(e, ctx);
		}
	}

	@Override
	public void exitCtrl_return(Ctrl_returnContext ctx) {
		current.exitFunction();
	}

	@Override
	public void enterParams(ParamsContext ctx) {
		// TODO Auto-generated method stub
	}

	@Override
	public void exitParams(ParamsContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterFunction_def(Function_defContext ctx) {
		new Func(ctx.id().getText());
	}

	@Override
	public void exitFunction_def(Function_defContext ctx) {
		current.exitFunction();
		current = null;
	}

	@Override
	public void enterId(IdContext ctx) {
	}

	@Override
	public void exitId(IdContext ctx) {
	}

	@Override
	public void enterNum(NumContext ctx) {
	}

	@Override
	public void exitNum(NumContext ctx) {
	}

	@Override
	public void enterOp_inc_dec(Op_inc_decContext ctx) {
	}

	@Override
	public void exitOp_inc_dec(Op_inc_decContext ctx) {
		try {
			boolean inc = ctx.op.getText().equals("++");
			if (inc)
				log("Inc");
			else
				log("Dec");
			String ret = expStack.pop();
			ref(ret);
			if (inc)
				w("M=M+1");
			else
				w("M=M-1");
			expStack.push(ret);
		} catch (Exception e) {
			err(e, ctx);
		}
	}

	@Override
	public void enterOp_not(Op_notContext ctx) {
	}

	@Override
	public void exitOp_not(Op_notContext ctx) {
		try {
			log("Not");
			String ret = v();
			ref(expStack.pop());
			w("D=M");
			ref(ret);
			w("D=!M");
			expStack.push(ret);
		} catch (Exception e) {
			err(e, ctx);
		}
	}

	@Override
	public void enterExp_id(Exp_idContext ctx) {
	}

	@Override
	public void exitExp_id(Exp_idContext ctx) {
		try {
			String name = ctx.id().getText();
			if (!vars.containsKey(name))
				throw new Exception("Undefined variable " + name + " used.");
			expStack.push(name);
		} catch (Exception e) {
			err(e, ctx);
		}
	}

	@Override
	public void enterOp_pointer(Op_pointerContext ctx) {
	}

	@Override
	public void exitOp_pointer(Op_pointerContext ctx) {
		try {
			log("Pointer");
			String operand = expStack.pop(); // operand is a pointer variable name.
			String ret = v();
			ref(operand); // Set A to the location of the pointer variable
			w("A=M"); // Set A to the location to get the value
			w("D=M"); // Copy value to D
			ref(ret); // Set A to result
			w("M=D"); // Copy D to result
			expStack.push(ret);
		} catch (Exception e) {
			err(e, ctx);
		}
	}

	@Override
	public void enterOp_ptr_assign(Op_ptr_assignContext ctx) {
	}

	@Override
	public void exitOp_ptr_assign(Op_ptr_assignContext ctx) {
		try {
			log("Pointer assign");
			String var = expStack.pop();
			String dst = expStack.pop();
			ref(var);
			w("D=M"); // Result to assign
			ref(dst);
			w("A=M"); // Copy address to register
			w("M=D"); // Assign to the register
		} catch (Exception e) {
			err(e, ctx);
		}
	}

	@Override
	public void enterOp_or(Op_orContext ctx) {
	}

	@Override
	public void exitOp_or(Op_orContext ctx) {
		String rhs = expStack.pop();
		String lhs = expStack.pop();
		String ret = v();

		ref(rhs);
		w("D=M");
		ref(lhs);
		w("D=D|M");
		ref(ret);
		w("M=D");
		expStack.push(ret);
	}

	@Override
	public void enterOp_comp(Op_compContext ctx) {
	}

	@Override
	public void exitOp_comp(Op_compContext ctx) {
		String rhs = expStack.pop();
		String lhs = expStack.pop();
		String ret = v();
		String end = cC.get();

		log("Compare");

		// Set ret to 1
		ref(ret);
		w("  M=1");

		ref(lhs);
		w("  D=M");
		ref(rhs);
		w("  D=D-M");
		// D = lhs-rhs

		// If true, jump to end. else, do nothing.
		w(" @" + end);
		switch (ctx.op.getText()) {
		case ">":
			w("  D;JGT");
			break;
		case "<":
			w("  D;JLT");
			break;
		case ">=":
			w("  D;JGE");
			break;
		case "<=":
			w("  D;JLE");
			break;
		case "==":
			w("  D;JEQ");
			break;
		case "!=":
			w("  D;JNE");
			break;
		default:
			System.err.println("Unregistered operation");
			break;
		}

		// Set ret to 0.
		ref(ret);
		w("  M=0");
		w("  (" + end + ")");
		expStack.push(ret);
	}

	@Override
	public void enterOp_and(Op_andContext ctx) {
	}

	@Override
	public void exitOp_and(Op_andContext ctx) {
		String rhs = expStack.pop();
		String lhs = expStack.pop();
		String ret = v();

		ref(rhs);
		w("D=M");
		ref(lhs);
		w("D=D&M");
		ref(ret);
		w("M=D");
		
		expStack.push(ret);
	}

	@Override
	public void enterAsm(AsmContext ctx) {
	}

	@Override
	public void exitAsm(AsmContext ctx) {
		// Assembly block
		String asm = ctx.getText().replaceAll("asm", "").replaceAll("{", "").replaceAll("}", "");
		w(asm);
	}
}

/**
 * Produce a string that never duplicates
 * 
 * @author unkno
 *
 */
class Counter {
	private String prefix = "";
	private int counter = 0;

	Counter(String prefix) {
		this.prefix = prefix;
	}

	public String get() {
		return prefix + counter++;
	}

	public void clear() {
		counter = 0;
	}
}
