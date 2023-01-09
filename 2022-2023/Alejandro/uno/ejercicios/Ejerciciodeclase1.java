package ejercicios;

import java.util.Scanner;

public class Ejerciciodeclase1 {
	final static double PI= 3.141592;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		double radio= 0;
		double superficie;
		double volumen;
		System.out.println("Introduce el radio: ");	
		radio= sc.nextDouble();
		superficie = 4*PI*radio*radio;
		volumen= (4*PI*radio*radio*radio)/3;
		System.out.println("la superficie es: "+superficie);
		System.out.println("el volumen es: "+volumen);
	}

}
