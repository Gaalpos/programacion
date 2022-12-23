package codigos;

import java.util.Scanner;

public class propuesto3 {

	/*
	 * ESTA CORRECTO public int elevarCuadrado(int n) { int cuadrado; cuadrado = n *
	 * n; return cuadrado; }
	 */

	public static long elevarCuadrado(int n) {
		return n * n;
	}
	
	public static long elevarCubo(int n) {
		return n * n *n;
	}
	
	public static long elevarCuarta (int n) {
		return elevarCuadrado(n) * elevarCuadrado(n);
	}

	/*
	 * public static void main(String[] args) { // entrada int numero = 0, cuad = 0;
	 * Scanner esca = new Scanner(System.in);
	 * 
	 * // entrada System.out.print("Introduce un entero:"); numero = esca.nextInt();
	 * 
	 * // algoritmo cuad = elevarCuadrado(numero);
	 * 
	 * // salida System.out.print("El cuadrado de " + numero + " es: " + cuad); }
	 */

	public static void main(String[] args) {
		// entrada
		int numero = 0, cuad = 0;
		Scanner esca = new Scanner(System.in);

		// entrada
		System.out.print("Introduce un entero:");
		numero = esca.nextInt();


		// salida
		System.out.println("El cuadrado de " + numero + " es " + elevarCuadrado(numero) +
				" , el cubo es "+elevarCubo(numero) + " y la cuarta es "+ elevarCuarta(numero));
		
	}
}