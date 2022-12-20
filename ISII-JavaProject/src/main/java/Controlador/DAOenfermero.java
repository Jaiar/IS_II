package Controlador;

import Modelo.Enfermedad;
import Modelo.Enfermero;
import Modelo.Medicamento;
import Modelo.Medico;
import Modelo.Paciente;
import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author algar
 */

public class DAOenfermero {
    
    public static ArrayList getAllEnfermeros(){
        ResultSet resultados = null;
        ArrayList<Enfermero> enfermeros = new ArrayList<Enfermero>();
        try {
            String con;
            Statement s = DAO.getConnection().createStatement();
            // Consulta SQL
            con = "SELECT * FROM usuario WHERE rol = 2";
            resultados = s.executeQuery(con);
            }
        catch (Exception e) { // Error en al realizar la consulta
            System.out.println("Error en la petición a la BD");
        }
        
        try{
            while(resultados.next()){
                Object enf = UserFactory.buildUsuario(resultados);
                
                if( enf instanceof Enfermero)
                    enfermeros.add((Enfermero)enf);
            }
        }
        catch(SQLException sqle){
            System.out.println("Error en la retirada de datos: " + sqle.getMessage());
            return null;
        }
        
        return enfermeros;
    }
    public static ArrayList getMedicos()
    {
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
    public static ArrayList getEnfermedades()
    {
        ResultSet resultados = null;
        
        try {
            String con;
            Statement s = DAO.getConnection().createStatement();
            // Consulta SQL
            con = "SELECT * FROM enfermedad;";
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
    
    public static ArrayList getPacientesATratar(LocalDate ld){
        ResultSet resultados = null;
        ArrayList<Paciente> pacientes = new ArrayList<>();
        
        try {
            String con;
            Statement s = DAO.getConnection().createStatement();
            // Consulta SQL
            con = "SELECT DISTINCT p.* FROM medicamento_paciente mp, paciente p WHERE mp.id_paciente = p.id_paciente AND mp.fecha = '" + ld.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))+ "'"; 
            resultados = s.executeQuery(con);
        }
        catch (Exception e) { // Error en al realizar la consulta
            System.out.println("DAOmedico @ getPacientesATratar -- Error en la petición a la BD");
        }
        
        try{
            while(resultados.next()){
                pacientes.add(ModelFactory.buildPaciente(resultados));
                
            }
        }catch(SQLException sqle){
            System.out.println("DAOmedico @ getPacientesATratar -- Error en retirar datos: " + sqle.getMessage());
            return null;
        }
        
        return pacientes;
    }
    
    public static ArrayList getMedicamentosPaciente(int id_pac, LocalDate ld){
        ResultSet resultados = null;
        ArrayList medicamentos = new ArrayList<>();
        
        try {
            String con;
            Statement s = DAO.getConnection().createStatement();
            // Consulta SQL
            con = "SELECT m.* FROM medicamento_paciente mp, medicamento m WHERE mp.id_paciente = "+ id_pac
                    +" AND mp.fecha = '" + ld.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) + "'"
                    + " AND mp.id_medicamento = m.id_medicamento;";
            resultados = s.executeQuery(con);
        }
        catch (Exception e) { // Error en al realizar la consulta
            System.out.println("DAOmedico @ getMedicamentosPaciente -- Error en la petición a la BD");
        }
        
        try{
            while(resultados.next()){
                medicamentos.add(ModelFactory.buildMedicamento(resultados));
            }
        }catch(SQLException sqle){
            System.out.println("DAOmedico @ getMedicamentosPaciente -- Error en retirar datos: " + sqle.getMessage());
            return null;
        }
        
        return medicamentos;
    }
    
    public static ArrayList getMedicamentosHospital(int cantidad){
        ResultSet resultados = null;
        
        try {
         String con;
         Statement s = DAO.getConnection().createStatement();
         // Consulta SQL
         con = "SELECT * FROM medicamento WHERE cantidad < " + cantidad + ";";
         
         resultados = s.executeQuery(con);
         }
        catch (Exception e) { // Error en al realizar la consulta
            System.out.println("Error en la petición a la BD");
        }
        
        ArrayList<Medicamento> medicamentos = new ArrayList<>();
        
        try{
            while(resultados.next()){
                medicamentos.add(ModelFactory.buildMedicamento(resultados));
            }
        }
        catch(SQLException sqle){
            System.out.println("Error en la retirada de datos: " + sqle.getMessage());
            return null;
        }
        
        return medicamentos;
    }
    
