/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.Date;
/**
 *
 * @author jaumearnau
 */
public class Medico {
    private String nombre;
    private String apellidos;
    private String dni;
    private int telefono;
    private Date incorporacion; //Es una fehca
    
    public Medico(String name, String surname, String dni, int tele, Date anyo){
        this.nombre = name;
        this.apellidos = surname; 
        this.dni = dni;
        this.telefono=tele;
        this.incorporacion = anyo;
        
        
    }
}
