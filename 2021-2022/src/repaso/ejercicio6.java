package repaso;

import java.util.Scanner;

public class ejercicio6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		
		do {
			System.out.println("Introduzca un número");
			a=sc.nextInt();
			b=b+a;
			
		}while(a!=0);
		System.out.println("La suma total es "+b);

	}
}
