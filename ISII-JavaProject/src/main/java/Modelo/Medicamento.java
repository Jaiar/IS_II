/**
 *  Clase Mediacamento
 * 
 */
package Modelo;

/**
 * 
 * @author ernes
 */
public class Medicamento {
    // Nombre del medicamento
    private String nombre;
    
    // Enfermedades que trata el medicamento
    private String enfermedad_cura;
    
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
    public Medicamento(String nombre, String enfermedad_cura, String alergia, String efecto_s) {
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
    * Obtiene el nombre de la enfermedad que cura el medicamento.
    * @return Nombre de la enferemdad que cura el medicamento.
    */
    public String getEnfermedad_cura() {
      return enfermedad_cura;
    }
    
    /**
    * Asigna el nombre de la enfermedad que cura el medicamento.
    * @param enfermedad_cura Nombre dela enfermedad que cura el medicamento.
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