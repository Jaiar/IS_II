package Controlador;

import Modelo.Enfermedad;
import Modelo.Enfermero;
import Modelo.Medico;
import Modelo.Paciente;
import Modelo.Medicamento;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import java.sql.SQLException;
import java.util.Date;
import java.util.Locale;
/**
 *
 * @author algar
 */
public class DAOmedico {
    
    public static ArrayList getAllMedicos(){
        ResultSet resultados = null;
        
        try {
            String con;
            Statement s = DAO.getConnection().createStatement();
            // Consulta SQL
            con = "SELECT * FROM usuario WHERE rol = 1";
            resultados = s.executeQuery(con);
            }
        catch (Exception e) { // Error en al realizar la consulta
            System.out.println("Error en la petición a la BD");
        }
        
        ArrayList<Medico> medicos = new ArrayList<>();
        try{
            while(resultados.next()){
                int code = resultados.getInt(1);
                String dni = resultados.getNString(2);
                String nombre = resultados.getNString(3);
                String apellidos = resultados.getNString(4);
                int rol = resultados.getInt(5);
                Date fecha = resultados.getDate(6);
                Medico med = new Modelo.Medico(code, nombre, apellidos, dni, "", fecha);
                medicos.add(med);
            }
        }
        catch(SQLException sqle){
            System.out.println("Error en la retirada de datos: " + sqle.getMessage());
            return null;
        }
        
        return medicos;
    }
    
    public static ArrayList getPacientes(int medico_id){
        ResultSet resultados = null;
        ArrayList<Paciente> pacientes = new ArrayList<>();
        
        try {
            String con;
            Statement s = DAO.getConnection().createStatement();
            // Consulta SQL
            con = "SELECT * FROM paciente WHERE medico = " + medico_id;
            resultados = s.executeQuery(con);
        }
        catch (Exception e) { // Error en al realizar la consulta
            System.out.println("DAOmedico @ getPacientes -- Error en la petición a la BD");
        }
        
        try{
            while(resultados.next()){
                int id = resultados.getInt(1);
                String dni = resultados.getNString(2);
                String nombre = resultados.getNString(3);
                String apellidos = resultados.getNString(4);
                int habitacion = resultados.getInt(6);
                int medico_p_id = resultados.getInt(7);
                int enfermero_id = resultados.getInt(8);
                
                pacientes.add(new Paciente(id, dni, nombre, apellidos, medico_p_id, enfermero_id, habitacion));
            }
        }catch(SQLException sqle){
            System.out.println("DAOmedico @ getPacientes -- Error en retirar datos: " + sqle.getMessage());
            return null;
        }
        catch(NullPointerException npe){
            System.out.println("DAOmedico @ getPacientes -- Resultados nulo: " + npe.getMessage());
            return null;
        }
        
        return pacientes;
    }
    
    public static ArrayList<Medicamento> getMedicamentosByNombre(String nombre_medicamento){
        ResultSet resultados = null;
        
        try {
            String con;
            Statement s = DAO.getConnection().createStatement();
            Locale SPANISH = Locale.forLanguageTag("es");
            // Consulta SQL
            con = "SELECT * FROM medicamento WHERE LOWER(nombre) LIKE '" + nombre_medicamento.toLowerCase(SPANISH) + "%';";
            resultados = s.executeQuery(con);
        }
        catch (SQLException e) { // Error en al realizar la consulta
            System.out.println("Error en la petición a la BD");
        }
        
        ArrayList<Medicamento> medicamentos = new ArrayList<>();
        
        try{
            while(resultados.next()){
                int id = resultados.getInt(1);
                String nombre = resultados.getNString(2);
                String alergias = resultados.getNString(3);
                String efectos_secundarios = resultados.getNString(4);
                int cantidad = resultados.getInt(5);
                
                medicamentos.add(new Medicamento(id, nombre, alergias, efectos_secundarios, cantidad));
            }
        }
        catch(SQLException sqle){
            System.out.println("Error en la retirada de datos: " + sqle.getMessage());
            return null;
        }
        
        return medicamentos;
    }
    
