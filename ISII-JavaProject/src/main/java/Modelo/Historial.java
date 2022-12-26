package Modelo;

import java.time.LocalDate;

import Controlador.DAOhistorial;

/**
 *
 * @author Mehdi
 */
public class Historial {
    private int id;
    private int pacienteId;
    private int enfermedadId;
    private LocalDate fecha;

    public Historial(int id, int paciente_id, int enfermedad_id, LocalDate fecha){
        this.id = id;
        this.pacienteId = paciente_id;
        this.enfermedadId = enfermedad_id;
        this.fecha = fecha;
    }
    
    public Enfermedad getEnfermedad(){
        return (Enfermedad) DAOhistorial.getEnfermedad(this.enfermedadId);
    }
    
    @Override
    public String toString(){
        return fecha.toString() + " - - " + getEnfermedad().toString();
    }
}