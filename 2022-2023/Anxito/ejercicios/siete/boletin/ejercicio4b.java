package boletin;

import java.util.Scanner;

/*4b. Leer 11 números enteros. Debemos mostrarlos en el 
siguiente orden: el primero, el último, el segundo, el 
penúltimo, el tercero, etc. */

public class ejercicio4b {

    public static void main(String[] args) {
		
		int tamaño=0;
		Scanner sc = new Scanner(System.in); 
		System.out.println("introduce tamaño del array");
		tamaño=sc.nextInt();
		int mitad=0;
		int[] arr = new int[tamaño];
		
		for(int i=0; i<arr.length;i++) {
			System.out.println("ingresa numero: "+i);
			arr[i]=sc.nextInt();
		}
		
		
		mitad=tamaño/2;
		
		
		
			for(int i=0; i<mitad;i++) {
					System.out.print(arr[i] + " ");
					System.out.print(arr[tamaño-1-i]+  " ");
				}
			if(tamaño%2!=0)		
				System.out.println(arr[mitad]);
		}
		
	}