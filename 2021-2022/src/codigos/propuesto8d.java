package codigos;

public class propuesto8d {

	public static char getLetras() {

		char letraGen = (char) (Math.random() * 26 + 'a');
		if (Math.round(Math.random()) == 1) {
			letraGen = Character.toUpperCase(letraGen);
		}
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