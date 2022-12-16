package Controlador;

/**
 * Class that build all model objects except users
 * 
 * @author algar
 */

import Modelo.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class ModelFactory {
    public static Paciente buildPaciente(ResultSet resultados){
        try{
            int id = resultados.getInt(1);
            String dni_res = resultados.getNString(2);
            String nombre = resultados.getNString(3);
            String apellidos = resultados.getNString(4);
            int habitacion = resultados.getInt(6);
            int medico_p_id = resultados.getInt(7);
            int enfermero_id = resultados.getInt(8);
            
            
            return new Paciente(id, dni_res, nombre, apellidos, medico_p_id, enfermero_id, habitacion);
        }catch(SQLException sqle){
            System.out.println("Build paciente failed");
            System.out.println(sqle.getMessage());
            return null;
        }
    }
    
    public static Enfermedad buildEnfermedad(ResultSet resultados){
        try{
            int id = resultados.getInt(1);
            String nombre = resultados.getNString(2);
            int enf_rel = resultados.getInt(3);
            boolean contagiosa = resultados.getBoolean(4);
            
            return new Enfermedad(id, nombre, enf_rel, contagiosa);
        }catch(SQLException sqle){
            System.out.println("Build Enfermedad failed");
            System.out.println(sqle.getMessage());
            return null;
        }
    }
    
    public static Medicamento buildMedicamento(ResultSet resultados){
        try{
            int id = resultados.getInt(1);
            String nombre = resultados.getNString(2);
            String alergias = resultados.getNString(3);
            String efectos_secundarios = resultados.getNString(4);
            int cantidad = resultados.getInt(5);

            return new Medicamento(id, nombre, alergias, efectos_secundarios, cantidad);
        }
        catch(SQLException sqle){
            System.out.println("Build Medicamento failed.\n" + sqle.getMessage());
            return null;
        }
    }
    
    public static Historial buildHistorial(ResultSet resultados){
        try{
            int id = resultados.getInt(1);
            int id_paciente = resultados.getInt(2);
            int id_enfermedad = resultados.getInt(3);
            java.time.LocalDate fecha = resultados.getDate(4).toLocalDate();
            
            return new Historial(id, id_paciente, id_enfermedad, fecha);
        }catch(SQLException sqle){
            System.out.println("Build Historial failed");
            System.out.println(sqle.getMessage());
            return null;
        }
    }
    
    public static Tratamiento buildTratamiento(ResultSet resultados){
        try{
            int id = resultados.getInt(1);
            int medicamento = resultados.getInt(2);
            int enfermedad = resultados.getInt(3);
            int dosis = resultados.getInt(4);
            int veces_dosis = resultados.getInt(5);
            
            return new Tratamiento(id, medicamento, enfermedad, dosis, veces_dosis);
        }catch(SQLException sqle){
            System.out.println("Error en la retirada de datos: " + sqle.getMessage());
            return null;
        }
    }
    
    public static Visita buildVisita(ResultSet resultados){
        try{
            int id = resultados.getInt(1);
            int id_paciente = resultados.getInt(2);
            int id_medico = resultados.getInt(3);
            String sintoma = resultados.getNString(4);
            LocalDate fecha = resultados.getDate(5).toLocalDate();
            
            return new Visita(id, id_paciente, id_medico, sintoma, fecha);
        }catch(SQLException sqle){
            System.out.println("Error en la retirada de datos: " + sqle.getMessage());
            return null;
        }
    }
}
