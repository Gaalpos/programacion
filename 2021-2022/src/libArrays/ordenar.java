package libArrays;

import java.util.Arrays;

public class ordenar {
	public static void main(String[] args) {

		int array[] = { 4, 6, 1, 8, 2, 9, 7, 4, 2 };
		int array1[] = { 4, 6, 1, 8, 2, 9, 7, 4, 2 };
		
		Arrays.sort(array);
		System.out.println(" Ordenado completo \n"+
		Arrays.toString(array));
		
		Arrays.sort(array1, 0, 6);
		System.out.println(" Ordenador los 0 a 6 \n"+
		Arrays.toString(array1));
		
	}
}
