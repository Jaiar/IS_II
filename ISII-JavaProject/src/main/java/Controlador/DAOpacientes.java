/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Paciente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author rrajo
 */
public class DAOpacientes extends DAO{
    
    public static ArrayList getPacientes(){
        ResultSet resultados = null;
        ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
        try {
         String con;
         Statement s = DAOmedico.getConnection().createStatement();
         // Consulta SQL
         con = "SELECT * FROM paciente";
         resultados = s.executeQuery(con);
         }
        catch (Exception e) { // Error en al realizar la consulta
            System.out.println("Error en la petición a la BD");
        }
        
        try{
            ArrayList<String>  enfermedades = new ArrayList<String> ();
            while(resultados.next()){
                int id = resultados.getInt(1);
                String dni = resultados.getNString(2);
                String nombre = resultados.getNString(3);
                String apellidos = resultados.getNString(4);
                int habitacion = resultados.getInt(6);
                int medico_p_id = resultados.getInt(7);
                int enfermero_id = resultados.getInt(8);
                while(resultados.next()){
                    if(resultados.getNString(2) == dni)
                        enfermedades.add(resultados.getNString(9));
                }
                pacientes.add(new Paciente(id, dni, nombre, apellidos, enfermedades, medico_p_id, enfermero_id, habitacion));
            }
        }
        catch(SQLException sqle){
            System.out.println("Error en la retirada de datos: " + sqle.getMessage());
            return null;
        }
        
        return pacientes;
    }
}
