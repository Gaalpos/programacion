package ejercicio;

import java.util.Arrays;
import java.util.Scanner;

// Código que vaya leyendo palabras desde el teclado hasta encontrar la
// palabra "fin".
// Cuando esto sucede, debe mostrar por pantalla la palabra que estaría
// en la última posición alfabética de entre todas las escritas. La
// palabra "fin" queda excluida.


public class ejercicio3B {
    
        public static final int NUM_PALABRAS = 10;

        static String[] letras = {"fin"};
        
        static int[] res = new int[letras.length];
        
        public static int recorrido(String cadena, String car) {
        
        int total = 0;
        for(int i=0; i<cadena.length();i++)
        if (cadena.charAt(i)==car.charAt(0)) 
        total++;
        return total;
        
        }
            
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("introduce una cadena: ");
            String cadena =sc.nextLine();
            
            cadena = cadena.toLowerCase().replaceAll("", "");
        
            for(int j=0; j<letras.length; j++) {
        
                res[j]=recorrido(cadena,letras[j]);
            }
            System.out.println(Arrays.toString(letras));
            System.out.println(Arrays.toString(res));
         
        }
        
        }