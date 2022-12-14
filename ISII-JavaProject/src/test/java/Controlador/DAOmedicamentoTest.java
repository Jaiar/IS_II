/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Controlador;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ernes
 */
public class DAOmedicamentoTest {
              
    public DAOmedicamentoTest() {
        
    }
    
    @Test
    public void testGetEnfermedadesTratadas(){
         System.out.println("GetEnfermedadesTratadas");
         int id_med = -1;
         ArrayList resultado = DAOmedicamento.getEnfermedadesTratadas(id_med);
         assertEquals(0,resultado.size());   
    }

    @Test
    public void testGetTratamiento() {
        System.out.println("GetTratamiento");
         int id_med = -1;
         int id_enf = -1;
         Object resultado = DAOmedicamento.getTratamiento(id_med, id_enf);
         assertEquals(null,resultado);
    }
    
}