    public static ArrayList getPacientes(int id_enfermero){
        ResultSet resultados = null;
        ArrayList<Paciente> pacientes = new ArrayList<>();
        
        try {
            String con;
            Statement s = DAO.getConnection().createStatement();
            // Consulta SQL
            con = "SELECT * FROM paciente WHERE enfermero = " + id_enfermero;
            resultados = s.executeQuery(con);
        }
        catch (Exception e) { // Error en al realizar la consulta
            System.out.println("DAOenfermero @ getPacientes -- Error en la petición a la BD");
        }
        
        try{
            while(resultados.next()){
                pacientes.add(ModelFactory.buildPaciente(resultados));
            }
        }catch(SQLException sqle){
            System.out.println("DAOenfermero @ getPacientes -- Error en retirar datos: " + sqle.getMessage());
            return null;
        }
        
        return pacientes;
    }
    public static Paciente getDatosPaciente(String dni_paciente){
        ResultSet resultados = null;
        
        try {
            String con;
            Statement s = DAO.getConnection().createStatement();
            // Consulta SQL
            con = "SELECT * FROM paciente WHERE dni_paciente = '"+ dni_paciente + "';";
            resultados = s.executeQuery(con);
        }
        catch (Exception e) { // Error en al realizar la consulta
            System.out.println("DAOenfermero 1@ getPacientesEnVisita -- Error en la petición a la BD\n--" + e.getMessage());
        }
        
        try{
            while(resultados.next()){
                return ModelFactory.buildPaciente(resultados);
            }
        }catch(SQLException sqle){
            System.out.println("DAOenfermero 2@ getPacientesEnVisita \n-- Error en retirar datos: " + sqle.getMessage());
            return null;
        }
        catch(NullPointerException npe){
            System.out.println("DAOenfermero 3@ getPacientesEnVisita \n-- Resultados nulo: " + npe.getMessage());
            return null;
        }
        
        return null;
    }
    
    public static boolean darDeAltaNuevoPaciente(Paciente paciente, Enfermedad enfermedad, LocalDate fecha ){
        ResultSet resultados = null;
         
        try{
            
            String co;
            Statement state = DAO.getConnection().createStatement();
            // Si ya existe le asigno el anterior id
            co = "SELECT * FROM paciente WHERE dni_paciente = " + paciente.getDNI();
            resultados = state.executeQuery(co);
            
            if(co != null)
            {
                Statement ss = DAO.getConnection().createStatement();
                String query = "INSERT INTO paciente "
                    + "VALUES ( " 
                    + resultados.getInt(1) + ","
                    + paciente.getDNI() + ", "
                    + paciente.getNombre() + ", "
                    + paciente.getApellidos() + ", "
                    + paciente.getTelefono() + ", "
                    + paciente.getHabitacion() + ", "
                    + paciente.getMedico() + ", "
                    + paciente.getEnfermero()
                    + ");";
                ss.executeUpdate(query);
            }
            else
            {
                Connection conn = DAO.getConnection();
                Connection con = DAO.getConnection();
                Statement s = conn.createStatement();
                Statement sa = con.createStatement();
                ResultSet rs = sa.executeQuery("SELECT MAX(id_historialmedico)+1 AS max FROM historialmedico;");
                rs.next();
                int id = rs.getInt("max");

                Statement ss = DAO.getConnection().createStatement();
                String query = "INSERT INTO paciente "
                        + "VALUES ( " 
                        + id + ","
                        + paciente.getDNI() + ", "
                        + paciente.getNombre() + ", "
                        + paciente.getApellidos() + ", "
                        + paciente.getTelefono() + ", "
                        + paciente.getHabitacion() + ", "
                        + paciente.getMedico() + ", "
                        + paciente.getEnfermero()
                        + ");";
                ss.executeUpdate(query);
            }
            
            
            
        }catch( SQLException sqle ){
            System.out.println("darDeAlataNuevoPaciente @ DAOmedico -- error en comprobación de datos");
            System.out.println(sqle.getMessage());
            
            return false;
        }
        
        return true;
     }
}
