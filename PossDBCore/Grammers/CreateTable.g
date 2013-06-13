grammar CreateTable;

@header {
package org.parser;

import java.util.List;
import org.parser.QueryList;
import org.parser.ColumnList;

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
		        Column c = new Column();
		        c.name = $table_name.text.toUpperCase();
			Query.q.setTableName(c); 
			Query.q.columns   = (ColumnList) $table_element_list.cols;
		} 
		SEMICOLON ;

insert_tuple
        : INSERT INTO table_name VALUES 
                integer_list {
		        Query.q = new InsertIntoTable();
			Column c = new Column();
		        c.name = $table_name.text.toUpperCase();
			Query.q.setTableName(c); 
			Query.q.intList   = (QueryList) $integer_list.cols;
		} (
		     CONDITION LEFT_PAREN boolean_value_expression {
		        ((InsertIntoTable)Query.q).condition = $boolean_value_expression.text.toUpperCase();
		     } RIGHT_PAREN
		  )?
		SEMICOLON ;

condition returns [String cond]
	:	LEFT_PAREN  onlysinglequotes  RIGHT_PAREN {$cond = $onlysinglequotes.text; };
	
table_name 
	:	(schema DOT)? table;
	
table_element_list returns [List cols]
	: {$cols = new ColumnList();} LEFT_PAREN column=column_name {$cols.add($column.name);} (COMMA column=column_name {$cols.add($column.name);})*   RIGHT_PAREN ;

select_element_list returns [List cols]
	: {$cols = new ColumnList();} column=column_name  {$cols.add($column.name);} (COMMA column=column_name {$cols.add($column.name);})* ;
	
table_element_list_with_quote returns [List cols]
        : {$cols = new QueryList();} LEFT_PAREN  column=quoted_item {$cols.add($column.name);}  (COMMA  column=quoted_item {$cols.add($column.name);})*   RIGHT_PAREN ;
        
integer_list returns [List cols]
        : {$cols = new QueryList();} LEFT_PAREN  column=NUMBER {$cols.add($column.getText());}  (COMMA  column=NUMBER {$cols.add($column.getText());})*   RIGHT_PAREN ;
        
column_name returns [Column name]
	:	column_definition {$name = $column_definition.col; };

column_definition returns [Column col]
	:	(schema DOT)? sel=(ID|ASTERIK) ((AS)? columnalias)? { 
	     col = new Column();
	     
	     if ($schema.text != null) {
	         col.tableName = $schema.text.toUpperCase();
	     }
	     col.name = $sel.text.toUpperCase();
	     if ($columnalias.text != null) {
	        col.alias = $columnalias.text.toUpperCase();
	     }
	 };
	
quoted_item returns [String name]
	:	 QUOTE qtext=onlysinglequotes QUOTE {$name = "'" + String.valueOf($qtext.text).toUpperCase() + "'" ; };
	
	
condition_text

	: (ID | VARIABLE | EQUAL |QUOTE | EXCLAMATION | LEFT_PAREN | RIGHT_PAREN)*;

select
	:  SELECT select_element_list from {
	   Query.q = new Select();
	   Query.q.tableNames = (ColumnList) $from.cols;
	   Query.q.columns = (ColumnList) $select_element_list.cols;
	   ((Select) Query.q ).generateShowList();
	}

	(
            jointables{
                 Query.q.setTableName($jointables.colum);
            }
	)*

	(
            WHERE search_condition {
	        ((Select)Query.q).whereCondition.add($search_condition.text.toUpperCase());
	    } 
	)? 
	  
	 SEMICOLON;

select_in
	:  SELECT select_element_list from {
	   ((IsFunction) Query.q).query = new Select();
	   ((IsFunction) Query.q).query.tableNames = (ColumnList) $from.cols;
	   ((IsFunction) Query.q).query.columns = (ColumnList) $select_element_list.cols;
	   ((IsFunction) Query.q).query.generateShowList();
	}

	(
            jointables{
                 ((IsFunction) Query.q).query.setTableName($jointables.colum);
            }
	)*

	(
            WHERE search_condition {
	        ((IsFunction) Query.q).query.whereCondition.add($search_condition.text.toUpperCase());
	    } 
	)? 
	  
	 ;
	 
everything: (RIGHT_PAREN | LEFT_PAREN | .) *;

search_condition returns [String text]
	: everything { $text = $everything.text;  };
	
from 	returns [List cols]:	
    FROM select_element_list {
       $cols = (ColumnList) $select_element_list.cols;
    };

jointables returns [Column colum]:	
    INNER JOIN column_definition {
    $colum = $column_definition.col;
} ON boolean_value_expression {
	        ((Select)Query.q).whereCondition.add($boolean_value_expression.text.toUpperCase());
	    } ;



boolean_value_expression
	:	(LEFT_PAREN bool_val_exp RIGHT_PAREN) ( OR boolean_value_expression )*  ( AND boolean_value_expression )*  
	|                bool_val_exp
	;

bool_val_exp 
	:	boolean_test ( OR boolean_test )* ( AND  boolean_test )*;
	
boolean_test
        :	parenthesized_boolean_value_expression
	|	nonparenthesized_value_expression_primary
	;


parenthesized_boolean_value_expression
	:  LEFT_PAREN value_expression RIGHT_PAREN;

nonparenthesized_value_expression_primary 
	: value_expression;

value_expression 
	:	col_col_eq 
	|       col_num_eq 
	|       num_col_eq
	|       col_col_neq 
	|       col_num_neq 
	|       num_col_neq
	|       num_num_eq
	|       num_num_neq;

col_col_eq 
	:	column_name EQUAL column_name ;
	
col_num_eq 
	:	column_name EQUAL NUMBER ;

num_col_eq 
	:	 NUMBER EQUAL column_name;
	
col_col_neq 
	:	column_name NOT_EQUAL column_name;
	
col_num_neq 
	:	column_name NOT_EQUAL NUMBER;

num_col_neq 
	:	 NUMBER NOT_EQUAL column_name;
	
num_num_eq 
	:	('-')* NUMBER EQUAL ('-')* NUMBER;
	
num_num_neq  
	:	('-')* NUMBER NOT_EQUAL ('-')* NUMBER;
	
is_functions 
	:	IS type=(POSSIBLE | CERTAIN) {Query.q = new IsFunction(); ((IsFunction)Query.q).type = $type.text;} isFunctionBody {
	             
	             Query.q.isFunctionList = (ArrayList<Object>) $isFunctionBody.cols;
	             
	        }
	           
                SEMICOLON;

isFunctionBody returns [List cols]
	:	LEFT_PAREN tupple_element_list_with_quote {
	     $cols = $tupple_element_list_with_quote.cols;
	} RIGHT_PAREN IN (tab=ID { ((IsFunction) Query.q).inTableName = $tab.text;} | select_in);

tupple_element_list_with_quote returns [List cols]
        : {$cols = new ArrayList();} column=ID {$cols.add($column.text);} COMMA num=NUMBER {$cols.add($num.text);} (COMMA  column=ID {$cols.add($column.text);})*  ;
        
schema : ID;
table :	ID;

onlysinglequotes :	 ((~('\'') | ('\'\'') )*);

anycondition     :	ID; 
columnalias   :	ID;

equal : '=';
number 	    :('-')* (DIGIT)+;
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

IN        :   I N;    
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
AS        :   A S;
	
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
WS       : ( '\t' | ' ' | '\r' | '\n' | '\u000C'  )+ 	{ $channel = HIDDEN;} ;
