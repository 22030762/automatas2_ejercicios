grammar Expr;

root: expr EOF;

expr:
	crearTabla
	| insertarDatos
	| consultaSelect
	| actualizarDatos
	| eliminarDatos
	| crearIndice
	| crearVista
	| eliminarTabla;

//TRANSACCIONES
transaccion:
    (BEGIN | START TRANSACTION) PUNTO_COMA
    (expr)*
    (COMMIT | ROLLBACK) PUNTO_COMA;
//PARA TODO EL CREATE DE TABLAS
crearTabla:
	CREATE TABLE nombreTabla PAR_IZQ listaElementosTabla PAR_DER PUNTO_COMA;
listaElementosTabla: 
    elementoTabla (COMA elementoTabla)*;
elementoTabla: 
    definirColumna | restriccionTabla;
definirColumna: 
    ID tipoDato restriccionColumna*;
restriccionColumna:
	PRIMARY KEY
	| NOT NULL
	| UNIQUE
	| DEFAULT valor
	| REFERENCES nombreTabla PAR_IZQ ID PAR_DER;
restriccionTabla:
    CONSTRAINT ID restriccionEspecifica
    | restriccionEspecifica;
restriccionEspecifica:
    PRIMARY KEY PAR_IZQ listaIds PAR_DER
    | FOREIGN KEY PAR_IZQ listaIds PAR_DER 
    REFERENCES nombreTabla PAR_IZQ listaIds PAR_DER
    | UNIQUE PAR_IZQ listaIds PAR_DER;
tipoDato:
	SERIAL
	| INTEGER
	| BIGINT
	| SMALLINT
	| NUMERIC PAR_IZQ NUM COMA NUM PAR_DER
	| NUMERIC PAR_IZQ NUM PAR_DER
	| REAL
	| BOOLEAN
	| VARCHAR PAR_IZQ NUM PAR_DER
	| CHAR PAR_IZQ NUM PAR_DER
	| TEXT
	| DATE
	| TIME
	| TIMESTAMP
	| BYTEA
	| JSON
	| JSONB
	| UUID;

//PARA EL INSERT
insertarDatos:
    INSERT INTO nombreTabla (PAR_IZQ listaIds PAR_DER)? 
    VALUES PAR_IZQ listaValores PAR_DER 
    (COMA PAR_IZQ listaValores PAR_DER)* PUNTO_COMA;
listaIds: 
    ID (COMA ID)*;
listaValores: 
    valor (COMA valor)*;
valor: 
    NUM | DECIMAL | CADENA | TRUE | FALSE | NULL;

//PARA EL SELECT
consultaSelect:
	SELECT listaSeleccion FROM origen condicionWhere? agrupamiento? ordenamiento? limite? PUNTO_COMA;
listaSeleccion: 
    ASTERISCO | itemSeleccion (COMA itemSeleccion)*;
itemSeleccion:
	ID PUNTO ID	| ID | ID PUNTO ASTERISCO ;
origen : 
    nombreTabla alias?
    | origen INNER JOIN nombreTabla alias? ON condicion
    | origen LEFT  JOIN nombreTabla alias? ON condicion
    | origen RIGHT JOIN nombreTabla alias? ON condicion;
alias : 
    AS ID | ID;
condicionWhere : 
    WHERE condicion;
agrupamiento :
    GROUP BY listaIds (HAVING condicion)?;
condicion : 
    expresion operadorComparacion expresion
    | condicion AND condicion
    | condicion OR  condicion
    | NOT condicion
    | expresion IS NULL
    | expresion IS NOT NULL
    | expresion BETWEEN expresion AND expresion
    | expresion LIKE CADENA
    | expresion IN PAR_IZQ listaValores PAR_DER
    | PAR_IZQ condicion PAR_DER;
expresion : 
    PAR_IZQ expresion PAR_DER
    | ID PUNTO ID | ID | NUM | DECIMAL | CADENA | TRUE | FALSE | NULL
    | expresion ASTERISCO expresion
    | expresion DIV expresion
    | expresion MAS expresion
    | expresion MENOS expresion;
operadorComparacion : 
    IGUAL | DIFERENTE | MENOR | MAYOR | MENOR_IGUAL | MAYOR_IGUAL;
ordenamiento : 
    ORDER BY itemOrden (COMA itemOrden)*;
itemOrden : 
    ID (ASC | DESC)? | ID PUNTO ID (ASC | DESC)?;
