package cap3;

import java.util.Scanner;

public class ejemplo1 {

	
	 //HACER METODO PARA PEDIR NOTAS 
	/* public static  int pideNotas(int a, int b) {
	 * 
		 
	 }
	 */
	 

	public static void main(String[] args) {

		int matematicas = 0, lengua = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce las notas");
		System.out.print("Matemáticas: ");
		matematicas = sc.nextInt();
		System.out.print("Lengua: ");
		lengua = sc.nextInt();

		if (matematicas >= 5) {
			if (lengua >= 5) {
				System.out.println("Has aprobado lengua");
				System.out.println("Has aprobado mates");
			} else {
				System.out.println("No has aprobado lengua");
				System.out.println("Has aprobado mates");
			}
		} else {
			if (lengua >= 5) {
				System.out.println("Has aprobado lengua");
				System.out.println("No has aprobado mates");
			} else {
				System.out.println("No has aprobado lengua");
				System.out.println("No has aprobado mates");
			}
		}
	}
}
