package ejercicios;

import java.util.Scanner;

/*Pedir 15 números y escribir la suma total.*/

public class ejercicio10 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double numero=0;
		double aux=0;
		for(int i=1;i<=15;i++) {
		System.out.println("Dame un numero para sumar: ");
		 numero= sc.nextDouble();
		 aux+=numero;
		}
		System.out.println("La suma total es. "+aux);
	}

}
