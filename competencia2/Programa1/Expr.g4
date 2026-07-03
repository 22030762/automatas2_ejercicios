grammar Expr;

root : expr EOF;

expr : EOF;

NUM : [0-9]+;
SUMA : '+';
WS : [ \t\r\n]+ -> skip;