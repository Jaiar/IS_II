package Controlador;

import Modelo.Medicamento;
import Modelo.Paciente;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import java.sql.SQLException;
/**
 *
 * @author algar
 */
public class DAOmedico extends DAO{
    
    public static ArrayList getPacientes(int medico_id){
        ResultSet resultados = null;
        ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
        try {
         String con;
         Statement s = DAOmedico.getConnection().createStatement();
         // Consulta SQL
         con = "SELECT * FROM paciente WHERE medico = " + medico_id;
         resultados = s.executeQuery(con);
         }
        catch (Exception e) { // Error en al realizar la consulta
            System.out.println("Error en la petición a la BD");
        }
        
        try{
            while(resultados.next()){
                String dni = resultados.getNString(2);
                String nombre = resultados.getNString(3);
                String apellidos = resultados.getNString(4);
                int habitacion = resultados.getInt(6);
                int medico_p_id = resultados.getInt(7);
                int enfermero_id = resultados.getInt(8);
                pacientes.add(new Paciente(dni, nombre, apellidos, (ArrayList)null, medico_p_id, enfermero_id, habitacion));
            }
        }
        catch(SQLException sqle){
            System.out.println("Error en la retirada de datos: " + sqle.getMessage());
            return null;
        }
        
        return pacientes;
    }
}
