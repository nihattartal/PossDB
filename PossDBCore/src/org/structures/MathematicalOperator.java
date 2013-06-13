package org.structures;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;

import com.google.common.collect.Sets;

public class MathematicalOperator extends Operator {
    
    public MathematicalOperator(int operator) {
        children = new ConditionalArrayList();
        this.setValue(operator);
    }
    
    public void setOperands(String member1, String member2) {
        String mem1 = member1;
        String mem2 = member2;
        if (mem1.startsWith("(- ")) {
            mem1 = mem1.substring(3, mem1.length());
            mem1 = "-" + mem1.substring(0, mem1.length() -1);
        }
        if (mem2.startsWith("(- ")) {
            mem2 = mem2.substring(3, mem2.length());
            mem2 = "-" + mem2.substring(0, mem2.length() -1);
        }
        
        Member m1 = MemberFactory.getMember(mem1);
        Member m2 = MemberFactory.getMember(mem2);
        
        if (m1 instanceof VariableMember) {
            if (m2 instanceof ConstantMember) {
                children.add(m1);
                children.add(m2);
            } else { //BOTH Are Variable
                if (m1.getValue() > m2.getValue() ) {
                    children.add(m1);
                    children.add(m2);
                } else {
                    children.add(m2);
                    children.add(m1);
                }
            }
        } else if (m2 instanceof VariableMember){
            children.add(m2);
            children.add(m1);
        } else if (m2 instanceof ColumnMember){
            children.add(m2);
            children.add(m1);
        } else {
            children.add(m1);
            children.add(m2);
        }
    }
    
    @Override
    public String toString() {
        return children.get(0) + this.getOperator(this.getValue()) + children.get(1);
    }
    
    public boolean containsCondition() {
        return ((Member)children.get(0)).isCondition() || ((Member)children.get(1)).isCondition();
    }
    
    public boolean evaluate() {
        if (getValue() == Operator.EQUAL) {
            return (evaluation = children.get(0).getValue() == children.get(1).getValue());
        } else if (getValue() == Operator.INEQUAL) {
            return (evaluation = children.get(0).getValue() != children.get(1).getValue());
        }
        return false;
    }
    
    public boolean containsColumnName() {
        return ((Member)children.get(0)).isColumnName() || ((Member)children.get(1)).isColumnName();
    }

    public boolean isVariableConstantEquality() {
        return ( (((Member)children.get(0)).isCondition() && !((Member)children.get(1)).isCondition()) ||  ( !((Member)children.get(0)).isCondition() && ((Member)children.get(1)).isCondition()) );
    }
    
    public boolean isColumnColumnEquality() {
        return ( (((Member)children.get(0)).isColumnName() &&   ((Member)children.get(1)).isColumnName()) );
    }
    
    public boolean isColumnConstantEquality() {
        return ( (((Member)children.get(0)).isConstant() && ((Member)children.get(1)).isColumnName()) || (((Member)children.get(1)).isConstant() && ((Member)children.get(0)).isColumnName()) );
    }
    
    public boolean isVariableVariableEquality() {
        return ((Member)children.get(0)).isCondition() && ((Member)children.get(1)).isCondition();
    }
    
    public Member getLeftOperand() {
        return (Member) children.get(0);
    }
    
    public Member getRightOperand() {
        return (Member) children.get(1);
    }
    
    public Member getVariable() {
        if (((Member)children.get(0)).isCondition()) {
            return (Member)children.get(0);
        } else if (((Member)children.get(1)).isCondition()) {
            return (Member)children.get(1);
        }
        return null;
    }
    
    public Member getConstant() {
        if (!((Member)children.get(0)).isCondition()) {
            return (Member)children.get(0);
        } else if (!((Member)children.get(1)).isCondition()) {
            return (Member)children.get(1);
        }
        return null;
    }
    
    public void setConstant(Member m) {
        if (!((Member)children.get(0)).isCondition()) {
            children.set(0, m);
        } else if (!((Member)children.get(1)).isCondition()) {
            children.set(1, m);
        }
    }

