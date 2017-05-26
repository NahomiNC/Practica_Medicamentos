package clases;

import excepciones.NomUsuarioCorrectoException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

/**
 *
 * @author dam117
 */
public class ListaUsuarios {
    private ArrayList<Usuario> listaUsuarios; 

    /**
     * Constructor que crea una lista de usuarios
     */
    public ListaUsuarios() {
        listaUsuarios = new ArrayList<Usuario>();
    }

    /**
     * Lista creada estática para poder usarla desde otras ventanas/clases
     */
    static public ListaUsuarios milista = new ListaUsuarios();
    
    /**
     * Método para añadir una persona a la lista
     * @param user
     * @throws excepciones.NomUsuarioCorrectoException
     */
    public void añadir(Usuario user) throws NomUsuarioCorrectoException {
        if (comprobarUsuario(user)) {
            listaUsuarios.add(user);
        } else throw new NomUsuarioCorrectoException("El nombre de usuario ya existe, escoge otro.");
    }
    
    /**
     * Método para que no se puedan crear dos objetos con el mismo nombre
     * @param user
     * @return
     */
    public boolean comprobarUsuario(Usuario user) {
        Usuario temporal;
        ListIterator<Usuario> iterList = listaUsuarios.listIterator();
        while (iterList.hasNext()) {
            temporal = iterList.next();
            if (temporal.getNomUsuario().equals(user.getNomUsuario())) {
                return false;
            }
        }
        return true;
    }

    /**
     * Método para comprobar que el usuario que intenta entrar lo hace con datos correctos
     * Comprueba que el nombre de usuario y contraseña coincidan con alguno de la lista
     * @param nomUsuario
     * @param contrasenha
     * @return
     */
    public boolean comprobarLogin(String nomUsuario, String contrasenha) {
        Usuario temporal;
        ListIterator<Usuario> iterList = listaUsuarios.listIterator();
        while (iterList.hasNext()) {
            temporal = iterList.next();
            if (temporal.getNomUsuario().equalsIgnoreCase(nomUsuario)) {
                if (temporal.getContrasenha().equalsIgnoreCase(contrasenha)) {
                    return false;
                }                
            }
        }
        return true;
    }
}
