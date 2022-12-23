package libArrays;

import java.util.Arrays;

public class rellenar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 4, 6, 1, 8, 2, 9, 7, 4, 2 };
		
		
		
		//lenar un rango
		Arrays.fill(array, 0,3,0);
		System.out.println("Array llenado con 0 "+
		"de 0 a 3 => \n"+Arrays.toString(array));
		
		//lenar completamente
		Arrays.fill(array, 10);
		System.out.println("Array llenado completamente"+
		"con 10 => \n"+Arrays.toString(array));
	}

}
