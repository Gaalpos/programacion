package ordenar;

//Un programa para ordenar valores usando el algoritmo de la burbuja.
public class floatBurbuja {
	
	public static void main(String[] args) {
		float[] notas = { 2f,5.5f,9f,10f, 4.9f,8f,8.5f,7f,6.6f,5f,9f,6f };
		
		//Bucle externo.
		//Se irá poniendo en cada posición tratada, empezando por la 0,
		//el valor más bajo que se encuentre.
		
		for (int i = 0; i < notas.length - 1; i++) {
			//Bucle interno.
			//Se busca entre el resto de posiciones cuál es el valor más bajo.
			for (int j = i + 1; j < notas.length; j++) {
				System.out.println("externo: "+1+ " interno "+ j);
				//SWAP
				if (notas[i] > notas[j]) {
					//Para intercambiar valores hay una variable auxiliar.
					float cambio = notas[i];
					notas[i] = notas[j];
					notas[j] = cambio;
				}
			}
		}
		//Lo mostramos por pantalla.
		System.out.print("El array ordenado es: [");
		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " ");

		}
		System.out.println("]");
	}
}