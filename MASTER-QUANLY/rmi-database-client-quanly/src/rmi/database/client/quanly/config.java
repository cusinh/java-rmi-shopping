
package rmi.database.client.quanly;

public class config {
    public static String ServerIP = "";
    public static String ServerPort ="";
    public config(String ServerIP,String ServerPort) {
        config.ServerIP = ServerIP;
        config.ServerPort = ServerPort;
    }
    public static void set(String ServerIP, String ServerPort) {
        config.ServerIP = ServerIP;
        config.ServerPort = ServerPort;
    }

}
