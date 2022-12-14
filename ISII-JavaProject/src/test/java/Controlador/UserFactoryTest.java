/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Controlador;

import Modelo.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jaumearnau
 */
public class UserFactoryTest {

    /**
     * Test of buildUsuario method, of class UserFactory.
     */
    @Test(expected = NullPointerException.class)
    public void testBuildUsuarioNull() {
        System.out.println("buildUsuarioNull");
        ResultSet resultados = null;
        Usuario expResult = null;
        Usuario result = UserFactory.buildUsuario(resultados);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testBuildUsuarioMedico(){
        System.out.println("builUsuarioMedico");
        ResultSet rs;
        try{
            String query = "SELECT * FROM usuarios WHERE rol = 1;";
            rs = DAO.getConnection().createStatement().executeQuery(query);
            rs.next();
        }catch(SQLException sqle){
            System.out.println("Error en base de datos");
            return;
        }
        
        Object res = UserFactory.buildUsuario(rs);
        
        assertTrue(res instanceof Modelo.Medico);
    }
    
    @Test
    public void testBuildUsuarioEnfermero(){
        System.out.println("builUsuarioEnfermero");
        ResultSet rs;
        try{
            String query = "SELECT * FROM usuarios WHERE rol = 2;";
            rs = DAO.getConnection().createStatement().executeQuery(query);
            rs.next();
        }catch(SQLException sqle){
            System.out.println("Error en base de datos");
            return;
        }
        
        Object res = UserFactory.buildUsuario(rs);
        
        assertTrue(res instanceof Modelo.Enfermero);
    }
    
    @Test
    public void testBuildUsuarioGestor(){
        System.out.println("builUsuario");
        ResultSet rs;
        try{
            String query = "SELECT * FROM usuarios WHERE rol = 3;";
            rs = DAO.getConnection().createStatement().executeQuery(query);
            rs.next();
        }catch(SQLException sqle){
            System.out.println("Error en base de datos");
            return;
        }
        
        Object res = UserFactory.buildUsuario(rs);
        
        assertTrue(res instanceof Modelo.Gestor);
    }
}
