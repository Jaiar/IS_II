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
    
    public Botiquin(){
        
        medicamentos = null;
       
    }
    
    public ArrayList consultar(){
        if ( medicamentos == null )
            ;//Consulta SQL para obtener todos los medicamentos
        
        return medicamentos;
    }
}
