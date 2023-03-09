package cap3;

import java.util.Random;

public class propuesto7B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();

		int valor = 0;

		int par = 0;
		int impar = 0;

		for (int i = 0; i < 20; i++) {
			valor = 500 + rnd.nextInt(301);

			System.out.println("aleatorio es " + valor);
			if (valor % 2 == 0) {
				System.out.println("par");
				par++;
				System.out.println();
			}

			else {
				System.out.println("impar");
				impar++;
				System.out.println();
			}
		}

		System.out.println("Pares totales: " + par);
		System.out.println("Impares totales: " + impar);
	}

}
