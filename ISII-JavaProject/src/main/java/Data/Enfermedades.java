/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import Modelo.Enfermedad;
import Modelo.Medicamento;
import java.util.ArrayList;

/**
 *
 * @author ernes
 */
public class Enfermedades {
    private ArrayList<Enfermedad> enfermedades;
    private ArrayList<Medicamento> medicamentos;
    
    public Enfermedades(){
        enfermedades = new ArrayList<Enfermedad>();
        Enfermedad e1 = new Enfermedad 
        ("Diarrea", medicamentos,
         enfermedades, 500, 3, false);
        enfermedades.add(e1);
    }
    public ArrayList<Enfermedad> getEnfermedades(int num){
        ArrayList<Enfermedad>   e = new ArrayList<Enfermedad>();
        /*for (Enfermedad pac: enfermedades){
            if(pac.getDoctor()==num)
                p.add(pac);
        }*/
        return e;
    }
    
}
