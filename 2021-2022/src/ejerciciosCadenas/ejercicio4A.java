package ejerciciosCadenas;

import java.util.Scanner;

/*
 * Rutina que indica si todos los caracteres contenidos en un String dado como parámetro
corresponden a vocales (mayúsculas o minúsculas) o no.
 */
public class ejercicio4A {
	
	public static boolean esVocal(char v) {
	
		if (v== 'A' ||v== 'E' ||v== 'I' ||v== 'O' ||v== 'U' ||v== 'a' ||v== 'e' ||v== 'i' ||v== 'o' ||v== 'u' )
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String cad;
		

		System.out.println("Introduce una cadena");
		cad = sc.nextLine();
		
		boolean noVale=false;
		char[] ch = cad.toCharArray();
		
		//Comprobamos de uno en uno
		for (char c : ch) {
			if (!esVocal(c))
				noVale=true;
		}
		
		if(noVale)
			System.out.println("NO SON VOCALES");
		else
			System.out.println("SON VOCALES");
	}
}
