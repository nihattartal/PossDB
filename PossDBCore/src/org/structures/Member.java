package org.structures;

import java.util.HashSet;
import java.util.Hashtable;


public class Member extends Operator{
   
    
    public boolean isCondition() {
        if (this instanceof VariableMember) return true;
        return false;
    }
    
    public boolean isColumnName() {
        if (this instanceof ColumnMember) return true;
        return false;
    }
    
    public boolean isConstant() {
        if (this instanceof ConstantMember) return true;
        return false;
    }
    
    @Override
    public String toString() {
        return getValue() + "";
    }
    
    @Override
    public Operator generateConditionalTree() {
        return this;
    }

    @Override
    public boolean containsChildOperator() {
        return false;
    }

    @Override
    public Operator toDNF() {
        return null;
    }

    @Override
    protected Operator toCNF() {
        return null;
    }
    
    @Override
    public boolean isTautology(GlobalCondition gc) {
        return false;
    }

    @Override
    public Operator normalize() {
        return this;
    }
    @Override
    public Operator negate() {
        return this;
    }
    @Override
    public Operator absorb() {
        return this;
    }
    @Override
    public int getChildCount() {
        return 0;
    }
    @Override
    public boolean contains(Operator o) {
        return false;
    }

    @Override
    public boolean isSatisfiable(GlobalCondition gc) {
        return true;
    }

    @Override
    public Operator replaceColumnNames(Hashtable<String, Integer> columns) { 
        return null; 
    }
    
    @Override
    public Operator clone()  {
        
        if (this instanceof ColumnMember) {
            ColumnMember m = new ColumnMember();
            m.value = ((ColumnMember)this).value;
            m.evaluation = evaluation;
            m.containsVariable = containsVariable;
            
            return m;
        } else {
            Member m = new Member();
            m.evaluation = evaluation;
            m.containsVariable = containsVariable;
            
            m.setValue(this.getValue());
            return m;
        }
        
    }

    @Override
    public Operator getConditionalTree() {
        return null;
    }

    @Override
    public HashSet<String> getAllContainedColumns() {
        return null;
    }
}
