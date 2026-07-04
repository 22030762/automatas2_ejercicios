grammar Expr;

root: expr EOF;

expr: EOF;

ID: [a-zA-Z]+;
MAYORIGUAL: '>=';
NUM: [0-9]+;

WS : [ \t\r\n]+ -> skip ;