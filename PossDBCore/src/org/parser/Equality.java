package org.parser;

public class Equality {

    public String schema1;
    public String schema2;
    public String table1;
    public String table2;

    public String generateEachSide(String schema, String table) {
        if (schema != null) {
            return schema + "." + table;
        } 
        return table;
    }
    
    public String generateForQuery() {
        return generateEachSide(schema1,table1) + "|| ' = ' ||" + generateEachSide(schema2, table2);
    }
    
    public String getEqualityText() {
        return generateEachSide(schema1,table1) + " = " + generateEachSide(schema2, table2);
    }
}
