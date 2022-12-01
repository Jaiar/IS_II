package Controlador;

import Modelo.Enfermero;
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

public class DAOenfermero {
    
    public static ArrayList getPacientes(int id_enfermero){return null;} // Falta implementar
    
    public static ArrayList getAllEnfermeros(){
        DAO.conectarDB();
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
        ArrayList<Medicamento> medicamentos = new ArrayList();
        try {
         String con;
         Statement s = DAO.getConnection().createStatement();
         // Consulta SQL
         con = "SELECT m.id_medicamento, m.nombre, m.alergias, "
                 + "m.efectos_secundarios, m.cantidad, e.nombre FROM "
                 + "(medicamento m JOIN tratamiento t "
                 + "ON m.id_medicamento = t.id_medicamento ) JOIN enfermedad e "
                 + "ON e.id_enfermedad = t.id_enfermedad WHERE cantidad <= " + cantidad;
         
         resultados = s.executeQuery(con);
         }
        catch (Exception e) { // Error en al realizar la consulta
            System.out.println("Error en la petición a la BD");
        }
        
        try{
            int id=0;
            int cant_med=0;
            String nombre = null;
            ArrayList<String> alergias = new ArrayList<String> ();
            ArrayList<String> e_secundarios = new ArrayList<String> ();
            ArrayList<String> enfermedad = new ArrayList<String> ();
            
            resultados.next();
            id = resultados.getInt(1);
            nombre = resultados.getNString(2);
            cant_med = resultados.getInt(5);   
            if(!alergias.contains(resultados.getNString(3)))
                        alergias.add(resultados.getNString(3));
            if(!e_secundarios.contains(resultados.getNString(4)))
                e_secundarios.add(resultados.getNString(4));           

            if(!enfermedad.contains(resultados.getNString(6)))
                enfermedad.add(resultados.getNString(6));
            
            while(resultados.next()){
                
                
                if(id == resultados.getInt(1))
                {
                    if(!alergias.contains(resultados.getNString(3)))
                        alergias.add(resultados.getNString(3));

                    if(!e_secundarios.contains(resultados.getNString(4)))
                        e_secundarios.add(resultados.getNString(4));           

                    if(!enfermedad.contains(resultados.getNString(6)))
                        enfermedad.add(resultados.getNString(6));
                }
                else
                {
                    medicamentos.add(new Medicamento( id, nombre, alergias, e_secundarios, cant_med));
                    System.out.print(":__>_>_>_>_\n");
                    alergias = new ArrayList<String> ();
                    e_secundarios = new ArrayList<String> ();
                    enfermedad = new ArrayList<String> ();
                    
                    id = resultados.getInt(1);
                    nombre = resultados.getNString(2);
                    cant_med = resultados.getInt(5);
                    if(!alergias.contains(resultados.getNString(3)))
                        alergias.add(resultados.getNString(3));

                    if(!e_secundarios.contains(resultados.getNString(4)))
                        e_secundarios.add(resultados.getNString(4));           

                    if(!enfermedad.contains(resultados.getNString(6)))
                        enfermedad.add(resultados.getNString(6));
                    
                    
                    
                }
                medicamentos.add(new Medicamento( id, nombre, enfermedad, alergias, e_secundarios, cant_med));
                System.out.print("UNO PILLADO\n");
            }
            
        }
        catch(SQLException sqle){
            System.out.println("Error en la retirada de datos: " + sqle.getMessage());
            return null;
        }
        
        return medicamentos;
    }
}
