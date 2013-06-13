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

public class MainJoin {
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
        Operator where = Operator.parseExpression("R1B = R2B");
        
        String sql = "SELECT a.R1A, a.R1B, a.R2C, a.R2B, a.COND, b.COND FROM ( " +

                " Select R1.A R1A, R1.B R1B, R2.C R2C, R2.B R2B, R1.COND COND FROM R1,R2 " +
                " WHERE R2.B = R2.B OR R2.B < 0 OR R1.B < 0 " +
                
                
                ") a";
        System.out.println(sql);
        //String resultsql = "Drop table result; Create table result as ( " + sql + " AND (1 = 2) );";
        //ps.execute(resultsql);
        connection.commit();
        long start = System.currentTimeMillis();
        
        ResultSet rs = ps.executeQuery(sql);
        ResultSetMetaData rsmd = rs.getMetaData();
        int columnCount = rsmd.getColumnCount();
        /** Doesn't contain tid and cond */
        String[] columnNames = new String[columnCount - 1];
        for (int i = 1; i < columnCount; i++) {
            columnNames[i - 1] = rsmd.getColumnName(i).toUpperCase();
        }

        int count = 0;
        
        StringBuffer sb = new StringBuffer(25000);
        while(rs.next()) {
            /**Contains tid but not cond*/
            int[] columnValues = new int[columnCount - 1];
            /*tid*/columnValues[0] = rs.getInt(1);
            Hashtable<String, Integer> columns = new Hashtable<String, Integer>();
            for(int i = 0; i < columnCount - 1; i++) {
                //ColumnPair tcp = new ColumnPair();
                columns.put(columnNames[i], columnValues[i] = rs.getInt(i + 1));
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
        //copyManager.copyIn("COPY result from stdin;", new ByteArrayInputStream(sb.toString().getBytes()));
        //connection.commit();
        System.out.println(sb.toString());
        System.out.println(count + "rows, Number of columns " + columnCount);
        System.out.println(System.currentTimeMillis() - start + " ms");
        
        System.out.println("Done");
    }
}
