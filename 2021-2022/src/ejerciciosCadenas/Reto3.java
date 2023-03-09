package ejerciciosCadenas;

import java.util.Scanner;

public class Reto3 {
	public static void main(String[] args) {

		String[] semana = {"lunes","martes","miércoles","jueves","viernes", "sábado","domingo"};
		int contar = 0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un caracter a buscar");
		String cad = sc.nextLine();
		
		for (String dia : args) {

			if (dia.indexOf(cad.charAt(0))!= -1) {
				contar++;
			}
			
		}
		
		System.out.println("Cadenas que contienen el caracter " + cad.charAt(0) + " son " + contar);
		
		sc.close();
		
	}
}