limite : 
    LIMIT NUM | LIMIT NUM OFFSET NUM;

//PARA EL UPDATE
actualizarDatos : 
    UPDATE nombreTabla SET listaAsignaciones condicionWhere? PUNTO_COMA;
listaAsignaciones : 
    asignacion (COMA asignacion)*;
asignacion : 
    ID IGUAL expresion;

//PARA EL DELETE
eliminarDatos : 
    DELETE FROM nombreTabla condicionWhere? PUNTO_COMA;

//CREACION DE INDICES
crearIndice : 
    CREATE UNIQUE? INDEX ID ON nombreTabla PAR_IZQ listaIds PAR_DER PUNTO_COMA;

//CREACION DE VISTAS
crearVista : 
    CREATE VIEW ID AS consultaSelect;

//DROPEAR TABLA
eliminarTabla : 
    DROP TABLE nombreTabla PUNTO_COMA;

//NOMBRES DE TABLA
nombreTabla : 
    ID (PUNTO ID)?;

//TRIGGERS
crearProcedimiento:
    CREATE (OR REPLACE)? PROCEDURE ID PAR_IZQ PAR_DER 
    LANGUAGE ID AS CADENA PUNTO_COMA;

crearTrigger:
    CREATE TRIGGER ID (BEFORE | AFTER) (INSERT | UPDATE | DELETE) ON nombreTabla
    FOR EACH ROW EXECUTE FUNCTION ID PAR_IZQ PAR_DER PUNTO_COMA;

//PALABRAS CLAVE
CREATE: [C|c] [Rr] [Ee] [Aa] [Tt] [Ee];
TABLE: [T|t] [A|a] [Bb] [Ll] [Ee];
DROP: [D|d] [Rr] [Oo] [Pp];
INSERT: [I|i] [N|n] [S|s] [Ee] [Rr] [Tt];
INTO: [I|i] [N|n] [Tt] [Oo];
VALUES: [V|v] [A|a] [Ll] [Uu] [Ee] [Ss];
SELECT: [S|s] [Ee] [Ll] [Ee] [Cc] [Tt];
FROM: [F|f] [Rr] [Oo] [Mm];
WHERE: [W|w] [Hh] [Ee] [Rr] [Ee];
UPDATE: [U|u] [Pp] [Dd] [Aa] [Tt] [Ee];
SET: [S|s] [Ee] [Tt];
DELETE: [D|d] [Ee] [Ll] [Ee] [Tt] [Ee];
PRIMARY: [P|p] [Rr] [Ii] [Mm] [Aa] [Rr] [Yy];
KEY: [K|k] [Ee] [Yy];
FOREIGN: [F|f] [Oo] [Rr] [Ee] [Ii] [Gg] [Nn];
REFERENCES: [R|r] [Ee] [Ff] [Ee] [Rr] [Ee] [Nn] [Cc] [Ee] [Ss];
CONSTRAINT : [C|c] [Oo] [Nn] [Ss] [Tt] [Rr] [Aa] [Ii] [Nn] [Tt];
NOT: [N|n] [Oo] [Tt];
NULL: [N|n] [Uu] [Ll] [Ll];
UNIQUE: [U|u] [Nn] [Ii] [Qq] [Uu] [Ee];
DEFAULT: [D|d] [Ee] [Ff] [Aa] [Uu] [Ll] [Tt];
INNER: [I|i] [Nn] [Nn] [Ee] [Rr];
LEFT: [L|l] [Ee] [Ff] [Tt];
RIGHT: [R|r] [Ii] [Gg] [Hh] [Tt];
JOIN: [J|j] [Oo] [Ii] [Nn];
ON: [O|o] [Nn];
AS: [A|a] [Ss];
ORDER: [O|o] [Rr] [Dd] [Ee] [Rr];
BY: [B|b] [Yy];
ASC: [A|a] [Ss] [Cc];
DESC: [D|d] [Ee] [Ss] [Cc];
LIMIT: [L|l] [Ii] [Mm] [Ii] [Tt];
OFFSET: [O|o] [Ff] [Ff] [Ss] [Ee] [Tt];
AND: [A|a] [Nn] [Dd];
OR: [O|o] [Rr];
IS: [I|i] [Ss];
IN: [I|i] [Nn];
BETWEEN: [B|b] [Ee] [Tt] [Ww] [Ee] [Ee] [Nn];
LIKE: [L|l] [Ii] [Kk] [Ee];
TRUE: [T|t] [Rr] [Uu] [Ee];
FALSE: [F|f] [Aa] [Ll] [Ss] [Ee];
INDEX: [I|i] [Nn] [Dd] [Ee] [Xx];
VIEW: [V|v] [Ii] [Ee] [Ww];
GROUP: [G|g] [Rr] [Oo] [Uu] [Pp];
HAVING : [H|h] [Aa] [Vv] [Ii] [Nn] [Gg];

