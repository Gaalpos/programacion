package recuP2;

import java.util.Scanner;

import libArrays.mostarObjetos;

public class ejercicio2B {

	private static int partir(int array[], int izquierda, int derecha) {
		int pivote = array[izquierda];

		while (true) {
			while (array[izquierda] < pivote) {
				izquierda++;
			}
			while (array[derecha] > pivote) {
				derecha--;
			}

			if (izquierda >= derecha) {
				return derecha;
			} else {
				int temporal = array[izquierda];
				array[izquierda] = array[derecha];
				array[derecha] = temporal;

				izquierda++;
				derecha--;
			}
		}
	}

	private static void quicksort(int arra[], int izquierda, int derecha) {

		if (izquierda < derecha) {

			int pivote = partir(arra, izquierda, derecha);

			quicksort(arra, izquierda, pivote);
			quicksort(arra, pivote + 1, derecha);
		}
	}

	public static void mostrar(int[] paso) {
		System.out.print("Array: [");
		for (int i = 0; i < paso.length; i++) {
			System.out.print(paso[i] + " ");
		}
		System.out.print("]");
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] uno = { 0, 0, 0, 0, 0, 0, 0 };
		int[] dos = { 0, 0, 0, 0, 0, 0, 0 };

		System.out.println("Serie 1");
		for (int i = 0; i < uno.length; i++) {
			System.out.println("Insertar índice: " + i);
			uno[i] = sc.nextInt();
		}
		System.out.println("Serie 2");
		for (int i = 0; i < dos.length; i++) {
			System.out.println("Insertar índice: " + i);
			dos[i] = sc.nextInt();
		}
		mostrar(uno);
		mostrar(dos);

		quicksort(uno, 0, uno.length - 1);
		quicksort(dos, 0, dos.length - 1);

		System.out.println("Arrays ordenados");
		mostrar(uno);
		mostrar(dos);

		int[] ambos = new int[14];
	

		
		for (int i = 0; i < uno.length; i++) {
			ambos[i]=uno[i];
			ambos[i+7]=dos[i];
		}
	
		System.out.println("Array con todo");
		mostrar(ambos);
		System.out.println("Array ordenado");
		quicksort(ambos, 0, ambos.length - 1);
		mostrar(ambos);
	
	}
	

}
