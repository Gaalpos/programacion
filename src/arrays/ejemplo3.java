package arrays;

import java.util.Arrays;

/*
 * array con todos los impares desde 1 hasta 100
 */

//Un programa que inicializa proceduralmente un array con valores relacionados entre sí.
public class ejemplo3 {

	public static void main(String[] args) {
		
		// uno
		int contar = 0;
		for (int i = 1; i < 100; i = i + 2) {
			contar++;

		}

		// dos
		int[] impares = new int[50];

		// tres
		impares[0] = 1;

		// cuatro
		for (int i = 1; i < impares.length;i++) {
			impares[i] = impares[i - 1] + 2;
		}

		// mostrar
		System.out.println(Arrays.toString(impares));
		System.out.println("hola");
	}
}
