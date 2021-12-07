package propuestos1;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);

		int a = 0;

		System.out.print("Introduzca un entero A: ");
		a = escaner.nextInt();

		System.out.println("A + 77= " + (a + 77));
		System.out.println("A - 3= " + (a - 3));
		System.out.println("El doble de A es " + (a * 2));

		escaner.close();

	}

}
