grammar Expr;

root: expr EOF ;    

expr: EOF ;

PUBLIC : 'public' ;
CLASS : 'class' ;
STATIC : 'static' ;
VOID : 'void' ;
INT : 'int' ;
STRING : 'String' ;
NUM : [0-9]+ ;
CADENA : '"' ~["\r\n]* '"' ;
ID : [a-zA-Z_][a-zA-Z0-9_]* ;
IGUAL : '=' ;
MAS : '+' ;
PUNTO : '.' ;
PUNTO_COMA : ';' ;
PAR_IZQ : '(' ;
PAR_DER : ')' ;
LLAVE_IZQ : '{' ;
LLAVE_DER : '}' ;
COR_IZQ : '[' ;
COR_DER : ']' ;

WS : [ \t\r\n]+ -> skip ;