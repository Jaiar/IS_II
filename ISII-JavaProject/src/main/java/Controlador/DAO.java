package Controlador;

import Modelo.Medico;
import Modelo.Enfermero;
import Modelo.Gestor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author Bobby
 */
public class DAO {
    private static Connection conexionBD;
    private static class UsuariosDB {
        public static final short MEDICO = 1;
        public static final short ENFERMERO = 2;
        public static final short GESTOR = 3;
    }
    
    protected DAO(){}
    
    protected final static Connection getConnection(){
        if(conexionBD == null)
            DAO.conectarDB();
        
        return DAO.conexionBD;
    }
    
    private final static void conectarDB(){
    
        String bd = "jdbc:mysql://localhost/hospitalito?serverTimezone=" + TimeZone.getDefault().getID();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Driver de mysql
            // Conexión usando usuario y clave de administrador de la BD
            conexionBD = DriverManager.getConnection(bd, "root", "hospitalito");
        } 
        catch (Exception e) { // Error en la conexión con la BD
            
            System.out.println("Error de conexión");
        }
    }
    
    public final static Object autenticarUsuario(String usuario, String contraseña){
        ResultSet resultados = null;
        try {
         String con;
         Statement s = conexionBD.createStatement();
         // Consulta SQL
         con = "SELECT * FROM usuario WHERE ";
         resultados = s.executeQuery(con);
         }
        catch (Exception e) { // Error en al realizar la consulta
            System.out.println("Error en la petición a la BD");
        }
        
        Object usuario_devuelto;
        // Recoger todos los datos de la consulta.
        int id;
        short rol;
        String dni_usuario;
        String nombre;
        String apellidos;
        Date fecha_incorporacion;
        try{
            rol = resultados.getShort(5);
            id = resultados.getInt(1);
            dni_usuario = resultados.getNString(2);
            nombre = resultados.getNString(3);
            apellidos = resultados.getNString(4);
            fecha_incorporacion = resultados.getDate(6);
        }catch(SQLException e){
            // No existe el usuario
            System.out.println("Consulta SQL: " + e.getMessage());
            return null;
        }
        
        switch(rol){
            case UsuariosDB.MEDICO:
                usuario_devuelto = new Medico(null, id, nombre, apellidos, dni_usuario, null, fecha_incorporacion);
                break;
            case UsuariosDB.ENFERMERO:
                usuario_devuelto = new Enfermero(id, nombre, apellidos, dni_usuario, null, fecha_incorporacion, null);
                break;
            case UsuariosDB.GESTOR:
                usuario_devuelto = new Gestor(null, id, nombre, apellidos, dni_usuario, null, fecha_incorporacion);
                break;
            default:
                return null;
        }
        
        return usuario_devuelto;
    }
}
