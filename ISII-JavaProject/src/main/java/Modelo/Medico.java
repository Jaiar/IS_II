/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import Data.Enfermos;
import Data.Hospital;
import java.util.Date;
import java.util.ArrayList;
/**
 *
 * @author jaumearnau
 */
public class Medico {
    private int code;
    private String nombre;
    private String apellidos;
    private String dni;
    private String telefono;
    private Date incorporacion; //Es una fehca
    private ArrayList<Paciente> pacientes;
    private Hospital hospital; 
    
    public Medico(Hospital hospital, int code, String name, String surname, String dni, String tele, Date anyo){
        this.code = code;
        this.nombre = name;
        this.apellidos = surname; 
        this.dni = dni;
        this.telefono=tele;
        this.incorporacion = anyo;
        this.hospital = hospital;
        pacientes = new ArrayList<Paciente>();
        listaDeEnfermos();
    }
    public void listaDeEnfermos(){
        pacientes = hospital.getPacientes(code);
    }
    public ArrayList<Paciente> getPacientes(){
        return pacientes;
    }
}

