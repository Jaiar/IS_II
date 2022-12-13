package Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;


import Modelo.Enfermedad;
import Modelo.Medicamento;
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
    
    public static ArrayList getHistorial(int id_paciente){
        ResultSet resultados = null;
        
        try{
            Statement s = DAO.getConnection().createStatement();
            
            String query = "SELECT * FROM historialmedico WHERE id_paciente = " + id_paciente + ";";
            
            resultados = s.executeQuery(query);
            
        }catch(SQLException sqle){
            System.out.println("getHistorial @ DAOmedico -- error consulta sql");
            System.out.println(sqle.getMessage());
            return null;
        }
        
        ArrayList historial = new ArrayList();
        
        try{
            while(resultados.next()){
                historial.add(ModelFactory.buildHistorial(resultados));
            }
        }catch(SQLException sqle){
            System.out.println("getHistorial @ DAOmedico -- error recuperando data");
            System.out.println(sqle.getMessage());
        }
        
        return historial;
    }
    
    public static ArrayList getMedicamentos(int id_paciente){
        ArrayList enfermedades = DAOpacientes.getEnfermedades(id_paciente);
        ResultSet resultados = null;
        
        ArrayList<Medicamento> medicamentos = new ArrayList<>();
        
        for(Enfermedad e: (ArrayList<Enfermedad>)enfermedades){
            try{
                Statement s = DAO.getConnection().createStatement();

                String query = "SELECT m.id_medicamento, m.nombre, m.alergias, m.efectos_secundarios, m.cantidad "
                             + "FROM tratamiento t, medicamento m "
                             + "WHERE t.id_enfermedad = " + e.getId()
                             + " AND t.id_medicamento = m.id_medicamento ;";

                resultados = s.executeQuery(query);

            }catch(SQLException sqle){
                System.out.println("getMedicamentos @ DAOpacientes -- error consulta sql");
                System.out.println(sqle.getMessage());
                return null;
            }
            
            try{
            while(resultados.next()){
                medicamentos.add(ModelFactory.buildMedicamento(resultados));
            }
            }catch(SQLException sqle){
                System.out.println("getMedicamentos @ DAOpacietnes -- error recuperando data");
                System.out.println(sqle.getMessage());
            }
        }
        
        return medicamentos;
    }
}
