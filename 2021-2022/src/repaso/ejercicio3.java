package repaso;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=0;

		do{
			System.out.println("Introduzca un numero");
			a=sc.nextInt();
			if(a%2==0) {
				System.out.println("Es par");
			}else {
				System.out.println("Es impar");
			}
			
		}while (a!=0);
		sc.close();
	}

}
