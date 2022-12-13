/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Controlador;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mehdi
 */
public class DAOhistorialTest {
    
    public DAOhistorialTest() {
    }

    @Test
    public void testGetEnfermedad() {
        System.out.println("GetEnfermedad");
        int enf_id = 1000000;
        Object obj = DAOhistorial.getEnfermedad(enf_id);
        assertEquals(null,obj);
    }
    
}
