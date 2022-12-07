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
            con = "SELECT * FROM usuario";
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
        
        return pacientes;
    }
}
