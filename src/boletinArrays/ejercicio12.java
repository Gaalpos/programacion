package boletinArrays;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Leer por teclado una tabla de 10 elementos numéricos
enteros y una posición (entre 0 y 9). Eliminar el elemento
situado en la posición dada sin dejar huecos.
 */
public class ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int valor, indice=0;
		
		int[] array = {1,2,3,4,5,6,7,8,9,10 };
		System.out.println(Arrays.toString(array));
		

		//Pedir indice
		System.out.println("introduce un indice");
		indice=sc.nextInt();
		
		
		//quitar posicion
		for(int i=indice;i<array.length-1;i++) {
			array[i]=array[i+1];
		}
		System.out.println(Arrays.toString(array));
		array[array.length-1]=0;
	System.out.println(Arrays.toString(array));
	}
}
