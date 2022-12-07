package Controlador;

import Modelo.Enfermedad;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
/**
 *
 * @author algar
 */
public class DAOmedicamento {
    public static ArrayList getEnfermedadesTratadas(int id_med){
        ResultSet resultados = null;
        ArrayList<Enfermedad> enfermedades_tratadas = new ArrayList<Enfermedad>();
        try {
            String con;
            Statement s = DAO.getConnection().createStatement();
            // Consulta SQL
            con =     "SELECT e.id_enfermedad, e.nombre,e.enfermedades_relacionadas, e.contagiosa "
                    + "FROM tratamiento t, enfermedad e "
                    + "WHERE t.id_enfermedad = e.id_enfermedad "
                            + "AND id_medicamento = " + id_med + ";";
            
            resultados = s.executeQuery(con);
            }
        catch (Exception e) { // Error en al realizar la consulta
            System.out.println("Error en la petición a la BD -- " + e.getMessage());
        }
        
        ArrayList <Enfermedad> enfermedades = new ArrayList<>();
        try{
            while(resultados.next()){
                
                enfermedades.add(ModelFactory.buildEnfermedad(resultados));
            }
        }catch (SQLException sqle){
            System.out.println("Error sqle");
            System.out.println(sqle.getMessage());
            return null;
        }
        
        return enfermedades;
    }
}
