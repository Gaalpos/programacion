package boletin;

import java.util.Scanner;

/*1. Leer 5 números y mostrarlos en el mismo orden 
introducido. */

public class ejercicio1{
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int t[] = new int[5];
		 for (int i = 0; i < 5; i++) {
		 System.out.print("Introduzca un número "+(i+1)+" :");
		 t[i] = sc.nextInt();
		 }
		 System.out.println("Los números son:");
		 for (int i = 0; i < 5; i++)
		 System.out.println(t[i]);
		 sc.close();
		 }

		 }


	
