package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/*
 * Ejercicio 4 Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado y cubo, Carga
 * el array numero con valores aleatorios entre 0 y 100. En el array cuadrado se deben almacenar los cuadrados de los valores que 
 * hay en el array numero. En el array cubo se deben almacenar los cubos de los valores que hay en numero. 
 * A continuación, muestra el contenido de los tres arrays dispuesto en tres columnas. 
 */

public class especialEjercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numero = new int[20];
		int[] cuadrado = new int[20];
		int[] cubo = new int[20];
		int max = 100;
		int min = 0;
		int diff = max - min;

		for (int k = 0; k < numero.length; k++) {

			Random rn = new Random();
			int i = rn.nextInt(diff + 1);
			i += min;
			// System.out.println("The Random Number is " + i);
			numero[k] = i;
		}
		System.out.println("El numero es");
		System.out.println(Arrays.toString(numero));
		
		
		for(int k=0;k<cuadrado.length;k++) {
			int cua=k;
			cuadrado[k]=(numero[k])*(numero[k]);
		} 
		System.out.println("El cuadrado es: ");
		System.out.println(Arrays.toString(cuadrado));
		
		for(int k=0;k<cuadrado.length;k++) {
			int cua=k;
			cuadrado[k]=(numero[k])*(numero[k])*(numero[k]);
		} 
		System.out.println("El cubo es: ");
		System.out.println(Arrays.toString(cuadrado));
	}

}
