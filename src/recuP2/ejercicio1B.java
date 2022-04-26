package recuP2;

import repasoExamen2ev.generaArray;

public class ejercicio1B {
	
	final static int SIZE = 50;
	static int[] array = new int[SIZE];
	
	static void generaNumeros() {
		int min = 300; // Set To Your Desired Min Value
		int max = 500;

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) ((Math.random() * ((max - min) + 1)) + min);
		}
	}

	public static void mostrarNumeros(int[] algo) {
		for (int i = 0; i < algo.length; i++) {
			System.out.print(algo[i] + " ");

		}
		System.out.println("\n----------");
	}
	
	public static void busca7(int[]algo) {
		int resto =0;
		System.out.println("Índices cuyo dígito termina en 7: ");
		for (int i=0;i<algo.length;i++) {
			resto = algo[i] % 10;
			if (resto == 7)
					System.out.print(i+" ");
		}
	}
	
	public static void main(String[] args) {
		generaNumeros();
		mostrarNumeros(array);
		busca7(array);
		/*
	 int i = array[0] ;
	 int a = i % 10;
	 
	 System.out.println(a);
		*/
	}
}
