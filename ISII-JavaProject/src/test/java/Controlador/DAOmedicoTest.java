/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Controlador;

import Modelo.Enfermedad;
import Modelo.Paciente;
import java.time.LocalDate;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jaumearnau
 */
public class DAOmedicoTest {
    

    /**
     * Test of getPacientes method, of class DAOmedico.
     */
    @Test
    public void testGetPacientes() {
        System.out.println("getPacientes");
        int medico_id = 999;
        ArrayList result = DAOmedico.getPacientes(medico_id);
        assertEquals(0,result.size());
    }

    /**
     * Test of getEnfermedadesByNombre method, of class DAOmedico.
     */
    @Test
    public void testGetEnfermedadesByNombre() {
        System.out.println("getEnfermedadesByNombre");
        String nombre_enfermedad = "";
        ArrayList<Enfermedad> expResult = null;
        ArrayList<Enfermedad> result = DAOmedico.getEnfermedadesByNombre(nombre_enfermedad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addToHistorialPaciente method, of class DAOmedico.
     */
    @Test
    public void testAddToHistorialPaciente() {
        System.out.println("addToHistorialPaciente");
        Paciente paciente = null;
        Enfermedad enfermedad = null;
        LocalDate fecha = null;
        DAOmedico.addToHistorialPaciente(paciente, enfermedad, fecha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of darDeAltaNuevoPaciente method, of class DAOmedico.
     */
    @Test
    public void testDarDeAltaNuevoPaciente() {
        System.out.println("darDeAltaNuevoPaciente");
        Paciente paciente = null;
        Enfermedad enfermedad = null;
        LocalDate fecha = null;
        boolean expResult = false;
        boolean result = DAOmedico.darDeAltaNuevoPaciente(paciente, enfermedad, fecha);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPacienteByDNI method, of class DAOmedico.
     */
    @Test
    public void testGetPacienteByDNI() {
        System.out.println("getPacienteByDNI");
        String dni = "";
        Paciente expResult = null;
        Paciente result = DAOmedico.getPacienteByDNI(dni);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
