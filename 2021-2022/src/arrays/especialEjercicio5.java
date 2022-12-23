package arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Ejercicio 5 Escribe un programa que pida 10 números por teclado y que luego muestre los números 
 * introducidos junto con las palabras “máximo" y "mínimo" al lado del máximo y del mínimo respectivamente.
 */
public class especialEjercicio5 {
	
	public static void main(String[] args) {

		int maximo=0;
		int minimo=0;
		int [] numeros = new int [10];
		Scanner sc = new Scanner(System.in);
		for (int k=0;k<numeros.length;k++) {
			System.out.println("Escribe un número");
			numeros[k]=sc.nextInt();

		}
		System.out.println(Arrays.toString(numeros));
	
		int cont=0;
		for(int k=0;k<numeros.length;k++) {
			if(numeros[k]>=numeros[k]+1) {
				maximo=numeros[k];
			}else {
				minimo=numeros[k];
			}
		}
		System.out.println("Máximo: "+maximo);
		System.out.println("minimo: "+minimo);
			
	
		
	}

}
