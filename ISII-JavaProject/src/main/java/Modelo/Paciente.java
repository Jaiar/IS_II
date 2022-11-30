/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

import java.util.ArrayList;

/**
 *
 * @author jaumearnau
 */
public class Paciente {
    private String dni;
    private String nombre;
    private String apellidos;
    private ArrayList<String> enfermedad;
    private int doc;
    private int enfer;
    private int room;
    private int id;
    
    public Paciente(int id, String dni, String nombre, String apellidos, ArrayList enfermedad, int doc, int enfer, int room){
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.doc= doc;
        this.enfer = enfer;
        this.enfermedad = enfermedad;
        this.room = room;
    }
    
    /**
     * Si tenemos una coinciendencia en fecha y DNI en una entrada en el historial 
     * del enfermo, el sistema debe lanzar una excepción.
     * 
     * @param dni
     * @param nombre
     * @param apellidos
     * @param enfermedad
     * @param doc
     * @param enfer
     * @param room
     * @return 
     */
    public boolean newPaciente(String dni, String nombre, String apellidos, String enfermedad, int doc, int enfer, int room){
        if(comprobarFechaHistorial(dni)){
            this.dni = dni;
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.doc= doc;
            this.enfer = enfer;
            this.enfermedad = new ArrayList<String>();
            this.enfermedad.add(enfermedad);
            this.room = room;
            
            return true;
        }
        else
            return false;
        
    }
    public boolean comprobarFechaHistorial(String dni){
        //Hay que hacer una conslta a la base de datos con la fecha actual y el dni del paciente
        return true;//Si hay una igualdad será falso y sino verdad
    }
    public String getEnfermedades(){
        String enfe="";
        System.out.print("\n length 3-->" + enfermedad.size());
        for(String e: enfermedad)
            enfe += e;
        
        return enfe;
    }
    public int getDoctor(){
        return doc;
    }
    public int getID(){
        return id;
    }
    public String getDNI(){
        return this.dni;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getApellidos(){
        return this.apellidos;
    }
    public String toString(){
        return "DNI: "+ dni + "| ROOM: " + room + "| Nombre: "+ nombre +", Apellidos: "+ apellidos;
    }
}
