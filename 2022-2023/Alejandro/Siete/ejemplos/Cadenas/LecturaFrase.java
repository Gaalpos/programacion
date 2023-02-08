package Cadenas;

import java.util.Arrays;
import java.util.Scanner;

public class LecturaFrase {
    public static final int NUM_FRASES = 4;

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		String[] frase= new String[NUM_FRASES];
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
