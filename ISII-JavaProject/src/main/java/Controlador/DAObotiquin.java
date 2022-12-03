package Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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
        ArrayList<Modelo.Medicamento> medicamentos = new ArrayList<>();
        
        try{
            while(resultados.next()){
                int id = resultados.getInt(1);
                String nombre = resultados.getNString(2);
                String alergias = resultados.getNString(3);
                String efectos_secundarios = resultados.getNString(4);
                int cantidad = resultados.getInt(5);
                
                medicamentos.add(new Modelo.Medicamento(id, nombre, alergias, efectos_secundarios, cantidad));
            }
        }
        catch(SQLException sqle){
            System.out.println("Error en la retirada de datos: " + sqle.getMessage());
            return null;
        }
        
        return medicamentos;
    }
}
