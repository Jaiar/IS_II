package Modelo;

import java.time.LocalDate;

import Controlador.DAOhistorial;

/**
 *
 * @author Mehdi
 */
public class Historial {
    private int id;
    private int paciente_id;
    private int enfermedad_id;
    private LocalDate fecha;

    public Historial(int id, int paciente_id, int enfermedad_id, LocalDate fecha){
        this.id = id;
        this.paciente_id = paciente_id;
        this.enfermedad_id = enfermedad_id;
        this.fecha = fecha;
    }
    
    public Enfermedad getEnfermedad(){
        return (Enfermedad) DAOhistorial.getEnfermedad(this.enfermedad_id);
    }
    
    @Override
    public String toString(){
        return fecha.toString() + " - - " + getEnfermedad().toString();
    }
}