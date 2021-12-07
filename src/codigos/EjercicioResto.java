package codigos;

import java.util.Scanner;

public class EjercicioResto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner esc = new Scanner(System.in);
		// variables
		int num1 = 0, num2 = 0, coc;
		float resto = 0;
		char respuesta;

		do {
			// entradas
			System.out.println("Introduce primer numero: ");
			num1 = esc.nextInt();
			System.out.println("Introduce segundo numero: ");
			num2 = esc.nextInt();

			// algoritmo
			coc = num1 / num2;
			resto = num1 % num2;

			// salida
			System.out.println("El cociente es: " + coc);
			System.out.println("El resto es: " + resto);

			// PREGUNTAMOS al usuario
			System.out.println("PULSA s para seguir/ PULSA n para salir");
			respuesta = esc.next().charAt(0);
		} while (respuesta == 's');

		System.out.println("fin");
		// cerramos el Scanner para ahorrar recursos (Aconsejable)
		 esc.close();
	}

}
