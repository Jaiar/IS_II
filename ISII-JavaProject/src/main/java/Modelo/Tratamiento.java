/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author algar
 */
public class Tratamiento {
    int id;
    int medicamento;
    int enfermedad;
    int dosis;
    int veces_dosis;
    
    public Tratamiento(int id, int medicamento, int enfermedad, int dosis, int veces_dosis){
        this.id = id;
        this.medicamento = medicamento;
        this.enfermedad = enfermedad;
        this.dosis = dosis;
        this.veces_dosis = veces_dosis;
    }
}
