package ejercicios;

import java.util.Scanner;

public class ejerciciometodos3 {
	
		public static double euroADolar(double e) {
			double moneda=0;
			moneda=e*0.96;
			return moneda;

		}

		public static double dolarAEuro(double d) {
		double moneda=0;
		moneda=d*1.05;
		return moneda;
		}
		
		public static void main(String[] args) {
			double aux;
			Scanner sc= new Scanner(System.in);
			System.out.println("introduce euros: ");
			aux=sc.nextDouble();
			System.out.println("En dolares son: "+euroADolar(aux));
			System.out.println("introduce dolares: ");
			aux=sc.nextDouble();
			System.out.println("En euros son: "+dolarAEuro(aux));
		}
		
		
	}