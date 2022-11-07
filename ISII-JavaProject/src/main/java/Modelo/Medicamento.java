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
    // id del medicamento
    private int id;
    
    // Nombre del medicamento
    private String nombre;
    
    // Enfermedades que trata el medicamento
    private ArrayList<String> enfermedad_cura = new ArrayList<String>();
    
    // Alérgenos que contiene el medicamento
    private ArrayList<String> alergia;
    
    // Efectos secundarios que puede producir el medicamento
    private ArrayList<String> efecto_s;
    
    // Cantidad del medicamento
    private int cantidad;
    
    /**
    * Constructor de Medicamento
    * @param id ID del medicamento
    * @param nombre Nombre del medicamento
    * @param enfermedad_cura Enfermedades que trata el medicamento
    * @param alergia Alérgenos que contiene el medicamento
    * @param efecto_s Efectos secundarios que puede producir el medicamento
    */
    public Medicamento(int id, String nombre, ArrayList<String> enfermedad_cura,
            ArrayList<String> alergia, ArrayList<String> efecto_s, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.enfermedad_cura = enfermedad_cura;
        this.alergia = alergia;
        this.efecto_s = efecto_s;
        this.cantidad = cantidad;
       
    }  
    
    /**
    * Obtiene los alérgenos que contiene el medicamento.
    * @return alérgenos que contiene el medicamento.
    */
    public ArrayList<String> getAlergia() {
      return alergia;
    }
    
    /**
    * Asigna los alérgenos que contiene el medicamento.
    * @param alergia alérgenos que contiene el medicamento.
    */
    public void setAlergia(ArrayList<String> alergia) {
      this.alergia = alergia;
    }
    
    /**
    * Obtiene el nombre de las enfermedades que trata el medicamento.
    * @return nombre de las enfermedades que trata el medicamento.
    */
    public ArrayList<String> getEnfermedad_cura() {
      return enfermedad_cura;
    }
    
    /**
    * Asigna los nombres de las enfermedades que trata el medicamento.
    * @param enfermedad_cura nombre de las enfermedades que trata el medicamento.
    */
    public void setEnfermedad_cura(ArrayList<String> enfermedad_cura) {
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
    public ArrayList<String> getEfecto_s(){
        return efecto_s;
    }    
  
    /**
    * Asigna los efectos secundarios que puede producir el medicamento.
    * @param efecto_s efectos secundarios que puede producir el medicamento.
    */
    public void setEfecto_s(ArrayList<String> efecto_s) {
        this.efecto_s = efecto_s;
    }
    public int getCantidad(){
        return cantidad;
    }
    public String toSting(){
        return "Nombre: "+nombre+"\n"+"Enfermedades: "+enfermedad_cura+
            "\n"+"Alergias: "+alergia+"\n"+"Efectos secundarios: "+efecto_s+"\n";
    }
    public String toStringBotiquin(){
        return "Nombre: "+nombre+" ----- Cantidad: " + cantidad;
    }
}