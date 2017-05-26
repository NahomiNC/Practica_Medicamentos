package clases;

import java.util.ArrayList;
import java.util.ListIterator;
import javax.swing.JOptionPane;

/**
 *
 * @author dam117
 */
public class ListaMedicamentos {

    private ArrayList<Medicamentos> listaMedicamentos;

    /**
     * Lista creada estática para poder usarla desde otras ventanas/clases
     */
    public static ListaMedicamentos listaM = new ListaMedicamentos();

    /**
     * Constructor que crea una lista de medicamentos
     */
    public ListaMedicamentos() {
        listaMedicamentos = new ArrayList<Medicamentos>();
    }

    /**
     * Método para obtener la lista de medicamentos
     * @return
     */
    public ArrayList<Medicamentos> getListaMedicamentos() {
        return listaMedicamentos;
    }

    /**
     * Método para obtener la lista de medicamentos estática
     * @return
     */
    public static ListaMedicamentos getListaM() {
        return listaM;
    }

    /**
     * Método para añadir medicamentos a la lista
     * Comprueba también que la referencia y el nombre no existan
     * Si ya existe alguno de esos atributos el medicamento no se guarda en la lista
     * @param tipoM
     */
    public void añadir(Medicamentos tipoM) {
        if (comprobarRef(tipoM) == true) {
            if (comprobarNombre(tipoM) == true) {
                listaMedicamentos.add(tipoM);
            } else {
                JOptionPane.showMessageDialog(null, "Creación denegada:\n"
                        + "El nombre ya existe.", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Creación denegada:\n"
                        + "La referencia ya existe.", "Error",
                        JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Método para eliminar a una persona de la agenda
     * Busca que la referencia exista dentro de la lista y si es así la borra
     * @param referencia
     * @return
     */
    public boolean eliminar(int referencia) {
        boolean correcto = false;
        ListIterator<Medicamentos> iterList = listaMedicamentos.listIterator();
        Medicamentos temporal; //elemento de la lista
        while (iterList.hasNext() && !correcto) {
            temporal = iterList.next();
            if (temporal.getReferencia() == referencia) {
                listaMedicamentos.remove(listaMedicamentos.indexOf(temporal));
                correcto = true;
            }
        }
        return correcto;
    }

    /**
     * Método para modificar un medicamento que ya esté dentro de la lista
     * Se necesitaran todos los atributos del medicamento para modificarlo
     * Buscará el medicamento que deseemos borrar por la referencia
     * @param referencia
     * @param nombre
     * @param laboratorio
     * @param pa
     * @param receta
     * @return
     */
    public boolean modificarMedicamento(int referencia, String nombre, String laboratorio, String pa, String receta) {
        boolean encontrado = false;
        ListIterator<Medicamentos> iterList = listaMedicamentos.listIterator();
        Medicamentos temporal; //elemento de la lista
        if (listaMedicamentos.isEmpty()) {
            encontrado = false;
        } else {
            while (iterList.hasNext()) {
                temporal = iterList.next();
                if (temporal.getReferencia() == referencia) {
                    temporal.setReferencia(referencia);
                    temporal.setNombre(nombre);
                    temporal.setLaboratorio(laboratorio);
                    temporal.setPrincipioActivo(pa);
                    temporal.setReceta(receta);
                    encontrado = true;
                }
            }
        }
        return encontrado;
    }

    /**
     * Método para buscar un medicamento dentro de nuestra lista
     * El medicamento será buscado por el nombre y si lo encuentra devolverá los datos
     * @param nombre
     * @return
     */
    public String buscarMedicamento(String nombre) {
        String cadena = "El medicamento " + nombre + " no existe."; 
        ListIterator<Medicamentos> iterador = listaMedicamentos.listIterator(); 
        Medicamentos temporal;
        while (iterador.hasNext()) {
            temporal = iterador.next();
            if (nombre.equalsIgnoreCase(temporal.getNombre())) { 
                cadena = temporal.toString();
            }
        }
        return cadena;
    }

    /**
     * Método utilizado para compbrobar si existe una referencia en la lista
     * @param tipoM
     * @return 
     */
    private boolean comprobarRef(Medicamentos tipoM) {
        Medicamentos temporal;
        ListIterator<Medicamentos> iterList = listaMedicamentos.listIterator();
        while (iterList.hasNext()) {
            temporal = iterList.next();
            if (temporal.getReferencia() == tipoM.getReferencia()) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Método utilizado para comprobar si existe un nombre dentro de la lista
     * @param tipoM
     * @return 
     */
    private boolean comprobarNombre(Medicamentos tipoM) {
        Medicamentos temporal;
        ListIterator<Medicamentos> iterList = listaMedicamentos.listIterator();
        while (iterList.hasNext()) {
            temporal = iterList.next();
            if (temporal.getNombre().equals(tipoM.getNombre())) {
                return false;
            }
        }
        return true;
    }
}
