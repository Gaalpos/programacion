package libArrays;

import java.util.Arrays;

public class rellenaArrayMD {

	public static void main(String[] args) {
		
		int [][] array = new int [3][4]; //3 filas 4 columnas
		//System.out.println(Arrays.deepToString(array));
		
		
		for (int j=0; j<3; j++) {
			System.out.println(Arrays.toString(array[j]));
		}
		
		for (int k=0; k<3;k++) {
			Arrays.fill(array[k],8);
			System.out.println(Arrays.toString(array[k]));
		}
		
		//bucle for each para recorrer todas las filas de nuestro array
		//fill each row with 10
		for (int[]row :array) {
			System.out.println(Arrays.deepToString(array));
			Arrays.fill(row,10);
		}

		System.out.println(Arrays.deepToString(array));
		
	}
	
}
