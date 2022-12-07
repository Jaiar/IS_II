/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Random;

import Controlador.DAOpacientes;
import java.util.ArrayList;

/**
 *
 * @author jaumearnau
 */
public class Paciente {
    private String dni;
    private String nombre;
    private String apellidos;
    private ArrayList<Enfermedad> enfermedades;
    private int doc_id;
    private int enfer_id;
    private int room_id;
    private int telefono = -1;
    private int id;
    
    public Paciente(int id, String dni, String nombre, String apellidos, int doc, int enfer, int room){
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.doc_id= doc;
        this.enfer_id = enfer;
        this.room_id = room;
        this.enfermedades = null;
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
            this.doc_id= doc;
            this.enfer_id = enfer;
            this.enfermedades = new ArrayList<Enfermedad>();
            //this.enfermedad.add(enfermedad);
            this.room_id = room;
            
            return true;
        }
        else
            return false;
        
    }
    public boolean comprobarFechaHistorial(String dni){
        //Hay que hacer una conslta a la base de datos con la fecha actual y el dni del paciente
        return true;//Si hay una igualdad será falso y sino verdad
    }
    public ArrayList<Enfermedad> getEnfermedades(){
        if ( this.enfermedades == null )
            this.enfermedades = DAOpacientes.getEnfermedades(this.id);
        
        return enfermedades;
    }
    
    public ArrayList getHistorial(){
        return DAOpacientes.getHistorial(this.id);
    }
    
    public int getDoctor(){
        return doc_id;
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
    
    public int getEnfermero(){
        return this.enfer_id;
    }
    
    public int getTelefono(){
        if ( telefono == -1 )
            // Generar nuevo número de telefono
            telefono = 1000000000 - new Random().nextInt(100000000) + 1;
        
        return telefono;
    }

    public int getHabitacion() {
        return room_id;
    }
    
    public int getMedico(){
        return this.doc_id;
    }
    
    @Override
    public String toString(){
        return apellidos + ", " + nombre;
    }
}
