package propuestos2;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {

		Scanner escaner = new Scanner(System.in);
		int a = 0;

		System.out.print("Introduzca una cifra de tres digitos: ");
		a = escaner.nextInt();

		System.out.println("Primera cifra de " + a + " -> " + (a / 100));
		System.out.println("Cifra central de " + a + " -> " + (a / 10) % 10);
		System.out.println("Ultima cifra  de " + a + " -> " + (a % 10));
		
		escaner.close();
	}

}
