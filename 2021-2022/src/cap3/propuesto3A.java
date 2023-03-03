package cap3;

import java.util.Scanner;

/*3. (Ejercicio de dificultad alta) Realiza un programa
 *  utilizando bucles que muestre la siguiente figura
 *   por pantalla:
		   *
		  ***
		 *****
		*******
		 *****	
		  ***
		   *	
*/
public class propuesto3A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner esc=new Scanner(System.in);
		int i, j, k;
		int filas;
		System.out.println("por favor cuantas filas: ");
		filas=esc.nextInt();
		
		// bucle que cuenta hasta filas PARTE DE ARRIBA
		for (i = 1; i <= filas-1; i++) {
			for (k = 1; k <= filas - i; k++) {
				System.out.print(" ");
			}
			for (j = 1; j <= 2 * (i - 1) + 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		for (i = 1; i <= filas; i++) {
			for (k = 0; k <= i - 2; k++) {
				System.out.print(" ");
			}
			for (j = 1; j <= (filas - i) * 2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		esc.close();
	
	}

}
