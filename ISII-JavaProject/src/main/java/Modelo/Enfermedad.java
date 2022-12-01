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
    
    public ArrayList getEnfermedadesRelacionadas(){
        if ( this.enfermedades_relacionadas == null )
            this.enfermedades_relacionadas = DAOenfermedad.getEnfermedadesRelacionadas(this.id);
        
        return this.enfermedades_relacionadas;
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
        return "Nombre: " + nombre + "\n" + "Contagiosa: " + (contagiosa ? "Si":"No") + "\n\n";
    }
}

