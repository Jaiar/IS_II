package Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.Locale;

/**
 *
 * @author algar
 */
public class DAObotiquin {
    public static ArrayList getAllMedicamentos(){
        ResultSet resultados = null;
        
        try {
            String con;
            Statement s = DAO.getConnection().createStatement();
            // Consulta SQL
            con = "SELECT * FROM medicamento;";
            
            resultados = s.executeQuery(con);
            }
        catch (Exception e) { // Error en al realizar la consulta
            System.out.println("Error en la petición a la BD -- " + e.getMessage());
        }
        ArrayList medicamentos = new ArrayList();
        
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
    
    public static ArrayList getMedicamentosByNombre(String nombre_medicamento){
        ResultSet resultados = null;
        
        try {
            String con;
            Statement s = DAO.getConnection().createStatement();
            Locale SPANISH = Locale.forLanguageTag("es");
            // Consulta SQL
            con = "SELECT * FROM medicamento WHERE LOWER(nombre) LIKE '" + nombre_medicamento.toLowerCase(SPANISH) + "%';";
            resultados = s.executeQuery(con);
        }
        catch (SQLException e) { // Error en al realizar la consulta
            System.out.println("Error en la petición a la BD");
        }
        
        ArrayList medicamentos = new ArrayList();
        
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
}
