package repaso;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=0;
		int b=0;
		int c=0;
		
		do {
			System.out.println("Introduzca un número");
			a=sc.nextInt();
			b=a+b;
			c++;
		}while(a>0);
		System.out.println("suma total: "+b);
		System.out.println("Media: "+b/c);
	}

}
