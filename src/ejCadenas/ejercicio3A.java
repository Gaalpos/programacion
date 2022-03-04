package ejCadenas;

import java.util.Scanner;

/*
 * Pedimos dos cadenas, las troceamos y 
 * las intercalamos en una cadena de salida
 */

public class ejercicio3A {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("una cadena");
		String cad1 = sc.nextLine();
		System.out.println("otra cadena");
		String cad2 = sc.nextLine();

		String[] uno = cad1.split(" ");
		String[] dos = cad2.split(" ");
		String res = "";
		int i = 0;
		int j = 0;
		
		int max=0;
		if(uno.length>=dos.length)
			max=uno.length;
		else
			max=dos.length;

		do {
			if (i < uno.length) {
				res += uno[i] + " ";
			
			}
			if (i < dos.length) {
				res += dos[i] + " ";
			}
			i++;
		} while (i < max);

		System.out.println(res);
	}
}
