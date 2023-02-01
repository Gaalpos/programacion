package boletinArrays;

/*
 * Leer los datos correspondientes a dos tablas de 12
elementos num�ricos, y mezclarlos en una tercera de la
forma: 3 de la tabla A, 3 de la B, otros 3 de A, otros 3 de
la B, etc
 */
public class ejercicio6 {

	public static void main(String[] args) {

		int[] arrayA = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		int[] arrayB = { 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62 };
		int[] junto = new int[24];

		for (int i = 0, j = 0; i < junto.length; i = i + 6, j = j + 3) {
			junto[i] = arrayA[j];
			junto[i + 1] = arrayA[j + 1];
			junto[i + 2] = arrayA[j + 2];
			junto[i + 3] = arrayB[j];
			junto[i + 4] = arrayB[j + 1];
			junto[i + 5] = arrayB[j + 2];
		}
		for(int k=0; k<junto.length;k++) {
			System.out.println(junto[k]);
		}
		/*
		 * junta A B 0 0 i de 0 a 5 j 0 a 2 1 1 2 2 3 0 4 1 5 2
		 * 
		 * 
		 * junta A B 6 3 i de 0 a 6 j 3 a 5 7 5 8 5 9 3 10 4 11 5
		 * 
		 * 
		 * junta A B 6 3 i de 12 a 17 j 6 A 8 7 5 8 5 9 3 10 4 11 5
		 * 
		 */
	}
}
