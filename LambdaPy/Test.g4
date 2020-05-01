grammar Test;

s: codeblock* EOF;

codeblock:
	def_var							# variable_definition
	| def_func						# function_definition
	| num							# number
	| id_							# id
	| codeblock '(' func_param ')'	# function_call
	| op_uni_1 codeblock			# unary_operation
	| codeblock op_bin_1 codeblock	# binary_operation
	| codeblock op_bin_2 codeblock	# binary_operation
	| '(' codeblock ')'				# skip
	| '{' codeblock* '}'			# skip
	| codeblock ';'					# skip
	| codeblock '=' codeblock		# assign;

def_var: type_ id_;

def_func: type_ '(' func_param ')' codeblock;

func_param: | (id_ (',' id_)*)?;

type_: ('int8' | 'int16' | 'int32' | 'int64' | 'float');

id_: ID;

op_uni_1: '!' | '~';

op_bin_1: '^' | '*' | '/' | '%' | '&';

op_bin_2: '+' | '-' | '|';

num: int_ | float_;

int_: INT;

float_: FLOAT;

ID: ('_' | [a-z] | [A-Z]) ( '_' | [a-z] | [A-Z] | [0-9])*;

INT: [1-9][0-9]*;

FLOAT: INT [.]| INT [.]INT | [.]INT;

WS: [ \t\r\n]+ -> skip; // skip spaces, tabs, newlines