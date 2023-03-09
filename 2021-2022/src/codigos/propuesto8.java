package codigos;

public class propuesto8 {

	public static char getLetras() {
		return (char) (Math.random() * 26 + 'a');
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char letra;

		letra = getLetras();
		System.out.println("letra generada:" + letra);

		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
			System.out.println("generada vocal");

		} else {
			System.out.println("generada consonante");

		}
	}

}
