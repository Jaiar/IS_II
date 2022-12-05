package Modelo;

import Controlador.DAOenfermedad;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Mehdi
 */
public class Historial {
    private int id;
    private int id_paciente;
    private int id_enfermedad;
    private LocalDate fecha;
    
    private Enfermedad enfermedad;
    
    public Historial(int id, int id_paciente, int id_enfermedad, LocalDate fecha){
        this.id = id;
        this.id_paciente = id_paciente;
        this.id_enfermedad = id_enfermedad;
        this.fecha = fecha;
    }
    
    public int getId(){
        return this.id;
    }
    
    public int getPaciente(){
        return this.id_paciente;
    }
    
    public LocalDate getFecha(){
        return this.fecha;
    }
    
    public Enfermedad getEnfermedad(){
        if( enfermedad == null )
            enfermedad = DAOenfermedad.getEnfermedad(id_enfermedad);
        return enfermedad;
    }
    
    @Override
    public String toString(){
        return getEnfermedad().toString() + " | " + fecha.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }
}
  

   
