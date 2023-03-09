package cap3;

import java.util.Scanner;

public class tarjetasSw1 {

	// Utilice un switch para las tarjetas
	/*
	 * 1 : oro 2 : club 3 : nada
	 */
	// utilice if/else para joven/no joven
	
	
	
	public static boolean esJoven() {
		Scanner sc = new Scanner(System.in);
		String resp;
		boolean  joven=false;
		System.out.println("Tiene modalidad joven?");
		resp=sc.next();
		if (resp.equalsIgnoreCase("s")) {
			System.out.println("Descuento por oro y joven");

		} else {
			System.out.println("Descuento por oro");

		}
		sc.close();
		return joven;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int importe = 0;
		int opcion = 0;

		System.out.println("Introduzca el importe");
		importe = sc.nextInt();

		do {

			System.out.println("Opciones:");
			System.out.println("Pulse 1 si tiene tarjeta oro");
			System.out.println("Pulse 2 si tiene tarjeta club");
			System.out.println("Pulse 3 si no tiene tarjeta");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1: {
				System.out.println("descuento ORO");
				esJoven();
					
				
				break;
			}
			case 2: {
				System.out.println("descuento CLUB");
				esJoven();
				break;
			}
			case 3:{
				System.out.println("SIN DESCUENTOS");
				System.out.println("Pague lo debido: " + importe + " €");
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
