package ejercicios;

import java.util.Scanner;

/*Leer un número e indicar si es positivo o negativo. El
proceso se repetirá hasta que se introduzca un 0.*/

public class ejercicio2 {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double numero=0;
		System.out.println("Dame un numero: (0 para salir)");
		 numero= sc.nextDouble();
		 while(numero!=0) {
			 
			 if(numero>0) {
				 System.out.println("El numero es positivo");
				 System.out.println("Dame un numero: (0 para salir)");
				 numero= sc.nextDouble();
			 }
			 else {
				 System.out.println("El numero es negativo");
				 System.out.println("Dame un numero: (0 para salir)");
				 numero= sc.nextDouble();
			 }
			 
		 }
	     System.out.println("Saliendo del programa.....");
			 

	}

}
