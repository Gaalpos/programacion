package ejerciciosCadenas;

import java.util.Scanner;

public class ejercicio2Metodo {

	public static boolean noEsNumero(String cadena) {
		boolean noEsDigito = false;
		
		int fran = 0;

		do {

			// if (cad.charAt(fran) == buscar)
			if (!Character.isDigit(cadena.charAt(fran)))
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


		if(noEsNumero(cad))
			System.out.println("Hay algún NO digito");
		else
			System.out.println("Todos son digitos");
	}
}
