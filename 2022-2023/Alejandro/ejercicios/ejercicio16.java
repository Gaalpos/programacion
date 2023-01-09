package ejercicios;

import java.util.Scanner;

/*Pide un número (que debe estar entre 0 y 10) y mostrar la
tabla de multiplicar de dicho número.*/

public class ejercicio16 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int numero=0;
		System.out.println("Dame un numero del 1 al 10 ");
		numero=sc.nextInt();
		if(numero>10 || numero<=0) {
			System.out.println("El numero introducido no es válido");
		}
		else {
			
			for(int i=1;i<=10;i++) {
				System.out.println(numero*i);
			}
			
			
		}
	}

}
