/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.ArrayList;
/**
 *
 * @author Mehdi
 */
public class Historial {
    private String DNI;
    private String fecha;
    private String enfermedad;
   private ArrayList<String> fechas = new ArrayList<String>();
   private ArrayList<String> enfermedades = new ArrayList<String>();
   
   public void setDNI(String newDNI) {
    this.DNI = newDNI;
  }
    public void setfecha(String newfecha) {
    this.fecha = newfecha;
  }
     public void setenfermedad(String newenfermedad) {
    this.enfermedad = newenfermedad;
  }
      public void setfechas(ArrayList newfechas) {
    this.fechas = newfechas;
  }
       public void setenfermedades(ArrayList newenfermedades) {
    this.enfermedades = newenfermedades;
  }
      public String geDNI() {
    return DNI;
  }
       public String getfecha() {
    return fecha;
  }
        public String getenfermedad() {
    return enfermedad;
  }
        public ArrayList<String> getfechas() {
    return fechas;
        }
     public ArrayList<String> getenfermedades() {
    return enfermedades;
  }
}
  

   
