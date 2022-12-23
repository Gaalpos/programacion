package cap3;

import java.util.Scanner;

/*
 *8. Realiza una clase con un método decimalToRomano que transforme números en formato decimal a números en
formato romano.

 1 - I
 2 - II
 3 - IIi
 4 -IV
 5 - V
 6 - VI
 7 - VII
 8 - VIII
 9 -IX
 10 - X
 50 - L
 100 - C
 500 - D
 1000 - M
 */

public class propuesto8 {

	public static String decimalARomanos(int valor) {
		// algoritmo simple
		int n = valor;
		String res = "";
		while (n >= 1) { // inicio de while

			if (n >= 1000) {
				n = n - 1000;
				res = res + "M";

			} else if (n >= 900) {
				n = n - 900;
				res = res + "CM";
			} else if (n >= 500) {
				n = n - 500;
				res = res + "D";

			} else if (n >= 400) {
				n = n - 400;
				res = res + "CD";

			} else if (n >= 100) {
				n = n - 100;
				res = res + "C";

			} else if (n >= 90) {
				n = n - 90;
				res = res + "XC";
			}

			else if (n >= 50) {
				n = n - 50;
				res = res + "L";

			} else if (n >= 40) {
				n = n - 40;
				res = res + "XL";
			}

			else if (n >= 10) {
				n = n - 10;
				res = res + "X";

			} else if (n >= 9) {
				n = n - 9;
				res = res + "IX";

			} else if (n >= 5) {
				n = n - 5;
				res = res + "V";

			} else if (n >= 4) {
				n = n - 4;
				res = res + "IV";

			} else if (n >= 3) {
				n = n - 3;
				res = res + "III";
			} else if (n >= 2) {
				n = n - 2;
				res = res + "X";

			} else {
				n = n - 1;
				res = res + "I";

			}
		}
		return res;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un decimal de 4 cifras");
		int n = sc.nextInt();

		System.out.println(decimalARomanos(n));
	}

}
