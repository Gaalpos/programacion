package ejercicios;

import java.util.Scanner;

/*Leer números hasta que se introduzca un 0. Para cada uno
indicar si es par o impar.*/


public class ejercicio3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double numero=0;
		System.out.println("Dame un numero: (0 para salir)");
		 numero= sc.nextDouble();
		 while(numero!=0) {
			 
			 if(numero%2==0) {
				 System.out.println("El numero es par");
				 System.out.println("Dame un numero: (0 para salir)");
				 numero= sc.nextDouble();
			 }
			 else {
				 System.out.println("El numero es impar");
				 System.out.println("Dame un numero: (0 para salir)");
				 numero= sc.nextDouble();
			 }
			 
		 }
	     System.out.println("Saliendo del programa.....");

	}

}
