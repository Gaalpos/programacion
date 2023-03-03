package ejercicios;

import java.util.Scanner;

/*Pedir un número y calcular su factorial.*/

public class ejercicio12 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int numero=0;
		int aux=1;
		System.out.println("Dame un numero para calcular su factorial: ");
		 numero= sc.nextInt();
		 for(int i=1;i<=numero;i++) {
			 aux=aux*i; 
		 }
System.out.println("El factorial es: "+aux);
	}

}
