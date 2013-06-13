package org.parser;

import java.util.Iterator;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.postgresql.jdbc2.ResultWrapper;

public class IsFunction extends Query{

    public String inTableName = null;
    public String type;
    public static Select query;
    
    @Override
    public String getPossQLQuery() {
        String condition = "";
        if (isFunctionList.size() < 1 || isFunctionList.size() % 2 != 0) {
            System.out.println("There is no tuple asked.");
            return "ERROR";
        }
        Iterator<Object> it = isFunctionList.iterator();
        while (it.hasNext()) {
            condition += it.next() + " = " + it.next();
            if (it.hasNext()) {
                condition += " AND ";
            }
        }
        String result = "SELECT * From ";
        if (inTableName != null) {
            result += inTableName + " WHERE " + condition +";";
            
            ANTLRStringStream in = new ANTLRStringStream(result);
            CreateTableLexer lexer = new CreateTableLexer(in);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            CreateTableParser parser = new CreateTableParser(tokens);
            try {
                parser.parse();
            } catch (Exception e) {
            }
            result = Query.q.getPossQLQuery();
        } else {
            query.whereCondition.add(condition);
            result +=  "(" + query.getPossQLQuery() + ")";
        }
        return result;
    }

}
