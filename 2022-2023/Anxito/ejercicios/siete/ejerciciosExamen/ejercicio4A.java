package ejerciciosExamen;

import javax.swing.JOptionPane;

// Crea un programa en java que solicite al usuario dos cadenas de caracteres y que devuelva
// la primera cadena, pero transformando en mayúsculas la parte que coincide con la segunda cadena introducida.
// Por ejemplo, si se introducen las cadenas "Este es mi amigo Juan" y "amigo", devolverá "Este es mi AMIGO JUAN". 

public class ejercicio4A {

    static String pasaMayusculas(String cadena, String parte){
        int posicion;
        String subcadena;
        
        posicion=cadena.indexOf(parte);
        if (posicion!=-1){   //Solo si el resultado de llamar a indexOf es distinto de -1 es porque la ha encontrado
            subcadena=cadena.substring(posicion,posicion+parte.length());   
            //Devuelvo la nueva cadena formada por la primera parte de la cadena principal si tocar,
            //la segunda parte pasada a mayúsculas y la tercer parte sin tocar
            return cadena.substring(0,posicion)+subcadena.toUpperCase()+cadena.substring(posicion+parte.length());
        } else{
            return cadena;
        }
    }
    
    public static void main(String[] args) {
        String cadena1,cadena2;
        
        cadena1=JOptionPane.showInputDialog("Introduzca primera cadena:");
        cadena2=JOptionPane.showInputDialog("Introduzca segunda cadena:");
        JOptionPane.showMessageDialog(null, "Resultado: "+pasaMayusculas(cadena1,cadena2));
        
    }
    
}
    

