package repaso;

import java.util.Scanner;

public class ejercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =0;
		
		do {
		System.out.println("Introduzca un número");
		a=sc.nextInt();
		System.out.println("El cuadrado de "+a+" es "+(a*a));
		
		}while(a>0);
	
	}

}
