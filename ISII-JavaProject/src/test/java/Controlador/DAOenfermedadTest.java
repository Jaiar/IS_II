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
 * @author Mehdi
 */
public class DAOenfermedadTest {
    
    public DAOenfermedadTest() {
        
    }

    @Test
    public void testGetEnfermedades() {
         System.out.println("GetEnfermedades");
         int nula = 0;
         ArrayList resultado = DAOenfermedad.getEnfermedades();
         assertNotSame(nula,resultado.size());
    }

    @Test
    public void testGetMedicamentosTratan() {
         System.out.println("GetMedicamentosTratan");
         int enf_id = 1000000;
         ArrayList resultado = DAOenfermedad.getMedicamentosTratan(enf_id);
         assertEquals(0,resultado);
    }

    @Test
    public void testGetEnfermedadesRelacionadas() {
        System.out.println("GetEnfermedadesRelacionadas");
         int enf_id = 1000000;
         ArrayList resultado = DAOenfermedad.getEnfermedadesRelacionadas(enf_id);
         assertEquals(0,resultado);
    }
    
}
