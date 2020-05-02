grammar Test;

s: code* EOF;

code:
	'(' code ')'																# skip
	| '{' code* '}'																# skip
	| code ';'																	# skip
	| type_ id_																	# variable_definition
	| type__ = type_ '(' ( | (param = id_ (',' param = id_)*)?) ')' body = code	# function_definition
	| (type_int | type_float)													# number
	| id_																		# id
	| func = code '(' ( | (param = code (',' param = code)*)?) ')'				# function_call
	| operator = OP_UNI_1 operand = code										# unary_operation
	| operand = code operator = OP_BIN_1 operand = code							# binary_operation
	| operand = code operator = OP_BIN_2 operand = code							# binary_operation
	| operand = code operator = OP_BIN_3 operand = code							# binary_operation
	| operator = OP_UNI_3 operand = code										# unary_operation
	| lhs = code '=' rhs = code													# assign;

type_: 'int' | 'float';

id_: ID;

type_int: INT;

type_float: FLOAT;

OP_UNI_1: '!' | '~';

OP_BIN_1: '^' | '*' | '/' | '%' | '&';

OP_BIN_2: '+' | '-' | '|';

OP_BIN_3: '=';

OP_UNI_3: '+' | '-';

ID: ('_' | [a-z] | [A-Z]) ( '_' | [a-z] | [A-Z] | [0-9])*;

INT: [1-9][0-9]*;

FLOAT: INT [.]| INT [.]INT | [.]INT;

WS: [ \t\r\n]+ -> skip; // skip spaces, tabs, newlines

COMMENT_LINE: '//' ~[\r\n]* -> skip;

COMMENT_BLOCK: '/*' .*? '*/' -> skip;
