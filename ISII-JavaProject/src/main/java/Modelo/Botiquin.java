/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Controlador.DAOenfermero;
import java.util.ArrayList;
/**
 *
 * @author jaumearnau
 */
public class Botiquin {
    private ArrayList<Medicamento> medicamentos;
    private boolean pertenece=false;
    
    public Botiquin(){
        
        medicamentos = new ArrayList<Medicamento>();
       
    }
    
    public ArrayList<Medicamento> consultarBotiquin(int num){
        medicamentos = DAOenfermero.getMedicamentosHospital(num);        
        return medicamentos;
    }
    
}
