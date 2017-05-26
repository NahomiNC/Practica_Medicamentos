package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author dam117
 */
public abstract class Medicamentos {

    private String nombre, principioActivo, laboratorio, receta;
    private int referencia;

    public Medicamentos(int referencia, String nombre, String pA, String laboratorio, String receta) {
        this.referencia = referencia;
        this.nombre = nombre;
        this.principioActivo = pA;
        this.laboratorio = laboratorio;
        this.receta = receta;

    }

    public String getNombre() {
        return nombre;
    }

    public String getPrincipioActivo() {
        return principioActivo;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public String getReceta() {
        return receta;
    }

    public int getReferencia() {
        return referencia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrincipioActivo(String principioActivo) {
        this.principioActivo = principioActivo;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public void setReceta(String receta) {
        this.receta = receta;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    @Override
    public String toString() {
        String tipo = getClass().getName();
        return "Medicamento:\n" + "   Referencia = " + referencia + "\n   Nombre = " + nombre + "\n   Tipo = " + tipo.substring(7) + "\n   PrincipioActivo = " + principioActivo + "\n   Laboratorio = " + laboratorio + "\n   Receta = " + receta;
    }

}
