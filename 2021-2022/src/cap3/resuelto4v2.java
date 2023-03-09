package cap3;

import java.util.Scanner;

public class resuelto4v2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n=0;
		int aux=0;
		int aux2=0;
		int suma=0;
		int contador=0;
		
		
		
		System.out.println ("introduce un numero para saber si es Armstrong");
		n=sc.nextInt();
		
		//CONTAR los digitos del numero
				while (n > 0) {
					n = n / 10;
					contador++;
				}

		//HACE la comprobacion --> calculaPotencia
				while (aux > 0) {
					suma += (int) Math.pow( (aux % 10) , contador);
					aux = aux / 10;
				}
				
			
	}

}
