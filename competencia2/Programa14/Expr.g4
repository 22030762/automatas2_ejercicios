grammar Expr;

root: expr EOF ;    

expr: EOF;

UPDATE : 'UPDATE';
SET : 'SET';
WHERE : 'WHERE';
NUM : [0-9]+ ;
CADENA : '\'' ~['\r\n]* '\'' ;
ID : [a-zA-Z_][a-zA-Z0-9_]* ;
IGUAL : '=' ;
PUNTO_COMA : ';' ;
COMA : ',' ;
WS : [ \t\r\n]+ -> skip ;