package Controlador;

import Modelo.Medico;
import Modelo.Paciente;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import java.sql.SQLException;
import java.util.Date;
/**
 *
 * @author algar
 */
public class DAOmedico extends DAO{
    
     public static ArrayList getAllMedicos(){
        DAO.conectarDB();
        ResultSet resultados = null;
        ArrayList<Medico> medicos = new ArrayList<Medico>();
        try {
            String con;
            Statement s = DAOenfermero.getConnection().createStatement();
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
        ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
        try {
         String con;
         Statement s = DAOmedico.getConnection().createStatement();
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
            while(resultados.next()){
                String dni = resultados.getNString(2);
                String nombre = resultados.getNString(3);
                String apellidos = resultados.getNString(4);
                int habitacion = resultados.getInt(6);
                int medico_p_id = resultados.getInt(7);
                int enfermero_id = resultados.getInt(8);
                while(resultados.next() && resultados.getNString(2) == dni){
                    enfermedades.add(resultados.getNString(9));
                }
                pacientes.add(new Paciente(dni, nombre, apellidos, enfermedades, medico_p_id, enfermero_id, habitacion));
            }
        }
        catch(SQLException sqle){
            System.out.println("Error en la retirada de datos: " + sqle.getMessage());
            return null;
        }
        
        return pacientes;
    }
}
