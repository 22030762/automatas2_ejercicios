grammar Expr;

root: expr EOF ;    

expr: EOF;

CREATE : 'CREATE';
TABLE : 'TABLE';
PRIMARY : 'PRIMARY';
KEY : 'KEY';
NOT : 'NOT';
NULL : 'NULL';
INSERT : 'INSERT';
INTO : 'INTO';
VALUES : 'VALUES';
SELECT : 'SELECT';
FROM : 'FROM';
INNER : 'INNER';
JOIN : 'JOIN';
ON : 'ON';
WHERE : 'WHERE';
SERIAL : 'SERIAL';
VARCHAR : 'VARCHAR';
INTEGER : 'INTEGER';
DATE : 'DATE';
NUM : [0-9]+ ;
CADENA : '\'' ~['\r\n]* '\'' ;
ID : [a-zA-Z_][a-zA-Z0-9_]* ;
IGUAL : '=' ;
PUNTO : '.' ;
PUNTO_COMA : ';' ;
COMA : ',' ;
PAR_IZQ : '(' ;
PAR_DER : ')' ;
WS: [ \t\r\n]+ -> skip ;