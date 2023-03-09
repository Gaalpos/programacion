package anomalos;

import java.util.Arrays;
import java.util.Scanner;

/*5/ Compilar y ejecutar el código, que inicializa proceduralmente un array de modo que el valor
 *  en cada posición sea el doble del anterior, partiendo de una primera posición con valor 1.
 */

public class ProcedimientosInicializar {

	public static void main(String[] args) {
		
		// Habrá que almacenar 20 enteros.
		int[] arr = new int[20];
		
		// La primera posición la ponemos directamente.
		arr[0] = 1;
		
		// El resto se va llenando secuencialmente, a base de cálculos.
		for (int i = 1; i < arr.length; i++) {
			arr[i] = 2 * arr[i - 1];  //procedimiento
		}
		
		System.out.println(Arrays.toString(arr));
	}

}