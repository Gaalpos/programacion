package listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/*
 * realiza un  programa que introduzca valores aleatorios
 * (entre 0 y 100) en un arraylist y que luego calcule la suma,
 * la media, el máximo y el mínimo de esos números. El tamaño de la lista
 * será aleatorio y podrá oscilar entre 10 y 20 alementos abmos inclusive
 */
public class ejercicio2 {
	
	public static Integer generaNumero() {
		Random r = new Random();
		return Integer.valueOf(r.nextInt(100));
	}

	public static int generaSize() {
		Random r = new Random();
		return r.nextInt(10)+10;
	}
	
	public static void main(String[] args) {
		
		int max=0;
		int min=100;
		int suma=0;
		int minimoC=0;
		int maximoC=0;
		
		ArrayList <Integer> lista = new ArrayList<>(); 
		for(int i =0;i<generaSize();i++) {
			lista.add(generaNumero());
		}
		
		System.out.println("tamaño de la lista"+lista.size);
		
		/*
		for(Integer r:lista) {
			System.out.println(r);
			suma+=r;
			if(r>max)
				max=r;
			if(r<min)
				min=r;
			suma+=r;
		}
		*/
		Collections.sort(lista);
		for(Integer r:lista) {
			System.out.println(r);
			suma+=r;
		}
		
		minimoC =Collections.min(lista);
		maximoC =Collections.max(lista);
		
		
		System.out.println("Max: "+max);
		System.out.println("Min: "+min);
		System.out.println("Media: "+(float)suma/lista.size());
		
		System.out.println("Maximo collections: "+maximoC);
		System.out.println("Minimo collections: "+minimoC);
		
	}
	
}
