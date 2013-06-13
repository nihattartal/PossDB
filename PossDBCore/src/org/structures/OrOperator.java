package org.structures;

import java.util.HashSet;
import java.util.Hashtable;

public class OrOperator extends BooleanOperator {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public OrOperator() {
        this.setValue(Operator.OR_OPERATOR);
    }

    @Override
    public Operator generateConditionalTree() {
        for (int i = 0; i < children.size(); i++) {
            if (children.get(i).generateConditionalTree() == null) {
                return null;
            } else if (!children.get(i).evaluation) {
                children.remove(i);
            }
        }
        if (this.children.size() == 0) {
            return null;
        }
        return this;
    }

    @Override
    protected Operator distributeAsDNF(Operator one, Operator two) {
        if (two instanceof MathematicalOperator && one instanceof OrOperator) {
            return distributeAsCNF(two, one);
        }
        if (!(one instanceof OrOperator)) {
            if (two instanceof OrOperator) {
                OrOperator tmpOr = new OrOperator();
                tmpOr.children.add(one);
                for (int i = 0; i < two.children.size(); i++) {
                    tmpOr.children.add(two.children.get(i));
                }
                return tmpOr;
            }
        } else if (two instanceof OrOperator) {
            OrOperator tmpOr = new OrOperator();
            for (int i = 0; i < one.children.size(); i++) {
                tmpOr.children.add(one.children.get(i));
            }
            for (int i = 0; i < two.children.size(); i++) {
                tmpOr.children.add(two.children.get(i));
            }
            return tmpOr;
        }
        return null;
    }

    private boolean checkTautology(GlobalCondition gc) {
        Hashtable<Integer, HashSet<Integer>> globalCondition = new Hashtable<Integer, HashSet<Integer>>();
        if (gc != null) {
            /*Enumeration<Integer> en = gc.keys();
            while (en.hasMoreElements()) {
                int varId = en.nextElement();
                HashSet<Integer> valuations = new HashSet<Integer>();
                Iterator<Integer> it = gc.get(varId).iterator();
                while (it.hasNext()) {
                    valuations.add(it.next());
                }
                globalCondition.put(varId, valuations);
            } */
        } else {
            return false;
        }
        
        //Hashtable<Integer, Integer> equality = new Hashtable<Integer, Integer>();
        //Hashtable<Integer, Integer> inEquality = new Hashtable<Integer, Integer>();
        
        
        for (int i = 0; i < children.size(); i++) {
            MathematicalOperator m = (MathematicalOperator) children.get(i);
            if (m.isVariableConstantEquality()) {
                if (m.getValue() == Operator.EQUAL) {
                    HashSet<Integer> hs = null;
                    if (globalCondition.containsKey(m.getVariable().getValue())) {
                        if (! (hs = globalCondition.get(m.getVariable().getValue())).contains(m.getConstant().getValue())) {
                            hs.remove(m.getConstant().getValue());
                            if (hs.size() == 0) {
                                return true;
                            }
                        }
                    } else {
                        continue;
                    }
                    
                } else { //Inequality
                    
                }
            }
        }
        return false;
            
           /* 
            Operator tmpOperator = children.get(i);
            
            MathematicalOperator tmpMathOp = null;
            if (tmpOperator instanceof MathematicalOperator && (tmpMathOp = (MathematicalOperator) tmpOperator).containsCondition() || tmpMathOp.containsColumnName()) {
                if (tmpMathOp.isVariableConstantEquality()) {
                    int variable = tmpMathOp.getVariable().getValue();
                    int constant = tmpMathOp.getConstant().getValue();
                    if (tmpOperator.getValue() == Operator.EQUAL ? constant == inEquality.get(variable) : constant == equality.get(variable)) {
                        return true;
                    } else {
                        if (tmpOperator.getValue() == Operator.EQUAL)  {
                            equality.put(variable,constant); 
                        } else {
                            inEquality.put(variable,constant);
                        }
                        continue;
                    }
                        
                } else if (tmpMathOp.isVariableVariableEquality() || tmpMathOp.containsColumnName() ) {
                    Member first = (Member) tmpOperator.children.get(0);
                    Member second = (Member) tmpOperator.children.get(1);
                    int[] forSorting = {first.getValue(), second.getValue()};
                    Arrays.sort(forSorting);
                    if (forSorting[0] == forSorting[1]) {
                        return true;
                    }
                    if (tmpOperator.getValue() == Operator.EQUAL ? forSorting[1] == inEquality.get(forSorting[0]) : forSorting[1] == equality.get(forSorting[0])) {
                        return true;
                    } else {
                        if (tmpOperator.getValue() == Operator.EQUAL)  {
                            equality.put(forSorting[0],forSorting[1]); 
                        } else {
                            inEquality.put(forSorting[0],forSorting[1]);
                        }
                        continue;
                    }
                } 
            } else {
                boolean result = tmpOperator.isTautology();
                if (result) {
                    return true;
                }
            }
        }
        return false;*/
    }
    
    /*
    @Override
    public boolean isSatisfiable() {
        boolean satisfiable = false;
        for (int i = 0; i < children.size(); i++) {
            if (children.get(i).isSatisfiable()) {
                satisfiable = true;
            } else {
                children.remove(i);
                i--;
            }
        }
        return satisfiable;
    }*/
    
