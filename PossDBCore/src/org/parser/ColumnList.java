package org.parser;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ColumnList extends ArrayList<Column> {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public String getListItemText() {
        StringBuffer buffer = new StringBuffer();
        Iterator<Column> iter = this.iterator();
        while (iter.hasNext()) {
            buffer.append(iter.next().toString());
            if (iter.hasNext()) {
                buffer.append(", ");
            }
        }
        return buffer.toString();
    }
    
    public String getListItemTextWithoutAlias() {
        StringBuffer buffer = new StringBuffer();
        Iterator<Column> iter = this.iterator();
        while (iter.hasNext()) {
            buffer.append(iter.next().getWithouAlias());
            if (iter.hasNext()) {
                buffer.append(", ");
            }
        }
        return buffer.toString();
    }
    
    public String getTableItemText() {
        StringBuffer buffer = new StringBuffer();
        Iterator<Column> iter = this.iterator();
        while (iter.hasNext()) {
            Column c = iter.next();
            buffer.append(c.getWithouAlias());
            if (c.alias != null && !"".equals(c.alias)) {
                buffer.append(" " + c.alias);
            }
            if (iter.hasNext()) {
                buffer.append(", ");
            }
        }
        return buffer.toString();
    }
    
    @Override
    public boolean add(Column e) {
        if (e.name.equals(Query.conditionColumnName)) {
            return false;
        }
        return super.add(e);
    }
    
    public HashSet<String> getColumnsSet() {
        HashSet<String> hs = new HashSet<String>();
        Iterator<Column> it = this.iterator();
        while (it.hasNext()) {
            hs.add(it.next().getSelectedName());
        }
        return hs;
    }

}
