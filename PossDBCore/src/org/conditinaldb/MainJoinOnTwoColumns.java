package org.conditinaldb;

import java.io.ByteArrayInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Hashtable;

import org.postgresql.PGConnection;
import org.postgresql.copy.CopyManager;
import org.structures.GlobalCondition;
import org.structures.Operator;
import org.structures.exceptions.NotSatisfiableException;
import org.tables.conditional.Functions;

public class MainJoinOnTwoColumns {
    static Connection connection = null;
    /**
     * @param args
     */
    public static void main(String[] args) throws Exception{
        Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5433/possdbint", "postgres","123456");
        connection.setAutoCommit(false);
        
        PGConnection pConn = (PGConnection)connection;
        CopyManager copyManager = pConn.getCopyAPI();
        
        Statement ps = connection.createStatement();
        GlobalCondition gc = new GlobalCondition();
        GlobalLoader.Load(connection, gc);
        System.out.println("Global Loaded");
        Operator where = Operator.parseExpression("B = C");
        String sql = "Select * from test where ((B = C) OR (B < 0) OR (C < 0)) ";
        String resultsql = "Drop table result; Create table result as ( " + sql + " AND (1 = 2) );";
        ps.execute(resultsql);
        connection.commit();
        long start = System.currentTimeMillis();
        
        ResultSet rs = ps.executeQuery(sql);
        ResultSetMetaData rsmd = rs.getMetaData();
        int columnCount = rsmd.getColumnCount();
        /** Doesn't contain tid and cond */
        String[] columnNames = new String[columnCount - 2];
        for (int i = 2; i < columnCount; i++) {
            columnNames[i - 2] = rsmd.getColumnName(i).toUpperCase();
        }

        int count = 0;
        
        StringBuffer sb = new StringBuffer(25000);
        while(rs.next()) {
            /**Contains tid but not cond*/
            int[] columnValues = new int[columnCount - 1];
            /*tid*/columnValues[0] = rs.getInt(1);
            Hashtable<String, Integer> columns = new Hashtable<String, Integer>();
            for(int i = 0; i < columnCount - 2; i++) {
                //ColumnPair tcp = new ColumnPair();
                columns.put(columnNames[i], columnValues[i + 1] = rs.getInt(i + 2));
            }
            String cond = null;
            try {
                /*if (rs.getInt(1) == 190) {
                    System.out.println("sds");
                }*/
                cond = Functions.conditionFunction(connection, gc, where, /*Local condition*/rs.getString(columnCount) ,columns);
            } catch (NotSatisfiableException e) {
                continue;
            } catch (Exception e) {
            }
            
            for (int i = 0; i < columnValues.length; i++) {
                sb.append(columnValues[i]).append("\t");
            }
            sb.append((cond == null) ? "" : cond).append("\r\n");
            count++;
        }
        copyManager.copyIn("COPY result from stdin;", new ByteArrayInputStream(sb.toString().getBytes()));
        connection.commit();
        System.out.println(count + "rows, Number of columns " + columnCount);
        System.out.println(System.currentTimeMillis() - start + " ms");
        
        System.out.println("Done");
    }
}
