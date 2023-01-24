package anomalos;

import java.util.Arrays;
import java.util.Scanner;

public class LectorValoresDesconocidos {
	
	public static final int MARCA = -1;
	public static final int NUM_VALORES = 10;
	
	public static void main(String[] args) {
		
		/*SI LOS ALMACENAMOS EN UN ARRAY DEBEMOS CONTROLAR SU TAMAÑO*/
		int[] arr= new int[NUM_VALORES];
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Escribe hasta " + NUM_VALORES + " enteros.");
		System.out.println("Después del último valor escribe un" + MARCA);
		
		int numValoresLeidos = 0;
		boolean marca = false;
		
		while (!marca && numValoresLeidos < NUM_VALORES) {
			// Antes de leer, comprobamos si realmente hay un entero.
			if (lector.hasNextInt()) {
				int valor = lector.nextInt();
				// Es la marca de fin?
				if (valor == MARCA) {
					// Sí lo es.
					marca = true;
				} else {
					arr[numValoresLeidos]=valor;
					numValoresLeidos++;
					System.out.println("Valor leído: " + valor);
				}
			} else {
				// Si el valor no es entero, se lee pero se ignora.
				lector.next();
			}
		}
		// Los valores que sobren en la última línea escrita se descartan.
		lector.nextLine();
		System.out.println("Ya se han leído todos los valores.");
		System.out.println(Arrays.toString(arr));
	}
}
