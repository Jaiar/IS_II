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
    private static Botiquin botiquin;
    
    public static Botiquin getBotiquin(){
        if( botiquin == null ){
            botiquin = new Botiquin();
        }
        
        return botiquin;
    }
    
    public static ArrayList getMedicamentosByNombre(String nombre){
        return (ArrayList) DAObotiquin.getMedicamentosByNombre(nombre);
    }
    
    public ArrayList consultar(){
        
        return (ArrayList) DAObotiquin.getAllMedicamentos();
    }
}
