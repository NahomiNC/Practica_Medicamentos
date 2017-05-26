package excepciones;

/**
 *
 * @author dam117
 */
public class EmailCorrectoException extends Exception {

    /**
     * Constructor que recoge el mensaje si el correo no es correcto
     * @param msg
     */
    public EmailCorrectoException(String msg){
        super(msg);
    }
}
