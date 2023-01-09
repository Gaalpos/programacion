package ejemplos;

import java.util.Scanner;

public class ejemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner eloy = new Scanner(System.in);

		String nombre = "";

		int edad =0;


		// paso 1
		System.out.println("dime tu nombre: ");

		// paso 2
		nombre = eloy.nextLine();

		// paso 4
		System.out.println("¿Cuantos años tienes? ");

		// paso 5
		edad = eloy.nextInt();

		// paso 6
		System.out.println("Tu nombre es " + nombre + " y tienes " + edad + " años");

	}

}