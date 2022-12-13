/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
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
        Enfermero instance = null;
        ArrayList result = instance.consultarBotiquin(num);
        
    }
    
}