//TRANSACCIONES
BEGIN : [B|b] [Ee] [Gg] [Ii] [Nn];
START: [S|s] [Tt] [Aa] [Rr] [Tt];
TRANSACTION: [T|t] [Rr] [Aa] [Nn] [Ss] [Aa] [Cc] [Tt] [Ii] [Oo] [Nn];
COMMIT: [C|c] [Oo] [Mm] [Mm] [Ii] [Tt];
ROLLBACK: [R|r] [Oo] [Ll] [Ll] [Bb] [Aa] [Cc] [Kk];
PROCEDURE: [P|p] [Rr] [Oo] [Cc] [Ee] [Dd] [Uu] [Rr] [Ee];
REPLACE: [R|r] [Ee] [Pp] [Ll] [Aa] [Cc] [Ee];
LANGUAGE: [L|l] [Aa] [Nn] [Gg] [Uu] [Aa] [Gg] [Ee];
TRIGGER: [T|t] [Rr] [Ii] [Gg] [Gg] [Ee] [Rr];
BEFORE: [B|b] [Ee] [Ff] [Oo] [Rr] [Ee];
AFTER: [A|a] [Ff] [Tt] [Ee] [Rr];
ROW : [R|r] [Oo] [Ww];
EXECUTE: [E|e] [Xx] [Ee] [Cc] [Uu] [Tt] [Ee];
FUNCTION: [F|f] [Uu] [Nn] [Cc] [Tt] [Ii] [Oo] [Nn];
FOR : [F|f] [Oo] [Rr];
EACH : [E|e] [Aa] [Cc] [Hh];

//TIPOS DE DATO
SERIAL: [S|s] [Ee] [Rr] [Ii] [Aa] [Ll];
INTEGER: [I|i] [Nn] [Tt] [Ee] [Gg] [Ee] [Rr];
BIGINT: [B|b] [Ii] [Gg] [Ii] [Nn] [Tt];
SMALLINT: [S|s] [Mm] [Aa] [Ll] [Ll] [Ii] [Nn] [Tt];
NUMERIC: [N|n] [Uu] [Mm] [Ee] [Rr] [Ii] [Cc];
REAL: [R|r] [Ee] [Aa] [Ll];
BOOLEAN: [B|b] [Oo] [Oo] [Ll] [Ee] [Aa] [Nn];
VARCHAR: [V|v] [Aa] [Rr] [Cc] [Hh] [Aa] [Rr];
CHAR: [C|c] [Hh] [Aa] [Rr];
TEXT: [T|t] [Ee] [Xx] [Tt];
DATE: [D|d] [Aa] [Tt] [Ee];
TIME: [T|t] [Ii] [Mm] [Ee];
TIMESTAMP: [T|t] [Ii] [Mm] [Ee] [Ss] [Tt] [Aa] [Mm] [Pp];
BYTEA: [B|b] [Yy] [Tt] [Ee] [Aa];
JSON : [J|j] [Ss] [Oo] [Nn];
JSONB : [J|j] [Ss] [Oo] [Nn] [Bb];
UUID: [U|u] [Uu] [Ii] [Dd];

//OPERADORES
IGUAL: '=';
DIFERENTE: '<>';
MENOR: '<';
MAYOR: '>';
MENOR_IGUAL: '<=';
MAYOR_IGUAL: '>=';
MAS: '+';
MENOS: '-';
DIV: '/';
ASTERISCO: '*';
PUNTO: '.';
PUNTO_COMA: ';';
COMA: ',';
PAR_IZQ: '(';
PAR_DER: ')';

//OTROS
DECIMAL: [0-9]+ '.' [0-9]*;
NUM: [0-9]+;
CADENA: '\'' ( ~['\r\n] | '\'\'')* '\'';
ID: [a-zA-Z_] [a-zA-Z0-9_]*;
COMENTARIO: '--' ~[\r\n]* -> skip;
COMENTARIO_BLOQUE: '/*' .*? '*/' -> skip;
WS: [ \t\r\n]+ -> skip;