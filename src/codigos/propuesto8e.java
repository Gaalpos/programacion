package codigos;

public class propuesto8e {

	public static char getLetras() {

		char letraGen;

		do {
			letraGen = (char) (Math.random() * 58 + 'A');
			System.out.println(letraGen);

		} while (letraGen < 97 && letraGen > 90);

		return letraGen;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char letra;

		letra = getLetras();
		System.out.println("letra generada:" + letra);

		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'A' || letra == 'E'
				|| letra == 'I' || letra == 'O' || letra == 'U') {
			System.out.println("generada vocal");

		} else {
			System.out.println("generada consonante");

		}
	}

}