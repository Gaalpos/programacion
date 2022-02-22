package ejerciciosCadenas;

import java.util.Scanner;

/*
 * Rutina que devuelve una cadena con la representación binaria de un valor entero dado como
parámetro.
 */
public class ejercicio8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una cadena");
		String cad =sc.nextLine();
		int numero = Integer.parseInt(cad);
		String num_bin=Integer.toBinaryString(numero);
		System.out.println(num_bin);
		
		String num_hex=Integer.toHexString(numero);
		System.out.println(num_hex);
	}
}
