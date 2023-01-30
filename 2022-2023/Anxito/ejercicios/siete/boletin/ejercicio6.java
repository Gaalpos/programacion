package boletin;


// Leer los datos correspondientes a dos tablas de 12
// elementos numéricos, y mezclarlos en una tercera de la
// forma: 3 de la tabla A, 3 de la B, otros 3 de A, otros 3 de
// la B, etc
 
public class ejercicio6 {

	public static void main(String[] args) {

		int[] arrayA = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		int[] arrayB = { 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
		int[] arrayC = new int[24];

		for (int i = 0, j = 0; i < arrayC.length; i = i + 6, j = j + 3) {
			arrayC[i] = arrayA[j];
			arrayC[i + 1] = arrayA[j + 1];
			arrayC[i + 2] = arrayA[j + 2];
			arrayC[i + 3] = arrayB[j];
			arrayC[i + 4] = arrayB[j + 1];
			arrayC[i + 5] = arrayB[j + 2];
		}
		for(int k=0; k<arrayC.length;k++) {
			System.out.println(arrayC[k]);
		}
		
	}
}