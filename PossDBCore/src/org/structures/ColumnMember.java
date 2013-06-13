package org.structures;

public class ColumnMember extends Member {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public ColumnMember() {
        children = new ConditionalArrayList();
    }
    
    /**
     * Only this one contains String value,
     * Because of that it contains extra String variable.
     */
    public String value;
    
    @Override
    public String toString() {
        return value;
    }
}
