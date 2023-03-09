package Examen2T;

import java.util.Scanner;

public class ejercicio3b {

	public static void main(String[] args) {
		
		boolean seguir=true;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Introduce palabras hasta escribir la palabra fin: ");
		
		while(sc.hasNext() && seguir==true) {
		String palabra=sc.next();
		
		System.out.println(palabra);
		if(palabra.equals("fin")) {
			seguir=false;
			sc.close();  
		}
		
		}
	}
}