package ejercicios;

import java.util.Scanner;

public class grados {

	// ºF = (ºC · 1,8) + 32
	public static double caf(double grados) {
		return (grados * 1.8) + 32;
	}

	public static double fac(double grados) {
		return (grados - 32) * 5 / 9;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double grad = 0;

		System.out.print("Escriba un grado: ");
		grad = sc.nextFloat();

		System.out.println(grad+"grados Celsius son "+caf(grad)+ "grados fahrenheit");
		System.out.println(grad+"grados fahrenheit son "+fac(grad)+ "grados fahrenheit");
		
		sc.close();
	}
}
