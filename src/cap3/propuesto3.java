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
public class propuesto3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner esc=new Scanner(System.in);
		int i, j, k;
		int filas;
		System.out.println("por favor cuantas filas: ");
		filas=esc.nextInt();
		
		// bucle que cuenta hasta filas PARTE DE ARRIBA
		for (i = 1; i <= filas; i++) { 
		//PARTE DE ARRIBA	
			//poniendo espacios
			for (k = 1; k <= filas - i; k++) {
				System.out.print(" ");
			}//fin k espacios
			
			//poniendo estrellas
			for (j = 1; j <=  2*(i-1)+1; j++) {
				System.out.print("*");
			}//fin j estrellas
			
			System.out.println("");
		} // fin i filas
		
		//PARTE DE ABAJO	
		for (i = 1; i <= filas; i++) { 
			
				//poniendo espacios
				for (k = 1; k <= filas - i; k++) {
					System.out.print(" ");
				}//fin k espacios
				
				//poniendo estrellas
				for (j = 1; j <=  2*(i-1)+1; j++) {
					System.out.print("*");
				}//fin j estrellas
				
				System.out.println("");
			} // fin i filas
	}

}
