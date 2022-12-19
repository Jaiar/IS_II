package Controlador;


import Modelo.Enfermero;
import Modelo.Gestor;
import Modelo.Medico;
import Modelo.Usuario;

import java.util.Date;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author algar
 */
public class UserFactory {
    public enum Usuario_Tipo{
        MEDICO,
        ENFERMERO,
        GESTOR;
        
        public static Usuario_Tipo getTipo(int i){
            switch(i){
                case 1: return MEDICO;
                case 2: return ENFERMERO;
                case 3: return GESTOR;
                default: return null;
            }
        }
    }
    
    public static Usuario buildUsuario(ResultSet resultados){
        int rol;
        int id;
        String dni_usuario;
        String nombre;
        String apellidos;
        String telefono;
        Date fecha_incorporacion;
        
        try{
            rol = resultados.getInt(5);  
            id = resultados.getInt(1);
            dni_usuario = resultados.getNString(2);
            nombre = resultados.getNString(3);
            apellidos = resultados.getNString(4);
            fecha_incorporacion = resultados.getDate(6);
            telefono = resultados.getNString(7);
        }catch(SQLException sqle){
            System.out.println("buildUsuario failed.");
            System.out.println(sqle.getMessage());
            return null;
        }
        
        switch(Usuario_Tipo.getTipo(rol)){
            case MEDICO:
                return new Medico( id, nombre, apellidos, dni_usuario, telefono, fecha_incorporacion);
            case ENFERMERO:
                return new Enfermero(id, nombre, apellidos, dni_usuario, telefono, fecha_incorporacion);
            case GESTOR:
                return new Gestor( id, nombre, apellidos, dni_usuario, telefono, fecha_incorporacion);
            default:
                return null;
        }
    }
}
