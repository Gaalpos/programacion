package codigos;

/*
 * 
 *(Ejercicio de dificultad alta) Realiza un programa que genere letras aleatoriamente y determine si son vocales o
consonantes.
 */

public class propuesto8b {

	/*
	 * public static char getLetras() { return (char) (Math.random() *58+65); }
	 */

	public static int getMayusculas() {
		return (int) (Math.random() * ((65 - 90 + 1) + 90));
	}

	public static int getMinusculas() {
		return (int) (Math.random() * ((97 - 122 + 1) + 122));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean b = Math.random() < 0.5;

		char letra;

		if (b)
			letra = (char) getMayusculas();
		else
			letra = (char) getMinusculas();

		System.out.println("letra generada:" + letra);

		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'A' || letra == 'E'
				|| letra == 'I' || letra == 'O' || letra == 'U') {
			System.out.println("generada vocal");

		} else {
			System.out.println("generada consonante");

		}

	}

}