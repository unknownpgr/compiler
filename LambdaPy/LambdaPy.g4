grammar Test;                   // Grammar name must be identical with file name. grammar XXXX = XXXX.g4
s   : s_ EOF;
s_  :
    exp|
    exp ';' exp
    |;                // Root

exp : 
    NUM|
    exp op exp|
    '(' exp ')';     // Expression

op  : 
    '*'|
    '+'|
    '-'|
    '/';

NUM : 
    '0'|
    [1-9][0-9]*;

WS  : 
    [ \t\r\n]+ -> skip ;      // skip spaces, tabs, newlines