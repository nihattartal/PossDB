grammar CreateTable;

@header {
package org.parser;

import java.util.List;
import org.parser.QueryList;

}

@lexer::header {
package org.parser;
}
parse 	:	
   create_table | insert_tuple | select | is_functions;

create_table
	: CREATE TABLE table_name 
		table_element_list {
		        Query.q = new CreateTable();
			Query.q.setTableName($table_name.text); 
			Query.q.columns   = (QueryList) $table_element_list.cols;
		} 
		SEMICOLON ;

insert_tuple
        : INSERT INTO table_name VALUES 
                table_element_list_with_quote {
		        Query.q = new InsertIntoTable();
			Query.q.setTableName($table_name.text); 
			Query.q.columns   = (QueryList) $table_element_list_with_quote.cols;
		} (
		     CONDITION condition {
		        ((InsertIntoTable)Query.q).condition = $condition.cond;
		     } 
		  )?
		SEMICOLON ;

condition returns [String cond]
	:	LEFT_PAREN condi=condition_text  RIGHT_PAREN {$cond = String.valueOf($condi.text); };
	
table_name 
	:	(schema DOT)? table;
	
table_element_list returns [List cols]
	: {$cols = new QueryList();} LEFT_PAREN column=column_name {$cols.add($column.name);} (COMMA column=column_name {$cols.add($column.name);})*   RIGHT_PAREN ;

select_element_list returns [List cols]
	: {$cols = new QueryList();} column=column_name  {$cols.add($column.name);} (COMMA column=column_name {$cols.add($column.name);})* ;
	
table_element_list_with_quote returns [List cols]
        : {$cols = new QueryList();} LEFT_PAREN  column=quoted_item {$cols.add($column.name);}  (COMMA  column=quoted_item {$cols.add($column.name);})*   RIGHT_PAREN ;
        
column_name returns [String name]
	:	column_definition {$name = $column_definition.columnName; };

column_definition returns [String columnName]
	:	(schema DOT)? ID (columnalias)? { 
	     String V_variable = "";
	     if ($schema.text != null) {
	         V_variable = $schema.text + ".";
	     }
	     V_variable += $ID.text;
	     if ($columnalias.text != null) {
	        $columnName = V_variable.toUpperCase() + " " + $columnalias.text.toUpperCase();
	     } else {
	         $columnName = V_variable.toUpperCase();
	     }
	 };
	
quoted_item returns [String name]
	:	 QUOTE qtext=onlysinglequotes QUOTE {$name = "'" + String.valueOf($qtext.text).toUpperCase() + "'" ; };
condition_text
	: (ID | VARIABLE | EQUAL |QUOTE | EXCLAMATION | LEFT_PAREN | RIGHT_PAREN)*;

select
	:  SELECT select_element_list from {
	   Query.q = new Select();
	   Query.q.tableNames = (QueryList) $from.cols;
	   Query.q.columns = (QueryList) $select_element_list.cols;
	}
	(INNER JOIN table_name ON everything)* {
	     ((Select)Query.q).addJoin($table_name.text,$everything.text); 
	}
	(
            WHERE search_condition {
	     ((Select)Query.q).whereCondition = $search_condition.text;
	    } 
	  )? 
	  
	 SEMICOLON;
	
everything: .*;

search_condition returns [String text]
	: everything { $text = $everything.text;  };
	
from 	returns [List cols]:	
    FROM select_element_list {
       $cols = (QueryList) $select_element_list.cols;
    };

 
is_functions 
	:	IS type=(POSSIBLE | CERTAIN) isFunctionBody {
	             Query.q = new IsFunction();
	             ((IsFunction)Query.q).type = $type.text;
	             Query.q.columns = (QueryList) $isFunctionBody.cols;
	             
	        }
	           
                SEMICOLON;

