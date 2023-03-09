package libArrays;

public class iguales {

	public static void main(String[] args) {

		int[] arrayA = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		int[] arrayB = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

		boolean igual = true;
		int j = 0;

		
		if (arrayA.length == arrayB.length) {
			do {
				if (arrayA[j] == arrayB[j]) {
					igual = true;
					System.out.println("Los arrays son iguales");
					j++;
				} else {
					igual = false;
					System.out.println("Los arrays NO son iguales");
				}
			} while (igual == true && j < arrayA.length);
			System.out.println("SON IGUALES");

		} else {
			System.out.println("NO TIENEN LAS MISMA LONGITUD");
		}

	}

}
