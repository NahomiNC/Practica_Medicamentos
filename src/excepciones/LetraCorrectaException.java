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
public class LetraCorrectaException extends Exception {

    /**
     * Constructor que recoge el mensaje si la letra del DNI no es la correcta
     * @param msg
     */
    public LetraCorrectaException(String msg){
        super(msg);
    }
}
