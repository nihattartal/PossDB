package org.parser;

public class Column {

    /**
     * @param args
     */
    public String tableName;
    public String name;
    public String alias;
        
    
    @Override
    public String toString() {
        String result = "";
        if (tableName == null || "".equals(tableName)) {
            result += name;
            if (alias == null || "".equals(alias)) {
                result += " AS \"" + result + "\"";
            } else {
                result += " AS " + alias;
            }
        } else {
            result += tableName + "." + name;
            if (alias == null || "".equals(alias)) {
                result += " AS \"" + result + "\"";
            } else {
                result += " AS " + alias;
            }
        }
        return result;
    }


    public String getWithouAlias() {
        return name;
    }
    
    public String getSelectedName() {
        String result = "";
        if (tableName == null || "".equals(tableName)) {
            result += name;
        } else {
            result += tableName + "." + name;
        }
        return result;
    }
    
    public String getTableName() {
        String result = "";
        result += name;
        if (alias != null && !"".equals(alias)) {
            result += " " + alias;
        } 
        return result;
    }
    
    public String getTableNameAlias() {
        if (alias != null && !"".equals(alias)) {
            return alias;
        } 
        return name;
    }
    
}
