package examenA;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		double m=0;
		double aux=m;
		int opcion=0;
		
		
		
		do {
			System.out.println("Escriba los metros");
			m=sc.nextDouble();
			aux=m;

			System.out.println("Opciones:");
			System.out.println("Pulse 1 para pasar de metros a yardas ");
			System.out.println("Pulse 2 para pasar de metros a pies");
			System.out.println("Pulse 3 para pasar de metros a pulgadas");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1: {
				aux=aux*1.093613298337708;
				System.out.println(m+" metros son "+aux+" yardas ");
				break;
			}
			case 2: {
				aux=aux*3.24254215304799;
				System.out.println(m+" metros son "+aux+" pies ");
				break;
			}
			case 3:{
				aux=aux*39.37007874015748;
				System.out.println(m+" metros son "+aux+" pulgadas");
				break;
			}

			default:
				System.out.println("Opcion no valida");
			}
			System.out.println("Pulse 1 para seguir o 2 para salir");
			opcion = sc.nextInt();


		} while (opcion <2) ;
		System.out.println("Fin");
		sc.close();
	}
	
	
}
