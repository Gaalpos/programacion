package boletin;

import java.util.Arrays;
import java.util.Scanner;

// 10. Ídem, desplazar N posiciones (N es introducido por el
// usuario).


public class ejercicio10 {
	
	public static int [] moverDerecha(int[]array) {
		int aux =0;
		aux=array[array.length-1];
		for (int i = array.length-1; i>0; i--) {
			array[i] = array[i-1];
		}
		array[0]=aux;
		return array;
	}
	
	
	public static int[]moverIzquierda(int[]array){
		
		int aux =0;
		
		aux=array[0];
		
		for (int i = 0; i<array.length-1; i++) {
			array[i] = array[i+1];
		}
		array[array.length-1]=aux;
		return array;
	}
	
	public static void main(String[] args) {
		//pedir al usuario cuantas veces lo quiere mover
		int[] array = {1,2,3,4,5,6,7,8,9,10 };
		
		System.out.println("Array original "+Arrays.toString(array));
		Scanner sc= new Scanner (System.in);
		int veces=0;
		
		System.out.println("Cuantas veces quieres mover? ");
		veces=sc.nextInt();
		for (int i= 0;i<veces;i++) {
			moverIzquierda(array);
			System.out.println(Arrays.toString(array));
		}
		System.out.println("Array movido "+veces+ " veces:");
		System.out.println(Arrays.toString(array));
		sc.close();
	}
}
