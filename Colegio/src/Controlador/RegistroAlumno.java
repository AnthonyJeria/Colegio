package Controlador;

import Negocio.Alumno;
import bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ANTHONY JERIA
 */
public class RegistroAlumno {
    
    public boolean agregarAlumno(Alumno alumno) {
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "INSERT INTO alumno(numRut,dv_rut,Nombre,Snombre,Appaterno,Apmaterno,Edad) VALUES(?,?,?,?,?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, alumno.getNumRut());
            stmt.setString(2, alumno.getDv_rut());
            stmt.setString(3, alumno.getNombre());
            stmt.setString(4, alumno.getSnombre());
            stmt.setString(5, alumno.getAppaterno());
            stmt.setString(6, alumno.getApmaterno());
            stmt.setInt(7, alumno.getEdad());

            stmt.executeUpdate();
            stmt.close();
            cnx.close();

            return true;

        } catch (SQLException e) {

            System.out.println("Error en la consulta insertar Alumno " + e.getMessage());
            return false;
        }
    }
}
