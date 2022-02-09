package boletinArrays;

/* dado un array de 6 posiciones encontrar cual es su valor
 * maximo y cual es su valor minimo
 * 
 */
public class ejercicioA {

	public static void main(String[] args) {
		
		int[] array = { 1, 3, 0, -5, 2, 0, -4, -7, 11, -2 };
		
		int max=array[0], min=array[0];
		
		
		for(int i= 0;i<array.length;i++) {
			if(array[i]>max)
				max=array[i];
			if(array[i]<min)
				min=array[i];
		}
		
		System.out.println("Máximo: "+max);
		System.out.println("Minimo: "+min);
	}
}
