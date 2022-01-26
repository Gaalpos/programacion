package ordenar;

public class burbujaFloat {

	public static void mostrar(float[] original) {
		System.out.print("[ ");
		for (int i = 0; i < original.length; i++)
			System.out.print(original[i] + " ");
		System.out.println("]");
	}

	public static float[] bubbleF(float[] array) {

		// Bucle externo.

		for (int i = 0; i < array.length - 1; i++) {

			// Bucle interno.
			// Se busca entre el resto de posiciones cuál es el valor más bajo.
			for (int j = i + 1; j < array.length; j++) {
			//	System.out.println("externo: " + i + " interno: " + j);
				// SWAP
				if (array[i] > array[j]) {
					// Para intercambiar valores hay una variable auxiliar.
					float cambio = array[i];
					array[i] = array[j];
					array[j] = cambio;
				}
				/*
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				*/
			}
		}
		return array;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float[] notas = { 5.5f, 9f, 10f, 4.9f, 8f, 2f, 8.5f, 7f, 6.6f, 5f, 9f, 7f };

		System.out.println("antes de empezar");
		mostrar(notas);
		
		bubbleF(notas);
		
		System.out.println("después de ordenar");
		mostrar(notas);

	}

}