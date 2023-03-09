package ejercicios;

import java.util.Scanner;

public class tabladel7 {

	public static void main(String[] args) {

		// scaner
		Scanner sc = new Scanner(System.in);

		int num1 = 0, respuesta;

		do {
		// request number
		System.out.print("Introduzca un número: ");
		num1 = sc.nextInt();

		System.out.println("TABLA DE MULTIPLICAR DEL " + num1);
		for (int i = 1; i <= 10; i++) {
			System.out.println(num1 + "x" + i + " es " + (num1 * i));
		}
		
		System.out.println("Pulse 1 para calcular otra tabla");
		respuesta = sc.nextInt();
		} while (respuesta == 1 );
		System.out.println("Gracias por su visita");

		sc.close();
	}

}