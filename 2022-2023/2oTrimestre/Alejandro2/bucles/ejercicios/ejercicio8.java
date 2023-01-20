package ejercicios;

import java.util.Scanner;

/*Pedir un número N, y mostrar todos los números del 1 al N.*/

public class ejercicio8 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int numero=0;
		System.out.println("Dame un numero hasta el que contar: ");
		 numero= sc.nextInt();
		 for(int i=1;i<=numero;i++) {
			 System.out.println(i);
			 
		 }

	}

}
