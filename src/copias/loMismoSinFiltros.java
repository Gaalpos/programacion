package copias;

import java.util.Scanner;

public class loMismoSinFiltros {

	public static final int INICIAL = 10;
	public static final int INCREMENTO = 5;

	public static void mostrar(float[] original) {
		System.out.print("[ ");
		for (int i = 0; i < original.length; i++)
			System.out.print(original[i] + " ");
		System.out.println("]");
	}

	public static void main(String[] args) {

		float[] notas = new float[INICIAL];
		// Hay un contador de posiciones utilizadas.
		int elementos = 0;
		Scanner lector = new Scanner(System.in);

		System.out.println("(Para terminar, escribe un -1)");

		boolean fin = false;
		while (!fin) {
			float nota = lector.nextFloat();
			
			if (elementos == notas.length) {
				// Paso 1 Hay que cambiar el tamaño del array.
				System.out.println("Capacidad superada. Añadimos " + INCREMENTO + " posiciones ...");
				// Paso 2 Copisr los del completo en el nuevo
				float[] arrayNuevo = new float[notas.length + INCREMENTO];
				for (int i = 0; i < notas.length; i++) {
						arrayNuevo[i] = notas[i];
					}
				// Paso 3 REASIGNACION DEL NOMBRE VIEJO AL ARRAY AMPLIADO
				notas = arrayNuevo;
			   }	
			else if(nota == -1) {
				fin = true;
				}
			else {
				notas[elementos] = nota;
				elementos++;
				}
		}//fin while
		System.out.println("En el array hay almacenados " + elementos + " elementos:");
		mostrar(notas);
	}

}