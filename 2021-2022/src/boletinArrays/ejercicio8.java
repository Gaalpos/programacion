package boletinArrays;

import java.util.Arrays;
import java.util.Scanner;

/*
 * diseñar una app que declare una tabla de 0 elementos enetors.
 * Despues se debe pedir un numero y una posicion, insertarlo en la posicion indicada,
 * desplazando los que estén detrás 
 */
public class ejercicio8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] array = {1,2,3,4,5,6,7,8,9,0 };

		int valor, indice;

		System.out.println("Introduce un valor ");
		valor = sc.nextInt();
		System.out.println("Introduce un indice");
		indice = sc.nextInt();

		for (int i = array.length-1; i>indice; i--) {
			array[i] = array[i-1];
		}
		array[indice] = valor;
		System.out.println(Arrays.toString(array));
		sc.close();
	}
}
