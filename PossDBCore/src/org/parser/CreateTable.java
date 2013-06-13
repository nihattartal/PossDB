package org.parser;

public class CreateTable extends Query {

    @Override
    public String getPossQLQuery() {
        if (tableNames != null && tableNames.size() > 0 && columns.size() > 0) {
            String result = "CREATE TABLE " + getTableName() +"(" + columns.getListItemTextWithoutAlias();
            result = result.replaceAll("\\,", " integer,");
            result += " integer, "  + conditionColumnName + " text);";
            return result;
        }
        return "";
    }
}
