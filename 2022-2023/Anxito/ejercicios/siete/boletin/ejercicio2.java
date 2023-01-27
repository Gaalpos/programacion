package boletin;

import java.util.Scanner;

/*2. Leer 5 números y mostrarlos en orden inverso al 
introducido.*/

public class ejercicio2 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int t[] = new int[5];
		 for (int i = 0; i < 5; i++) {
		 System.out.print("Introduzca un número "+(1+i)+" :");
		 t[i] = sc.nextInt();
		 }
		 
		 System.out.println("Los números son:");
		 for (int i = 4; i >= 0; i--)
		 System.out.println(i+1);
		 sc.close();
		 }

		 }