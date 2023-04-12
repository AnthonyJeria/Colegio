package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ANTHONY JERIA
 */
public class Conexion {
    
     public Connection obtenerConexion()
    {
        
        Connection con = null;
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/escuela", "root", "");
            System.out.println("Conexión exitosa");
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error de conexion a BD : " + e.getMessage());
        }
        
        return con;
        
    }
}
