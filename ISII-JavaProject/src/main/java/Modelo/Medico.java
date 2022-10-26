/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
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
    private int telefono;
    private Date incorporacion; //Es una fehca
    private ArrayList<Paciente> pacientes;
    
    public Medico(int code, String name, String surname, String dni, int tele, Date anyo){
        this.code = code;
        this.nombre = name;
        this.apellidos = surname; 
        this.dni = dni;
        this.telefono=tele;
        this.incorporacion = anyo;
        pacientes = new ArrayList<Paciente>();
        listaDeEnfermos(code);
     
    }
    public void listaDeEnfermos(int code){
        //La consulta a la base de datos y almacenamos los pacientes en la lista de pacientes   
    }
    public ArrayList<Paciente> getPacientes(){
        return pacientes;
    }
}

