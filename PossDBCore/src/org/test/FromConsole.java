package org.test;

import org.conditinaldb.Main;

public class FromConsole {

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {

        
        
        int db = 1;
        String type = "ten" ;//, one, five, ten
        
        
        
        /*Main.main(null);
        String database = args[0]; //possdb1, possdb2, possdb3, possdb4, possdb5, possdb6
        String type = args[1]; //half, one, five, ten
        int query = Integer.parseInt(args[2]); // 1,2,3
        Queries q = new Queries();
        q.runQuery(database, type, query);*/
        
        //Main.main(null);
        String database = "possdb1"; //possdb1, possdb2, possdb3, possdb4, possdb5, possdb6
        int query = 9; // 1,2,3
        Queries q = new Queries();
        q.runQuery(database, type, query);
    }

}
