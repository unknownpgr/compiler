grammar Test;

@header {package target.generated;}

s: ( function_def | codeblock)* EOF;

// Assignalbes

var_def: 'var' id ( '=' exp)?;

// Exp is a excution unit that returns a value.

exp:
	num																	# exp_int
	| id																# exp_id
	| '(' exp ')'														# exp_bracket
	| '!' exp															# op_not
	| '*' lhs = exp '=' rhs = exp										# op_ptr_assign
	| '*' exp															# op_pointer
	| exp op = ( '++' | '--')											# op_inc_dec
	| op = ( '+' | '-') exp												# op_sign
	| exp '&' exp														# op_and
	| exp '|' exp														# op_or
	| lhs = exp op = ( '+' | '-') rhs = exp								# op_add_sub
	| lhs = exp op = ('>' | '<' | '>=' | '<=' | '==' | '!=') rhs = exp	# op_comp
	| lhs = id '=' rhs = exp											# op_assign
	| id '(' ( exp ( ',' exp)*)? ')'									# op_function_call;

code: var_def | exp;

codeblock: control | code? ';' | '{' codeblock* '}';

if_def: 'if' '(' exp ')';

else_def: 'else' codeblock;

while_def: 'while' '(' exp ')';

control:
	if_def codeblock else_def?	# ctrl_if
	| while_def codeblock		# ctrl_while
	| 'return' exp?				# ctrl_return
	| 'continue'				# ctrl_continue;

params: ( id ( ',' id)*);

function_def: 'function' id '(' params? ')' codeblock;

id: ID;

num: INT;

// Lex

ID: ( '_' | [a-z] | [A-Z]) ( '_' | [a-z] | [A-Z] | [0-9])*;

INT: '0' | [1-9] [0-9]*;

// Skip rules

WS: [ \t\r\n]+ -> skip;

COMMENT_LINE: '//' ~[\r\n]* -> skip;

COMMENT_BLOCK: '/*' .*? '*/' -> skip;

