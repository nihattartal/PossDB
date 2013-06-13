package org.structures;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

import com.google.common.collect.Sets;
import com.google.common.collect.Sets.SetView;

public class AndOperator extends BooleanOperator {
    
    /**
     * 
     */

    public AndOperator() {
        this.setValue(Operator.AND_OPERATOR);
    }

    @Override
    public Operator generateConditionalTree() {
        for (int i = 0; i < children.size(); i++) {
            if (children.get(i).generateConditionalTree() == null) {
                children.remove(i);
                i--;
            } else if (!children.get(i).evaluation) {
                return null;
            }
        }
        if (this.children.size() == 0) {
            return null;
        }
        return this;
    }

    
    @Override
    protected Operator distributeAsDNF(Operator one, Operator two) {
        if (!(one instanceof MathematicalOperator) && two instanceof MathematicalOperator) {
            return distributeAsDNF(two, one);
            /*
             * a and (b or c) :- (a and b) or (a and c)
             */
        } else if (one instanceof MathematicalOperator) {
            if(two instanceof OrOperator) {
                OrOperator tmpResult = new OrOperator();
                for (int i = 0; i < two.children.size(); i++) {
                    AndOperator child = new AndOperator();
                    child.children.add(one);
                    child.children.add(two.children.get(i));
                    tmpResult.children.add(child);
                }
                return tmpResult;
                /*
                 * a and (b and c) :- a and b and c
                 */
            } else if (two instanceof AndOperator) {
                AndOperator tmpAND = new AndOperator();
                tmpAND.children.add(one);
                for (int i = 0; i < two.children.size(); i++) {
                    tmpAND.children.add(two.children.get(i));
                }
                return tmpAND;
            } else {
                AndOperator tmpAND = new AndOperator();
                tmpAND.children.add(one);
                tmpAND.children.add(two);
                return tmpAND;
            }
        } else if (one instanceof OrOperator) {
            /*
             * (a or b) and (c or d) :- (a and c) or (a and d) or (b and c) or (b and d)
             */
            if (two instanceof OrOperator) {
                OrOperator tmpResult = new OrOperator();
                for (int i = 0; i < one.children.size(); i++) {
                    tmpResult.children.add(distributeAsDNF(one.children.get(i),two));
                }
                return tmpResult.normalize();
                /*
                 * (a or b) and (c and d) :- (a and c and d) or (b and c and d)
                 */
            } else if (two instanceof AndOperator) {
                return andOr(two, one);
            }
        } else if (one instanceof AndOperator) {
            if (two instanceof OrOperator) {
                return andOr(one, two);
            } else if (two instanceof AndOperator) {
                AndOperator tmpOr = new AndOperator();
                for (int i = 0; i < one.children.size(); i++) {
                    tmpOr.children.add(one.children.get(i));
                }
                for (int i = 0; i < two.children.size(); i++) {
                    tmpOr.children.add(two.children.get(i));
                }
                return tmpOr;
            }
        }
        return null;
    }
    
    /**
     * Does below example conversion;
     * (a and b) and (c or d) -: (a and b and c) or (a and b and d)
     * 
     * @param one
     * @param two
     * @return
     */
    private Operator andOr(Operator one, Operator two) {
        OrOperator tmpResult = new OrOperator();
        for (int i = 0;  i < two.children.size(); i++) {
            tmpResult.children.add(distributeAsDNF(two.children.get(i), one));
        }
        return tmpResult;
    }

/*    @Override
    public boolean isTautology() {
        for (int i = 0; i < children.size(); i++) {
            boolean result = children.get(i).isTautology();
            if (!result) {
                return false;
            }
        }
        return true;
    }
    */
    
    @Override
    public boolean isSatisfiable(GlobalCondition gc) {
        Satisfiability s = new Satisfiability(gc);
        return s.getResult();
    }
/*
    @Override
    public boolean isSatisfiable(GlobalCondition gc) {
        if (this.isSatisfiable()) {
            for (int i = 0; i < children.size(); i++) {
                if (!children.get(i).isSatisfiable(gc)) {
                    return false;
                } 
            }
            return true;
        }
        return false;
    }
    */
    @Override
    protected Operator distributeAsCNF(Operator one, Operator two) {
        return null;
    }

