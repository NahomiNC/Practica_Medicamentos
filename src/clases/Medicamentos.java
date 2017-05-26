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
     *
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
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @return
     */
    public String getPrincipioActivo() {
        return principioActivo;
    }

    /**
     *
     * @return
     */
    public String getLaboratorio() {
        return laboratorio;
    }

    /**
     *
     * @return
     */
    public String getReceta() {
        return receta;
    }

    /**
     *
     * @return
     */
    public int getReferencia() {
        return referencia;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @param principioActivo
     */
    public void setPrincipioActivo(String principioActivo) {
        this.principioActivo = principioActivo;
    }

    /**
     *
     * @param laboratorio
     */
    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    /**
     *
     * @param receta
     */
    public void setReceta(String receta) {
        this.receta = receta;
    }

    /**
     *
     * @param referencia
     */
    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        String tipo = getClass().getName();
        return "Medicamento:\n" + "   Referencia = " + referencia + "\n   Nombre = " + nombre + "\n   Tipo = " + tipo.substring(7) + "\n   PrincipioActivo = " + principioActivo + "\n   Laboratorio = " + laboratorio + "\n   Receta = " + receta;
    }

}
