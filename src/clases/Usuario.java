package clases;
import excepciones.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author dam117
 */
public class Usuario {
    private String nomUsuario, nombre, apellidos, email, contrasenha;
    private DNI dni;

    /**
     * Constructor que lleva los atributos necesarios para poder crear usuarios. 
     * @param nomUsuario
     * @param nombre
     * @param apellidos
     * @param email
     * @param dni
     * @param contrasenha
     * @throws EmailCorrectoException
     * @throws ContrasenhaCorrectaException
     */
    public Usuario(String nomUsuario, String nombre, String apellidos, String email, DNI dni, String contrasenha) throws EmailCorrectoException, ContrasenhaCorrectaException {
        this.nomUsuario = nomUsuario;        
        this.nombre = nombre;
        this.apellidos = apellidos;
        if(comprobarEmail(email) == true) {
            this.email = email;
        } else throw new EmailCorrectoException("Email incorrecto, introduzca uno correcto.");        
        this.dni = dni;
        if (contrasenha.length() >= 4) {
            this.contrasenha = contrasenha;
        } else throw new ContrasenhaCorrectaException("La contraseña debe contener más de 4 caracteres/digitos.");
    }
    
    /**
     * Método para obtener el nombre 
     * @return devuelve el nombre de usuario (con el que entra en la aplicación)
     */
    public String getNomUsuario() {
        return nomUsuario;
    }

    /**
     * Método para obtner el nombre
     * @return devuelve el nombre del usuario
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para obtener los apellidos
     * @return devuelve los apellidos del usuario
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Método para obtener el correo electrónico
     * @return devuelve el correo del usuario
     */
    public String getEmail() {
        return email;
    }

    /**
     * Método para obtener el dni
     * @return devuelve el dni del usuario 
     */
    public DNI getDni() {
        return dni;
    }

    /**
     * Método para obtener la contraseña
     * @return devuelve la contraseña del usuario
     */
    public String getContrasenha() {
        return contrasenha;
    }

    /**
     * Método para comprobar que el correo que se introduce es correcto
     * Por medio de un patrón comprobamos que sea "ejemplo@gmail.com"
     * @param email
     * @return 
     */
    private boolean comprobarEmail(String email) {
        //Creamos un string con el patrón
        String patronEmail = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        //Guardamos el patron en un objeto patron
        Pattern pe = Pattern.compile(patronEmail);        
        Matcher mather = pe.matcher(email);
        if (mather.matches()) { //Si el correo metido es correcto devolvemos true
            return true;
        }
        return false;
    }
    
    /**
     * Método para mostrar los datos del usuario
     * @return devuelve una cadena con los datos del usuario
     */
    @Override
    public String toString() {
        return "Usuario{" + "nomUsuario = " + nomUsuario + ", nombre = " + nombre + ", apellidos = " + apellidos + ", email = " + email + ", dni = " + dni + ", contrasenha = " + contrasenha + '}';
    }
}
