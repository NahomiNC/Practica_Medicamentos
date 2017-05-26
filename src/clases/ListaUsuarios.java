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
    private ArrayList<Usuario> listaUsuarios; //Guarda todos los objetos, sin orden y duplicados

    public ListaUsuarios() {
        listaUsuarios = new ArrayList<Usuario>(); //Ponemos que tipo de objetos va a contener y creamos la lista
    }

    static public ListaUsuarios milista = new ListaUsuarios();
    /**
     * Método para añadir una persona a la agenda
     * @param user
     */
    public void añadir(Usuario user) throws NomUsuarioCorrectoException {
        if (comprobarUsuario(user)) {
            listaUsuarios.add(user);
        } else throw new NomUsuarioCorrectoException("El nombre de usuario ya existe, escoge otro.");
    }
    /**
     * Método para mostrar la lista de contactos de la agenda
     */
    public void mostrarLista(){
        if (listaUsuarios.isEmpty()) {
            System.out.println("La lista está vacia.");
        } else {
            System.out.println("Lista:");
            for (Usuario p : listaUsuarios) {
                System.out.println(p.toString()+"  Posicion: " + listaUsuarios.indexOf(p)); 
            }
            System.out.println("Nº de personas en la agenda: " + listaUsuarios.size());
        }
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
