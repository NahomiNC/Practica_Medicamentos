/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author nahom
 */
public class NomUsuarioCorrectoException extends Exception {

    /**
     * Constructor que recoge el mensaje si el nombre de usuario ya existe
     * @param msg
     */
    public NomUsuarioCorrectoException(String msg) {
        super(msg);
    }
    
}
