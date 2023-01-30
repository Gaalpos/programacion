package anomalos;

import java.util.Arrays;
import java.util.Scanner;

// Un programa que lee un número conocido de valores enteros.
public class LectorValoresConocidos {
	
	// Se leerán 10 valores.
	public static final int NUM_VALORES = 10;

	public static void main(String[] args) {
	
		Scanner lector = new Scanner(System.in);
		float[] arr= new float[NUM_VALORES];
		System.out.println("Escribe" + NUM_VALORES + "enteros. Se puede hacer en diferentes líneas.");
		
		
		int numValoresLeidos = 0;
		while (numValoresLeidos < NUM_VALORES) {
			// Antes de leer, comprobamos si realmente hay un entero.

			//Y ADEMAS DEBE ESTAR ENTRE 0 y 10
			if (lector.hasNextInt()) {
				float valor = lector.nextInt();

				if(valor>=0 && valor<=10){
				arr[numValoresLeidos]=valor;
				System.out.println("Valor " + numValoresLeidos + " leído: " + valor);
				numValoresLeidos++;
			}else{
				System.out.println("valor no valido");
			} 
			
		}else {
				lector.next();
			}
		}
		
		// Los valores que sobren en la última línea escrita se descartan.
		lector.nextLine();
		System.out.println("Ya se han leído " + NUM_VALORES + " valores.");
		System.out.println(Arrays.toString(arr));
	}
}
