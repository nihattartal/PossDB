package org.structures;

import java.util.HashSet;
import java.util.Hashtable;

public class GlobalCondition extends Hashtable<Integer, HashSet<Integer>>{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    public void addVariable(int name, String values) {
        String[] vars = values.split(",");
        HashSet<Integer> hs = new HashSet<Integer>();
        for (String var : vars) {
           hs.add(Integer.parseInt(var));
        }
        this.put(name, hs);
    }
}
