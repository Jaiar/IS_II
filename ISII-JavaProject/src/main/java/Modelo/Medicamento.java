/**
 *  Clase Mediacamento
 * 
 */
package Modelo;

import java.util.ArrayList;

/**
 * 
 * @author ernes
 */
public class Medicamento {
    // Nombre del medicamento
    private String nombre;
    
    // Enfermedades que trata el medicamento
    private ArrayList<String> enfermedad_cura = new ArrayList<String>();
    
    // Alérgenos que contiene el medicamento
    private String alergia;
    
    // Efectos secundarios que puede producir el medicamento
    private String efecto_s;
    
    /**
    * Constructor de Medicamento
    * @param nombre Nombre del medicamento
    * @param enfermedad_cura Enfermedades que trata el medicamento
    * @param alergia Alérgenos que contiene el medicamento
    * @param efecto_s Efectos secundarios que puede producir el medicamento
    */
    public Medicamento(String nombre, ArrayList<String> enfermedad_cura, String alergia, String efecto_s) {
        this.nombre = nombre;
        this.enfermedad_cura = enfermedad_cura;
        this.alergia = alergia;
        this.efecto_s = efecto_s;
    }  
    
    /**
    * Obtiene los alérgenos que contiene el medicamento.
    * @return alérgenos que contiene el medicamento.
    */
    public String getAlergia() {
      return alergia;
    }
    
    /**
    * Asigna los alérgenos que contiene el medicamento.
    * @param alergia alérgenos que contiene el medicamento.
    */
    public void setAlergia(String alergia) {
      this.alergia = alergia;
    }
    
    /**
    * Obtiene el nombre de las enfermedades que trata el medicamento.
    * @return nombre de las enfermedades que trata el medicamento.
    */
    public String getEnfermedad_cura() {
      return enfermedad_cura;
    }
    
    /**
    * Asigna los nombres de las enfermedades que trata el medicamento.
    * @param enfermedad_cura nombre de las enfermedades que trata el medicamento.
    */
    public void setEnfermedad_cura(String enfermedad_cura) {
      this.enfermedad_cura = enfermedad_cura;
    }
    
    /**
    * Obtiene el nombre del medicamento.
    * @return  nombre del mediacmento.
    */
    public String getNombre() {
      return nombre;
    }
    
    /**
    * Asigna el nombre del medicamento.
    * @param nombre nombre del medicamento.
    */
    public void setNombre(String nombre) {
      this.nombre = nombre;
    }
  

    /**
    * Obtiene el nombre de los efectos secundarios que puede producir el medicamento.
    * @return efectos secundarios que puede produir el medicamento.
    */
    public String getEfecto_s(){
        return efecto_s;
    }    
  
    /**
    * Asigna los efectos secundarios que puede producir el medicamento.
    * @param efecto_s efectos secundarios que puede producir el medicamento.
    */
    public void setEfecto_s(String efecto_s) {
        this.efecto_s=efecto_s;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+nombre+"\n"+"Enfermedades: "+enfermedad_cura+
            "\n"+"Alergias: "+alergia+"\n"+"Efectos secundarios: "+efecto_s+"\n";
    }
}