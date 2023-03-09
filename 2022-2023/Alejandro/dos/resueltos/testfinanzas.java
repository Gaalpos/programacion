package resueltos;

import java.util.Scanner;

public class testfinanzas {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double aux=0d;
		int opcion;
		System.out.println("pulsa 1 para cambio por defecto");
		System.out.println("pusla 2 para introducir tu cambio");
		opcion= sc.nextInt();
		
		//Probamos el constructor por defecto
		if(opcion==1) {
			finanzas enero= new finanzas();
			System.out.println(enero.toString());
			System.out.println("dame el numero de euros: ");
			aux=sc.nextDouble();
			System.out.println("En dolares son: "+enero.euroADolar(aux));
			System.out.println("dame el numero de dolares: ");
			aux=sc.nextDouble();
			System.out.println("En euros son: "+enero.dolarAEuro(aux));
			}
		
		//probamos el constructor pasando el cambio que queramos
		else {
			System.out.println("que cambio deseas?");
			aux=sc.nextDouble();
			
			finanzas octubre= new finanzas(aux);
			System.out.println(octubre.toString());
			System.out.println("dame el numero de euros: ");
			aux=sc.nextDouble();
			System.out.println("En dolares son: "+octubre.euroADolar(aux));
			System.out.println("dame el numero de dolares: ");
			aux=sc.nextDouble();
			System.out.println("En euros son: "+octubre.dolarAEuro(aux));
			}
		
		
		
	}
	
	
}

