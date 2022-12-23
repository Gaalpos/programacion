package libArrays;

import java.util.Arrays;

public class busqueda {
	public static void main(String[] args) {
		int array[] = { 4, 6, 1, 8, 2, 9, 7, 4, 2 };
		
		Arrays.sort(array);
		
		int index =Arrays.binarySearch(array, 9);
		System.out.println("Position of 9 in sorted "+
		" arrays is => \n "+index);
	}

}
