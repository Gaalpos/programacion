package ejercicios;

import java.util.Scanner;

/*Pedir números hasta que se teclee un 0, mostrar la suma de
todos los números introducidos.*/

public class ejercicio6 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		double numero=0;
		double aux=0;
		System.out.println("Dame un numero distinto de 0 para sumar: ");
		 numero= sc.nextDouble();
		 while(numero!=0){
			 aux+=numero;
			 System.out.println("Dame un numero distinto para sumar( al introducir 0 te muestra la suma): ");
			 numero= sc.nextDouble();
		 }
		
		System.out.println("La suma es: "+aux);
	}

}
