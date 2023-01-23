package ejercicios;

import java.util.Scanner;

/*Pedir números hasta que se introduzca uno negativo, y
calcular la media.*/

public class ejercicio7 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double numero=0;
		double aux=0;
		int cont=0;
		System.out.println("Dame un numero positivo para calcular la media( al introducir uno negativo te da el resultadoa): ");
		 numero= sc.nextDouble();
		 while(numero>=0){
			 aux+=numero;
			 System.out.println("Dame un numero positivo para calcular la media( al introducir uno negativo te da el resultadoa): ");
			 numero= sc.nextDouble();
			 cont++;
		 }
		
		System.out.println("La media es: "+aux/cont);

	}

}
