package org.structures;


public class MemberFactory {

    public static Member getMember(String value) {
        int val;
        try {
            val = Integer.parseInt(value);
            return getMember(val);
        } catch (NumberFormatException e) {
           ColumnMember cm = new ColumnMember();
           cm.value = value;
           return cm;
        }
        
    }
    
    public static Member getMember(int value) {
        if (value < 0) {
            VariableMember bm = new VariableMember();
            bm.setValue(value);
            return bm;
        } else {
            ConstantMember cm = new ConstantMember();
            cm.setValue(value);
            return cm;
        }
    }

    private MemberFactory() {
    }
    
}
