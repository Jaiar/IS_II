/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import Data.Enfermos;
import Data.Hospital;
import java.util.Date;
import java.util.ArrayList;
/**
 *
 * @author jaumearnau
 */
public class Medico extends Usuario{
    private ArrayList<Paciente> pacientes;
    private Hospital hospital; 
    
    public Medico(Hospital hospital, int code, String name, String surname, String dni, String tele, Date anyo){
        super(code, name, surname, dni, tele, anyo);
        this.hospital = hospital;
        pacientes = new ArrayList<Paciente>();
        listaDeEnfermos();
    }
    public void listaDeEnfermos(){
        pacientes = hospital.getPacientes(code);
    }
    public ArrayList<Paciente> getPacientes(){
        return pacientes;
    }
}