    @Override
    public Operator normalize() {
        HashSet<String> set = new HashSet<String>();
        for (int i = 0; i < children.size(); i++) {
            if (children.get(i) instanceof AndOperator) {
                ConditionalArrayList child = children.get(i).children;
                for (int j = 0; j < child.size(); j++) {
                    children.add(child.get(j));
                }
                children.remove(i);
                i--;
                //TODO: Think which one is better else of or without elseif call normalize.
            } else if (children.get(i) instanceof OrOperator) {
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
        OrOperator o = new OrOperator();
        for (int i = 0; i < this.children.size(); i++) {
            o.children.add(this.children.get(i).negate());
        }
        return o;
    }
    
    private class Satisfiability {
        Hashtable<Integer, HashSet<Integer>> globalCondition = null;
        
        private Satisfiability(GlobalCondition gc) {
            globalCondition = gc;
            /*Enumeration<Integer> en = gc.keys();
            while (en.hasMoreElements()) {
                int varId = en.nextElement();
                HashSet<Integer> valuations = new HashSet<Integer>();
                Iterator<Integer> it = gc.get(varId).iterator();
                while (it.hasNext()) {
                    valuations.add(it.next());
                }
                globalCondition.put(varId, valuations);
            }*/
        }
        
        
        Hashtable<Integer, Integer> varConst = new Hashtable<Integer, Integer>();
        Hashtable<Integer, HashSet<Integer>> varConstInequality = new Hashtable<Integer, HashSet<Integer>>();
        
        //Variable =,!= Variable    a != b
        Hashtable<Integer, HashSet<Integer>> varVar = new Hashtable<Integer, HashSet<Integer>>();
        Hashtable<Integer, HashSet<Integer>> varVarInequality = new Hashtable<Integer, HashSet<Integer>>();
        
        public boolean getResult() {
            for (int i = 0; i < children.size(); i++) {
                MathematicalOperator m = (MathematicalOperator) children.get(i);
                if (m.isVariableConstantEquality()) {
                    if (m.getValue() == Operator.EQUAL) {
                        if (!addVarConst(m.getVariable().getValue(), m.getConstant().getValue())) {
                            return false;
                        }
                    } else { //Inequality
                        if (!addVarConstInequality(m.getVariable().getValue(), m.getConstant().getValue())) {
                            return false;
                        }
                    }
                } else { //It's var var equality
                    if (m.getValue() == Operator.EQUAL) {
                        if (!addVarVar(m.getLeftOperand().getValue(),m.getRightOperand().getValue())) {
                            return false;
                        } 
                    } else { //Inequality
                        if (!addVarVarInequality(m.getLeftOperand().getValue(),m.getRightOperand().getValue())) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
        
        private boolean addVarVar(int a, int b) {
            HashSet<Integer> list;
            //Add part
            if (!isInList(b, varVar.get(a))) {
                list = new HashSet<Integer>();
                list.add(b);
                varVar.put(a, list);
                list = new HashSet<Integer>();
                list.add(a);
                varVar.put(b, list);
                if (globalCondition.containsKey(a)) {
                    if (globalCondition.containsKey(b)) {
                        SetView<Integer> sw = Sets.intersection(globalCondition.get(a), globalCondition.get(b));
                        if (sw.size() > 0) {
                            HashSet<Integer> hs = setViewToHashSet(sw);
                            globalCondition.remove(a);
                            globalCondition.remove(b);
                            globalCondition.put(a, hs);
                            globalCondition.put(b, hs);
                            if (varConst.get(a) != null && !globalCondition.get(a).contains(varConst.get(a))) {
                                return false;
                            }
                            if (varConst.get(b) != null && !globalCondition.get(b).contains(varConst.get(b))) {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    } else { //b is not in global condition
                        globalCondition.put(b, globalCondition.get(a));
                        if (varConst.get(b) != null && !globalCondition.get(b).contains(varConst.get(b))) {
                            return false;
                        }
                    }
                } else if (globalCondition.containsKey(b)) {
                    globalCondition.put(a, globalCondition.get(b));
                    if (varConst.get(a) != null && !globalCondition.get(a).contains(varConst.get(a))) {
                        return false;
                    }
                }
            }

            //Check in var var equality a=3 and a=b
            if (isInList(a, varVarInequality.get(b))) {
                return false;
            }
            //Find equality left and right ex. add b=3
            Integer tmp;
            if ((tmp = varConst.get(a)) != null) {
                if (!addVarConst(b, tmp)) return false;
            }
            tmp = null;
            if ((tmp = varConst.get(b)) != null) {
                if (!addVarConst(a, tmp)) return false;
            }
            //Find inequality ex a!=3 and a=b then b!=3
            if (isInList(a, varConstInequality.get(b))) {
                list = varConstInequality.get(b);
                for (Integer str : list) {
                    if (!addVarConst(a, str)) {
                        return false;
                    }
                }
            }
            if (isInList(b, varConstInequality.get(a))) {
                list = varConstInequality.get(a);
                for (Integer str : list) {
                    if (!addVarConst(b, str)) {
                        return false;
                    }
                }
            }
            return true;
        }
        
        private boolean addVarConstInequality(int a, int b) {
            HashSet<Integer> list;
            if (globalCondition.containsKey(a) && globalCondition.containsKey(b)) {
                if (Sets.symmetricDifference(globalCondition.get(a), globalCondition.get(b)).size() == 0) {
                    return false;
                }
            }
            //Add part
            if ((list = varConstInequality.get(a)) != null) {
                list.add(b);
            } else {
                list = new HashSet<Integer>();
                list.add(b);
                varConstInequality.put(a, list);
            }

            if (b == varConst.get(a)) {
                return false;
            }
            //Suppose a!=3, check if there is any a=b if there is b!=3 also
            if ((list = varVar.get(a)) != null) {
                for (Integer str : list) {
                    if (!isInList(b, varConstInequality.get(str))) {
                        if (!addVarConstInequality(str, b)) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }

        /**
         * 
         * @param a variable
         * @param b constant
         * @return if its not satisfiable it returns false
         */
        private boolean addVarConst(int a, int b) {
            if (globalCondition != null) {
                if (!globalCondition.get(a).contains(b)) {
                    return false;
                }
            }
            
            
            if (varConst.containsKey(a)) {
                if (b == varConst.get(a)) {
                    return true;
                } else {
                    //Ex. a=3 is already exist you try to add a=4 which is not satisfiable.
                    return false;
                }
            }

            //Add Part
            varConst.put(a, b);

            //Ex. a=3 and a!=3
            if (isInList(b, varConstInequality.get(a))) {
                return false;
            }
            //a=3 and a=b -> b=3 / b=c
            if (varVar.containsKey(a)) {
                HashSet<Integer> list = varVar.get(a);
                for (Integer tmp : list) {
                    if (!addVarConst(tmp, b)) {
                        return false;
                    }
                }
            }
            //a=3 and a!=b -> b!=3
            if (varVarInequality.containsKey(a)) {
                HashSet<Integer> list = varVarInequality.get(a);
                for (Integer str : list) {
                    if (!addVarConstInequality(str, b)) {
                        return false;
                    }
                }
            }
            return true;
        }
        
        private boolean addVarVarInequality(int a, int b) {

            
            if (isInList(a, varVarInequality.get(b))) {
                return true;
            }
            //Add part
            HashSet<Integer> list;
            if ((list = varVarInequality.get(a)) != null) {
                list.add(b);
            } else {
                list = new HashSet<Integer>();
                list.add(b);
                varVarInequality.put(a, list);
            }
            if ((list = varVarInequality.get(b)) != null) {
                list.add(a);
            } else {
                list = new HashSet<Integer>();
                list.add(a);
                varVarInequality.put(b, list);
            }
            //a!=b
            if (isInList(a, varVar.get(b))) {
                return false;
            }
            //a!=b and a=3 -> b!=3
            if (varConst.containsKey(a)) {
                if (!addVarConstInequality(b, varConst.get(a))) {
                    return false;
                }
            }
            if (varConst.containsKey(b)) {
                if (!addVarConstInequality(a, varConst.get(b))) { 
                    return false;
                }
            }
            return true;
        }
        
        private boolean isInList(int key, HashSet<Integer> list) {
            if (list == null) {
                return false;
            }
            for (int str : list) {
                if (key == str) {
                    return true;
                }
            }
            return false;
        }
        
        private HashSet<Integer> setViewToHashSet(SetView<Integer> sw) {
            HashSet<Integer> hs = new HashSet<Integer>();
            Iterator<Integer> it = hs.iterator();
            while (it.hasNext()) {
                hs.add(it.next());
            }
            return hs;
            
        }
    }

    @Override
    public boolean isTautology(GlobalCondition gc) {
        for (int i = 0; i < children.size(); i++) {
            if (children.get(i).isTautology(gc)) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    @Override
    public Operator replaceColumnNames(Hashtable<String, Integer> columns) {
        AndOperator tmp = (AndOperator) this.clone();
        for (int i = 0; i < tmp.children.size(); i++) {
            Operator o = tmp.children.get(i).replaceColumnNames(columns);
            if (o == null) {
                tmp.children.remove(i);
                i--;
            } else if(o.containsVariable) {
                this.containsVariable = true;
                tmp.children.set(i, o);
            } else if (!o.evaluation){
                return null;
            }
        }
        if (children.size() == 0) {
            return null;
        }
        return tmp;
    }
    
    @Override
    public Operator clone() {
        return super.clone();
    }

}
