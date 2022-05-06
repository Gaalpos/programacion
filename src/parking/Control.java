package parking;

import java.util.Scanner;

public class Control {
	
	public static void menu() {
		
		boolean sigue=true;
		char cPuerta, cOperacion;
		Puerta puertaOperando = null;
		
		Parking Aparcamiento = new Parking ((short)5);
		Puerta puerta1 = new Puerta(Aparcamiento,"Plaza Elíptica");
		Puerta puerta2 = new Puerta(Aparcamiento, "Calle venezuela");
		
		do {
			System.out.println("1 Plaza Elíptica:" );
			System.out.println("1 Calle Venezuela:" );
			cPuerta = IntroduceCaracter("Puerta de acceso (1, 2): ");
			
			switch (cPuerta) {
			
			
			case '1':
				puertaOperando = puerta1;
				break;
			case '2':
				puertaOperando = puerta2;
			default:
				System.out.println(" Puerta seleccionada no valida");
				break;
			}
			
			cOperacion = IntroduceCaracter ("Entrar/Salir/Fin vehiculo (e,s): ");
			
			switch(cOperacion) {
			
			case 'e':
				puertaOperando.entraVehiculo();
				break;
			case 's':
				puertaOperando.saleVehivulo();
				break;
			case 'f':
				System.out.println("fin dek programa");
				sigue=false;
				break;
			default:
				System.out.println("Puerta no válida");
				break;
			}
			
		}while(true);
	}
	
	static public char IntroduceCaracter(String mensaje) {
		Scanner sc = new Scanner (System.in);
		

		System.out.println(mensaje);
		String entrada = sc.nextLine().toLowerCase();
		return entrada.charAt(0);
	}
	

}
