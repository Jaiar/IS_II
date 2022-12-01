package Controlador;

import Modelo.Enfermedad;
import Modelo.Medicamento;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import java.sql.SQLException;
/**
 *
 * @author Mehdi
 */
public class DAOenfermedad {
     public static ArrayList getEnfermedades(){
        ResultSet resultados = null;
        ArrayList<Enfermedad> enfermedades = new ArrayList<Enfermedad>();
        try {
         String con;
         Statement s = DAO.getConnection().createStatement();
         // Consulta SQL
         con = "SELECT * FROM enfermedad  " ;
         resultados = s.executeQuery(con);
         }
        catch (Exception e) { // Error en al realizar la consulta
            System.out.println("Error en la petición a la BD");
        }
        
        try{
            while(resultados.next()){
                int id = resultados.getInt(1);
                String nombre = resultados.getNString(2);
                int enfer_rel = resultados.getInt(3);
                boolean contagiosa = resultados.getBoolean(4);
                enfermedades.add(new Enfermedad( id, nombre, contagiosa ));
            }
        }
        catch(SQLException sqle){
            System.out.println("Error en la retirada de datos: " + sqle.getMessage());
            return null;
        }
        
        return enfermedades;
    }
     
     public static ArrayList getEnfermedadesRelacionadas(int id){return null;}
}


