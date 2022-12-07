package Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author algar
 */
public class DAOhistorial {
    public static Object getEnfermedad(int id_enfer){
        ResultSet resultados = null;
        try {
         String con;
         Statement s = DAO.getConnection().createStatement();
         // Consulta SQL
         con = "SELECT * FROM enfermedad  WHERE id_enfermedad = " + id_enfer +";";
         resultados = s.executeQuery(con);
         }
        catch (Exception e) { // Error en al realizar la consulta
            System.out.println("Error en la petición a la BD");
            return null;
        }
        
        try{
            resultados.next();
            return ModelFactory.buildEnfermedad(resultados);
        }
        catch(SQLException sqle){
            System.out.println("Error en la retirada de datos: " + sqle.getMessage());
            return null;
        }
    }
}
