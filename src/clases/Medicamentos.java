package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author dam117
 */
public abstract class Medicamentos {

    private String nombre, principioActivo, laboratorio, receta;
    private int referencia;

    /**
     * Constructor que lleva los atributos necesarios para poder crear tipos de medicamentos.
     * @param referencia
     * @param nombre
     * @param pA
     * @param laboratorio
     * @param receta
     */
    public Medicamentos(int referencia, String nombre, String pA, String laboratorio, String receta) {        
        this.referencia = referencia;     
        this.nombre = nombre;
        this.principioActivo = pA;
        this.laboratorio = laboratorio;
        this.receta = receta;

    }

    /**
     * Método para obtener el nombre
     * @return devuelve el nombre del medicamento
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para obtener el principio activo
     * @return devuelve el principio activo del medicamento
     */
    public String getPrincipioActivo() {
        return principioActivo;
    }

    /**
     * Método para obtener el nombre del Laboratorio que lo fabrica
     * @return devuelve el laboratio del medicamento
     */
    public String getLaboratorio() {
        return laboratorio;
    }

    /**
     * Método para obtener si necesita o no receta
     * @return devuelve si necesita o no receta el medicamento
     */
    public String getReceta() {
        return receta;
    }

    /**
     * Método para obtener la referencia del medicamento que debe ser unico
     * @return devuelve la referencia del medicamento
     */
    public int getReferencia() {
        return referencia;
    }

    /**
     * Método para asignar un nombre a un medicamento
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para asignar el principio activo a un medicamento
     * @param principioActivo
     */
    public void setPrincipioActivo(String principioActivo) {
        this.principioActivo = principioActivo;
    }

    /**
     * Método para asignar el Laboratorio que la fabrica a un medicamento
     * @param laboratorio
     */
    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    /**
     * Método para asignar si necesita o no receta un medicamento
     * @param receta
     */
    public void setReceta(String receta) {
        this.receta = receta;
    }

    /**
     * Método para asignar la referencia a un medicamento
     * @param referencia
     */
    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    /**
     * Método para mostrar los datos de un medicamento
     * @return devuelve los datos de los medicamentos
     */
    @Override
    public String toString() {
        String tipo = getClass().getName();
        return "Medicamento:\n" + "   Referencia = " + referencia + "\n   Nombre = " + nombre + "\n   Tipo = " + tipo.substring(7) + "\n   PrincipioActivo = " + principioActivo + "\n   Laboratorio = " + laboratorio + "\n   Receta = " + receta;
    }

}
