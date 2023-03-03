package ejercicios;

import java.util.Scanner;

/*Pedir números hasta que se teclee uno negativo, y mostrar
cuántos números se han introducido.*/

public class ejercicio4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double numero=0;
		System.out.println("Dame un numero: (negativo para salir)");
		 numero= sc.nextDouble();
		 int cont=0;
	 while(numero>=0) {
		cont++;
		System.out.println("Dame un numero: (negativo para salir)");
		 numero= sc.nextDouble();
		 
	 }
	     System.out.println("Has introducido: "+cont+" numeros");

	}

	}


