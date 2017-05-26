/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author dam117
 */
public class Antibioticos extends Medicamentos {
    
    /**
     * Constructor para crear Medicamentos de tipo Antibióticos
     * @param referencia
     * @param nombre
     * @param pA
     * @param laboratorio
     * @param receta
     */
    public Antibioticos(int referencia, String nombre, String pA,String laboratorio, String receta) {
        super(referencia, nombre, pA,laboratorio, receta);
    } 
}
