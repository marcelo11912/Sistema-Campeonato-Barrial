package Conexion;

import java.sql.*;

public class Conexion {

    public static final String URL = "jdbc:mysql://algoritmo-cam.ccfwonllebuw.us-east-2.rds.amazonaws.com/barrial";
    public static final String USERNAME = "admin";
    public static final String PASSWORD = "marcelo11912";
    PreparedStatement ps;
    ResultSet rs;
    //autoReconnect=true&useSSL=false
//useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    public Connection Conexion() {
        Connection coneccion = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            coneccion = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Conexion exitosa");
            
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        return coneccion;

    }

}
































