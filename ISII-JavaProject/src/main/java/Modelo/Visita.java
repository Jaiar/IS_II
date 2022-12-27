package Modelo;

import java.time.LocalDate;
import Controlador.DAOvisita;

/**
 *
 * @author algar
 */
public class Visita {
    private int id;
    private int idPaciente;
    private int id_medico;
    private String sintomas;
    private LocalDate fecha;
    
    public Visita(int id, int id_paciente, int id_medico, String sintoma, LocalDate ld){
        this.id = id;
        this.idPaciente = id_paciente;
        this.id_medico = id_medico;
        this.sintomas = sintoma;
        this.fecha = ld;
    }
    
    public String getSintomas(){
        return this.sintomas;
    }
    
    public LocalDate getFecha(){
        return this.fecha;
    }
    
    public int getId(){
        return this.id;
    }
    
    public Paciente getPaciente(){
        return DAOvisita.getPaciente(this.id);
    }
    
    @Override
    public String toString(){
        Paciente paciente = this.getPaciente();
        
        return paciente.getNombre() + ", " + paciente.getApellidos() + " --> Habitación: " + paciente.getHabitacion();
    }
}
