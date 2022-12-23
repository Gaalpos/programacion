package boletinArrays;

import java.util.Scanner;

/*
 * 1. Leer 5 números y mostrarlos en el mismo orden
introducido.
 */
public class ejercicio1 {
	
	public static void main(String[] args) {	
		
		Scanner sc=new Scanner(System.in);
		int [] array=new int [5];
		for (int i =0; i<array.length;i++) {
			System.out.println("Intrduce el indice "+i );
			array[i]=sc.nextInt();
		}
		for (int i =0; i<array.length;i++) {
			System.out.println(" "+array[i]+ " ");
		}
		sc.close();
		
	}
	

}
