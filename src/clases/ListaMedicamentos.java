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
    public static ListaMedicamentos listaM = new ListaMedicamentos();

    public ListaMedicamentos() {
        listaMedicamentos = new ArrayList<Medicamentos>();
    }

    public ArrayList<Medicamentos> getListaMedicamentos() {
        return listaMedicamentos;
    }

    public static ListaMedicamentos getListaM() {
        return listaM;
    }

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
     *
     * @param nombre
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

    public void mostrarLista() {
        if (listaMedicamentos.isEmpty()) {
            System.out.println("La lista está vacía.");
        } else {
            System.out.println("Lista:");
            for (Medicamentos med : listaMedicamentos) {
                System.out.println(med.toString() + "  Posicion: " + listaMedicamentos.indexOf(med));
            }
            System.out.println("Nº de personas en la agenda: " + listaMedicamentos.size());
        }
    }
}
