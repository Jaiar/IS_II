/**
 *  Clase Enfermedad
 * 
 */
package Modelo;

import java.util.ArrayList;

import Controlador.DAOenfermedad;

/**
 * 
 * @author ernes
 */
public class Enfermedad {
    // Id de la enfermedad
    int id;
    
    // Nombre de la enfermedad
    private String nombre;
    
    // Enfermedades relacionadas
    private ArrayList<Enfermedad> enfermedades_relacionadas;
    
    private int enfer_rel;
    
    // Enfermedad contagiosa o no
    private boolean contagiosa;
    /**
    * Constructor de Enfermedad
    * @param id Id de la enfermedad
    * @param nombre Nombre de la enfermedad
    * @param contagiosa Enfermedad contagiosa o no
    */
    public Enfermedad(int id, String nombre, boolean contagiosa) {
        this.id = id;
        this.nombre = nombre;
        this.contagiosa = contagiosa;
        this.enfermedades_relacionadas = null;
    }  
    
    public Enfermedad(int id, String nombre, int enfer_rel,  boolean contagiosa) {
        this.id = id;
        this.nombre = nombre;
        this.contagiosa = contagiosa;
        this.enfer_rel = enfer_rel;
        this.enfermedades_relacionadas = null;
    }  
    
    public static ArrayList getEnfermedades(){
        return DAOenfermedad.getEnfermedades();
    }
    
    public ArrayList<Enfermedad> getEnfermedadesRelacionadas(){
        return (ArrayList<Enfermedad>) DAOenfermedad.getEnfermedadesRelacionadas(this.id);
    }
    
    public ArrayList getMedicamentosQueLaTratan(){
        return DAOenfermedad.getMedicamentosTratan(this.id);
    }
    
    public int getId(){
        return this.id;
    }
    
    /**
    * Obtiene el nombre de la enfermedad
    * @return  nombre de la enfermedad.
    */
    public String getNombre() {
      return nombre;
    }
    /**
    * Asigna el nombre de la enfermedad
    * @param nombre nombre de la enferemdad.
    */
    public void setNombre(String nombre) {
      this.nombre = nombre;
    }
    
    /**
    * Obtiene si la enferemdad es contagiosa o no.
    * @return si la enferemdad es contagiosa o no.
    */
    public boolean getContagiosa(){
        return contagiosa;
    }    
    /**
    * Asigna true si la enferemdad es contagiosa o false no.
    * @param contagiosa si la enferdad es contagiosa o no.
    */
    public void setContagiosa(boolean contagiosa) {
        this.contagiosa = contagiosa;
    }
    
    @Override
    public String toString(){
        return nombre;
    }
}

