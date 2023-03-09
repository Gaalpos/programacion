package repaso;

import java.util.Scanner;

public class ejercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =0;
		
		do {
		System.out.println("Introduzca un número");
		a=sc.nextInt();
		if(a<0) {
			System.out.println("Es negativo");
			
		}else {
			System.out.println("Es positivo");
		}
		
		}while(a!=0);
	
	}
}
