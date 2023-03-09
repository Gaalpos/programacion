package cap3;

import java.util.Scanner;

/*  El factorial de un entero positivo n o el factorial de n se define
 *  como el producto de todos los números enteros positivos desde el propio
 *  numero hasta 1. Por ejemplo:
 *  5! = 5*4*3*2*1 = 120
 *  3! = 3*2*1 = 6
 */

public class factorial {
	
	
	public static int factorialIterativo(int n) {
		int fac=1;
		for(int i=n;i>=1;i=i-1) {
			fac=fac*i;
			System.out.println("acumulado: "+fac);
		}
		return fac;
	}

	public static void main(String[] args) {
		int fac=1;
		int n=0;
		Scanner pide = new Scanner(System.in);
		System.out.println("introduce un entero (bajito): ");
		n=pide.nextInt();
	
		System.out.println("factorial de "+n+" es: "+factorialIterativo(n));
	
	}
}
