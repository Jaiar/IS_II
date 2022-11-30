/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Paciente;
import Modelo.Enfermedad;
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
                pacientes.add(new Paciente(id, dni, nombre, apellidos, medico_p_id, enfermero_id, habitacion));
            }
        }
        catch(SQLException sqle){
            System.out.println("Error en la retirada de datos: " + sqle.getMessage());
            return null;
        }
        
        return pacientes;
    }
    
    public static ArrayList getEnfermedades(int id){
        ResultSet resultados = null;
        
        try {
         String con;
         Statement s = DAOmedico.getConnection().createStatement();
         // Consulta SQL
         con = "SELECT e.id_enfermedad, e.nombre, e.enfermedades_relacionadas, e.contagiosa "
                 + " FROM paciente_enfermedades pe JOIN enfermedad e ON (pe.id_enfermedad = e.id_enfermedad)"
                 + " WHERE pe.id_paciente = " + id;
         resultados = s.executeQuery(con);
         }
        catch (Exception e) { // Error en al realizar la consulta
            System.out.println("Error en la petición a la BD: get enfermedades");
            e.printStackTrace();
        }
        ArrayList<Enfermedad> enfermedades = new ArrayList<Enfermedad>();
        try{
            while(resultados.next()){
                int id_e = resultados.getInt(1);
                String nombre = resultados.getNString(2);
                int e_rel = resultados.getInt(3);
                boolean contagiosa = resultados.getInt(4) == 1;
                
                enfermedades.add(new Enfermedad(nombre, null, null, 0.0f, 0, contagiosa));
            }
        }
        catch(SQLException sqle){
            System.out.println("Error en la retirada de datos: " + sqle.getMessage());
            return null;
        }
        catch(NullPointerException npe){
            System.out.println("Error: Null Pointer");
            return null;
        }
        
        return enfermedades;
    }
}
