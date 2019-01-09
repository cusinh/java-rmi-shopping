
package rmi.database.server.khohang;
import java.sql.*;

public class SQLConnect {
    
    private static Connection _con=null;  
    public  SQLConnect() 
    {
    }
    protected static void driverTest () throws Exception
    {
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        }
        catch(java.lang.ClassNotFoundException e)
        {
            throw new Exception("MySQL JDBC Driver not found ...");
        }
    }
    public static Connection GetConnection() throws Exception 
    {
        String url="";
        try
        {
                driverTest();
                url="jdbc:sqlserver://"+Config.Host.trim()+":"+Config.Port.trim()+";databaseName="+Config.Database+";user="+Config.Username+";password="+Config.Password;
                _con=DriverManager.getConnection(url);  
        }
        catch(java.sql.SQLException e)
        {
           throw new Exception("Khong The Ket Noi Den Database Server ..." + url + e.getMessage());
        }
        return _con; 
    }
  
}