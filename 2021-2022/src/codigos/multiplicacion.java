package codigos;

import java.util.Scanner;

public class multiplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner pepe = new Scanner(System.in);
		// variables
		int num1 = 0, num2 = 0, res;
		int respuesta;

		do {
			// entradas
			System.out.println("Introduce primer numero: ");
			num1 = pepe.nextInt();
			System.out.println("Introduce segundo numero: ");
			num2 = pepe.nextInt();

			// algoritmo
			res = num1 + num2;

			// salida
			System.out.println("El resultado es: " + res);

			// PREGUNTAMOS al usuario
			System.out.println("PULSA 0 para seguir/ PULSA 1 para salir");
			respuesta = pepe.nextInt();
		} while (respuesta == 0);

		System.out.println("fin");
		// cerramos el Scanner para ahorrar recursos (Aconsejable)
		pepe.close();
	}

}