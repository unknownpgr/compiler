grammar Test;                   // Grammar name must be identical with file name. grammar XXXX = XXXX.g4
s   : exp|exp s|;               // Root
exp : NUM op exp|'(' exp ')'|exp ';' exp;               // Expression
op  : '+'|'-'|'*'|'/';
NUM : '0'|[1-9]|[1-9] [0-9]+;
WS  : [ \t\r\n]+ -> skip ;      // skip spaces, tabs, newlines