package org.conditinaldb;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.structures.GlobalCondition;

public class GlobalLoader {
    
    public static GlobalLoader Loader = new GlobalLoader();
    
    private GlobalLoader() {
    }
    
    public static void Load(Connection c, GlobalCondition gc) {
        try {
            Statement ps = c.createStatement();
            ResultSet rs = ps.executeQuery("Select * From cond");
            while(rs.next()) {
                gc.addVariable(rs.getInt(1), rs.getString(2));
            }
            rs.close();
        } catch (Exception e) {
            System.out.println("Problem with global condition loader");
        }
        
    }
    
    public static void LoadForTest(String type, Connection c, GlobalCondition gc) {
        try {
            Statement ps = c.createStatement();
            ResultSet rs = ps.executeQuery("Select * From " + type + ".global_condition");
            while(rs.next()) {
                gc.addVariable(rs.getInt(1),rs.getString(2));
            }
            rs.close();
        } catch (Exception e) {
            System.out.println("Problem with global condition loader");
        }
        
    }
}
