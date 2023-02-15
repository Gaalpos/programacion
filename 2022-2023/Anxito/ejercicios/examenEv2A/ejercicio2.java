package examenEv2A;

/*
 * Ejercicio 2A Genera un array de 50 posiciones enteras que
tomarán valores entre - 100 y 100. Separe en dos matrices
los valores positivos (incluido el cero) y los negativos en
otra. Ordene ambos arrays por el método Quicksort.
 */
public class ejercicio2 {

	final static int SIZE = 50;
	static int[] array = new int[SIZE];

	static int[] positivos;
	static int[] negativos;

	static void generaNumeros() {
		int min = -100; // Set To Your Desired Min Value
		int max = 100;

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) ((Math.random() * ((max - min) + 1)) + min);
		}
	}

	public static int[] contarNumeros() {
		int countP = 0;
		int countN = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= 0)
				countP++;
			else
				countN++;
		}
		return new int[] { countP, countN };
	}

	public static void separaNumeros() {
		positivos = new int[contarNumeros()[0]];
		negativos = new int[contarNumeros()[1]];
		int p = 0;
		int n = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] >= 0) {
				positivos[p] = array[i];
				p++;
			} else {
				negativos[n] = array[i];
				n++;
			}
		}

	}

	public static void mostrarNumneros(int[] algo) {
		for (int i = 0; i < algo.length; i++) {
			System.out.print(algo[i] + " ");

		}
		System.out.println("\n----------");
	}

	public static void main(String[] args) {
		generaNumeros();
		mostrarNumneros(array);
		separaNumeros();

		System.out.println("Ordenado");

		System.out.println("Positivos");
		mostrarNumneros(positivos);
		System.out.println("Negativos");
		mostrarNumneros(negativos);

		}

}
