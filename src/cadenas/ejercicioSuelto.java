package cadenas;

import java.util.Scanner;

/*
 * Construir un programa que pida intrpducir una cadena  de caracteres por teclado
 * y visualice por pantalla el numero de caracteres a y A que coniene dicha cadena
 */
public class ejercicioSuelto {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String cad;
		int numMay = 0, numMin = 0;

		System.out.println("Introduce una cadena");
		cad = sc.nextLine();
		System.out.println(cad);

		for (int i = 0; i < cad.length(); i++) {
			if (cad.charAt(i) == 'a') {
				numMin++;
			} else if (cad.charAt(i) == 'A') {
				numMay++;
			}
		}
		System.out.println("numero  de A: " + numMay);
		System.out.println("numero de A: " + numMin);
	}
}
