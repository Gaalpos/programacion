package arrays;

import java.util.Arrays;

/*Array con 30 primeras potencias de 5
 * 
 */

public class ejemplo4 {

	public static void main(String[] args) {
		
		/*
		// uno
		int contar = 0;
		for (int i = 1; i < 100; i = i + 2) {
			contar++;

		}

*/
		// dos
		int[] potencia = new int[30];

		// tres
		potencia[0] = 1;

		// cuatro
		for (int i = 1; i < potencia.length;i++) {
			potencia[i] = potencia[i - 1] *5;
		}

		// mostrar
		System.out.println(Arrays.toString(potencia));
	}
}

