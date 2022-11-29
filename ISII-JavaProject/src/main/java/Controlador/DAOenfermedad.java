/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.Enfermedad;
import Modelo.Medicamento;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import java.sql.SQLException;
/**
 *
 * @author Mehdi
 */
public class DAOenfermedad extends DAO {
     public static ArrayList getEnfermedades(int medico_id){
        ResultSet resultados = null;
        ArrayList<Enfermedad> enfermedades = new ArrayList<Enfermedad>();
        try {
         String con;
         Statement s = DAOmedico.getConnection().createStatement();
         // Consulta SQL
         con = "SELECT * FROM enfermedad WHERE medico = " + medico_id;
         resultados = s.executeQuery(con);
         }
        catch (Exception e) { // Error en al realizar la consulta
            System.out.println("Error en la petición a la BD");
        }
        
        try{
            while(resultados.next()){
                String nombre = resultados.getNString(2);
                ArrayList<Medicamento> medicamento = (ArrayList<Medicamento>) resultados.getArray(3);
                ArrayList<Enfermedad> enfermedad_relacionada = (ArrayList<Enfermedad>) resultados.getArray(4);
                float dosis = resultados.getFloat(6);
                int veces= resultados.getInt(7);
                boolean contagiosa = resultados.getBoolean(8);
                enfermedades.add(new Enfermedad( nombre, medicamento,enfermedad_relacionada,dosis,veces,contagiosa));
            }
        }
        catch(SQLException sqle){
            System.out.println("Error en la retirada de datos: " + sqle.getMessage());
            return null;
        }
        
        return enfermedades;
    }
}


