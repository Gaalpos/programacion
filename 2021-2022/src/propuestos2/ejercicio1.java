package propuestos2;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {

		Scanner escaner = new Scanner(System.in);

		int r = 0;

		System.out.print("Inserte la longitud de radio: ");
		r = escaner.nextInt();
		System.out.println("La esfera con un radio de " + r + " tiene un volumen de:");
		System.out.println((4 / 3) * Math.PI * (r * r * r));

		escaner.close();
	}

}
