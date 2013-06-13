package org.parser;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.structures.Operator;

public class Select extends Query {

    public ArrayList<String> whereCondition = new ArrayList<String>();
    public ArrayList<String> showList = new ArrayList<String>();
    public Operator whereConditionAsTree; 
    private final static String MERGE_CONDITION = "MERGE_CONDITION";
    public ColumnList joinTables = new ColumnList();
    
    //private HashMap<String, String> tableNameAliasMap;
    
    @Override
    public String getPossQLQuery() {
        String result = "SELECT ";
        /*
         * IF IT IS REGULARE SELECT STATEMENT
         */
        if (columns != null && tableNames != null && columns.size() > 0 && tableNames.size() > 0) {
            Operator o = Operator.parseExpression(generateWehereCondition());
            if (o != null) {
                whereConditionAsTree = o.clone();
            }
            HashSet<String> hs = columns.getColumnsSet();
            if (o != null) {
                if (!hs.contains("*")) {
                    hs.addAll(o.getAllContainedColumns());
                }
            }
            
            result += Query.getListItemText(hs) + (hs.contains("*") ? "" : (", " + generateConditionalColumn()));
            
            if (joinTables.size() > 0) {
                    
            }
            
            result += " FROM " + tableNames.getTableItemText();
            
            if (whereCondition != null && whereCondition.size() > 0) {
                result += " WHERE " + o.getConditionalTree();
            }
            if (o != null) {
                
            }
        } 
        else {
            return null;
        }
        return result;
        
    }
    
    private String generateConditionalColumn() {
        if (tableNames.size() > 1 || joinTables.size() >0) {
            String result = MERGE_CONDITION +"(";
            Iterator<Column> it = tableNames.iterator();
            while (it.hasNext()) {
                Column tmp = it.next();
                result += tmp.getTableNameAlias() + "." + conditionColumnName;
                if (it.hasNext()) {
                    result += ",";
                } else {
                    result += ") AS COND";
                }
            }
            
            return result;
        } 
        return conditionColumnName;
    }
    
    /*
    public void addJoin(String tableName, String condition) {
        try {
            if (tableName == null) {
                return;
            }
            setTableName(tableName.toUpperCase());
            
            System.out.println(tableName + "   " + condition);
            if (join.containsKey(tableName)) {
                System.out.println("Duplicate table name already contains in the query.");
            }
            /*ANTLRStringStream in = new ANTLRStringStream(condition.toUpperCase());
            EqualityLexer lexer = new EqualityLexer(in);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            EqualityParser parser = new EqualityParser(tokens);
            Equality e = parser.parseEquality();
            join.put(tableName.toUpperCase(), e);
        } catch (Exception e) {
            System.out.println("Parsing problem for the join condition ");
        }
    }*/
    
    public void generateShowList() {
        for (Column c : columns) {
            showList.add(c.getSelectedName());
        }
        showList.add(conditionColumnName);
    }
    
    public String generateWehereCondition() {
        String result = "";
        Iterator<String> it = whereCondition.iterator();
        while (it.hasNext()) {
            result += it.next();
            if (it.hasNext()) {
                result += " AND ";
            }
        }
        return result;
    }

}