    @Override
    public Operator generateConditionalTree() {
        if (!this.containsCondition()) {
            evaluation = this.evaluate();
            if (evaluation) {
                return null;
            }
        } 
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
    public Operator toCNF() {
        return null;
    }


    @Override
    public boolean isSatisfiable(GlobalCondition gc) {
        if (this.getValue() == Operator.EQUAL) {
             if (isVariableConstantEquality()) {
                 int var = this.getVariable().getValue();
                 if (!gc.get(var).contains(this.getConstant().getValue())) {
                     return false;
                 }
             } else { // Var Var Equality
                 if (this.evaluate()) {
                     return true; //Same variable
                 } else {
                     HashSet<Integer> h1 = (HashSet<Integer>) gc.get(this.children.get(0).getValue()).clone();
                     HashSet<Integer> h2 = (HashSet<Integer>) gc.get(this.children.get(1).getValue()).clone();
                     if (Sets.intersection(h1, h2).size() == 0) {
                         return false;
                     }
                 }
                 
                 /*int a = this.getLeftOperand().getValue();
                 int b = this.getRightOperand().getValue();
                 if (gc.containsKey(a) && gc.containsKey(b)) {
                     if (Sets.intersection(gc.get(a), gc.get(b)).size() == 0) {
                         return false;
                     }
                 }*/
             }
        } else { // Inequality
            /*int a = this.getLeftOperand().getValue();
            int b = this.getRightOperand().getValue();
            if (gc.containsKey(a) && gc.containsKey(b) && gc.get(a).size() == 1 && gc.get(b).size() == 1 ) {
                return (gc.get(a).iterator().next() != gc.get(b).iterator().next());
            }*/
        }
        return true;
    }

    @Override
    public Operator normalize() {
        return this;
    }

    @Override
    public Operator negate() {
        MathematicalOperator mo;
        if ("=".equals(this.getValue())) {
            mo = new MathematicalOperator(Operator.INEQUAL);
        } else {
            mo = new MathematicalOperator(Operator.EQUAL);
        }
        for (int i = 0; i < this.children.size(); i++) {
            mo.children.add(this.children.get(i));
        }
        return mo;
    }

    @Override
    public Operator absorb() {
        return this;
    }

    @Override
    public int getChildCount() {
        return 1;
    }

    @Override
    public boolean contains(Operator o) {
        return o.toString().equals(this.toString());
    }

    @Override
    public boolean isTautology(GlobalCondition gc) {
        if (this.containsCondition() && this.getValue() == Operator.EQUAL) {
            HashSet<Integer> hs;
           if (this.isVariableConstantEquality()) {
               if ((hs = gc.get(this.getVariable().getValue())) != null && hs.size() == 1) {
                   if (hs.contains(this.getConstant().getValue())) {
                       return true;
                   }
               }
           } else {
               return false;
           }
        } 
        return false;
    }

    @Override
    public Operator replaceColumnNames(Hashtable<String, Integer> columns) {
        MathematicalOperator tmp = (MathematicalOperator) this.clone();
      
        if (tmp.containsColumnName()) {
            Member m1 = (Member) tmp.children.get(0);
            Member m2 = (Member) tmp.children.get(1);
            if (m1 instanceof ColumnMember) {
                Member newMember = MemberFactory.getMember(columns.get(((ColumnMember) m1).value));
                tmp.children.set(0, newMember);
            }
            if (m2 instanceof ColumnMember) {
                Member newMember = MemberFactory.getMember(columns.get(((ColumnMember) m2).value));
                tmp.children.set(1, newMember);
            }
        } 
        
        if (tmp.containsCondition()) {
            tmp.containsVariable = true;
            if (tmp.isVariableVariableEquality() && tmp.evaluate()) {
                return null;
            }
        } else if (tmp.evaluate()) {
            return null;
        }
        return tmp;
    }
    
    public HashSet<String> getAllContainedColumns() {
        HashSet<String> columnNames = new HashSet<String>();
        if (this.containsColumnName()) {
            Member m1 = (Member) this.children.get(0);
            Member m2 = (Member) this.children.get(1);
            if (m1 instanceof ColumnMember) {
                columnNames.add(m1.toString());
            }
            if (m2 instanceof ColumnMember) {
                columnNames.add(m2.toString());
            }
        } 
        return columnNames;
    }
    
    @Override
    public Operator clone() {
        MathematicalOperator tmp = new MathematicalOperator(this.getValue());
        tmp.evaluation = evaluation;
        tmp.containsVariable = containsVariable;
        tmp.setValue(this.getValue());
        tmp.children = (ConditionalArrayList) children.clone();
        return tmp;
    }

    @Override
    public Operator getConditionalTree() {
        OrOperator o = new OrOperator();
        o.children.add(this.clone());
        ArrayList<Operator> al = getConditionalQueryOperators();
        for (int i = 0; i < al.size(); i++ ) {
            o.children.add(al.get(i));
        }
        return o;
    }
    
    private ArrayList<Operator> getConditionalQueryOperators() {
        ArrayList<Operator> al = new ArrayList<Operator>();
        if (this.isColumnConstantEquality()) {
            MathematicalOperator m = new MathematicalOperator(LESS);
            m.children.add(this.getConstant().clone());
            Member constant = new ConstantMember();
            constant.setValue(0);
            m.children.add(constant);
            al.add(m);
        } else if (this.isColumnColumnEquality()) {
            MathematicalOperator m1 = new MathematicalOperator(LESS);
            MathematicalOperator m2 = new MathematicalOperator(LESS);
            
            m1.children.add(this.children.get(0));
            m2.children.add(this.children.get(1));
            
            Member mem = new ConstantMember();
            mem.setValue(0);
            
            m1.children.add(mem);
            m2.children.add(mem);

            al.add(m1);
            al.add(m2);
        } 
        return al;
    }
}
