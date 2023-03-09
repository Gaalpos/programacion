package resueltos;

import java.util.Scanner;

public class resuelto5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduzca el numero de inicio: ");
			int uno=sc.nextInt();
		System.out.println("Introduzca el numero final: ");
			int dos=sc.nextInt();
			int suma=0;
			int cuenta=0;
		do {
		
			//System.out.println(uno);
			suma+=uno;
			cuenta++;
			uno++;
			
			//System.out.println("la suma es: " +suma);
			
		}while(uno<=dos);
		System.out.println("la suma es: " +suma);
		System.out.println("la cuenta es: " +cuenta);
		System.out.println("Promedio: "+ (double)suma/cuenta);
	}


	}

