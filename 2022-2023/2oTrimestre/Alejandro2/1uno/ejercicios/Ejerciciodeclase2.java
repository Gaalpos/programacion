package ejercicios;

import java.util.Scanner;

public class Ejerciciodeclase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		double peso;
		double altura;
		double IMS=0;
		System.out.println("Introduce el peso: ");	
		peso= sc.nextDouble();
		System.out.println("Introduce la altura: ");
		altura= sc.nextDouble();
		IMS= peso/(altura*altura);
		System.out.println("Tu Índice de Masa Corporal es : "+IMS);
		if((18<IMS)&&(IMS<25)) {System.out.println("Tu Índice de Masa Corporal es saludable");
			
		}
		else {
		System.out.println("Tu Índice de Masa Corporal no es saludable, para serlo debe estar entre 18 y 25");}
		
		

		}}

