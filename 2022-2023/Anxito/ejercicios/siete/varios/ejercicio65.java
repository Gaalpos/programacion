package varios;

import java.util.Arrays;

public class ejercicio65 {

	//metodo que recorre un array de enteros
	//y devuelve la cadena consecutiva del array
	
	public static int[] completarArray(int[] arr) {
		
		for(int k=0; k<arr.length; k++ ) {
			
		}
		return arr;
	}
	
public static int[] rellenarArray(int[] arr, int valor) {
		
		for(int k=0; k<arr.length; k++ ) arr[k]=valor; {
			
		}
		return arr;
	}
	
	
	
	public static void main(String[] args) {
		
		int[] altos= {111,222,333,444,555,666,777,888,999};
		System.out.println(Arrays.toString(altos));
		
		completarArray(altos);
		System.out.println(Arrays.toString(altos));
		
		rellenarArray(altos,345);
		System.out.println(Arrays.toString(altos));
		
	}
	
}