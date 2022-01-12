package examenA;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int pares = 0;
		int contA = 0;
		int impares = 0;
		int contB = 0;
		int ceros = 0;
		int cont1 = 0;

		do {
			System.out.println("Escribe un número entre 0 y 100");
			a = sc.nextInt();
			if (a <= 100) {

				if (a != 0) {
					if (a % 2 == 0) {
						pares = pares + a;
						contA++;
						cont1++;
					} else {
						impares = impares + a;
						contB++;
						cont1++;
					}
				} else {
					ceros++;
					cont1++;
				}
			} else {
				System.out.println("¡DIJE ENTRE 0 Y 100!");
			}
		} while (cont1 < 10);
		sc.close();
		if (pares != 0) {
			System.out.println("Media de los pares:" + pares / contA);
		} else {
			System.out.println("No hubo ningún par");
		}
		if (impares != 0) {
			System.out.println("Media de los impares: " + impares / contB);
		} else {
			System.out.println("No hubo ningún impar");
		}
		System.out.println("Ceros totales: " + ceros);
	}
}
