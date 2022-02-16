package boletinArrays;

import java.util.Arrays;

public class ejercicioC2 {

	public static void main(String[] args) {
		
		int [] array = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(array));
		
		int par = 0, impar = 0;
		
		for ( int i = 0; i< array.length; i++) {
			if ( array[i] % 2 == 0) par++;
			else impar++;
		}
		
		System.out.println(par);
		System.out.println(impar);
		
		int [] nuevo = new int[array.length];
		
		int j = 0, k = 0;
		
		for ( int i = 0; i< array.length; i++) {
			if ( array[i] % 2 == 0) {
				nuevo[j] = array[i];
				j++;
			}
			else {
				nuevo[par + k] = array[i];
				k++;
			}
		}
		
		System.out.println(Arrays.toString(nuevo));

	}

}