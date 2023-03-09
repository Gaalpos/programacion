package examenEv2A;

import java.util.Scanner;

/*
 * Ejercicio 4A Crea un programa en Java que solicite al
usuario dos cadenas de caracteres y que devuelva la primera
cadena, pero transformando en mayúsculas la parte que
coincide con la segunda cadena introducida. Por ejemplo, si
se introducen las cadenas “Este es mi amigo Juan” y
“amigo”, devolverá “Este es mi AMIGO Juan”.
 */
public class ejercicio4A {

	public static void main(String[] args) {
		
		String palabra;
		String cadena;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduce una frase: ");
		cadena=sc.nextLine();
		System.out.println("Introduce la segunda frase: ");
		palabra=sc.nextLine();
		
		String [] tokens=cadena.split(" ");
		
		for(int i=0;i< tokens.length;i++) {
			if(tokens[i].equals(palabra))
				tokens[i]=tokens[i].toUpperCase();
		}
		for(String fran:tokens) {
			System.out.print(fran+" ");
		}
	}
}
