/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Data.Hospital;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author jaumearnau
 */
public class Enfermero extends Usuario{
    private ArrayList<Paciente> pacientes;
    private Hospital hospital;
    
    public Enfermero(int code, String name, String sur, String dni, String telefono,
                     Date incorporacion, Hospital hospital)
    {
        super(code, name, sur, dni, telefono, incorporacion);
        
        this.hospital = hospital;
        pacientes = new ArrayList<Paciente>();
        listaDeEnfermos(code);
        
    }
    
    public void listaDeEnfermos(int code){
        //La consulta a la base de datos y almacenamos los pacientes en la lista de pacientes   
    }
    
    public ArrayList consultarBotiquin(int num){
        return hospital.consultarBotiquin(num);
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
