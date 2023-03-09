package repaso;

import java.util.Scanner;

public class ejercicio4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=0;
		int cont=0;
		
		do {
			System.out.println("Introduzca un número");
			a=sc.nextInt();
			cont++;
			
		}while(a>0);
		System.out.println("Se han introducido "+cont+" números");
	}

}
