package Controlador;

import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Logger;

/**
 *
 * @author algar
 */
public class DAObotiquin {
    
    private DAObotiquin(){}
    
    public static List getAllMedicamentos(){
        ResultSet resultados = null;
        
        try {
            String con;
            Statement s = DAO.getConnection().createStatement();
            // Consulta SQL
            con = "SELECT * FROM medicamento;";
            
            resultados = s.executeQuery(con);
            }
        catch (Exception e) { // Error en al realizar la consulta
             System.out.println("Error en la petición a la BD");
        }
        List medicamentos = new ArrayList();
        
        try{
            while(resultados.next()){
                medicamentos.add(ModelFactory.buildMedicamento(resultados));
            }
        }
        catch(SQLException sqle){
            System.out.println("Error en la retirada de datos: " + sqle.getMessage());
            return null;
        }
        return medicamentos;
    }
    
    public static List getMedicamentosByNombre(String nombreMedicamento){
        ResultSet resultados = null;
        
        try {
            String con;
            Statement s = DAO.getConnection().createStatement();
            Locale spanish = Locale.forLanguageTag("es");
            // Consulta SQL
            con = "SELECT * FROM medicamento WHERE LOWER(nombre) LIKE '" + nombreMedicamento.toLowerCase() + "%';";
            resultados = s.executeQuery(con);
        }
        catch (SQLException e) { // Error en al realizar la consulta
            System.out.println("Error en la petición a la BD");
            throw new UnsupportedOperationException();
        }
        
        List medicamentos = new ArrayList();
        
        try{
            while(resultados.next()){
                medicamentos.add(ModelFactory.buildMedicamento(resultados));
            }
        }
        catch(SQLException sqle){
            System.out.println("Error en la retirada de datos: " + sqle.getMessage());
            return new ArrayList();
        }
        
        return medicamentos;
    }
}