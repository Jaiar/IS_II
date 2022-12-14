/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jaumearnau
 */
public class ModelFactoryTest {
    
    public ModelFactoryTest() {
    }

    /**
     * Test of buildPaciente method, of class ModelFactory.
     */
    @Test
    public void testBuildMedicamento(){
        System.out.println("buildMedicamento");
        ResultSet rs;
        try{
            String query = "SELECT * FROM medicamento;";
            rs = DAO.getConnection().createStatement().executeQuery(query);
            rs.next();
        }catch(SQLException sqle){
            System.out.println("Error en base de datos");
            return;
        }
        
        Object res = ModelFactory.buildMedicamento(rs);
        
        assertTrue(res instanceof Modelo.Medicamento);
    }
    @Test
    public void testBuildEnfermedad(){
        System.out.println("buildEnfermedad");
        ResultSet rs;
        try{
            String query = "SELECT * FROM enfermedad;";
            rs = DAO.getConnection().createStatement().executeQuery(query);
            rs.next();
        }catch(SQLException sqle){
            System.out.println("Error en base de datos");
            return;
        }
        
        Object res = ModelFactory.buildEnfermedad(rs);
        
        assertTrue(res instanceof Modelo.Enfermedad);
    }
    
    @Test
    public void testBuildTratamiento(){
        System.out.println("buildTratamiento");
        ResultSet rs;
        try{
            String query = "SELECT * FROM tratamiento;";
            rs = DAO.getConnection().createStatement().executeQuery(query);
            rs.next();
        }catch(SQLException sqle){
            System.out.println("Error en base de datos");
            return;
        }
        
        Object res = ModelFactory.buildTratamiento(rs);
        
        assertTrue(res instanceof Modelo.Tratamiento);
    }
    
    @Test
    public void testBuildHistorial(){
        System.out.println("buildHistorial");
        ResultSet rs;
        try{
            String query = "SELECT * FROM historialmedico;";
            rs = DAO.getConnection().createStatement().executeQuery(query);
            rs.next();
        }catch(SQLException sqle){
            System.out.println("Error en base de datos");
            return;
        }
        
        Object res = ModelFactory.buildHistorial(rs);
        
        assertTrue(res instanceof Modelo.Historial);
    }
    
    @Test
    public void testBuildUsuario(){
        System.out.println("buildPaciente");
        ResultSet rs;
        try{
            String query = "SELECT * FROM pacientes;";
            rs = DAO.getConnection().createStatement().executeQuery(query);
            rs.next();
        }catch(SQLException sqle){
            System.out.println("Error en base de datos");
            return;
        }
        
        Object res = ModelFactory.buildPaciente(rs);
        
        assertTrue(res instanceof Modelo.Paciente);
    }
    
    @Test(expected=NullPointerException.class)
    public void testBuildNull(){
        System.out.println("buildNull");
        ResultSet rs = null;
        
        Object res = ModelFactory.buildEnfermedad(rs);
    }
}
