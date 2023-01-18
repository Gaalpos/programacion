package ejercicios;

import java.util.Scanner;

public class ejerciciodeclase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int semanas;
		int a=0;
		int dias;
		System.out.println("Introduce las horas: ");	
		a= sc.nextInt();
		semanas= a/168;
		a%=168;
		dias=a/24;
		a%=24;
		
		
		System.out.println("han pasado "+semanas+ " semanas, "+dias+" dias y "+a+" horas");
		
		
	}

}
