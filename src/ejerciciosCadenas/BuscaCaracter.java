package ejerciciosCadenas;

import java.util.Scanner;

public class BuscaCaracter {

	public static void main(String[] args) {

		String[] semana = {"lunes","martes","miércoles","jueves","viernes", "sábado","domingo"};
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un caracter a buscar");
		String cad = sc.nextLine();
		
		for (String dia : semana) {
			System.out.println(dia);
			System.out.println("Posición " + dia.indexOf(cad.charAt(0)));
			
		}
		
		sc.close();
		
	}
	
}