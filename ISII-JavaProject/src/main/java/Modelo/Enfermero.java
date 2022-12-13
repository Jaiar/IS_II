package Modelo;

import Controlador.DAOenfermero;
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
    
    public static ArrayList<Enfermero> getAllEnfermeros(){
        return (ArrayList<Enfermero>) DAOenfermero.getAllEnfermeros();
    }
    
    public void listaDeEnfermos(int code){
        //La consulta a la base de datos y almacenamos los pacientes en la lista de pacientes   
    }
    
    public ArrayList consultarBotiquin(int num){
        if(num<0)
            throw new UnsupportedOperationException();
        
        return DAOenfermero.getMedicamentosHospital(num);
    }
    
    public ArrayList<Paciente> getPacientes(){
        if ( pacientes == null )
            pacientes = DAOenfermero.getPacientes(this.code);
        
        return pacientes;
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
        new Vista.VistaEnfermeros(this).setVisible(true);
    }
}
