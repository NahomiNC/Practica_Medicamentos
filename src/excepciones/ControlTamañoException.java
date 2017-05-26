/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author dam117
 */
public class ControlTamañoException extends Exception {
    
    /**
     * Constructor que recoge el mensaje si el el tamaño del dni no es correcto
     * @param msg
     */
    public ControlTamañoException(String msg){
        super(msg);
    }
}
