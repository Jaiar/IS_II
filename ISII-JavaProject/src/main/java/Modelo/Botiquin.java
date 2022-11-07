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
    private boolean pertenece=false;
    
    public Botiquin(){
        
        medicamentos = new ArrayList<Medicamento>();
        String nombre = "Frenadol";
        ArrayList<String> str = new ArrayList<String>();
        str.add("Resfriado Común");
        ArrayList<String> str2 = new ArrayList<String>();
        str2.add("Corticodides");
        ArrayList<String> str3 = new ArrayList<String>();
        str3.add("");
        medicamentos.add(new Medicamento(1,nombre,str,str2,str3,5));
       
    }
    
    public ArrayList<Medicamento> consultarBotiquin(int num){
        ArrayList<Medicamento> cantidad = new ArrayList<>();
        for(Medicamento m: medicamentos)
            if(m.getCantidad()<=num)
                cantidad.add(m);
        
        return cantidad;
    }
    
}
