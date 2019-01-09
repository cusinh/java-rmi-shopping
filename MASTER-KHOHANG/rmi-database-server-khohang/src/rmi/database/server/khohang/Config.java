
package rmi.database.server.khohang;

public class Config {

    public static String Host = "";
    public static String Username = "";
    public static String Password = "";
    public static String Database = "";
    public static String Port = "";
    public static String ServicePort = "";
    public Config(String Host,String Username,String Password,String Database,String Port,String ServicePort) {
        Config.Host = Host;
        Config.Username = Username;
        Config.Password = Password;
        Config.Database = Database;
        Config.Port = Port;
        Config.ServicePort = ServicePort;
    }
    public static void set(String Host,String Username,String Password,String Database,String Port, String ServicePort) {
        Config.Host = Host;
        Config.Username = Username;
        Config.Password = Password;
        Config.Database = Database;
        Config.Port = Port;
        Config.ServicePort = ServicePort;
    }

}
