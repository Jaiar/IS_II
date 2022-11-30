/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import Controlador.DAOmedico;
import java.util.Date;
import java.util.ArrayList;
/**
 *
 * @author jaumearnau
 */
public class Medico extends Usuario{
    private ArrayList<Paciente> pacientes;
    
    public Medico( int code, String name, String surname, String dni, String tele, Date anyo){
        super(code, name, surname, dni, tele, anyo);
        pacientes = DAOmedico.getPacientes(code);
    } 
    public ArrayList<Paciente> getPacientes(){
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
    public ArrayList<Paciente> setAltaPaciente(int num){
        DAOmedico.setHistorialPaciente(num);
        pacientes = DAOmedico.getPacientes(code);
        return pacientes;
    }
}


