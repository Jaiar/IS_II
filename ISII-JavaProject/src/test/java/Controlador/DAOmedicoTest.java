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
        assertNotSame(expResult, result);
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
    }
    
}
