package ejerciciosCadenas;

import java.util.Scanner;

		//Un programa que extrae todo el texto de una frase, excepto laprimera y la última palabra.
public class ExtraerPalabras {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.println("Escribe una frase de texto y pulsa retorno:");
		String texto = lector.nextLine();
			//Busca el primer y el último espacio en blanco.

		int inicioSubcadena = texto.indexOf(' ');
		int finSubcadena = texto.lastIndexOf(' ');
		System.out.println("El texto sin la primera y la última palabra es:");
		if (inicioSubcadena == finSubcadena) {

			System.out.println("(No hay nada que escribir ...)");
		} else {

			String textoFinal = texto.substring(inicioSubcadena + 1, finSubcadena);
			System.out.println(textoFinal);
		}
	}
}
