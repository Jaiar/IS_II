/**
 *  Clase Enfermedad
 * 
 */
package Modelo;

import java.util.ArrayList;

/**
 * 
 * @author ernes
 */
public class Enfermedad {
    // Nombre de la enfermedad
    private String nombre;
    
    // Medicamentos que tratan la enfermedad
    private ArrayList<Medicamento> medicamento;
    
    // Enfermedades relacionadas
    private ArrayList<Enfermedad> enfermedad_relacionada;
    
    // Dósis recomendada del medicamento en mg
    private float dosis;
    
    // Veces al día que se toma esa dósis
    private int veces;
    
    // Enfermedad contagiosa o no
    private boolean contagiosa;
    /**
    * Constructor de Enfermedad
    * @param nombre Nombre de la enfermedad
    * @param medicamento Medicamentos que tratan la enfermedad
    * @param enfermedad_relacionada Enfermedades relacionadas
    * @param dosis Dósis recomendada del medicamento en mg
    * @param veces Veces al día que se toma la dósis
    * @param contagiosa Enfermedad contagiosa o no
    */
    public Enfermedad(String nombre, ArrayList<Medicamento> medicamento, ArrayList<Enfermedad> enfermedad_relacionada, float dosis, int veces, boolean contagiosa) {
        this.nombre = nombre;
        this.medicamento = medicamento;
        this.enfermedad_relacionada = enfermedad_relacionada;
        this.dosis = dosis;
        this.veces = veces;
        this.contagiosa = contagiosa;
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
    * Obtiene los medicamentos que tratan la enfermedad.
    * @return medicamentos que tratan la enfermedad.
    */
    public ArrayList<Medicamento> getMedicamento() {
      return medicamento;
    }
    /**
    * Asigna los medicamentos que tratan la enfermedad.
    * @param medicamento medicamentos que tratan la enfermedad.
    */
    public void setMedicamento(ArrayList<Medicamento> medicamento) {
      this.medicamento = medicamento;
    }
    
    
    /**
    * Obtiene los nombres de las enfermedades relacionadas.
    * @return enfermedades relacionadas.
    */
    public ArrayList<Enfermedad> getenfermedad_relacionada() {
      return enfermedad_relacionada;
    }
    /**
    * Asigna los nombres de las enfermedades relacionadas.
    * @param enfermedad_relacionada los nombres de las enfermedades relacionadas.
    */
    public void setenfermedad_relacionada(ArrayList<Enfermedad> enfermedad_relacionada) {
      this.enfermedad_relacionada = enfermedad_relacionada;
    }
    
    
    /**
    * Obtiene dósis recomendada del medicamento en mg.
    * @return dósis recomendada del medicamento en mg.
    */
    public float getDosis() {
      return dosis;
    }
    /**
    * Asigna dósis recomendada del medicamento en mg.
    * @param dosis dósis recomendada del medicamento en mg.
    */
    public void setDosis(float dosis) {
      this.dosis = dosis;
    }
 
    
    /**
    * Obtiene veces al día que se toma la dosis.
    * @return veces al día que se toma la dosis.
    */
    public int getveces(){
        return veces;
    }    
    /**
    * Asigna las veces al día que se toma la dosis.
    * @param veces veces al día que se toma la dosis.
    */
    public void setveces(int veces) {
        this.veces = veces;
    }
    
    
     /**
    * Obtiene si la enferemdad es contagiosa o no.
    * @return si la enferemdad es contagiosa o no.
    */
    public boolean getcontagiosa(){
        return contagiosa;
    }    
    /**
    * Asigna true si la enferemdad es contagiosa o false no.
    * @param contagiosa si la enferdad es contagiosa o no.
    */
    public void setcontagiosa(boolean contagiosa) {
        this.contagiosa = contagiosa;
      
        
    }
    
    @Override
    public String toString(){
        return "Nombre: " + nombre + "\n" + "Contagiosa: " + (contagiosa ? "Si":"No") + "\n\n";
    }
}

