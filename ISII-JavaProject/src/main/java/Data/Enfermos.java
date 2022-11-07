package Data;
import Modelo.Paciente;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jaumearnau
 */
public class Enfermos {
    private ArrayList<Paciente> pacientes;
    
    /**
     * Vamos a simular que hay información ya cargada en la base de datos
     * creando un par de pacientes y viendo el flujo
     */
    public Enfermos(){
        pacientes = new ArrayList<Paciente>();
        Paciente p1 = new Paciente ();
        p1.newPaciente("34567890B","Yoshef","Mikael","Resfriado Común",1,2,200);
        pacientes.add(p1);
    }
    public ArrayList<Paciente> getPacientes(int num){
        ArrayList<Paciente>   p = new ArrayList<Paciente>();
        for (Paciente pac: pacientes){
            if(pac.getDoctor()==num)
                p.add(pac);
        }
        return p;
    }
}
