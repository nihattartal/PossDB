package org.parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class QueryList extends ArrayList<String>{

    /**
     * 
     */
    private final static String conditionColumnTitle = "cond";
    private static final long serialVersionUID = 1L;

    public String getListItemText() {
        StringBuffer buffer = new StringBuffer();
        Iterator<String> iter = this.iterator();
        while (iter.hasNext()) {
            buffer.append(iter.next());
            if (iter.hasNext()) {
                buffer.append(", ");
            }
        }
        return buffer.toString();
    }
    
    public void addCondition() {
        for (String item : this) {
            if (conditionColumnTitle.equals(item)) {
                return;
            }
        }
        this.add(conditionColumnTitle);
    }
    
    public String getListItemTextWithoutAlias() {
        StringBuffer buffer = new StringBuffer();
        Iterator<String> iter = this.iterator();
        while (iter.hasNext()) {
            String item = iter.next();
            String[] tmpArray = item.split(" ");
            item = tmpArray[0];
            buffer.append(item);
            if (iter.hasNext()) {
                buffer.append(", ");
            }
        }
        return buffer.toString();
    }
    
    public HashMap<String, String> getAliasMapping() {
        HashMap<String, String> result = new HashMap<String, String>();
        Iterator<String> iter = this.iterator();
        while (iter.hasNext()) {
            String item = iter.next();
            String[] tmpArray = item.split(" ");
            if (tmpArray.length == 1) {
                result.put(tmpArray[0], tmpArray[0]);
            } else if (tmpArray.length == 2){
                result.put(tmpArray[1], tmpArray[0]);
            }
        }
        return result;
    }
    
    public void replaceWithAliases(HashMap<String, String> mapping) {
        Iterator<String> iter = this.iterator();
        int index = 0;
        while (iter.hasNext()) {
            String item = iter.next();
            String[] parts = item.split("\\.");
            if (parts.length == 2) {
                String key = parts[0];
                if (mapping.containsKey(key)) {
                    this.set(index, item.replaceAll(key, mapping.get(key)));
                }
            }
            index++;
        }
    }
    
    public String getAllTableConditions() {
        String result = "";
        Iterator<String> iter = this.iterator();
        while (iter.hasNext()) {
            String item = iter.next();
            String[] tmpArray = item.split(" ");
            result += tmpArray[0] + "." + conditionColumnTitle;
            if (iter.hasNext()) {
                result += ", ";
            }
        }
        return result;
        
    }
}
