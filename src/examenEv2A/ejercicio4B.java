package examenEv2A;

import java.util.Scanner;

/*
 *Ejercicio4B Ingresar una cadena de caracteres formadas por numeros y letras, en ese orden
 *y obtenga otra cadena donde aparezca cada letra tantas veces como lo indique el numero que 
 *lo precede. Ejemplo; sil la cadena es 2w4r5f debemos obtener la sigiente caden: wwrrrrfffff
 */

public class ejercicio4B {

	public static void main(String[] args) {

		String cadena;
		String resultado="";
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una cadena numero/letra");
		cadena = sc.nextLine();

		for (int i = 0; i < cadena.length(); i++) {
			if (Character.isDigit(cadena.charAt(i))) {
				for (int j = 0; j < Integer.parseInt(String.valueOf(cadena.charAt(i))); j++) {
					resultado += cadena.charAt(i+1);
				}
				// recoger el entero y añadirlo a la respuesta
			}
		}
		System.out.println(resultado);
	}
}
