package libArrays;

import java.util.Arrays;
import java.util.List;

public class envolverComoLista {

	public static void main(String[] args) {
		
		
		Integer array[] = { 4, 6, 1, 8, 2, 9, 7, 4, 2 };
		System.out.println(Arrays.toString(array));
		
		//Creates a wrapper list over array
		List<Integer> lista = Arrays.asList(array);
		System.out.println(lista);
		lista.set(0, 123456);
		System.out.println(Arrays.toString(array));
	}
}