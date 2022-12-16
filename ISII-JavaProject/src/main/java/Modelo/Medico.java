package Modelo;

import Controlador.DAOmedico;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author jaumearnau
 */
public class Medico extends Usuario {
    private ArrayList<Paciente> pacientes;
    
    public Medico( int code, String name, String surname, String dni, String tele, Date anyo){
        super(code, name, surname, dni, tele, anyo);
        this.pacientes = null;
    } 
    
    public ArrayList<Paciente> getPacientes(){
        if (pacientes == null )
            pacientes = DAOmedico.getPacientes(this.code);
        
        return pacientes;
    }
    
    public ArrayList<Paciente> getPacientesCitaHoy(){
        return DAOmedico.getPacientesAVisitar(this.code, LocalDate.now());
    }
    
    public static ArrayList<Medico> getAllMedicos(){
        return (ArrayList<Medico>) DAOmedico.getAllMedicos();
    }
    
    public Paciente getPacienteByDNI(String DNI){
        return DAOmedico.getPacienteByDNI(DNI);
    }
    
    public ArrayList getEnfermedadesByNombre(String texto){
        return DAOmedico.getEnfermedadesByNombre(texto);
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public String getTelefono() {
        return telefono;
    }
    
    public Date getFecha(){
        return this.incorporacion;
    }
    
    public void setAltaPaciente(Paciente paciente, Enfermedad enfermedad, LocalDate fecha) throws UnsupportedOperationException {
        DAOmedico.addToHistorialPaciente(paciente, enfermedad, fecha);
    }
    
    public void datDeAltaPaciente(Paciente paciente, Enfermedad enfermedad, LocalDate fecha){
        DAOmedico.darDeAltaNuevoPaciente(paciente, enfermedad, fecha);
    }
    
    @Override
    public void launchMenu(){
        new Vista.VistaMedico(this).setVisible(true);
    }
}


