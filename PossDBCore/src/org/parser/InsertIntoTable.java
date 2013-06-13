package org.parser;

public class InsertIntoTable extends Query {

    public String condition;
    @Override
    public String getPossQLQuery() {
        if (tableNames != null && tableNames.size() >  0 ) {
            String result = "INSERT INTO " + getTableName() + " VALUES(";
            if (condition != null && !"".equals(condition)) {
                intList.add("'" + condition.replaceAll("\\'", "''") + "'");
            }
            result += intList.getListItemText() + ");";
            return result;
        }
        return null;
    }

}
