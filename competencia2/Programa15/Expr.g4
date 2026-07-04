grammar Expr;

root: expr EOF ;    

expr: EOF;

NMAP : 'nmap' ;
SS : 'ss' ;
SUDO: 'sudo' ;
TCPDUMP : 'tcpdump' ;
CURL : 'curl' ;
DIG : 'dig' ;
JOURNALCTL : 'journalctl' ;
GREP : 'grep' ;
UFW : 'ufw' ;
DENY : 'deny' ;
FROM : 'from' ;
FLAG : '-' [a-zA-Z]+ | '--' [a-zA-Z]+ ;
IP : [0-9]+ '.' [0-9]+ '.' [0-9]+ '.' [0-9]+ ('/' [0-9]+)? ;
RUTA_ARCHIVO : '/' [a-zA-Z0-9_]+ ('/' [a-zA-Z0-9_.]+)+ ;
NUM     : [0-9]+ ;
CADENA  : '"' ~["\r\n]* '"' ;
ID : [a-zA-Z0-9_][a-zA-Z0-9_.-]* ;
WS : [ \t\r\n]+ -> skip ;