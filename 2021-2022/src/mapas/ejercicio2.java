package mapas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* Realiza un programa que introduzca valores aleatorios (entre o y 100) en un Arraylist 
 * y que luego calcule la suma, la media, el  maximo y el minimo de esos numeros
 * El tamaño de la lista sera aleatorio y podra oscilar entre 10 y 20 elementos ambos inclusive
 * 
 * */
public class ejercicio2 {

	//cominezo clase ineterna operacione
	static class operaciones {

		static List<Integer> lista = new ArrayList<Integer>();

		public static int generaTamano() {
			Random r = new Random();
			int t = 10 + r.nextInt(21 - 10);
			return t;
		}

		public static int generaAleatorio() {
			Random r = new Random();
			int t = 0 + r.nextInt(101 - 0);
			return t;
		}

		public static void rellenaLista() {
			// generatamaño
			int t = generaTamano();
			for (int i = 0; i < t; i++) {
				lista.add(generaAleatorio());
			}
		}

		public static int suma() {
			int s = 0;
			for (Integer i : lista) {
				s += i;
			}
			return s;
		}

		public static float media() {
			return suma() / lista.size();
		}

		public static int maximo() {
			int max = 0;
			for (Integer i : lista) {
				if (i > max)
					max = i;
			}
			return max;
		}

		public static int minimo() {
			int min = 100;
			for (Integer i : lista) {
				if (i < min)
					min = i;
			}
			return min;
		}

		public static void resultado() {

			rellenaLista();
			System.out.println("Ejecutando calculos");

			System.out.println(lista);
			System.out.println("tamaño " + lista.size());
			System.out.println("Suma: " + suma());
			System.out.println("Media: " + media());
			System.out.println("Maximo: " + maximo());
			System.out.println("Minimo: " + minimo());

			System.out.println("Fin del programa");
		}
		
		
		//ejercicio 3 incluido en operaciones
		
		//public static void ordena();
		
		

	}
}
