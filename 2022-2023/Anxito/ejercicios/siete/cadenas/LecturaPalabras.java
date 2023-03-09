package cadenas;

import java.util.Arrays;
import java.util.Scanner;

public class LecturaPalabras {
    
    public static final int NUM_PALABRAS = 10;

	public static void main(String[] args) {

        String[] arr = new String[NUM_PALABRAS];
        StringBuilder sb = new StringBuilder();
		Scanner lector = new Scanner(System.in);
		System.out.println("Escribe " + NUM_PALABRAS + " palabras separadas por espacios.");
		System.out.println("Las puedes escribir en líneas de texto diferente, si quieres.");
		for (int i = 0; i < NUM_PALABRAS; i++) {
			// Va leyendo palabras una por una.
			// Recordar el comportamiento lectura de secuencias de datos por teclado.
			String palabra = lector.next();
            arr[i]=palabra;
			System.out.println("Palabra " + i + ": Has escrito " + palabra);
		}
		// Se lee el resto de la línea y se ignora el contenido.
		lector.nextLine();
        System.out.println(Arrays.toString(arr));
        System.out.println(sb.toString());
	}
}
