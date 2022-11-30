/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
    
    public void listaDeEnfermos(int code){
        //La consulta a la base de datos y almacenamos los pacientes en la lista de pacientes   
    }
    
    public ArrayList consultarBotiquin(int num){
        return DAOenfermero.getMedicamentosHospital(num);
    }
    
    public ArrayList<Paciente> getPaciente(int id){
        if ( pacientes == null )
            pacientes = DAOenfermero.getPacientes(id);
        
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
}
