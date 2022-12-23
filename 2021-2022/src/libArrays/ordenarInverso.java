package libArrays;

import java.util.Arrays;
import java.util.Collections;

public class ordenarInverso {

	public static void main(String[] args) {
		Integer array[] = { 4, 6, 1, 8, 2, 9, 7, 4, 2 };
		
		Arrays.sort(array, Collections.reverseOrder());
		
		System.out.printf("modified array[] : %s", Arrays.toString(array));
	}
}
