package ejercicios;

import java.util.Scanner;

/*Realizar un juego para adivinar un número. Para ello pedir un
número N, y luego ir pidiendo números indicando “mayor” o
“menor” según sea mayor o menor con respecto a N. El proceso
termina cuando el usuario acierta.*/

public class ejercicio5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int secreto=0;
		int numero=0;
		System.out.println("Dame un numero para adivinar: ");
		 secreto= sc.nextInt();
		 System.out.println("Adivina el numero: ");
		 numero= sc.nextInt();
 while(numero!=secreto) {
			 
			 if(numero>secreto) {
				 System.out.println("El numero es menor");
				 System.out.println("Prueba otro numero: ");
				 numero= sc.nextInt();
			 }
			 else {
				 System.out.println("El numero es mayor");
				 System.out.println("Prueba otro numero: ");
				 numero= sc.nextInt();
			 }
			 
		 }
	     System.out.println("Has acertado");
		 

	}

}
