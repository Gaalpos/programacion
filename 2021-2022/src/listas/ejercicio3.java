package listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/*
 * realiza un  programa que genere palabras aleatorias
 * (entre 4 y 12 caracteres) en un arraylist y que luego
 *  calcule la primera y ultima alfabeticamente.
 *  
 *   El tamaño de la lista sera aleatorio entre 10 y 20, ambos inclusive
 *   
 *   mostrar ordenado alfabeticamente creciente y alfabeticamente decreciente
 * */
public class ejercicio3 {
	
	

	public static int generaSize() {
		Random r = new Random();
		return r.nextInt(10)+10;
	}
	
	public static String generaPalabra() {
		
	}
	
	public static void main(String[] args) {
		
	}
	
}
