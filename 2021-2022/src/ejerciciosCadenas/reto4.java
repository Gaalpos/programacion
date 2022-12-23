package ejerciciosCadenas;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Reto 4: usando el método compareTo, debe ORDENAR un array de cadenas
de texto. Para facilitar la entrada de los datos, este array puede ser
determinado directamente a partir de argumentos en la ejecución del
programa (la variable args).
 */
public class reto4 {
	
	public static String[] bubbleCadenas(String[] array) {

		// Bucle externo.

		for (int i = 0; i < array.length - 1; i++) {

			// Bucle interno.
			// Se busca entre el resto de posiciones cuál es el valor más bajo.
			for (int j = i + 1; j < array.length; j++) {
			//	System.out.println("externo: " + i + " interno: " + j);
				// SWAP
				if (array[i].compareTo(array[j])>0) {
					// Para intercambiar valores hay una variable auxiliar.
					String cambio = array[i];
					array[i] = array[j];
					array[j] = cambio;
				}
				/*
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				*/
			}
		}
		return array;
	}
	
	public static void main(String[] args) {
		
		String[] semana = {"lunes","martes","miércoles","jueves","viernes", "sábado","domingo"};
		
		System.out.println(Arrays.toString(semana));
		
		bubbleCadenas(semana);
		
		System.out.println(Arrays.toString(semana));
		
		
		
	}

}
