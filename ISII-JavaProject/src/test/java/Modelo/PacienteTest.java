/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modelo;

import Modelo.Paciente;
import java.util.ArrayList;
import static junit.framework.Assert.*;
import org.junit.Test;
/*import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;/*


/**
 *
 * @author rrajo
 */
public class PacienteTest {
    

    private Paciente p;
    
    public PacienteTest() {
    }
/*
    @Test
    public void testGetAllPacientes() {
        
        ArrayList<Paciente> methodOutput = Paciente.getAllPacientes();

        assertNotNull(methodOutput);
    }

    @Test
    public void testNewPaciente() {
    }

    @Test
    public void testGetEnfermedades() {
       
        ArrayList<Enfermedad> methodOutput = p.getEnfermedades();

        assertNotNull(methodOutput);
    }

    @Test
    public void testGetHistorial() {
         
        ArrayList  methodOutput = p.getHistorial();

        assertNotNull(methodOutput);
    }
*/
    @Test
    public void testGetDoctor() {
        
        p = new Paciente(0,null,null,null,0,0,0);
        int num = p.getDoctor();

        assertEquals(0,num);
    }

    @Test
    public void testGetID() {
        
        p = new Paciente(0,null,null,null,0,0,0);
        int num = p.getID();

        assertEquals(0,num);
    }

    @Test
    public void testGetDNI() {
                 
        p = new Paciente(0,null,null,null,0,0,0);      
        String s = p.getDNI();

        assertNotNull(s);
    }

    @Test
    public void testGetNombre() {
                
        p = new Paciente(0,null,null,null,0,0,0);
        String s = p.getNombre();

        assertNotNull(s);
    }

    @Test
    public void testGetApellidos() {
                 
        p = new Paciente(0,null,null,null,0,0,0);
        String s = p.getApellidos();

        assertNotNull(s);
    }

    @Test
    public void testGetEnfermero() {
                
        p = new Paciente(0,null,null,null,0,0,0);
        int num = p.getEnfermero();

        assertEquals(0,num);
    }

    @Test
    public void testGetTelefono() {
                
        p = new Paciente(0,null,null,null,0,0,0);
        int num = p.getTelefono();

       assertEquals(0,num);
    }

    @Test
    public void testGetHabitacion() {
                
        p = new Paciente(0,null,null,null,0,0,0);
        int num = p.getHabitacion();

        assertEquals(0,num);
    }

    @Test
    public void testGetMedico() {
                
        p = new Paciente(0,null,null,null,0,0,0);
        int num = p.getMedico();

        assertEquals(0,num);
    }

    @Test
    public void testToString() {
            
        p = new Paciente(0,null,null,null,0,0,0);
        String s = p.toString();
        
        assertNotNull(s);
    }
    
}
