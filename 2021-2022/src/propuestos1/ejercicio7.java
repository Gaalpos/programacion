package propuestos1;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner escaner = new Scanner(System.in);
		int a = 0;

		System.out.print("Inserte un entero:");
		a = escaner.nextInt();
		System.out.println(a + (a >= 0 ? " es positivo " : " es negativo "));
		System.out.println(a + (a % 2 == 0 ? " es par " : " es impar "));
		System.out.println(a + (a % 5 == 0 ? " es múltiplo de 5 " : " no es múltiplo de 5 "));
		System.out.println(a + (a % 10 == 0 ? " es múltiplo de 10 " : " no es múltiplo de 10 "));
		System.out.println(a + (a > 100 ? " es mayor que 100 " : " es menor que 100 "));

		escaner.close();
	}

}