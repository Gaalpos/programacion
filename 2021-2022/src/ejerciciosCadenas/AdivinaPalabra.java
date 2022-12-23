	package ejerciciosCadenas;

import java.util.Scanner;

//Juego de adivinar una palabra, dando pistas de su orden alfabético.
public class AdivinaPalabra {
//La palabra para adivinar es "java".
	public static final String PALABRA_SECRETA = "java";

	public static String generaPalabra() {
		return "Algo";

	}

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.println("Empezamos el juego.");
		System.out.println("Adivina el valor de la palabra del diccionario.");
		boolean hasAcertado = false;
		int contador = 0;
		while (!hasAcertado && contador < 3) {
			System.out.print("¿Qué palabra crees que es?");
			String palabraUsuario = lector.next();
			lector.nextLine();
			int posicion = palabraUsuario.compareTo(PALABRA_SECRETA);
			if (posicion < 0) {
				//La palabra del usuario es anterior a la secreta.
				System.out.println("Has fallado! La palabra va después ...");
				contador++;
				System.out.println("Te quedan " + (3 - contador) + " intentos");
			} else if (posicion > 0) {
				//La palabra del usuario es posterior a la secreta
				System.out.println("Has fallado! La palabra va antes ...");
				contador++;
				System.out.println("Te quedan " + (3 - contador) + " intentos");
			} else {
				//Si vale 0, es que se ha acertado.
				hasAcertado = true;
			}
		}

		if (hasAcertado)
			System.out.println("Enhorabuena. Has acertado en " + (contador + 1) + " intentos!");
		else
			System.out.println("Se te acabaron los intentos, pedazo de burro");

		lector.close();
	}
}
