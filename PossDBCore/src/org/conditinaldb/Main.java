package org.conditinaldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Hashtable;

import org.parser.CreateTable;
import org.parser.Interpreter;
import org.parser.Query;
import org.parser.Select;
import org.structures.GlobalCondition;
import org.structures.Operator;
import org.structures.exceptions.NotSatisfiableException;
import org.tables.conditional.Functions;

public class Main {
    static Connection connection = null;

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
        Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5433/possdbint", "postgres",
                "123456");
        connection.setAutoCommit(false);
        // PGConnection pConn = (PGConnection)connection;
        // CopyManager copyManager = pConn.getCopyAPI();

        Statement ps = connection.createStatement();
        GlobalCondition gc = new GlobalCondition();
        GlobalLoader.Load(connection, gc);

        Query q = Interpreter.getQuery(System.in);
        String sql = null;
        Operator where = null;
        long start = System.currentTimeMillis();

        if (q instanceof Select) {
            sql = ((Select) q).getPossQLQuery();
            where = ((Select) q).whereConditionAsTree;

            ResultSet rs = ps.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();

            String[] columnNames = new String[columnCount - 1];
            for (int i = 1; i < columnCount; i++) {
                columnNames[i - 1] = rsmd.getColumnName(i).toUpperCase();
            }

            int count = 0;

            StringBuffer sb = new StringBuffer(25000);
            while (rs.next()) {
                /** Contains tid but not cond */
                int[] columnValues = new int[columnCount - 1];
                Hashtable<String, Integer> columns = new Hashtable<String, Integer>();
                for (int i = 0; i < columnCount - 1; i++) {
                    // ColumnPair tcp = new ColumnPair();
                    columns.put(columnNames[i],
                            columnValues[i] = rs.getInt(i + 1));
                }
                String cond = null;
                try {
                    /*
                     * if (rs.getInt(1) == 190) { System.out.println("sds"); }
                     */
                    cond = Functions.conditionFunction(connection, gc, where, /* Local condition*/ rs.getString(columnCount), columns);
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
            // copyManager.copyIn("COPY result from stdin;", new
            // ByteArrayInputStream(sb.toString().getBytes()));
            // connection.commit();
            System.out.println(sb.toString());
            System.out
                    .println(count + "rows, Number of columns " + columnCount);
            System.out.println(System.currentTimeMillis() - start + " ms");
        } else if (q instanceof CreateTable) {
            sql = q.getPossQLQuery();
            System.out.println(sql);
            ps.executeUpdate(sql);
            connection.commit();
        }

        // System.out.println("Done");
        connection.close();
    }
}
