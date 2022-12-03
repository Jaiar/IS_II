package Controlador;

import Modelo.Enfermero;
import Modelo.Medicamento;
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
                int code = resultados.getInt(1);
                String dni = resultados.getNString(2);
                String nombre = resultados.getNString(3);
                String apellidos = resultados.getNString(4);
                int rol = resultados.getInt(5);
                Date fecha = resultados.getDate(6);
                Enfermero enf = new Modelo.Enfermero(code, nombre, apellidos, dni, null, fecha);
                enfermeros.add(enf);
            }
        }
        catch(SQLException sqle){
            System.out.println("Error en la retirada de datos: " + sqle.getMessage());
            return null;
        }
        
        return enfermeros;
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
                int id_med = resultados.getInt(1);
                String nombre = resultados.getNString(2);
                String alergias = resultados.getNString(3);
                String efect_secund = resultados.getNString(4);
                int cantidad_med = resultados.getInt(5);
                
                medicamentos.add(new Medicamento(id_med, nombre, alergias, efect_secund, cantidad_med));
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
}
