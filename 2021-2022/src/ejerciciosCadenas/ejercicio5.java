package ejerciciosCadenas;

import java.util.Scanner;

/*
 * Rutina que devuelve invertida la cadena indicada como parámetro
 */
public class ejercicio5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce una cadena");
		String cad=sc.nextLine();
		String invertida;
		
		//recorremos la cadena desde el final
		
		for(int i=cad.length()-1;i>=0; i--) {
			System.out.println(i);
			invertida+=cad.charAt(i);
			System.out.println(invertida);
		}
		System.out.println("la cadena invertida es \n" +invertida);
	}

}
