package org.test;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Hashtable;

import org.conditinaldb.GlobalLoader;
import org.postgresql.PGConnection;
import org.postgresql.copy.CopyManager;
import org.structures.GlobalCondition;
import org.structures.Operator;
import org.structures.exceptions.NotSatisfiableException;
import org.tables.conditional.Functions;

public class Queries {

    private Connection connection;
    public void runQuery(String database, String type, int query) throws Exception {
        if (query == 1) {
            Q1(database, type);
        } else if (query == 2) {
            Q2(database, type);
        } else if (query == 3) {
            Q3(database, type);
        } else if (query == 4) {
            Q4(database, type);
        } else if (query == 5) {
            Q5(database, type);
        } else {
            join(database);
        }
    }
    
    private void Q1(String database, String type) throws Exception{
        Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5433/" + database, "postgres","123456");
        connection.setAutoCommit(false);
        //PGConnection pConn = (PGConnection)connection;
        //CopyManager copyManager = pConn.getCopyAPI();
        
        Statement ps = connection.createStatement();
        GlobalCondition gc = new GlobalCondition();
        GlobalLoader.LoadForTest(type, connection, gc);
        //System.out.println("Global Loaded");
        
        Operator where = Operator.parseExpression("VETSTAT = 8 AND  CITIZEN = 9");
        String sql = "Select * from " + type + ".rt where (VETSTAT = 8 OR VETSTAT < 0) AND  (CITIZEN = 9 OR CITIZEN < 0) ";
        FileWriter fstream = new FileWriter("f:\\Tests\\Outs\\Q1-" + database + "-" + type+  ".txt");
        BufferedWriter out = new BufferedWriter(fstream);
        //String resultsql = "Drop table result; Create table result as ( " + sql + " AND (1 = 2) );";
        //ps.execute(resultsql);
        //connection.commit();
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
        //copyManager.copyIn("COPY result from stdin;", new ByteArrayInputStream(sb.toString().getBytes()));
        //connection.commit();
        out.write(sb.toString());
        System.out.println(System.currentTimeMillis() - start + " ms");
        System.out.println(count + "rows");
        out.close();
        System.out.println("----DONE");
    }
        
    private void Q2(String database, String type) throws Exception{
        Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5433/" + database, "postgres","123456");
        connection.setAutoCommit(false);
        PGConnection pConn = (PGConnection)connection;
        CopyManager copyManager = pConn.getCopyAPI();
        
        Statement ps = connection.createStatement();
        GlobalCondition gc = new GlobalCondition();
        GlobalLoader.LoadForTest(type, connection, gc);
        //System.out.println("Global Loaded");
        
        Operator where = Operator.parseExpression("(SUBFAM = 5 OR SUBFAM = 6 OR SUBFAM = 7 OR SUBFAM = 8 OR SUBFAM = 9) AND (CITIZEN = 1) AND (STATEFIP = OCC1990)");
        String sql = "Select TID, STATEFIP, CITIZEN, SUBFAM, OCC1990, COND  from " + type + ".rt where (SUBFAM = 5 OR SUBFAM = 6 OR SUBFAM = 7 OR SUBFAM = 8 OR SUBFAM = 9 OR SUBFAM < 0) AND (CITIZEN = 1 OR CITIZEN < 0) AND (STATEFIP = OCC1990 OR STATEFIP < 0 OR OCC1990 < 0) ";
        //FileWriter fstream = new FileWriter("f:\\Tests\\Outs\\Q2-" + database + "-" + type+  ".txt");
        //BufferedWriter out = new BufferedWriter(fstream);
        String resultsql = "Create table " + type + ".r3 (  TID integer, STATEFIP integer, CITIZEN integer, SUBFAM integer, COND text );";
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
                if (rs.getInt(1) == 55337) {
                    System.out.println("sds");
                }
                cond = Functions.conditionFunction(connection, gc, where, /*Local condition*/rs.getString(columnCount) ,columns);
            } catch (NotSatisfiableException e) {
                continue;
            } catch (Exception e) {
            }
            
