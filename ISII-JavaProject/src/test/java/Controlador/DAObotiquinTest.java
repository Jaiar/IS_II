/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Controlador;

import Modelo.Botiquin;
import Modelo.Medicamento;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author jaumearnau
 */
public class DAObotiquinTest {

    /**
     * Test of getAllMedicamentos method, of class DAObotiquin.
     */
    @Test
    public void testGetAllMedicamentos() {
        System.out.println("getAllMedicamentos");
        ArrayList result = DAObotiquin.getAllMedicamentos();
        ArrayList exp_result = Botiquin.getBotiquin().consultar();
        
        Assert.assertArrayEquals(result.toArray(), exp_result.toArray());
       
    }

    /**
     * Test of getMedicamentosByNombre method, of class DAObotiquin.
     */
    @Test
    public void testGetMedicamentosByNombre() {
        System.out.println("getMedicamentosByNombre");
        String nombre_medicamento = "dalsy";
        
        //Resultado esperado con un médicamento que se encutra actualemte en el BD
        Medicamento dalsy = new Medicamento(2, "dalsy", "Te matriculas en la UV", "Tienes depresion", 10);
        ArrayList prueba = new ArrayList<Medicamento>();
        prueba.add(dalsy);
        
        //LLamada a la base de datos
        ArrayList result = DAObotiquin.getMedicamentosByNombre(nombre_medicamento);
        
        Assert.assertSame(prueba, result);
    }
    
    @Test(expected = Exception.class)
    public void testGetMedicamentosByNombreException(){
        DAObotiquin.getMedicamentosByNombre(null);
    }
}
