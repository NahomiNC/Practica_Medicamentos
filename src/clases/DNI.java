package clases;
import excepciones.*;
/**
 *
 * @author dam117
 */
public class DNI {
    private String dni;
    
    /**
     *
     * @param dni
     * @throws ControlTamañoException
     * @throws TodoDigitosException
     * @throws TieneLetraException
     * @throws LetraCorrectaException
     */
    public DNI(String dni) throws ControlTamañoException, TodoDigitosException, TieneLetraException, LetraCorrectaException {
        if(controlTamaño(dni) == true)
            if(todoDigitos(dni) == true)
                if(tieneLetra(dni) == true)
                    if(letraCorrecta(dni) == true)
                        this.dni = dni;
                    else throw new LetraCorrectaException("La letra no es la correcta.");
                else throw new TieneLetraException("No tiene una letra.");
            else throw new TodoDigitosException("No son todo dígitos.");
        else throw new ControlTamañoException("El tamaño no es el indicado.");
    }
    
    /**
     *
     * @param dni
     * @return
     */
    public boolean controlTamaño(String dni){
        StringBuffer dniControl = new StringBuffer(dni);
        if (dniControl.length() == 9) 
            return true;
        else
            return false;        
    }
    
    /**
     *
     * @param dni
     * @return
     */
    public boolean todoDigitos(String dni){
        StringBuffer dniControl = new StringBuffer(dni);
        int i = 0;
        for (; i < dniControl.length()-1; i++) {
            if (!Character.isDigit(dniControl.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    
    /**
     *
     * @param dni
     * @return
     */
    public boolean tieneLetra(String dni){
        StringBuffer dniControl = new StringBuffer(dni);        
        if (Character.isLetter(dniControl.charAt(8))){
            return true;
        }
        return false;
    }
    
    /**
     *
     * @param dni
     * @return
     */
    public boolean letraCorrecta(String dni){
        String[]letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        StringBuffer dniControl = new StringBuffer(dni);
        int numeroDNI = Integer.parseInt(dniControl.substring(0, 8)); //Separamos los digitos de la letra        
        int resto = numeroDNI % 23; //Calculamos el resto(mod)        
        String letra = Character.toString(dniControl.charAt(8)).toUpperCase(); //Separamos la letra y la pasamos a mayuscula
        if (letra.matches(letras[resto])){//Comparamos si la letra es correcta
            return true;
        }
        return false;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return this.dni;
    }
    
}
