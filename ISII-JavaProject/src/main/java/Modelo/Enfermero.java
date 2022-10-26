/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Modelo.Botiquin;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author jaumearnau
 */
public class Enfermero {
    private int code;
    private String nombre;
    private String apellidos;
    private String dni;
    private int telefono;
    private Date incorporacion; //Es una fecha
    private ArrayList<Paciente> pacientes;
    private Botiquin botiquin;
    
    public Enfermero(int code, String name, String sur, String dni, int telefono,
            Date incorporacion, Botiquin boti){
        this.code=code;
        this.apellidos = sur;
        this.nombre = name;
        this.dni = dni;
        this.telefono = telefono;
        this.incorporacion = incorporacion;
        pacientes = new ArrayList<Paciente>();
        listaDeEnfermos(code);
        botiquin = boti;
    }
    
    public void listaDeEnfermos(int code){
        //La consulta a la base de datos y almacenamos los pacientes en la lista de pacientes   
    }
    
    public ArrayList consultarBotiquin(int num){
        return botiquin.consultarBotiquin(num);
    }
}
