package Controlador;

import Modelo.Usuario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.TimeZone;

/**
 *
 * @author Bobby
 */
public class DAO {
    private static Connection conexionBD;
    
    private DAO(){}
    
    public final static Connection getConnection(){
        if(conexionBD == null)
            DAO.conectarDB();
        
        return DAO.conexionBD;
    }
    
    private final static void conectarDB(){
    
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
        
        try {
         String con;
         Statement s = DAO.getConnection().createStatement();
         // Consulta SQL
         con = "SELECT * FROM usuario WHERE user = '"+usuario+"' AND pass = '"+contraseña+"'";
         resultados = s.executeQuery(con);
         }
        catch (SQLException e) { // Error en al realizar la consulta
            System.out.println("Error en la petición a la BD");
        }
        
        try{
            resultados.next();
            
            return UserFactory.buildUsuario(resultados);
            
        }catch( SQLException sqle ){
            System.out.println("autenticarUsuario failed");
            System.out.println(sqle.getMessage());
            return null;
        }
    }
}
