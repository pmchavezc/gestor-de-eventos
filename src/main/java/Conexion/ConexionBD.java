
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    
    private static String url = "jdbc:postgresql://gestor-eventos.postgres.database.azure.com:5432/proyecto_final";
    private static String user = "Administrador" ;
    private static String password = "Pablo123";
    
    
    public static Connection getConection(){
       try{
           Connection connection = DriverManager.getConnection(url, user, password);            
           return connection;
       }
       catch (SQLException e) {
           System.out.println(e.toString());
           return null;
       }
    }
    
}
