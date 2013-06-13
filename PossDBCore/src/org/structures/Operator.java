package org.structures;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;

import org.gibello.zql.ZExp;
import org.gibello.zql.ZExpression;
import org.gibello.zql.ZqlParser;

public abstract class Operator {

    /*
     * Don't forget to add to getOperator(int) as well.
     */
    public final static int OR_OPERATOR  = 1;
    public final static int AND_OPERATOR = 2;
    public final static int EQUAL        = 3;
    public final static int INEQUAL      = 4;
    public final static int LESS         = 5;
    
    /**
     * Defines whether the operator is true or not, For example 3=3 Operator is
     * true, contrary 4=3 is false
     */
    
    /*
     * -3 = 4 true
     * -3 = 3 true
     *  3 = 5 false
     *  3 = 3 true 
     */
    public boolean evaluation = true;
    public boolean containsVariable = false;
    
    private int value;
    protected ArrayList<String> columnNames = new ArrayList<String>();
    public ConditionalArrayList children;

    public int getValue() {
        return value;
    }
    
    public String getOperator(int value) {
        switch(value) {
            case 1:  return " OR ";
            case 2:  return " AND ";
            case 3:  return " = ";
            case 5:  return " < ";
            default: return " != ";
        }
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static Operator parseExpression(String condition) {
        ZqlParser p = null;
        p = new ZqlParser(new ByteArrayInputStream(condition.getBytes()));

        ZExp st = null;
        try {
            st = p.readExpression();
        } catch (Exception e) {
            // TODO: PL Java How Exception works.
        }

        if (!(st instanceof ZExpression)) {
            return null;
        }
        ZExpression pred = (ZExpression) st;
        String op = pred.getOperator();
        if ("-".equals(op)) {
            return null;
        }
        Operator o = OperatorFactory.getOperator(op);
        for (int i = 0; i < pred.getOperands().size(); i++) {
            Operator subOperator;
            if ((subOperator = parseExpression(pred.getOperand(i).toString())) != null) {
                o.children.add(subOperator);
            } else {
                ((MathematicalOperator) o).setOperands(pred.getOperand(i).toString(), pred.getOperand(i + 1).toString());
                break;
            }
        }
        return o;
    }

    public abstract Operator replaceColumnNames(Hashtable<String, Integer> columns); 
    
    
    /*
    private boolean isColumnName(int value) {
        /*if (value == null || value.length() < 1) {
            return false;
        }
        try {
            Integer.parseInt(value);
            return false;
        } catch (NumberFormatException e) {
            if (Character.isDigit(value.charAt(0)) || Functions.isCondition(value)) {
                return false;
            } else {
                return true;
            }
        }
        
        //TODO: Implement
        return false;
    }*/

    public abstract Operator generateConditionalTree();

    public abstract boolean containsChildOperator();

    protected abstract Operator toDNF();

    /**
     * @deprecated Instead of converting to CNF, CNF Mapping on DNF is used.
     * @return
     */
    protected abstract Operator toCNF();

    //public abstract boolean isTautology();
    
    public abstract boolean isTautology(GlobalCondition gc);

    public abstract int getChildCount();

    public abstract Operator absorb();
    
    public abstract Operator getConditionalTree();

    public abstract boolean contains(Operator o);
    
    public abstract HashSet<String> getAllContainedColumns();

    public Operator getDNFTree() {
        Operator o = this.toDNF();
        if (o != null) {
            return o.normalize().absorb();
        }
        return this.normalize().absorb();
    }

    /**
     * @deprecated Instead of converting to CNF, CNF Mapping on DNF is used.
     * @return
     */
    public Operator getCNFTree() {
        Operator o = this.toCNF();
        if (o != null) {
            o = o.normalize().absorb();
            return o;
        }
        return this.normalize().absorb();
    }

    public abstract Operator normalize();

    public abstract boolean isSatisfiable(GlobalCondition gc);

    public abstract Operator negate();
    
    public abstract Operator clone();
}
