package libArrays;

import java.util.Arrays;

public class igualesConMetodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]array1=new int [] {1,2,3,4};
		int[]array2=new int [] {1,2,3,4};
		int[]array3=new int [] {1,2,4,3};

		System.out.println("Son iguales el array1 y array2 ? "+ 
		Arrays.equals(array1, array2));
		System.out.println("Son iguales el array1 y array3 ? "+ 
		Arrays.equals(array1, array3));
		
	}

}
