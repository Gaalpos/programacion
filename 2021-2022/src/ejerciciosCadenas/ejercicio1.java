package ejerciciosCadenas;

import java.util.Scanner;

/*
 * Rutina que indica si un carácter determinado está incluido o no dentro de un String dado como
parámetro.
 */
public class ejercicio1 {
	


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String cad;
		boolean encontrado = false;

		System.out.println("Introduce una cadena");
		cad = sc.nextLine();
		//char buscar;
		CharSequence buscar;
		System.out.println("Introduce lo que quieres buscar");
		buscar = sc.nextLine();
		int fran = 0;

		/*do {
			if (cad.charAt(fran) == buscar)
				encontrado = true;
			fran++;
		} while (fran < cad.length() && !encontrado);
		*/
		if(cad.contains(buscar))
			System.out.println("El valor '"+buscar+"' ha aparecido");
		else
			System.out.println("El valor '"+buscar+ "' no está");
	}
	
	

}
