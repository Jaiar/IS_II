/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jaumearnau
 */
public class EnfermeroTest {
    
    public EnfermeroTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAllEnfermeros method, of class Enfermero.
     */
    @Test
    public void testGetAllEnfermeros() {
        System.out.println("getAllEnfermeros");
        ArrayList<Enfermero> expResult = null;
        ArrayList<Enfermero> result = Enfermero.getAllEnfermeros();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaDeEnfermos method, of class Enfermero.
     */
    @Test
    public void testListaDeEnfermos() {
        System.out.println("listaDeEnfermos");
        int code = 0;
        Enfermero instance = null;
        instance.listaDeEnfermos(code);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarBotiquin method, of class Enfermero.
     */
    @Test
    public void testConsultarBotiquin() {
        System.out.println("consultarBotiquin");
        int num = 0;
        Enfermero instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.consultarBotiquin(num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPacientes method, of class Enfermero.
     */
    @Test
    public void testGetPacientes() {
        System.out.println("getPacientes");
        Enfermero instance = null;
        ArrayList<Paciente> expResult = null;
        ArrayList<Paciente> result = instance.getPacientes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Enfermero.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Enfermero instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApellidos method, of class Enfermero.
     */
    @Test
    public void testGetApellidos() {
        System.out.println("getApellidos");
        Enfermero instance = null;
        String expResult = "";
        String result = instance.getApellidos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDni method, of class Enfermero.
     */
    @Test
    public void testGetDni() {
        System.out.println("getDni");
        Enfermero instance = null;
        String expResult = "";
        String result = instance.getDni();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelefono method, of class Enfermero.
     */
    @Test
    public void testGetTelefono() {
        System.out.println("getTelefono");
        Enfermero instance = null;
        String expResult = "";
        String result = instance.getTelefono();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha method, of class Enfermero.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Enfermero instance = null;
        Date expResult = null;
        Date result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of launchMenu method, of class Enfermero.
     */
    @Test
    public void testLaunchMenu() {
        System.out.println("launchMenu");
        Enfermero instance = null;
        instance.launchMenu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
