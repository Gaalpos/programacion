package AAAExamen3;

import java.util.Random;

/*
 * Ejercicio 2
Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un ArrayList y 
que luego calcule la suma, la media, el máximo y el mínimo de esos números. 
El tamaño de la lista también será aleatorio y podrá oscilar entre 10 y 20 elementos ambos inclusive.

 */
public class listasEjercicio02 {
	
	public static Integer generaNumeros() {
		Random r = new Random();
		 return Integer.valueOf(r.nextInt(100));
		
	}
	
	
	public static void main(String[] args) {
		
	}

}
