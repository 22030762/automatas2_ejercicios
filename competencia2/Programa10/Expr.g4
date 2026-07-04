grammar Expr;

root: expr EOF;

expr: EOF;

PRINT: 'print';
PARENTESISIZQ: '(';
PARENTESISDER: ')';
CADENA: '"'~["\r\n]*'"';
PYC: ';';

WS : [ \t\r\n]+ -> skip ;