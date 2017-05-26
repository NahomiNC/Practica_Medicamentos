package excepciones;

/**
 *
 * @author dam117
 */
public class ContrasenhaCorrectaException extends Exception {

    /**
     * Constructor que recoge el mensaje si la contraseña no es correcta
     * @param msg
     */
    public ContrasenhaCorrectaException(String msg) {
        super(msg);
    }
    
}
