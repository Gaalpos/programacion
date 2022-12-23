package recuP2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



public class ejercicio3B {
	public static final String FINAL = "fin";
	
	public static String[] bubbleCadenas(String[] array) {

		// Bucle externo.

		for (int i = 0; i < array.length - 1; i++) {

			// Bucle interno.
			// Se busca entre el resto de posiciones cuál es el valor más bajo.
			for (int j = i + 1; j < array.length; j++) {
			//	System.out.println("externo: " + i + " interno: " + j);
				// SWAP
				if (array[i].compareTo(array[j])>0) {
					// Para intercambiar valores hay una variable auxiliar.
					String cambio = array[i];
					array[i] = array[j];
					array[j] = cambio;
				}
				/*
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				*/
			}
		}
		return array;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String fin = "fin";
		ArrayList<String> palabras = new ArrayList<>();
		String palabra;
		boolean fini=false;
		
		
		do {
			System.out.println("Escribe una palabra");
			palabra=sc.next();
			
			if (palabra.compareTo(FINAL)!=0) {
				palabras.add(palabra);
			}else {
				System.out.println("Has finalizado");
				fini=true;
			}
			
		}while(!fini);
		System.err.println(palabras);
		sc.close();
		
		
	
	//	bubbleCadenas(palabras);
		
	}

}
