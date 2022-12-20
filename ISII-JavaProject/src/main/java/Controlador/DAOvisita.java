package Controlador;

import Modelo.Paciente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author algar
 */
public class DAOvisita {
    public static Paciente getPaciente(int id){
        ResultSet resultados = null;
        
        try {
            String con;
            Statement s = DAO.getConnection().createStatement();
            // Consulta SQL
            con = "SELECT p.* FROM visita v, paciente p WHERE v.id_visita = " + id + " AND  v.id_paciente = p.id_paciente;";
            resultados = s.executeQuery(con);
        }
        catch (Exception e) { // Error en al realizar la consulta
            System.out.println("DAOmedico @ getPacientes -- Error en la petición a la BD\n--" + e.getMessage());
        }
        
        try{
            while(resultados.next()){
                return ModelFactory.buildPaciente(resultados);
            }
        }catch(SQLException sqle){
            System.out.println("DAOmedico @ getPacientes \n-- Error en retirar datos: " + sqle.getMessage());
            return null;
        }
        catch(NullPointerException npe){
            System.out.println("DAOmedico @ getPacientes \n-- Resultados nulo: " + npe.getMessage());
            return null;
        }
        
        return null;
    }
}
