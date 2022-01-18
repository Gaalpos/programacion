package arrays;

import java.util.Arrays;

public class reto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cont = 0;
		int i = 0;
		int[] pares = new int[100];

		while (i < 100) {
			if (cont % 2 == 0) {
				pares[i] = cont;
				i++;
			}

			cont++;
		}

		System.out.println(Arrays.toString(pares));
	}

}
