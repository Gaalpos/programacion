package listas;

import java.util.ArrayList;
import java.util.Scanner;

public class ejemplo1B {
	public static void main(String[] args) {
		ArrayList<String> colores = new ArrayList<String>(); 
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Numero de elementos "+colores.size());
		colores.add("rojo");
		colores.add("verde");
		colores.add("azul");
		colores.add("morado");
		colores.add("blanco");
		System.out.println("Numero de elementos "+colores.size());
		
		
		
		for (String recorre : colores) {
			System.out.println(recorre);
		}
		
		
		//modificar en un recorrido con for
		int i=0;
		for(String r:colores) {
			String dato=colores.get(i);
			System.out.println(dato);
			System.out.println("introduce un color");
			dato=sc.nextLine();
			System.out.println(dato);
			colores.set(i, dato);
			i++;
		}
		for (String recorre : colores) {
			System.out.println(recorre);
		}
		
		/*
		System.out.println("El elemento en las posicion 0 es "+colores.get(0));
		System.out.println("El elemento en las posicion 3 es "+colores.get(3));
		System.out.println("¿Hay azul o no?" + colores.contains("azul"));
		*/
		/*
		String dato=colores.get(0);
		
		System.out.println(dato);
		System.out.println("introduce un color");
		dato=sc.nextLine();
		System.out.println(dato);
		colores.set(0, dato);
		
		System.out.println("El elemento de la posicion 0 es "+colores.get(0));
		*/
		sc.close();
	}

}
