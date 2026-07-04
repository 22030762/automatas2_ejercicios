grammar Expr;

root: expr EOF;

expr: EOF;

NUM: [0-9]+;
MAS: '+';
MULTI: '*';

WS : [ \t\r\n]+ -> skip ;