package ejercicios;

import java.util.Scanner;

public class resuelto4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner (System.in);
		int edad;
		int nivel_de_estudios;
		int ingresos;
		boolean jasp;	

		System.out.print("introduce edad:");
		edad = sc.nextInt();

		System.out.print("introduce nivel:");
		nivel_de_estudios = sc.nextInt();

		System.out.print("introduce ingresos:");
		ingresos = sc.nextInt();


		jasp= (edad<=28) && (nivel_de_estudios>3) && (ingresos>28000);		

		System.out.println("Eresjasp?   "+jasp);
		sc.close();
	}
	

}
