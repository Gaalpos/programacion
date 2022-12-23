package repaso;

import java.util.Scanner;

public class ejercicio12 {
	
	public static int factorial(int n) {
		int fac=1;
		for(int i=n;i>=1;i=i-1) {
			fac=fac*i;
			System.out.println("acumulado: "+fac);
		}
		return fac;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fac=1;
		int n=0;
		Scanner pide = new Scanner(System.in);
		System.out.println("introduce un entero (bajito): ");
		n=pide.nextInt();
	
		System.out.println("factorial de "+n+" es: "+factorial(n));
	}

}
