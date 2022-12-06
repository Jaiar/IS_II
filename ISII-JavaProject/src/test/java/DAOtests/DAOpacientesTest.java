package DAOtests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.assertThat;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.sameInstance;

import java.util.ArrayList;
import Controlador.DAOpacientes;

import Modelo.Paciente;

/**
 *
 * @author algar
 */
@RunWith(JUnit4.class)
public class DAOpacientesTest {
    private DAOpacientesTest daopacientestest = new DAOpacientesTest();
    
    @Test
    public void getAllPacientes(){
        ArrayList<Paciente> pacientes = DAOpacientes.getAllPacientes();
        
        assertThat(pacientes, allOf(sameInstance(new Paciente(0, null, null, null,0, 0, 0))));
    }
    
    @Test
    public void getEnfermedadesTest(){
        ArrayList<Modelo.Enfermedad> enfermedades = DAOpacientes.getEnfermedades(1);
        
        assertThat(enfermedades, allOf(sameInstance(new Modelo.Enfermedad(0, null, false))));
    }
    
    @Test
    public void getEnfermedadesVacioTest(){
        ArrayList<Modelo.Enfermedad> enfermedades = DAOpacientes.getEnfermedades(-1);
        
        Assert.assertEquals("enfermedades no vacío", 0, enfermedades.size());
    }
    
    
}
