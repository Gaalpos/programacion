package cadenas;

import java.util.Scanner;

public class BuscaCaracter {

	public static void main (String [] args) {
		Scanner lector = new Scanner (System.in);
		
		System.out.println ("Escribe una línea de texto cualquiera y pulsa retorno: ");
		String texto = lector.nextLine();
		
		System.out.println ("¿Qué carácter quieres buscar?");
		String charText = lector.next();
		lector.nextLine();
		char charBusca = charText.charAt(0);
		
		
		//metodos indexOf
		//metodos lastIndexOf
		
		
		int posInicial = texto.indexOf(charBusca);
		int posFinal = texto.lastIndexOf(charBusca);
		if (posInicial>-1) {
			System.out.println ("Las apariciones del carácter " + charBusca + " son:");
			System.out.println("Primera vez en: " + posInicial);
			System.out.println("Última vez en: " + posFinal);
		} else {
			System.out.println ("Este carácter no se encuentra en el texto.");
		}
		}
}
