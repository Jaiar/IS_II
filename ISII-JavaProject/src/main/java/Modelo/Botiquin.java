/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
/**
 *
 * @author jaumearnau
 */
public class Botiquin {
    private ArrayList<Medicamento> medicamentos;
    
    public Botiquin(){
        medicamentos = new ArrayList<Medicamento>();
    }
    
    public ArrayList consultarBotiquin(int num){
        //consulta a la base de datos con número de medicamnetos igual o menores a num
        return medicamentos;
    }
    
}
