package resueltos;

import java.util.Scanner;

public class mainIsrael {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner sc = new Scanner(System.in);
			double patatas;// En kilos
			double chocos;// En kilos

			System.out.println("cuantos kilos de patatas hay? ");
			patatas = sc.nextDouble();
			System.out.println("cuantos kilos de chocos hay? ");
			chocos = sc.nextDouble();

			israel almacen= new israel(patatas, chocos);
			System.out.println(almacen.toString());
					
			System.out.println("El numero de comensales es: " + almacen.numeroClientes());
			System.out.println(almacen.toString());
		
	}

}
