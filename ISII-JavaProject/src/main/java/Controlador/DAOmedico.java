 package Controlador;

import Modelo.Enfermedad;
import Modelo.Medico;
import Modelo.Paciente;
import Modelo.Visita;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.Locale;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
                Medico med = (Medico)UserFactory.buildUsuario(resultados);
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
                pacientes.add(ModelFactory.buildPaciente(resultados));
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
    
    public static ArrayList getVisitas(int id_med, LocalDate ld){
        ResultSet resultados = null;
        ArrayList<Visita> visitas = new ArrayList<>();
        
        try {
            String con;
            Statement s = DAO.getConnection().createStatement();
            // Consulta SQL
            con = "SELECT * FROM visita WHERE id_medico = " + id_med 
                    + " AND fecha_cita = '" + ld.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) + "';";
            resultados = s.executeQuery(con);
        }
        catch (Exception e) { // Error en al realizar la consulta
            System.out.println("DAOmedico @ getVisitas -- Error en la petición a la BD\n--" + e.getMessage());
        }
        
        try{
            while(resultados.next()){
                visitas.add(ModelFactory.buildVisita(resultados));
            }
        }catch(SQLException sqle){
            System.out.println("DAOmedico @ getVisitas \n-- Error en retirar datos: " + sqle.getMessage());
            return null;
        }
        catch(NullPointerException npe){
            System.out.println("DAOmedico @ getVisitas \n-- Resultados nulo: " + npe.getMessage());
            return null;
        }
        
        return visitas;
    }
    
    public static Paciente getPacienteEnVisita(int id_visita){
        ResultSet resultados = null;
        
        try {
            String con;
            Statement s = DAO.getConnection().createStatement();
            // Consulta SQL
            con = "SELECT p.* FROM visita v paciente p WHERE v.id_visita = " + id_visita
                    + " AND v.id_paciente = p.id_paciente";
            resultados = s.executeQuery(con);
        }
        catch (Exception e) { // Error en al realizar la consulta
            System.out.println("DAOmedico @ getPacientesEnVisita -- Error en la petición a la BD\n--" + e.getMessage());
        }
        
        try{
            while(resultados.next()){
                return ModelFactory.buildPaciente(resultados);
            }
        }catch(SQLException sqle){
            System.out.println("DAOmedico @ getPacientesEnVisita \n-- Error en retirar datos: " + sqle.getMessage());
            return null;
        }
        catch(NullPointerException npe){
            System.out.println("DAOmedico @ getPacientesEnVisita \n-- Resultados nulo: " + npe.getMessage());
            return null;
        }
        
        return null;
    }
    
    public static ArrayList getEnfermedadesByNombre(String nombre_enfermedad){
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
                enfermedades.add(ModelFactory.buildEnfermedad(resultados));
            }
        }catch(SQLException sqle){
            System.out.println("getEnfermedadesByNombre @ DAOmedico -- error en la recogida de datos");
        }
        
        return enfermedades;
    }
    
     public static void addToHistorialPaciente(Paciente paciente, Enfermedad enfermedad, LocalDate fecha) throws UnsupportedOperationException {
        ResultSet resultados = null;
        
        // Comprobamos que no exista una transacción ya hecha en la misma fecha
        try{
            Statement s = DAO.getConnection().createStatement();
            
            String query = "SELECT id_paciente "
                        + "FROM historialmedico "
                        + "WHERE id_paciente = " + paciente.getID()
                        + "AND fecha_alta = '" + fecha.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) + "';";
        }catch(SQLException sqle){
            System.out.println("addToHistorialPaciente @ DAOmedico -- error en la query");
            System.out.println(sqle.getMessage());
            sqle.printStackTrace();
        }
        try {
            if ( resultados.next() )
                throw new UnsupportedOperationException("Ya existe una entrada en el historial para esa fecha. \n\t"
                        + "DNI: " + paciente.getDNI() + " -- Fecha: " + fecha + ".");
            
        }catch(SQLException sqle){
            System.out.println("addToHistorialPaciente @ DAOmedico -- error en comprobación de datos");
            System.out.println(sqle.getMessage());
        }
        catch( NullPointerException npe ){
            // Something
            System.out.println(resultados);
        }
        
        try{
            Connection conn = DAO.getConnection();
            Statement s = conn.createStatement();
            
            String query = "INSERT INTO historialmedico (id_historialmedico, id_paciente, id_enfermedad, fecha_alta)"
                    + "VALUES (23, "+ paciente.getID() + ", " + enfermedad.getId() + ",  STR_TO_DATE('" + fecha.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) + "', '%d-%m-%Y'));";
            s.executeUpdate(query);
            conn.commit();
        }catch(SQLException sqle){
            System.out.println("addToHistorialPaciente @ DAOmedico -- error en inserción de datos");
            System.out.println(sqle.getMessage());
        }
    }
     
     public static boolean darDeAltaNuevoPaciente(Paciente paciente, Enfermedad enfermedad, LocalDate fecha ){
        ResultSet resultados = null;
         
        try{
            Statement s = DAO.getConnection().createStatement();
            String query = "INSERT INTO paciente "
                    + "VALUES ( " + paciente.getID() + ","
                    + paciente.getDNI() + ", "
                    + paciente.getNombre() + ", "
                    + paciente.getApellidos() + ", "
                    + paciente.getTelefono() + ", "
                    + paciente.getHabitacion() + ", "
                    + paciente.getMedico() + ", "
                    + paciente.getEnfermero()
                    + ");";
            
            s.executeUpdate(query);
            
        }catch( SQLException sqle ){
            System.out.println("darDeAlataNuevoPaciente @ DAOmedico -- error en comprobación de datos");
            System.out.println(sqle.getMessage());
            
            return false;
        }
        
        return true;
     }
     
    public static Paciente getPacienteByDNI(String dni){
        ResultSet resultados = null;
        
        try{
            Statement s = DAO.getConnection().createStatement();
            String consult = "SELECT * FROM paciente WHERE dni_paciente = '" + dni + "';";
            
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
            
            paciente = ModelFactory.buildPaciente(resultados);
            
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
