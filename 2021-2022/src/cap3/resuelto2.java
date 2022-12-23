package cap3;

import java.util.Scanner;

public class resuelto2 {

	public static void main(String[] args) {
		Scanner es=new Scanner(System.in);
		int i, j, k;
		int filas=0;
		
		System.out.println( "Cuantas filas?");
		filas=es.nextInt();
		

		for (i = 1; i <= filas; i++) { // bucle que cuenta hasta 10
			for (k = 1; k <= filas - i; k++) {
				System.out.print(" ");
			}
			for (j = 1; j <= 2 * (i - 1) + 1; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
