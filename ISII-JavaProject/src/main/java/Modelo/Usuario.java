/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author algar
 */
public class Usuario {
    protected int code;
    protected String nombre;
    protected String apellidos;
    protected String dni;
    protected String telefono;
    protected Date incorporacion; //Es una fecha
    
    public Usuario (int code, String nombre, String apellidos, String dni, String telefono, Date incorporacion){
        this.code = code;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.telefono = telefono;
        this.incorporacion = incorporacion;
    }
}
