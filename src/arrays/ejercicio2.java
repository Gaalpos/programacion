package arrays;

import java.util.Scanner;

public class ejercicio2 {

	public static final int MARCA = -1;

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		
		int[] array= new int[5];
		int indice=0;
		System.out.print("Escribe diferentes valores enteros.");
		System.out.println("Después del último valor escribe un" + MARCA);
		System.out.println("COMO MAXIMO SE ADMITEN 100 VALORES");
		
		// semaforo de encontrar la marca
		boolean fin = false;
		
		while (!fin && indice<5) {
			// Antes de leer, comprobamos si realmente hay un entero.
			if (lector.hasNextInt()               ) {
				int valor = lector.nextInt();
				// Es la marca de fin?
				if (valor == MARCA     ) {
					// Sí lo es.
					fin = true;
				} else {
					// No. Es un valor que debe ser tratado.
					System.out.println("Valor leído: " + valor);
					array[indice]=valor;
					indice++;
				}
			} else {
				// Si el valor no es entero, se lee pero se ignora.
				lector.next();
			}
		}
		
		// Los valores que sobren en la última línea escrita se descartan.
		lector.nextLine();
		System.out.println("Ya se han leído todos los valores.");
	}
}