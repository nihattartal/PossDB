package org.structures;

import java.util.HashSet;



public abstract class BooleanOperator extends Operator{
    
    public int getChildCount() {
        return children.size();
    }
    
    public BooleanOperator() {
        children = new ConditionalArrayList();
    }

    @Override
    public String toString() {
        if (children.size() > 1 ) {
            return "(" + children.join(getOperator(this.getValue())) + ")";
        } else if (children.size() == 1) {
            return children.get(0).toString();
        }
        return null;
    }
    
    @Override
    public boolean containsChildOperator() {
        for (int i = 0; i < children.size(); i++) {
            if (children.get(i) instanceof BooleanOperator) {
                return true;
            }
        }
        return false;
    }
    
    protected abstract Operator distributeAsDNF(Operator one, Operator two);
    
    protected abstract Operator distributeAsCNF(Operator one, Operator two);
    
    public Operator toDNF() {
        for (int i = 0; i < children.size(); i++) {
            Operator tmpDNF = children.get(i).toDNF();
            if (tmpDNF != null) {
                children.set(i, tmpDNF);
            }
        }
        Operator[] oa = new Operator[children.size()];
        oa[0] = children.get(0);
        for (int i = 0; i < children.size() -1; i++) {
             oa[i + 1] = distributeAsDNF(oa[i], children.get(i + 1));
        }
        return (oa[children.size() -1]);
    }
    
    /**
     * @deprecated
     */
    public Operator toCNF() {
        for (int i = 0; i < children.size(); i++) {
            Operator tmpCNF = children.get(i).toCNF();
            if (tmpCNF != null) {
                children.set(i, tmpCNF);
            }
        }        
        Operator[] oa = new Operator[children.size()];
        oa[0] = children.get(0);
        for (int i = 0; i < children.size() -1; i++) {
             oa[i + 1] = distributeAsCNF(oa[i], children.get(i + 1));
        }
        return (oa[children.size() -1]);
    }
    
    @Override
    public boolean contains(Operator o) {
        if (o instanceof MathematicalOperator) {
            for (Operator op : this.children) {
                if (op.toString().equals(o.toString())) {
                    return true;
                }
            }
        } else {
            boolean found = true;
            for (int i = 0; i < o.children.size() && found; i++) {
                found = false;
                for (int j = 0; j < this.children.size(); j++) {
                    if (o.children.get(i).toString().equals(this.children.get(j).toString())) {
                        found = true;
                    }
                }
            }
            return found;
        }
        return false;
    }
    
    @Override
    public Operator absorb() {
        sortChildren(this);
        for (int i = 0; i < this.children.size(); i++) {
            Operator first =  this.children.get(i);
            for (int j = i + 1; j < this.children.size(); j++) {
                Operator second =  this.children.get(j);
                if (second.contains(first)) {
                    this.children.remove(j);
                    j--;
                }
            }
        }
        return this;
    }
    
    private void sortChildren(Operator o) {
        if (o == null) { 
            return;
        }
        int size = o.children.size();
        quickSort(o, 0, size - 1);
    }
    
    private void quickSort(Operator o, int low, int high) {
        int i = low, j = high;
        int pivot = o.children.get(low + (high-low)/2).getChildCount();
        while (i <= j) {
            while (o.children.get(i).getChildCount() < pivot) {
                i++;
            }
            // If the current value from the right list is larger then the pivot
            // element then get the next element from the right list
            while (o.children.get(j).getChildCount() > pivot) {
                j--;
            }
            if (i <= j) {
                Operator tmp = o.children.get(i);
                o.children.set(i, o.children.get(j));
                o.children.set(j , tmp);
                i++;
                j--;
            }
        }
        if (low < j) {
            quickSort(o, low, j);
        }
        if (i < high) {
            quickSort(o, i, high);
        }
    }
    
    @Override
    public Operator clone()  {
        BooleanOperator tmp;
        if (this instanceof AndOperator) {
            tmp = new AndOperator();
        } else {
            tmp = new OrOperator();
        }
        
        tmp.evaluation = evaluation;
        tmp.containsVariable = containsVariable;
        tmp.setValue(this.getValue());
        tmp.children = (ConditionalArrayList) children.clone();
        return tmp;
    }
    

    @Override
    public Operator getConditionalTree() {
        for (int i = 0; i < this.children.size(); i++) {
            this.children.set(i, this.children.get(i).getConditionalTree());
        }
        return this.clone();
    }
    
    public HashSet<String> getAllContainedColumns() {
        HashSet<String> columnNames = new HashSet<String>();
        for (int i = 0; i < this.children.size(); i++) {
            columnNames.addAll(this.children.get(i).getAllContainedColumns());
        }
        return columnNames;
    }
}
