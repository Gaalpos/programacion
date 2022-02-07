package boletinArrays;

import java.lang.reflect.Array;

/*
 * Leer por teclado dos tablas de 10 números enteros y
mezclarlas en una tercera de la forma: el 1o de A, el 1o de
B, el 2o de A, el 2o de B, etc.
 */
public class ejercicio5 {

	public static void main(String[] args) {

		int[] arrayA = { 1, 3, 0, -5, 2 };
		int [] arrayB = {0, -4, -7, 11, -2};
		int []arrayC= {2, 5,8,-9,7};
		/*
		int doble=arrayB.length*3;
		int [] mezcla = new int [doble];
		*/
		int triple=arrayB.length*2;
		int [] mezcla = new int [triple];
		/*mezclar*/
		for (int i=0, j=0; i<arrayA.length; i++, j=j+2) {
			mezcla[j]=arrayA[i];
			mezcla[j+1]=arrayB[i];
			mezcla[j+2]=arrayC[i];
		}
		
		for(int k=0; k<mezcla.length;k++) {
			System.out.println(mezcla[k]);
		}
		
	}
}