    public static ArrayList<Enfermedad> getEnfermedadesByNombre(String nombre_enfermedad){
        ResultSet resultados = null;
        
        try {
            String con;
            Statement s = DAO.getConnection().createStatement();
            // Consulta SQL
            Locale SPANISH = Locale.forLanguageTag("es");
            con = "SELECT * FROM enfermedad WHERE LOWER(nombre) LIKE '" + nombre_enfermedad.toLowerCase(SPANISH) +"%';";
            resultados = s.executeQuery(con);
            }
        catch (SQLException e) { // Error en al realizar la consulta
            System.out.println("getEnfermedadesByNombre @ DAOmedico -- error en la base de datos");
            return null;
        }
        
        ArrayList<Enfermedad> enfermedades = new ArrayList<>();
        
        try{
            while( resultados.next() ){
                int id = resultados.getInt(1);
                String nombre = resultados.getNString(2);
                int enf_rel = resultados.getInt(3);
                boolean contagiosa = resultados.getBoolean(4);
                enfermedades.add(new Enfermedad(id, nombre, contagiosa));
            }
        }catch(SQLException sqle){
            System.out.println("getEnfermedadesByNombre @ DAOmedico -- error en la recogida de datos");
        }
        
        return enfermedades;
    }
    
     public static void setHistorialPaciente(int id){
        ResultSet resultados = null;
        int historial=0;
        int paciente=0;
        int enfermedad=0;
        try {
            String con;
            Statement s = DAO.getConnection().createStatement();
            // Consulta SQL
            con = "SELECT * INTO " +historial+","+paciente+","+enfermedad +"FROM pacientes_enfermedades WHERE id_paciente = " + id;
            resultados = s.executeQuery(con);
         }
        catch (Exception e) { // Error en al realizar la consulta
            System.out.println("Error en la petición a la BD");
        }
        try {
            String con;
            Statement s = DAO.getConnection().createStatement();
            // Consulta SQL
            con = "DELETE FROM pacientes_enfermedades WHERE id_paciente =" + id;
            resultados = s.executeQuery(con);
         }
        catch (Exception e) { // Error en al realizar la consulta
            System.out.println("Error en la petición a la BD");
        }
        
        try {
            String con;
            Statement s = DAO.getConnection().createStatement();
            // Consulta SQL
            con = "INSERT INTO historialmedico (id_historial, id_paciente, id_enfermedad, fecha_alta) VALUES (" + historial +","+paciente+","+enfermedad+",SYSDATE()";
            resultados = s.executeQuery(con);
         }
        catch (Exception e) { // Error en al realizar la consulta
            System.out.println("Error en la petición a la BD");
        }
    }
     
    public static Paciente getPacienteByDNI(String dni){
        ResultSet resultados = null;
        
        try{
            Statement s = DAO.getConnection().createStatement();
            String consult = "SELECT * FROM paciente WHERE dni = '" + dni + "';";
            
            resultados = s.executeQuery(consult);
        }catch( SQLException sqle ){
            System.out.println("getPacientesByDNI @ DAOmedico -- error en la consulta SQL");
            System.out.println(sqle.getMessage());
            return null;
        }
        
        Paciente paciente = null;
        
        try{
            if(! resultados.next() )
                return null;        // No existe ningún paciente con ese dni
            
            int id = resultados.getInt(1);
            
        }catch( SQLException sqle ){
            System.out.println("getPacientesByDNI @ DAOmedico -- error recogiendo los datos");
            System.out.println(sqle.getMessage());
            return null;
        }catch ( NullPointerException npe ){
            System.out.println("getPacientesByDNI @ DAOmedico -- ResultSet nulo");
            return null;
        }
        
        return paciente;
    }
}
