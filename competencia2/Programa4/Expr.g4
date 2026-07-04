grammar Expr;

root : expr EOF;

expr : EOF;

IF : 'if';
NUM : [0-9]+;
MAYOR_QUE : '>';
ID : [a-zA-Z]+;
WS : [ \t\r\n]+ -> skip;