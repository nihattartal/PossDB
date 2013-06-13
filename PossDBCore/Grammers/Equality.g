grammar Equality;


@header {
package org.parser;

import java.util.List;
import org.parser.QueryList;

}

@lexer::header {
package org.parser;
}

parseEquality returns[Equality equality]
	:	
 ((schema1 DOT)? table1 EQUAL (schema2 DOT)? table2) {
     Equality e = new Equality();
     e.schema1 = $schema1.text;
     e.schema2 = $schema2.text;
     e.table1 =  $table1.text;
     e.table2 =  $table2.text;
     $equality = e;
 } ;

schema1 : ID;
schema2 : ID;
table1	: ID;
table2	: ID;  

fragment DIGIT :   '0'..'9' ;
DOT	:	'.';
ID       : (('a'..'z'|'A'..'Z' | '_') ((DIGIT)*))+ ;
NEWLINE  :'\r'? '\n' { $channel = HIDDEN; } ;
WS       : ( '\t' | ' ' | '\r' | '\n' | '\u000C' )+ 	{ $channel = HIDDEN;} ;
EQUAL       : '=';