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
public class DAOenfermedad {
    public static ArrayList<Enfermedad> getEnfermedades(){
        ResultSet resultados = null;
        ArrayList<Enfermedad> enfermedades = new ArrayList<Enfermedad>();
        try {
         String con;
         Statement s = DAO.getConnection().createStatement();
         // Consulta SQL
         con = "SELECT * FROM enfermedad  " ;
         resultados = s.executeQuery(con);
         }
        catch (Exception e) { // Error en al realizar la consulta
            System.out.println("Error en la petición a la BD");
        }
        
        try{
            while(resultados.next()){
                int id = resultados.getInt(1);
                String nombre = resultados.getNString(2);
                int enfer_rel = resultados.getInt(3);
                boolean contagiosa = resultados.getBoolean(4);
                enfermedades.add(new Enfermedad( id, nombre, contagiosa ));
            }
        }
        catch(SQLException sqle){
            System.out.println("Error en la retirada de datos: " + sqle.getMessage());
            return null;
        }
        
        return enfermedades;
    }
     
    public static ArrayList getMedicamentosTratan(int id_enf){
        ResultSet resultados = null;
        ArrayList<Enfermedad> enfermedades_tratadas = new ArrayList<Enfermedad>();
        try {
            String con;
            Statement s = DAO.getConnection().createStatement();
            // Consulta SQL
            con =     "SELECT m.id_medicamento, m.nombre, m.alergias, m.efectos_secundarios, m.cantidad "
                    + "FROM tratamiento t, medicamento m "
                    + "WHERE t.id_medicamento = m.id_medicamento "
                            + "AND id_enfermedad = " + id_enf + ";";
            
            resultados = s.executeQuery(con);
            }
        catch (Exception e) { // Error en al realizar la consulta
            System.out.println("Error en la petición a la BD -- " + e.getMessage());
        }
        
        ArrayList <Medicamento> medicamentos = new ArrayList<>();
        try{
            while(resultados.next()){
                int id = resultados.getInt(1);
                String nombre = resultados.getNString(2);
                String alergias = resultados.getNString(3);
                String efect_secun = resultados.getNString(4);
                int cantidad = resultados.getInt(5);
                medicamentos.add(new Medicamento(id, nombre, alergias, efect_secun, cantidad));
            }
        }catch (SQLException sqle){}
        
        return medicamentos;
    }
     
    public static ArrayList getEnfermedadesRelacionadas(int id_enf){
         ResultSet resultados = null;
        ArrayList<Enfermedad> enfermedades_tratadas = new ArrayList<Enfermedad>();
        try {
            String con;
            Statement s = DAO.getConnection().createStatement();
            // Consulta SQL
            con =     "SELECT e.id_enfermedad, e.nombre, e.contagiosa "
                    + "FROM tratamiento t, medicamento m, enfermedad e "
                    + "WHERE t.id_enfermedad = " + id_enf
                        + " AND t.id_medicamento = m.id_medicamento"
                        + " AND t.id_enfermedad = e.id_enfermedad"
                        + " AND e.id_enfermedad <> " + id_enf + ";";
            
            resultados = s.executeQuery(con);
            }
        catch (Exception e) { // Error en al realizar la consulta
            System.out.println("Error en la petición a la BD -- " + e.getMessage());
        }
        
        ArrayList <Enfermedad> enfermedades = new ArrayList<>();
        try{
            while(resultados.next()){
                int id = resultados.getInt(1);
                String nombre = resultados.getNString(2);
                boolean contagiosa = resultados.getBoolean(3);
                enfermedades.add(new Enfermedad( id, nombre, contagiosa ));
            }
        }catch (SQLException sqle){}
        
        return enfermedades;
     }
    
    public static Object getTratamientos(int id_med, int id_enf){
        ResultSet resultados = null;
        
        try {
            String con;
            Statement s = DAO.getConnection().createStatement();
            // Consulta SQL
            con = "SELECT * "
                    + "FROM tratamiento "
                    + "WHERE id_medicamento = " + id_med
                    + " AND id_enfermedad = " + id_enf + ";";
            
            resultados = s.executeQuery(con);
            }
        catch (SQLException e) { // Error en al realizar la consulta
            System.out.println("Error en la petición a la BD -- " + e.getMessage());
        }
        
        try{
            resultados.next();
            
            int id = resultados.getInt(1);
            int medicamento = id_med;
            int enfermedad = id_enf;
            int dosis = resultados.getInt(4);
            int veces_dosis = resultados.getInt(5);
            
            return new Modelo.Tratamiento(id, medicamento, enfermedad, dosis, veces_dosis);
        }catch(SQLException sqle){
            System.out.println("Error en la retirada de datos: " + sqle.getMessage());
            return null;
        }
    }
    
    public static Enfermedad getEnfermedad(int id_enfer){
        ResultSet resultados = null;
        
        try {
            Statement s = DAO.getConnection().createStatement();
            String query = "SELECT * FROM enfermedad WHERE id_enfermedad = " + id_enfer + ";";
            
            resultados = s.executeQuery(query);
        }catch( SQLException sqle ){
            System.out.println("getEnfermedad @ DAOenfermedad -- error en la query ");
            System.out.println(sqle.getMessage());
        }
        
        try {
            resultados.next();
            
            int id = resultados.getInt(1);
            String nombre = resultados.getNString(2);
            boolean contagiosa = resultados.getBoolean(4);
            
            return new Enfermedad(id, nombre, contagiosa);
        }catch(SQLException sqle){
            System.out.println("getEnfermedad @ DAOenfermedad -- error fetching ");
            System.out.println(sqle.getMessage());
        }
        
        return null;
    }
}


