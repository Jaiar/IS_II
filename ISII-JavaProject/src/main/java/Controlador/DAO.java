package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.TimeZone;

/**
 *
 * @author Bobby
 */
public class DAO {
    Connection conexionBD;
    public void Conectar(){
    
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
    public void Probar(){
         ResultSet resultados = null;
        try {
         String con;
         Statement s = conexionBD.createStatement();
         // Consulta SQL
         con = "SELECT * FROM medicamento";
         resultados = s.executeQuery(con);
         while (resultados.next()) {
         int id = resultados.getInt("id_medicamento");
         System.out.print(id);
         }
        } catch (Exception e) { // Error en al realizar la consulta
         System.out.println("Error en la petición a la BD");
        }
    }
}
