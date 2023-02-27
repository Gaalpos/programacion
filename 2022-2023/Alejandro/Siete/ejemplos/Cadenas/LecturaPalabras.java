package Cadenas;

import java.util.Arrays;
import java.util.Scanner;
/*public static void main(String[] args) {
 
 StringBuilder cadena=new StringBuilder();
 long numero1= System.currentTimeMillis();
 for(int i=0;i<10000;i++) {
 
 cadena.append("hola");
 cadena.append("que");
 cadena.append("tal");
 cadena.append("estas");
 
 }
 long numero2=System.currentTimeMillis();
 System.out.println(numero2-numero1);
 }
 
} */

public class LecturaPalabras {
	public static final int NUM_FRASES = 4;

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);
		String[] frase = new String[NUM_FRASES];
		System.out.println("Escribe " + NUM_FRASES + " frases.");
		System.out.println("Para terminar una frase, pulsa la tecla de retorno.");
		for (int i = 0; i < NUM_FRASES; i++) {
			// Va leyendo frases una por una.
			frase[i] = lector.nextLine();
			System.out.println("Frase " + i + ": Has escrito \" " + frase);
		}
		// Ahora no hay que leer el resto de ninguna línea, ya que siempre se leen
		// líneas enteras ...
		System.out.println(Arrays.toString(frase));
	}

}