    @Override
    public boolean isSatisfiable(GlobalCondition gc) {
        for (int i = 0; i < children.size(); i++) {
            if (children.get(i).isSatisfiable(gc)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean isTautology(GlobalCondition gc) {
        int[] sizes = new int[this.children.size()];
        double totalCNFCount = 1;
        int numberOfSubConjuncts = sizes.length;
        for (int i = 0; i < numberOfSubConjuncts; i++) {
            totalCNFCount = (sizes[i] = this.children.get(i).getChildCount()) * totalCNFCount;
        }
        
        int[] old = new int[numberOfSubConjuncts];
        old[numberOfSubConjuncts -1] = -1;
        for (int i = 0; i < totalCNFCount; i++) {
            for (int j = sizes.length - 1; j >= 0; j--) {
                if (((old[j] + 1) % sizes[j]) == 0) {
                    old[j] = 0;
                } else {
                    old[j] ++;
                    break;
                }
            }
            OrOperator tmpOr = new OrOperator();
            for (int j = 0; j < old.length; j++) {
                if (sizes[j] > 1) {
                    tmpOr.children.add(this.children.get(j).children.get(old[j]));                    
                } else {
                    tmpOr.children.add(this.children.get(j));                    
                }
            }
            if (!tmpOr.checkTautology(gc)) {
                return false;
            }
        }
        
        return true;
    }

    @Override
    protected Operator distributeAsCNF(Operator one, Operator two) {
        if (!(one instanceof MathematicalOperator) && two instanceof MathematicalOperator) {
            return distributeAsCNF(two, one);
        } else if (one instanceof MathematicalOperator) {
            if (two instanceof AndOperator) {
                
                AndOperator tmpResult = new AndOperator();
                for (int i = 0; i < two.children.size(); i++) {
                    OrOperator child = new OrOperator();
                    Object tmp;
                    if ((tmp = distributeAsCNF(one, two.children.get(i))) == null) {
                        child.children.add(two.children.get(i));
                        child.children.add(one);
                        tmpResult.children.add(child);
                    } else {
                        tmpResult.children.add((Operator) tmp);
                    }
                    
                }
                return tmpResult;
                
            } else if (two instanceof OrOperator) {
                OrOperator tmpOR = new OrOperator();
                tmpOR.children.add(one);
                for (int i = 0; i < two.children.size(); i++) {
                    tmpOR.children.add(two.children.get(i));
                }
                return tmpOR;
            } else if (two instanceof MathematicalOperator) {
                OrOperator tmpOr = new OrOperator();
                tmpOr.children.add(one);
                tmpOr.children.add(two);
                return tmpOr;
            }
        } else if (one instanceof AndOperator) {
            if (two instanceof AndOperator) {
                AndOperator tmpAND = new AndOperator();
                for (int i = 0; i < one.children.size(); i++) {
                    tmpAND.children.add(distributeAsCNF(one.children.get(i), two));
                }
                return tmpAND.normalize();
            } else if (two instanceof OrOperator) {
                AndOperator tmpAND = new AndOperator();
                for (int i = 0; i < one.children.size(); i++) {
                    tmpAND.children.add(distributeAsCNF(one.children.get(i), two));
                }
                return tmpAND;
            }
        } else if (one instanceof OrOperator) {
            if (two instanceof OrOperator) {
                OrOperator tmpOr = new OrOperator();
                for (int i = 0; i < one.children.size(); i++) {
                    tmpOr.children.add(one.children.get(i));
                }
                for (int i = 0; i < two.children.size(); i++) {
                    tmpOr.children.add(two.children.get(i));
                }
                return tmpOr;
            } else if (two instanceof AndOperator) {
                return distributeAsCNF(two, one);
            }
        }
        return null;
    }

    @Override
    public Operator normalize() {
        HashSet<String> set = new HashSet<String>();
        
        for (int i = 0; i < children.size(); i++) {
            if (children.get(i) instanceof OrOperator) {
                ConditionalArrayList child = children.get(i).children;
                for (int j = 0; j < child.size(); j++) {
                    children.add(child.get(j));
                }
                children.remove(i);
                i--;
            } else if (children.get(i) instanceof AndOperator) {
                children.get(i).normalize();
            } else if (children.get(i) instanceof MathematicalOperator) {
                MathematicalOperator tmpMath = (MathematicalOperator) children.get(i);
                if (set.contains(tmpMath.toString())) {
                    children.remove(i);
                    i--;
                } else {
                    set.add(tmpMath.toString());
                }
            }
        }
        return this;
    }
    
    @Override
    public Operator negate() {
        AndOperator o = new AndOperator();
        for (int i = 0; i < this.children.size(); i++) {
            o.children.add(this.children.get(i).negate());
        }
        return o;
    }

    @Override
    public Operator replaceColumnNames(Hashtable<String, Integer> columns) {
        /*
         * Think: if there exist or inside or.
         */
        OrOperator tmp = (OrOperator) this.clone();
        for (int i = 0; i < tmp.children.size(); i++) {
            Operator o = tmp.children.get(i).replaceColumnNames(columns);
            if (o == null) {
                return null;
            } else if (!o.containsVariable) {
                if (!o.evaluation) {
                    tmp.children.remove(i);
                    i--;
                } 
            } else {
                tmp.containsVariable = true;    
                tmp.children.set(i, o);
            }
        }
        if (tmp.children.size() == 0) {
            return null;
        }
        return tmp;
    }
    
    @Override
    public Operator clone() {
        return super.clone();
    }

}
