package org.structures;

import java.util.ArrayList;
import java.util.Iterator;

public class ConditionalArrayList extends ArrayList<Operator>{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

   //TODO: Think about it, if it is faster if you override tostring in member object.
 /*   @Override
    public Operator get(int index) {
        if ((super.get(index) instanceof Member)) {
            String value = super.get(index).toString();
            if (value.length() > 4 && value.startsWith("var_")) {
                value = value.replaceAll("var_", "#");
                super.get(index).setValue(value);
            }
        }
        return super.get(index);
    }
    */
    
    public String join(String conjuction) {
        StringBuffer buffer = new StringBuffer();
        Iterator<Operator> iter = this.iterator();
        while (iter.hasNext()) {
            buffer.append(iter.next());
            if (iter.hasNext()) {
                buffer.append(conjuction);
            }
        }
        return buffer.toString();
    }
    
    public Object clone() {
        ConditionalArrayList tmp  = new ConditionalArrayList();
        for (int i = 0; i < this.size(); i++) {
            tmp.add((Operator) this.get(i).clone());
        }
        return tmp;
    }
}
