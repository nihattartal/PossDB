package org.tables.conditional;

import java.sql.Connection;
import java.util.Hashtable;

import org.structures.ColumnPair;
import org.structures.GlobalCondition;
import org.structures.Operator;
import org.structures.exceptions.NotSatisfiableException;

public class Functions {

    /**
     * Returns if given boolean expression is tautology or not.
     */
    /*
     * public static boolean isTautology(String expression, String
     * globalCondition) { //TODO: Implement its not true;
     * 
     * GlobalCondition gc = new GlobalCondition(globalCondition); if (expression
     * == null || expression == "") { return false; } Operator globalTree =
     * null; try { globalTree = Operator.parseExpression(expression); globalTree
     * = globalTree.generateConditionalTree(); } catch (Exception e) { return
     * false; }
     * 
     * return globalTree.getDNFTree().isTautology(gc); }
     */

    /**
     * Is Condition method, returns true if given string starts with # Symbol
     * 
     * @param a
     * @return
     */
    public static boolean isCondition(String a) {
        if (a == null || a.length() < 1) {
            return false;
        }
        if (a.startsWith("(- ") || a.startsWith("-")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isCondition(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public static String mergeConditions(String... conditions) {
        boolean isAfterFirst = false;
        String result = "";
        for (int i = 0; i < conditions.length; i++) {
            if (conditions[i] != null || !"".equals(conditions[i])) {
                if (isAfterFirst) {
                    result += " AND (" + conditions[i] + ")";
                } else {
                    result += "(" + conditions[i] + ")";
                }
            }
        }
        return result;
    }

    /**
     * Maps to fcond in postgresql.
     * 
     * @param columns
     * @return
     * @throws NotSatisfiableException
     */
    public static String conditionFunction(Connection connection,
            GlobalCondition gc, Operator whereTree, String tuppleCond,
            Hashtable<String, Integer> columns) throws NotSatisfiableException {


        // String localCondition;

        
        /*
         * if (tuppleCond != null && !"".equals(tuppleCond)) { if (whereCond ==
         * null || whereCond.equals("")) { localCondition = tuppleCond; } else {
         * localCondition = "(" + whereCond + ") AND (" + tuppleCond + ")"; } }
         * else { localCondition = whereCond; }
         * 
         * Operator tree = Operator.parseExpression(localCondition);
         */

        // Replaces Column Names with the variables if column contains variable.
        // IMPLEMENT : Also removes the constants.
        if (whereTree == null) {
            return null;
        }
        Operator tree = whereTree.replaceColumnNames(columns);
        if (tree == null) {
            return null;
        }

        // TODO: Check what does it do
        // tree = tree.generateConditionalTree();
        if (tree.children.size() == 0) {
            return null;
        }

        tree = tree.getDNFTree();
        if (!tree.isSatisfiable(gc)) {
            throw new NotSatisfiableException();
        }
        if (tree.isTautology(gc)) {
            return "TRUE";
        }

        return tree + "";

    }

    /*
     * public static String setGlobalCondition(String condition) { //String cond
     * = condition.replaceAll("\\-", "var_"); Operator tree =
     * Operator.parseExpression(condition); tree = tree.getDNFTree(); if
     * (tree.isSatisfiable()) { if (tree.isTautology()) { return "TRUE"; } }
     * else { return "FALSE"; } return tree.toString(); }
     */

    /*public static int getGlobalCondition(int variable) {
        try {
            Class.forName("org.postgresql.Driver"); // load the driver
            Connection connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5433/possdbint", "postgres",
                    "123456");
            PreparedStatement ps;
            ps = connection
                    .prepareStatement("Select count(0) from global_condition_3");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            return -6;
        }

        return 6;
    }*/

    /*
     * public static String test(ColumnPair... c) { String result = ""; for
     * (ColumnPair cp : c ) { result += cp.name + " -> " + cp.value; } return
     * result; }
     */
}
