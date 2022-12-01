/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Bobby
 */
public class Gestor extends Usuario{
    // Este usuario no interviene en el funcionamiento de la aplicación
    // tan solo se emplea para entrar al login para el metodo Consultar Medicos y Pacientes

    public Gestor( int code, String nombre, String apellidos, String dni, String telefono, Date incorporacion) {
        super(code, nombre, apellidos, dni, telefono, incorporacion);
    }
    
    @Override
    public void launchMenu(){
        new Vista.VistaGestor(this).setVisible(true);
    }
}
