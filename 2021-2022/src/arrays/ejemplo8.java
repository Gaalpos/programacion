package arrays;

public class ejemplo8 {
	public static void main(String[] args) {


		char[] letras = { 'a', 'z', 'g', 'd', 'w', 'o', 'h', 'y', 'x', 's' };

		boolean encontrado = false;

		int i = 0;

		while ((i < letras.length) && (!encontrado)) {
			if (letras[i] == 'w') {
				encontrado = true;
			}
			i = i + 1;
		}

		if (encontrado) {
			System.out.println("La letra 'w' está en la lista.");

		} else {
			System.out.println("La letra 'w' no está en la lista.");
		}
	}
}
