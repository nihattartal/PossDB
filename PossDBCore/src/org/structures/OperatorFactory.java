package org.structures;
import java.util.Arrays;
import java.util.HashSet;


public class OperatorFactory {
    /*private static final String[] mathOperators = {"=",
                                                   "!=",
                                                   "<>",
                                                   "IS",
                                                   "IS NOT"};
    private static final HashSet<String> mathematicalSet = new HashSet<String>(Arrays.asList(mathOperators));*/
    
    private static final String[] boolOperators = {"AND",
                                                   "OR"};
private static final HashSet<String> boolSet = new HashSet<String>(Arrays.asList(boolOperators));
    
    public static Operator getOperator(String operator) {
        if (boolSet.contains(operator)) {
            if (operator.equals("AND")) {
                return new AndOperator();
            } else {
                return new OrOperator();
            }
        } else {
            return new MathematicalOperator(operator.equals("=") ? Operator.EQUAL : Operator.INEQUAL);
        }
    }
    //TODO: Buyuk ihtimalle su member i kaldirip mathematical operator u comment leyeseksin.
    private OperatorFactory() {
    }
}
