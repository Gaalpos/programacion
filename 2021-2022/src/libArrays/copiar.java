package libArrays;

import java.util.Arrays;

public class copiar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 4, 6, 1, 8, 2, 9, 7, 4, 2 };
		
		int[]copy =Arrays.copyOf(array, array.length);
		System.out.println("Copied array => \n " +Arrays.toString(copy) );
		
		int[]rcopy =Arrays.copyOfRange(array, 1,5);
		System.out.println("Copied array => \n " +Arrays.toString(rcopy) );
	}

}
