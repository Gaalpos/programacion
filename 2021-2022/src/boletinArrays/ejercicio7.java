package boletinArrays;

/*
 * Leer por teclado una serie de 10 números enteros. La
aplicación debe indicarnos si los números están ordenados
de forma creciente, decreciente, o si están desordenados.
 */
public class ejercicio7 {

	public static void main(String[] args) {

		//int[] array = { 1, 3, 0, -5, 2, 0, -4, -7, 11, -2 };
		//int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		//int [] array = {10,9,8,7,6,5,4,3,2,1};
		int [] array = {2,2,2,2,2};

		/*
		 * i i+1 0 1 1 2 3 4
		 * 
		 * 8 9 --- ojo
		 */
		int i = 0;
		boolean crece= true;
		boolean decrece=true;
		
		do {
			System.out.println(array[i] + " frente a " + array[i + 1]);
			
			if (array[i] > array[i + 1])
				crece =false;
			else if(array[i] < array[i + 1])
				decrece=false;
			i++;
		} while ((crece || decrece) && i < array.length - 1);
		
		if (crece) {
			if (decrece)
				System.out.println(" Todos iguales");
			else
				System.out.println(" Es creciente");
		}
	
		else {
			if (decrece)
			System.out.println(" Es decreciente");
			else
			System.out.println("Está desordenado");
		}
			
	}
}
