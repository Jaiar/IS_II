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
    public static ArrayList<Enfermedad> getEnfermedades(){
        ResultSet resultados = null;
        ArrayList enfermedades = new ArrayList();
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
                enfermedades.add(ModelFactory.buildEnfermedad(resultados));
            }
        }
        catch(SQLException sqle){
            System.out.println("Error en la retirada de datos: " + sqle.getMessage());
            return null;
        }
        
        return enfermedades;
    }
     
    public static ArrayList getMedicamentosTratan(int id_enf){
        ResultSet resultados = null;
        try {
            String con;
            Statement s = DAO.getConnection().createStatement();
            // Consulta SQL
            con =     "SELECT m.id_medicamento, m.nombre, m.alergias, m.efectos_secundarios, m.cantidad "
                    + "FROM tratamiento t, medicamento m "
                    + "WHERE t.id_medicamento = m.id_medicamento "
                            + "AND id_enfermedad = " + id_enf + ";";
            
            resultados = s.executeQuery(con);
            }
        catch (Exception e) { // Error en al realizar la consulta
            System.out.println("Error en la petición a la BD -- " + e.getMessage());
        }
        
        ArrayList medicamentos = new ArrayList();
        try{
            while(resultados.next()){
                medicamentos.add(ModelFactory.buildMedicamento(resultados));
            }
        }catch (SQLException sqle){}
        
        return medicamentos;
    }
     
    public static ArrayList getEnfermedadesRelacionadas(int id_enf){
    ResultSet resultados = null;
        try {
            String con;
            Statement s = DAO.getConnection().createStatement();
            // Consulta SQL
            con = "SELECT * FROM enfermedad WHERE  enfermedades_relacionadas = "+id_enf+";";
            
            resultados = s.executeQuery(con);
            }
        catch (Exception e) { // Error en al realizar la consulta
            System.out.println("Error en la petición a la BD -!- " + e.getMessage());
        }
        
        ArrayList enfermedades = new ArrayList();
        try{
            while(resultados.next()){
                enfermedades.add(ModelFactory.buildEnfermedad(resultados));
            }
        }catch (SQLException sqle){
            System.out.println("getEnfermedadesRelacionadas @ DAOenfermedad");
            System.out.println(sqle.getMessage());
            return null;
        }
        
        return enfermedades;
     }
}


