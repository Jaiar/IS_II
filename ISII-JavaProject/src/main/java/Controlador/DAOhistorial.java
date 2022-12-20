package Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

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
    public static ArrayList<String> getHistorial (int id){
       ArrayList<String> vector = new ArrayList<String>();
       Date fecha=null;
       String nombre="";
       
    try {  
        ResultSet resultados = null;
        Statement s = DAO.getConnection().createStatement();
        String consulta;

        consulta = "SELECT h.fecha_alta, e.nombre"
                + " FROM historialmedico h JOIN enfermedad e ON h.id_enfermedad = e.id_enfermedad"
                + " WHERE h.id_paciente = "+id+";";

        resultados = s.executeQuery(consulta);

        while (resultados.next())
        {
            fecha = resultados.getDate(1);
            nombre = resultados.getString(2);

            vector.add(fecha+" - "+nombre);
        }    
           
       }
    catch (SQLException e) {
           System.out.println("Error en la retirada de datos: " + e.getMessage());
           return null;
    }
         
       return vector;
    }
}
