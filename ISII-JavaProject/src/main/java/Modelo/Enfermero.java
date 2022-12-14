package Modelo;

import Controlador.DAOenfermero;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author jaumearnau
 */
public class Enfermero extends Usuario{
    private ArrayList<Paciente> pacientes;
    
    public Enfermero(int code, String name, String sur, String dni, String tel, Date incorporacion)
    {
        super(code, name, sur, dni, tel, incorporacion);
        
        pacientes = null;
        
    }
    
    public ArrayList<Paciente> getPacientesATratar(){
        return (ArrayList<Paciente>) DAOenfermero.getPacientesATratar(this.code, LocalDate.now());
    }
    
    public ArrayList<Medicamento> getMedicamentosPaciente(int id_paciente){
        return (ArrayList<Medicamento>) DAOenfermero.getMedicamentosPaciente(id_paciente, LocalDate.now());
    }
    
    public static ArrayList<Enfermero> getAllEnfermeros(){
        return (ArrayList<Enfermero>) DAOenfermero.getAllEnfermeros();
    }
    
    public ArrayList getEnfermedades(){
        return DAOenfermero.getEnfermedades();
    }
    public ArrayList getMedicos(){
        return DAOenfermero.getMedicos();
    }
    public ArrayList listaDeEnfermos(){
        return (ArrayList<Paciente>) DAOenfermero.getPacientes(code);
    }
   
    public boolean darDeAltaNuevoPaciente(Paciente paciente, Enfermedad enfermedad, LocalDate fecha){
        return DAOenfermero.darDeAltaNuevoPaciente(paciente, enfermedad, fecha);
    }
    
    public boolean anyadirAlHistorial(Paciente paciente, Enfermedad enfermedad, LocalDate fecha){
        return DAOenfermero.anyadirAlHistorial(paciente, enfermedad, fecha);
    }
    
    public ArrayList consultarBotiquin(int num){
        if(num<0)
           throw new NullPointerException();
        
        return DAOenfermero.getMedicamentosHospital(num);
    }
    
    public ArrayList<Paciente> getPacientes(){
        if ( pacientes == null )
            pacientes = DAOenfermero.getPacientes(this.code);
        
        return pacientes;
    }
    
    public Paciente getDatosPaciente(String dni_paciente){
        return DAOenfermero.getDatosPaciente(dni_paciente);
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
    
    @Override
    public void launchMenu(){
        new vista.VistaEnfermeros(this).setVisible(true);
    }
}
