package arrays;

import java.util.Arrays;

import java.util.Scanner;

/*
 * Escribe un programa que lea 10 números por teclado y que luego los muestre en orden inverso, es decir, el
 * primero que se introduce es el último en mostrarse y viceversa.
 */

public class especialEjercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] inversos = new int[10];

		for (int k = 9; k >=0; k--) {
			int n=0;
			System.out.println("Escribe un número");
			n=sc.nextInt();
			inversos[k] = n;
		}
		System.out.println(Arrays.toString(inversos));
	}
}
