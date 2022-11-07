/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import Modelo.Botiquin;
import Modelo.Paciente;
import java.util.ArrayList;

/**
 *
 * @author jaumearnau
 */
public class Hospital {
    private Enfermos pacientes_hospital;
    private Botiquin botiquin;
    public Hospital(){
        pacientes_hospital = new Enfermos();
        botiquin = new Botiquin();
    }
    public ArrayList<Paciente> getPacientes(int code){        
        return pacientes_hospital.getPacientes(code);
    }
    
    public ArrayList consultarBotiquin(int num){
        return botiquin.consultarBotiquin(num);
    }
}
