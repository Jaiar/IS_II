/**
 *  Clase Mediacamento
 * 
 */
package Modelo;

import Controlador.DAOmedicamento;
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
    
    // Alérgenos que contiene el medicamento
    private String alergia;
    
    // Efectos secundarios que puede producir el medicamento
    private String efecto_s;
    
    // Cantidad del medicamento
    private int cantidad;
    
    /**
    * Constructor de Medicamento
    * @param id ID del medicamento
    * @param nombre Nombre del medicamento
    * @param enfermedad_cura Enfermedades que trata el medicamento
    * @param alergia Alérgenos que contiene el medicamento
    * @param efecto_s Efectos secundarios que puede producir el medicamento
    * @param cantidad 
    */
    public Medicamento(int id, String nombre, String alergia, String efecto_s, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.alergia = alergia;
        this.efecto_s = efecto_s;
        this.cantidad = cantidad;
       
    }
    
    public int getId(){
        return this.id;
    }
    
    public Tratamiento getTratamiento(int id_enfermedad){
        return (Tratamiento) DAOmedicamento.getTratamiento(this.id, id_enfermedad);
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
        this.efecto_s = efecto_s;
    }
    
    
    /**
    * Asigna la cantidad.
    * @param cantidad.
    */
    public void setCantidad(int cantidad) {
      this.cantidad = cantidad;
    }
    /**
    * Obtiene la cantidad.
    * @return  cantidad.
    */
    public int getCantidad(){
        return cantidad;
    }
    
    @Override
    public String toString(){
        return nombre;
    }
}
