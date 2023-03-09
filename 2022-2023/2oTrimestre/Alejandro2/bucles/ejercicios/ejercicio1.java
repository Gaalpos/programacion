package ejercicios;

/*Leer un número y mostrar su cuadrado, repetir el proceso
hasta que se introduzca un número negativo.*/


import java.util.Scanner;

public class ejercicio1 {

	
	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		double numero=0;
		while(numero>=0) {
			
			System.out.println("Dame un numero: (negativo para salir)");
		 numero= sc.nextDouble();
		 if(numero>=0) {
			System.out.println("Su cuadrado es: "+Math.pow(numero, 2));
		}
		 else {
			 System.out.println("El numero introducido es negativo CERRANDO PROGRAMA.........");
		 }
			 }
		
		
		
		
	}
	
}
