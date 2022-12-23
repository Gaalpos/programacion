package ejerciciosCadenas;

import java.util.Scanner;

/*
 * Reto 5: haga un programa que muestre por pantalla cada una de las
palabras individuales de una frase en líneas diferentes. Para ello,
antes deberá ir averiguando las posiciones donde hay espacios en
blanco para poder delimitar dónde empieza y termina cada palabra.

 */
public class reto5 {

	public static void main(String[] args) {
		
	
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Introduce una cadena a trocear");
		String texto=sc.nextLine();
		
		
		int aux=0;
		for(int i=0;i<texto.length();i++) {
			if(texto.charAt(i)==' ') {
				System.out.println(texto.substring(aux,i));	
				aux=i+1;
			}
			
		}
		System.out.println(texto.substring(aux, texto.length()));
	}
}
