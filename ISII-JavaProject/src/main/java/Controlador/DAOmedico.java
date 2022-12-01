package Controlador;

import Modelo.Medico;
import Modelo.Paciente;
import Modelo.Medicamento;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import java.sql.SQLException;
import java.util.Date;
/**
 *
 * @author algar
 */
public class DAOmedico {
    
     public static ArrayList getAllMedicos(){
        DAO.conectarDB();
        ResultSet resultados = null;
        ArrayList<Medico> medicos = new ArrayList<Medico>();
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
    
    public static ArrayList getPacientes2(int medico_id){
        ResultSet resultados = null;
        ArrayList<Paciente> pacientes = new ArrayList<>();
        System.out.print("ESTOY EN GET PACIENTES\n");
        try {
            String con;
            Statement s = DAO.getConnection().createStatement();
            // Consulta SQL
            con = "SELECT p.id_paciente, p.dni_paciente, p.nombre, p.apellidos, "
                    + "p.telefono, p.habitacion, p.medico, p.enfermero, e.nombre "   
                    + "FROM (paciente p JOIN paciente_enfermedades pe ON "
                    + "p.id_paciente = pe.id_paciente ) JOIN enfermedad e "
                    + "ON e.id_enfermedad = pe.id_enfermedad "
                    + "WHERE p.medico = " + medico_id;
            resultados = s.executeQuery(con);
        }
        catch (Exception e) { // Error en al realizar la consulta
            System.out.println("Error en la petición a la BD");
        }
        
        try{
            ArrayList<String>  enfermedades = new ArrayList<String> ();
            
            resultados.next();
                    
            int id = resultados.getInt(1);
            String dni = resultados.getNString(2);
            String nombre = resultados.getNString(3);
            String apellidos = resultados.getNString(4);
            int habitacion = resultados.getInt(6);
            int medico_p_id = resultados.getInt(7);
            int enfermero_id = resultados.getInt(8);
            if(!enfermedades.contains(resultados.getNString(9)))
                enfermedades.add(resultados.getNString(9));
            
            while(resultados.next()){
                if(id == resultados.getInt(1))
                {
                    if(!enfermedades.contains(resultados.getNString(9)))
                        enfermedades.add(resultados.getNString(9));
                }
                else{
                    pacientes.add(new Paciente(id, dni, nombre, apellidos, medico_p_id, enfermero_id, habitacion));
                    enfermedades = new ArrayList<String> ();
                
                    id = resultados.getInt(1);
                    dni = resultados.getNString(2);
                    nombre = resultados.getNString(3);
                    apellidos = resultados.getNString(4);
                    habitacion = resultados.getInt(6);
                    medico_p_id = resultados.getInt(7);
                    enfermero_id = resultados.getInt(8);
                    
                    if(!enfermedades.contains(resultados.getNString(9)))
                        enfermedades.add(resultados.getNString(9));
                }
            }
            pacientes.add(new Paciente(id, dni, nombre, apellidos, medico_p_id, enfermero_id, habitacion)); 
        }
        catch(SQLException sqle){
            System.out.println("Error en la retirada de datos: " + sqle.getMessage());
            return null;
        }
        System.out.print("SALGo EN GET PACIENTES\n");
        return pacientes;
    }
    
    public static ArrayList getMedicamentosByNombre(String nombre_medicamento){
        ResultSet resultados = null;
        
        try {
            String con;
            Statement s = DAO.getConnection().createStatement();
            // Consulta SQL
            con = "SELECT * FROM medicamentos WHERE LOWER(nombre) LIKE '" + nombre_medicamento.toLowerCase() + "%';";
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
}
