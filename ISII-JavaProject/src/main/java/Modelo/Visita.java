package Modelo;

import java.time.LocalDate;

/**
 *
 * @author algar
 */
public class Visita {
    private int id;
    private int id_paciente;
    private int id_medico;
    private String sintomas;
    private LocalDate fecha;
    
    public Visita(int id, int id_paciente, int id_medico, String sintoma, LocalDate ld){
        this.id = id;
        this.id_paciente = id_paciente;
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
}
