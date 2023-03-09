package anomalos;

import java.util.Arrays;

public class vacasNarayana2 {
    
public static void main(String[] args) {
    
// Habrá que almacenar 20 enteros.
int[] arr = new int[100];
		
// La primera posición la ponemos directamente.
arr[0] = 0;
arr[1] = 1;
arr[2] = 1;

// El resto se va llenando secuencialmente, a base de cálculos.
for (int i = 3; i < arr.length; i++) {
    arr[i] = arr[i-1] + arr[i-3];  //procedimiento
}

System.out.println(Arrays.toString(arr));
}

}