package repaso;

import java.util.Scanner;

public class ejercicio10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		for (int c = 0; c < 15; c = c + 1) {
			System.out.println("introduzca un número");
			a = sc.nextInt();
			b = a + b;
		}
		System.out.println("La suam total es " + b);

	}

}
