/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author jaumearnau
 */
public class EnfermeroTest {
    
    /**
     * Test of consultarBotiquin method, of class Enfermero.
     */
    @Test(expected = NullPointerException.class)
    public void testConsultarBotiquin() {
        System.out.println("consultarBotiquin");
        int num = -1;
        Enfermero instance;
        instance = new Enfermero(03, "ENFERMERO", "PRUEBA", "dd", "dd", new Date(1,1,1));
        ArrayList result = instance.consultarBotiquin(num);
        
    }
    /**
     * Test of consultarBotiquin method, of class Enfermero.
     */
    @Test(expected = NullPointerException.class)
    public void testConsultarBotiquinTrue() {
        System.out.println("consultarBotiquin");
        int num = 6;
        Enfermero instance;
        instance = new Enfermero(03, "ENFERMERO", "PRUEBA", "dd", "dd", new Date(1,1,1));
        ArrayList result = instance.consultarBotiquin(num);
        assertEquals(1,result.size());
    }
    
}
