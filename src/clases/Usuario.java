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
    

    public String getNomUsuario() {
        return nomUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEmail() {
        return email;
    }

    public DNI getDni() {
        return dni;
    }

    public String getContrasenha() {
        return contrasenha;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nomUsuario = " + nomUsuario + ", nombre = " + nombre + ", apellidos = " + apellidos + ", email = " + email + ", dni = " + dni + ", contrasenha = " + contrasenha + '}';
    }

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
    
    
}