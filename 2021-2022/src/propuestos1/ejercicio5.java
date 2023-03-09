package propuestos1;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner escaner = new Scanner(System.in);
		int a = 5;

		System.out.print("Inserte un entero:");
		a = escaner.nextInt();
		System.out.println(a + (a % 2 == 0 ? " es par " : " es impar "));

		escaner.close();
	}

}
