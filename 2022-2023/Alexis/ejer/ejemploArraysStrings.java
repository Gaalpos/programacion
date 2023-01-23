package ejer;

import java.util.Scanner;

public class ejemploArraysStrings {

	private static String[] lista;
	final static int POS=4;

	public static void muestra() {
		for(int i=0; i<POS; i++) System.out.print(lista[i] + " ");
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		lista = new String[POS];
		
		for(int j=0; j<POS; j++) {
			System.out.println("Dame un nombre: ");
			String ln =sc.nextLine();
			lista[j]=ln.toString();
		}
		System.out.println();
		muestra();
	}
	
}
