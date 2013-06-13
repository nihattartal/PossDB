package org.parser;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public abstract class Query {

    protected final static String conditionColumnName = "COND";
    public static Query q;
    
    
    public String fullQueryText;
    public ColumnList tableNames = new ColumnList();
    public ColumnList columns = new ColumnList();
    public QueryList intList = new QueryList();
    public ArrayList<Object> isFunctionList = new ArrayList<Object>();
    
    public abstract String getPossQLQuery();
    
    public void setTableName(Column tableName) {
        tableNames.add(tableName);
    }
    
    public String getTableName() {
        return tableNames.get(0).getWithouAlias();
    }
    
    public static String getListItemText(HashSet<String> hs) {
        String result = "";
        Iterator<String> it = hs.iterator();
        while (it.hasNext()) {
            String tmp = it.next();
            if (!tmp.contains("*")) {
                result += tmp + " AS \"" + tmp + "\"";                
            } else {
                result += tmp;
            }
            if (it.hasNext()) {
                result += ",";
            }
        }
        return result;
    }
    
   
    
}
