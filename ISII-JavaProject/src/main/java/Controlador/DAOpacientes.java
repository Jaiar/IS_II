package Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;

/**
 *
 * @author rrajo
 */
public class DAOpacientes {
    
    public static ArrayList getAllPacientes(){
        ResultSet resultados = null;
        ArrayList pacientes = new ArrayList();
        try {
         String con;
         Statement s = DAO.getConnection().createStatement();
         // Consulta SQL
         con = "SELECT * FROM paciente";
         resultados = s.executeQuery(con);
         }
        catch (Exception e) { // Error en al realizar la consulta
            System.out.println("Error en la petición a la BD");
        }
        
        try{
            while(resultados.next()){
                
                pacientes.add(ModelFactory.buildPaciente(resultados));

            }
        }
        catch(SQLException sqle){
            System.out.println("Error en la retirada de datos: " + sqle.getMessage());
            return null;
        }
        
        return pacientes;
    }
    
    public static ArrayList getEnfermedades(int id_paciente){
        ResultSet resultados = null;
        
        try {
         String con;
         Statement s = DAO.getConnection().createStatement();
         // Consulta SQL
         con = "SELECT e.id_enfermedad, e.nombre, e.enfermedades_relacionadas, e.contagiosa "
                 + " FROM paciente_enfermedades pe JOIN enfermedad e ON (pe.id_enfermedad = e.id_enfermedad)"
                 + " WHERE pe.id_paciente = " + id_paciente;
         resultados = s.executeQuery(con);
        }
        catch (SQLException sqle) { // Error en al realizar la consulta
            System.out.println("getEnfermedades @ DAOpacientes error en query");
            System.out.println(sqle.getMessage());
        }
        
        ArrayList enfermedades = new ArrayList();
        
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
    
    public static ArrayList getEnfermedadesByDNI(String dni){
        ResultSet resultados = null;
        
        try {
            String con;
            Statement s = DAO.getConnection().createStatement();
            // Consulta SQL
            con = "SELECT id_paciente FROM paciente WHERE dni_paciente = '" + dni + "'";
            resultados = s.executeQuery(con);
        }
        catch (Exception e) { // Error en al realizar la consulta
            System.out.println("Error en la petición a la BD: get enfermedades");
            e.printStackTrace();
        }
        
        try{
            resultados.next();
            return DAOpacientes.getEnfermedades(resultados.getInt(1));
        }
        catch(SQLException sqle){
            System.out.println("Error en la retirada de datos: " + sqle.getMessage());
            return null;
        }
        catch(NullPointerException npe){
            System.out.println("Error: Null Pointer");
            return null;
        }
    }
}
