package listas;

import java.util.ArrayList;
import java.util.Scanner;

public class ejemplo1 {
	
	public static void main(String[] args) {
		ArrayList<String> colores = new ArrayList<String>(); 
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Numero de elementos "+colores.size());
		colores.add("rojo");
		colores.add("verde");
		colores.add("azul");
		System.out.println("Numero de elementos "+colores.size());
		colores.add("blanco");
		System.out.println("Numero de elementos "+colores.size());
		
		System.out.println("El elemento en las posicion 0 es "+colores.get(0));
		System.out.println("El elemento en las posicion 3 es "+colores.get(3));
		System.out.println("¿Hay azul o no?" + colores.contains("azul"));
		
		
		String dato=colores.get(0);
		
		System.out.println(dato);
		System.out.println("introduce un color");
		dato=sc.nextLine();
		System.out.println(dato);
		colores.set(0, dato);
		
		System.out.println("El elemento de la posicion 0 es "+colores.get(0));
		
		sc.close();
	}

}
