/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Controlador;

import Modelo.Enfermedad;
import Modelo.Historial;
import Modelo.Medicamento;
import Modelo.Paciente;
import Modelo.Tratamiento;
import java.sql.ResultSet;
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
public class ModelFactoryTest {
    
    public ModelFactoryTest() {
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
     * Test of buildPaciente method, of class ModelFactory.
     */
    @Test
    public void testBuildPaciente() {
        System.out.println("buildPaciente");
        ResultSet resultados = null;
        Paciente expResult = null;
        Paciente result = ModelFactory.buildPaciente(resultados);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buildEnfermedad method, of class ModelFactory.
     */
    @Test
    public void testBuildEnfermedad() {
        System.out.println("buildEnfermedad");
        ResultSet resultados = null;
        Enfermedad expResult = null;
        Enfermedad result = ModelFactory.buildEnfermedad(resultados);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buildMedicamento method, of class ModelFactory.
     */
    @Test
    public void testBuildMedicamento() {
        System.out.println("buildMedicamento");
        ResultSet resultados = null;
        Medicamento expResult = null;
        Medicamento result = ModelFactory.buildMedicamento(resultados);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buildHistorial method, of class ModelFactory.
     */
    @Test
    public void testBuildHistorial() {
        System.out.println("buildHistorial");
        ResultSet resultados = null;
        Historial expResult = null;
        Historial result = ModelFactory.buildHistorial(resultados);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buildTratamiento method, of class ModelFactory.
     */
    @Test
    public void testBuildTratamiento() {
        System.out.println("buildTratamiento");
        ResultSet resultados = null;
        Tratamiento expResult = null;
        Tratamiento result = ModelFactory.buildTratamiento(resultados);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