            for (int i = 0; i < 4; i++) {
                sb.append(columnValues[i]).append("\t");
            }
            sb.append((cond == null) ? "" : cond).append("\r\n");
            count++;
        }
        copyManager.copyIn("COPY " + type + ".r3 from stdin;", new ByteArrayInputStream(sb.toString().getBytes()));
        connection.commit();
        //out.write(sb.toString());
        System.out.println(System.currentTimeMillis() - start + " ms");
        System.out.println(count + "rows");
        //out.close();
        System.out.println("----DONE");
    }
    
    private void Q3(String database, String type) throws Exception{
        Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5433/" + database, "postgres","123456");
        connection.setAutoCommit(false);
        PGConnection pConn = (PGConnection)connection;
        CopyManager copyManager = pConn.getCopyAPI();
        
        Statement ps = connection.createStatement();
        GlobalCondition gc = new GlobalCondition();
        GlobalLoader.LoadForTest(type, connection, gc);
        //System.out.println("Global Loaded");
        
        Operator where = Operator.parseExpression("(CITIZEN = 1 OR CITIZEN = 2 OR CITIZEN = 3 OR CITIZEN = 4 OR CITIZEN = 5) AND (SPEAKENG = 4 OR SPEAKENG = 5 OR SPEAKENG = 6 OR SPEAKENG = 7 OR SPEAKENG = 8)");
        String sql = "Select TID, STATEFIP, CITIZEN, GQ, SPEAKENG, COND  from " + type + ".rt where (CITIZEN = 1 OR CITIZEN = 2 OR CITIZEN = 3 OR CITIZEN = 4 OR CITIZEN = 5 OR CITIZEN < 0) AND (SPEAKENG = 4 OR SPEAKENG = 5 OR SPEAKENG = 6 OR SPEAKENG = 7 OR SPEAKENG = 8 OR SPEAKENG < 0) ";
        //FileWriter fstream = new FileWriter("f:\\Tests\\Outs\\Q3-" + database + "-" + type+  ".txt");
        //BufferedWriter out = new BufferedWriter(fstream);
        String resultsql = "Create table " + type + ".r2 ( TID integer , STATEFIP integer, CITIZEN integer, GQ integer, COND text );";
        ps.execute(resultsql);
        //connection.commit();
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
            
            for (int i = 0; i < 4; i++) {
                sb.append(columnValues[i]).append("\t");
            }
            sb.append((cond == null) ? "" : cond).append("\r\n");
            count++;
        }
        copyManager.copyIn("COPY " + type + ".r2 from stdin;", new ByteArrayInputStream(sb.toString().getBytes()));
        connection.commit();
        //out.write(sb.toString());
        System.out.println(System.currentTimeMillis() - start + " ms");
        System.out.println(count + "rows");
        //out.close();
        System.out.println("----DONE");
    }
    
    private void Q4(String database, String type) throws Exception{
        Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5433/" + database, "postgres","123456");
        connection.setAutoCommit(false);
        //PGConnection pConn = (PGConnection)connection;
        //CopyManager copyManager = pConn.getCopyAPI();
        
        Statement ps = connection.createStatement();
        GlobalCondition gc = new GlobalCondition();
        GlobalLoader.LoadForTest(type, connection, gc);
        //System.out.println("Global Loaded");
        
        Operator where = Operator.parseExpression("(STATEFIP1 = 51 OR STATEFIP1 = 53 OR STATEFIP1 = 54 OR STATEFIP1 = 55 OR STATEFIP1 = 56 OR STATEFIP1 = 61 OR STATEFIP1 = 62 OR STATEFIP1 = 63 OR STATEFIP1 = 64 OR STATEFIP1 = 65 OR STATEFIP1 = 66 OR STATEFIP1 = 67 OR STATEFIP1 = 68 OR STATEFIP1 = 72 OR STATEFIP1 = 97 OR STATEFIP1 = 99) AND (STATEFIP1 = STATEFIP2)");
        String sql = "Select a.TID, a.STATEFIP STATEFIP1, b.STATEFIP STATEFIP2, a.CITIZEN, a.GQ, b.SUBFAM, "+ type + ".merge_condition(a.cond, b.cond) as cond from " + type + ".r2 a, " + type + ".r3 b where (a.STATEFIP = 51 OR a.STATEFIP = 53 OR a.STATEFIP = 54 OR a.STATEFIP = 55 OR a.STATEFIP = 56 OR a.STATEFIP = 61 OR a.STATEFIP = 62 OR a.STATEFIP = 63 OR a.STATEFIP = 64 OR a.STATEFIP = 65 OR a.STATEFIP = 66 OR a.STATEFIP = 67 OR a.STATEFIP = 68 OR a.STATEFIP = 72 OR a.STATEFIP = 97 OR a.STATEFIP = 99 OR a.STATEFIP < 0) AND (a.STATEFIP = b.STATEFIP OR b.STATEFIP < 0 OR a.STATEFIP < 0) ";
        FileWriter fstream = new FileWriter("f:\\Tests\\Outs\\Q4-" + database + "-" + type+  ".txt");
        BufferedWriter out = new BufferedWriter(fstream);
        //String resultsql = "Create table " + type + ".r2 ( TID integer , STATEFIP integer, CITIZEN integer, GQ integer, COND text );";
        //ps.execute(resultsql);
        //connection.commit();
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
            
            for (int i = 0; i < 4; i++) {
                sb.append(columnValues[i]).append("\t");
            }
            sb.append((cond == null) ? "" : cond).append("\r\n");
            count++;
        }
        //copyManager.copyIn("COPY " + type + ".r2 from stdin;", new ByteArrayInputStream(sb.toString().getBytes()));
        //connection.commit();
        out.write(sb.toString());
        System.out.println(System.currentTimeMillis() - start + " ms");
        System.out.println(count + "rows");
        out.close();
        System.out.println("----DONE");
    }
    
    private void Q5(String database, String type) throws Exception{
        Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5433/" + database, "postgres","123456");
        connection.setAutoCommit(false);
        //PGConnection pConn = (PGConnection)connection;
        //CopyManager copyManager = pConn.getCopyAPI();
        
        Statement ps = connection.createStatement();
        GlobalCondition gc = new GlobalCondition();
        GlobalLoader.LoadForTest(type, connection, gc);
        //System.out.println("Global Loaded");
        
        Operator where = Operator.parseExpression("SPEAKENG = 4 OR SPEAKENG = 5 OR SPEAKENG = 6 OR SPEAKENG = 7 OR SPEAKENG = 8");
        String sql = "Select STATEFIP, OCC1990, SPEAKENG, COND from " + type + ".rt where (SPEAKENG = 4 OR SPEAKENG = 5 OR SPEAKENG = 6 OR SPEAKENG = 7 OR SPEAKENG = 8 OR SPEAKENG < 0) ";
        FileWriter fstream = new FileWriter("f:\\Tests\\Outs\\Q5-" + database + "-" + type+  ".txt");
        BufferedWriter out = new BufferedWriter(fstream);
        //String resultsql = "Drop table result; Create table result as ( " + sql + " AND (1 = 2) );";
        //ps.execute(resultsql);
        //connection.commit();
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
            
            for (int i = 0; i < 2; i++) {
                sb.append(columnValues[i]).append("\t");
            }
            sb.append((cond == null) ? "" : cond).append("\r\n");
            count++;
        }
        //copyManager.copyIn("COPY result from stdin;", new ByteArrayInputStream(sb.toString().getBytes()));
        //connection.commit();
        out.write(sb.toString());
        System.out.println(System.currentTimeMillis() - start + " ms");
        System.out.println(count + "rows");
        out.close();
        System.out.println("----DONE");
    }
    
    
    private void join(String database) throws Exception{
        Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5433/" + database, "postgres","123456");
        connection.setAutoCommit(false);
        //PGConnection pConn = (PGConnection)connection;
        //CopyManager copyManager = pConn.getCopyAPI();
        
        Statement ps = connection.createStatement();
        GlobalCondition gc = new GlobalCondition();
        GlobalLoader.Load(connection, gc);
        //System.out.println("Global Loaded");
        
        Operator where = Operator.parseExpression("(dept2 = dept1) and (gend1 = 11) and (gend2 = 12)".toUpperCase());
        String sql = "Select 1 as tid, e1.Name as Name1, e2.Name as Name2, e1.dept as dept1, e2.dept as dept2, e1.gender as gend1, e2.gender as gend2, e1.cond as cond From emp e1, emp e2 where (e1.dept = e2.dept or e1.dept < 0 or e2.dept< 2) and (e1.gender = 11 or e1.gender < 0) and  (e2.gender = 12 or e2.gender < 0)";
        FileWriter fstream = new FileWriter("f:\\Tests\\Outs\\Q4-" + database + "-.txt");
        BufferedWriter out = new BufferedWriter(fstream);
        //String resultsql = "Create table " + type + ".r2 ( TID integer , STATEFIP integer, CITIZEN integer, GQ integer, COND text );";
        //ps.execute(resultsql);
        //connection.commit();
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
            
            for (int i = 0; i < 3; i++) {
                sb.append(columnValues[i]).append("\t");
            }
            sb.append((cond == null) ? "" : cond).append("\r\n");
            count++;
        }
        //copyManager.copyIn("COPY " + type + ".r2 from stdin;", new ByteArrayInputStream(sb.toString().getBytes()));
        //connection.commit();
        System.out.println(sb.toString());
        System.out.println(System.currentTimeMillis() - start + " ms");
        System.out.println(count + "rows");
        out.close();
        System.out.println("----DONE");
    }
}
