package ejercicios;

import java.util.Scanner;

public class ejerciciometodos2 {

	public static double centAFahr(double c) {
		double temp=0;
		temp=(9*c/5)+32;
		return temp;

	}

	public static double fahrACent(double f) {
	double temp=0;
	temp=5*(f-32)/9;
	return temp;
	}
	
	public static void main(String[] args) {
		double aux;
		Scanner sc= new Scanner(System.in);
		System.out.println("introduce grados centígrados: ");
		aux=sc.nextDouble();
		System.out.println("En fahrenheit da: "+centAFahr(aux));
		System.out.println("introduce grados fahrenheit: ");
		aux=sc.nextDouble();
		System.out.println("En centigrados da: "+fahrACent(aux));
	}
	
	
}
