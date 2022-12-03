/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Controlador.DAObotiquin;
import java.util.ArrayList;
/**
 *
 * @author jaumearnau
 */
public class Botiquin {
    private ArrayList<Medicamento> medicamentos;
    private static Botiquin botiquin;
    
    private Botiquin(){
        medicamentos = null;
    }
    
    public static Botiquin getBotiquin(){
        if( botiquin == null ){
            botiquin = new Botiquin();
        }
        
        return botiquin;
    }
    
    public ArrayList consultar(){
        if ( medicamentos == null )
            medicamentos = DAObotiquin.getAllMedicamentos();
        
        return medicamentos;
    }
}
