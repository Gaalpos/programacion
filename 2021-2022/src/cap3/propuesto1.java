package cap3;

import java.util.Scanner;

public class propuesto1 {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		Scanner sc = new Scanner(System.in);

		// TRES NUMEROS DISTINTOs
		System.out.println("Introduce numero A");
		a = sc.nextInt();
		System.out.println("Introduce numero B");
		b = sc.nextInt();
		System.out.println("Introduce numero C");
		c = sc.nextInt();

		if (a < b) {
			if (a < c) {
				if (b < c) {
					System.out.println(a + " < " + b + " < " + c);
				} else {
					System.out.println(a + " < " + c + " < " + b);
				}

			} else {
				System.out.println(c + "<" + a + "<" + b);
			}

		} else {
			if (a < c) {
				System.out.println(b + "<" + a + "<" + c);
			} else {
				if (b < c) {
					System.out.println(b + "<" + c + "<" + a);
				} else {
					System.out.println(c + "<" + b + "<" + a);
				}
			}
		}
		sc.close();
	}

}