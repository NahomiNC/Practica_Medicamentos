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
public class TieneLetraException extends Exception {

    /**
     * Constructor que recoge el mensaje si no contiene una letra
     * @param msg
     */
    public TieneLetraException(String msg){
        super(msg);
    }
}
