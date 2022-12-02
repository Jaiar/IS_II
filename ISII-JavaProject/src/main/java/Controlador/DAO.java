package Controlador;

import Modelo.Usuario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
import java.util.TimeZone;

/**
 *
 * @author Bobby
 */
public class DAO {
    private static Connection conexionBD;
    
    protected DAO(){}
    
    protected final static Connection getConnection(){
        if(conexionBD == null)
            DAO.conectarDB();
        
        return DAO.conexionBD;
    }
    
    protected final static void conectarDB(){
    
        String bd = "jdbc:mysql://localhost/hospitalito?serverTimezone=" + TimeZone.getDefault().getID();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Driver de mysql
            // Conexión usando usuario y clave de administrador de la BD
            conexionBD = DriverManager.getConnection(bd, "root", "root");
        } 
        catch (Exception e) { // Error en la conexión con la BD
            
            System.out.println("Error de conexión");
        }
    }
    
    public final static Usuario autenticarUsuario(String usuario, String contraseña){
        ResultSet resultados = null;
        conectarDB();
        try {
         String con;
         Statement s = conexionBD.createStatement();
         // Consulta SQL
         con = "SELECT * FROM usuario WHERE user = '"+usuario+"' AND pass = '"+contraseña+"'";
         resultados = s.executeQuery(con);
         }
        catch (SQLException e) { // Error en al realizar la consulta
            System.out.println("Error en la petición a la BD");
        }
        // Recoger todos los datos de la consulta.
        int id=0, rol=0;
        String dni_usuario="undefined", nombre="undefined", apellidos="undefined";
        Date fecha_incorporacion = new Date(1900/01/01);
        try{
            while (resultados.next())
            {
            rol = resultados.getInt(5);  
            id = resultados.getInt(1);
            dni_usuario = resultados.getNString(2);
            nombre = resultados.getNString(3);
            apellidos = resultados.getNString(4);
            fecha_incorporacion = resultados.getDate(6);
            }
        }catch(SQLException e){
            // No existe el usuario
            System.out.println("Consulta SQL: " + e.getMessage());
            return null;
        }
        
        return UserFactory.hacerUsuario(UserFactory.Usuario_Tipo.getTipo(rol), 
                  id, nombre, apellidos, dni_usuario, rol, fecha_incorporacion);
    }
}
