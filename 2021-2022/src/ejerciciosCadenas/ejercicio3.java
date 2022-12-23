package ejerciciosCadenas;

import java.util.Scanner;

/*
 * Rutina que indica si todos los caracteres contenidos en un String
 * son letras o no
 */
public class ejercicio3 {

	public static boolean noSonLetras(String cadena) {
		boolean noEsDigito = false;
		
		int fran = 0;

		do {

			// if (cad.charAt(fran) == buscar)
			if (!Character.isLetter(cadena.charAt(fran)))
				noEsDigito = true;
			fran++;
		} while (fran < cadena.length() && !noEsDigito);

		return noEsDigito;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cad;
		

		System.out.println("Introduce una cadena");
		cad = sc.nextLine();


		if(noSonLetras(cad))
			System.out.println("NO SON LETRAS");
		else
			System.out.println("TODAS LETRAS");
	}
}
