package org.structures;

import java.sql.SQLData;
import java.sql.SQLException;
import java.sql.SQLInput;
import java.sql.SQLOutput;

public class ColumnPair implements SQLData{
    public String name;
    public int value;
    private String m_typeName;
    
    @Override
    public String getSQLTypeName()  {
        return m_typeName;
    }
    @Override
    public void readSQL(SQLInput stream, String typeName) throws SQLException {
        name = stream.readString();
        value = stream.readInt();
        m_typeName = typeName;
    }
    
    @Override
    public void writeSQL(SQLOutput stream) throws SQLException {
        stream.writeString(name);
        stream.writeInt(value);
    }
}
