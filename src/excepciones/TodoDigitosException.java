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
public class TodoDigitosException extends Exception {

    /**
     * Constructor que recoge el mensaje si en los 8 primero caracteres no son todo dígitos
     * @param msg
     */
    public TodoDigitosException(String msg){
        super(msg);
    }
}
