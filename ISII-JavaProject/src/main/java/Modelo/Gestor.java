/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Data.Hospital;
import java.util.Date;

/**
 *
 * @author Bobby
 */
public class Gestor {
    // Este usuario no interviene en el funcionamiento de la aplicación
    // tan solo se emplea para entrar al login para el metodo Consultar Medicos y Pacientes 
    private int code;
    private String nombre;
    private String apellidos;
    private String dni;
    private String telefono;
    private java.util.Date incorporacion; //Es una fecha
    private Hospital hospital;

    public Gestor(Hospital hospital, int code, String nombre, String apellidos, String dni, String telefono, Date incorporacion) {
        this.code = code;
        this.nombre = nombre;
        this.apellidos = apellidos; 
        this.dni = dni;
        this.telefono=telefono;
        this.incorporacion = incorporacion;
        this.hospital = hospital;
    }

    
     
    

    
}
