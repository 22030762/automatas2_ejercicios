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
	INSERT INTO nombreTabla PAR_IZQ listaIds PAR_DER 
    VALUES PAR_IZQ listaValores PAR_DER PUNTO_COMA
	| INSERT INTO nombreTabla VALUES PAR_IZQ listaValores PAR_DER PUNTO_COMA;
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
CREATE: 'CREATE' | 'create';
TABLE: 'TABLE' | 'table';
DROP: 'DROP' | 'drop';
INSERT: 'INSERT' | 'insert';
INTO: 'INTO' | 'into';
VALUES: 'VALUES' | 'values';
SELECT: 'SELECT' | 'select';
FROM: 'FROM' | 'from';
WHERE: 'WHERE' | 'where';
UPDATE: 'UPDATE' | 'update';
SET: 'SET' | 'set';
DELETE: 'DELETE' | 'delete';
PRIMARY: 'PRIMARY' | 'primary';
KEY: 'KEY' | 'key';
FOREIGN: 'FOREIGN' | 'foreign';
REFERENCES: 'REFERENCES' | 'references';
CONSTRAINT : 'CONSTRAINT' | 'constraint';
NOT: 'NOT' | 'not';
NULL: 'NULL' | 'null';
UNIQUE: 'UNIQUE' | 'unique';
DEFAULT: 'DEFAULT' | 'default';
INNER: 'INNER' | 'inner';
LEFT: 'LEFT' | 'left';
RIGHT: 'RIGHT' | 'right';
JOIN: 'JOIN' | 'join';
ON: 'ON' | 'on';
AS: 'AS' | 'as';
ORDER: 'ORDER' | 'order';
BY: 'BY' | 'by';
ASC: 'ASC' | 'asc';
DESC: 'DESC' | 'desc';
LIMIT: 'LIMIT' | 'limit';
OFFSET: 'OFFSET' | 'offset';
AND: 'AND' | 'and';
OR: 'OR' | 'or';
IS: 'IS' | 'is';
IN: 'IN' | 'in';
BETWEEN: 'BETWEEN' | 'between';
LIKE: 'LIKE' | 'like';
TRUE: 'TRUE' | 'true';
FALSE: 'FALSE' | 'false';
INDEX: 'INDEX' | 'index';
VIEW: 'VIEW' | 'view';
GROUP: 'GROUP' | 'group';
HAVING : 'HAVING' | 'having';

//TRANSACCIONES
BEGIN : 'BEGIN' | 'begin';
START: 'START' | 'start';
TRANSACTION: 'TRANSACTION' | 'transaction';
COMMIT: 'COMMIT' | 'commit';
ROLLBACK: 'ROLLBACK' | 'rollback';
PROCEDURE: 'PROCEDURE' | 'procedure';
REPLACE: 'REPLACE' | 'replace';
LANGUAGE: 'LANGUAGE' | 'language';
TRIGGER: 'TRIGGER' | 'trigger';
BEFORE: 'BEFORE' | 'before';
AFTER: 'AFTER' | 'after';
ROW: 'ROW' | 'row';
EXECUTE: 'EXECUTE' | 'execute';
FUNCTION: 'FUNCTION' | 'function';
FOR : 'FOR' | 'for';
EACH : 'EACH' | 'each';

//TIPOS DE DATO
SERIAL: 'SERIAL' | 'serial';
INTEGER: 'INTEGER' | 'integer';
BIGINT: 'BIGINT' | 'bigint';
SMALLINT: 'SMALLINT' | 'smallint';
NUMERIC: 'NUMERIC' | 'numeric';
REAL: 'REAL' | 'real';
BOOLEAN: 'BOOLEAN' | 'boolean';
VARCHAR: 'VARCHAR' | 'varchar';
CHAR: 'CHAR' | 'char';
TEXT: 'TEXT' | 'text';
DATE: 'DATE' | 'date';
TIME: 'TIME' | 'time';
TIMESTAMP: 'TIMESTAMP' | 'timestamp';
BYTEA: 'BYTEA' | 'bytea';
JSON: 'JSON' | 'json';
JSONB: 'JSONB' | 'jsonb';
UUID: 'UUID' | 'uuid';

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