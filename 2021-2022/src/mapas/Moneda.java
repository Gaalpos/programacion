package mapas;

import java.util.Random;

public class Moneda {

	String anverso; // 1 cent , 2 cent, 5, cent, 10, cent, 20 cent, 50, 1euro 2 euro
	String reverso;

	Moneda() {
		anverso = generaAnverso();
		reverso = generaReverso();
		
		
		
	}

	public static String generaReverso() {
		String rev = "";
		Random r = new Random();

		if (r.nextBoolean() == true)
			rev = "cara";
		else
			rev = "cruz";
		return rev;
	}

	public static String generaAnverso() {
		String anv = "";

		Random r = new Random();
		int n = 1 + r.nextInt(8 - 0);
		switch (n) {

		case 1:
			anv = "1c";
			break;
		case 2:
			anv = "2c";
			break;
		case 3:
			anv = "5c";
			break;
		case 4:
			anv = "10c";
			break;
		case 5:
			anv = "20c";
			break;
		case 6:
			anv = "50c";
			break;
		case 7:
			anv = "1E";
			break;
		case 8:
			anv = "2E";
			break;

		}
		return anv;
	}

	@Override
	public String toString() {
		return "Moneda [anverso=" + anverso + ", reverso=" + reverso + "]";
	}


}
