package Controlador;


import Modelo.Enfermero;
import Modelo.Gestor;
import Modelo.Medico;

import java.util.Date;

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
    
    public static Object hacerUsuario(Usuario_Tipo u_t, int id, String nombre, String apellidos, String dni_usuario, int telefono, Date fecha_incorporacion){
        switch(u_t){
            case MEDICO:
                return new Medico( id, nombre, apellidos, dni_usuario, null, fecha_incorporacion);
            case ENFERMERO:
                return new Enfermero(id, nombre, apellidos, dni_usuario, null, fecha_incorporacion);
            case GESTOR:
                return new Gestor( id, nombre, apellidos, dni_usuario, null, fecha_incorporacion);
            default:
                return null;
        }
    }
}