isFunctionBody returns [List cols]
	:	LEFT_PAREN tupple_element_list_with_quote {
	     $cols = $tupple_element_list_with_quote.cols;
	} COMMA quoted_item {
	     $cols.add($quoted_item.name);
	} RIGHT_PAREN;

tupple_element_list_with_quote returns [List cols]
        : {$cols = new QueryList();} LEFT_TRIANGLE column=quoted_item {$cols.add($column.name);}  (COMMA  column=quoted_item {$cols.add($column.name);})*   RIGHT_TRIANGLE ;
        
schema : ID;
table :	ID;
onlysinglequotes :	 ((~('\'') | ('\'\'') )*);
anycondition     :	ID; 
columnalias   :	ID;
/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/

fragment A :'A' | 'a';
fragment B :'B' | 'b';
fragment C :'C' | 'c';
fragment D :'D' | 'd';
fragment E :'E' | 'e';
fragment F :'F' | 'f';
fragment G :'G' | 'g';
fragment H :'H' | 'h';
fragment I: 'I' | 'i';
fragment J: 'J' | 'j';
fragment K: 'K' | 'k';
fragment L: 'L' | 'l';
fragment M: 'M' | 'm';
fragment N: 'N' | 'n';
fragment O: 'O' | 'o';
fragment P: 'P' | 'p';
fragment Q: 'Q' | 'q';
fragment R: 'R' | 'r';
fragment S: 'S' | 's';
fragment T: 'T' | 't';
fragment U: 'U' | 'u';
fragment V: 'V' | 'v';
fragment W: 'W' | 'w';
fragment X: 'X' | 'x';
fragment Y: 'Y' | 'y';
fragment Z: 'Z' | 'z';
fragment DIGIT :   '0'..'9' ;

/*UnicodeStringLiteral
     :
     'n' '\'' (~'\'')* '\'' ( '\'' (~'\'')* '\'' )*
     ;
 
ASCIIStringLiteral
     :
     '\'' (~'\'')* '\'' ( '\'' (~'\'')* '\'' )*
     ;
     
SingleQuotedString
    : '\'' (('\\' '\'')=>'\\' '\''
    |         ('\\' '\\')=>'\\' '\\' 
    |         '\\' | ~ ('\'' | '\\'))* 
      '\''
    ;*/
    
CREATE    :   C R E A T E; 
FROM      :   F R O M;	
INNER     :   I N N E R; 
INSERT    :   I N S E R T; 
INTO      :   I N T O; 
JOIN      :   J O I N; 
SELECT    :   S E L E C T; 
TABLE     :   T A B L E; 
VALUES    :   V A L U E S; 
CONDITION :   C O N D I T I O N;
WHERE     :   W H E R E; 
AND       :   A N D;
OR        :   O R;
NOT       :   N O T;
TRUE 	  :   T R U E;
FALSE 	  :   F A L S E;
UNKNOWN   :   U N K N O W N;
IS        :   I S;
POSSIBLE  :   P O S S I B L E;
CERTAIN   :   C E R T A I N;		
ON 	  :   O N;
	
ASTERIK   :   '*';
QUOTE 	    : '\'';
LEFT_PAREN  : '(';
LEFT_TRIANGLE :	'<';
RIGHT_TRIANGLE : '>';	
RIGHT_PAREN : ')';
COMMA       : ',';
SEMICOLON   : ';';
DOT	    : '.';
EQUAL       : '=';
EXCLAMATION : '!';
NOT_EQUAL   : '!=';
	
NUMBER 	    :(DIGIT)+;
	
ID       : (('a'..'z'|'A'..'Z' | '_') ((DIGIT)*))+ ;
VARIABLE :(('a'..'z'|'A'..'Z' | '#' | '_' | '=' ) ((DIGIT)*))+ ;
NEWLINE  :'\r'? '\n' { $channel = HIDDEN; } ;
WS       : ( '\t' | ' ' | '\r' | '\n' | '\u000C' )+ 	{ $channel = HIDDEN;} ;
