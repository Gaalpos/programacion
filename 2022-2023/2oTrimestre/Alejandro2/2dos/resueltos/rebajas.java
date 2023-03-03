package resueltos;

import java.util.Scanner;

public class rebajas {
	//Métodos
		static double descubrePorcentaje(double original, double actual){
		return(original-actual)*100/original;
		}
		
		
		public static double descubreOriginal(double actual2,double porcentaje2) {
			
			return ((actual2*100)/(100-porcentaje2));
		}
		

		public static double descubreNuevo(double original3,double porcentaje3) {
		return(original3-((porcentaje3/100)*original3) );
		}



		//Funciones
		public static void main(String[] args) {
		
			boolean sigue = true;
			Scanner sc = new Scanner(System.in);
			while (sigue) {
			System.out.println("Programa para  calcular precios con descuentos ");
			System.out.println("Selecciona una opción: ");
			System.out.println("1 para descubrir el porcentaje ");
			System.out.println("2 para descubrir el precio original ");
			System.out.println("3 para descubrir el precio tras el descuento ");
			System.out.println("4 para salir ");
		int uno=1;
		int dos=2;
		int tres=3;
		int cuatro= 4;

		int opcion= sc.nextInt();
		switch(opcion){
			
			
			case 1: 
			System.out.println("Introduce el precio original: ");
			double original= sc.nextDouble();
			System.out.println("Introduce el precio nuevo: ");
			double actual= sc.nextDouble();
			double porcentaje=descubrePorcentaje(original,actual);
			System.out.println(" tu porcentajede descuento es de: "+porcentaje);
	
				break;
				
				
				case 2:
				System.out.println("Introduce el porcentaje: ");
				double porcentaje2= sc.nextDouble();
				System.out.println("Introduce el precio nuevo: ");
				double actual2= sc.nextDouble();
				double original2=descubreOriginal(actual2,porcentaje2);
				System.out.println(" tu precio original de la rebaja es de: "+original2);
				break;
				
				
				
				case 3: 
				System.out.println("Introduce el precio original: ");
				double original3= sc.nextDouble();
				System.out.println("Introduce el porcentaje de descuento: ");
				double porcentaje3= sc.nextDouble();
				double actual3=descubreNuevo(original3,porcentaje3);
				System.out.println(" tu precio tras el descuento es de: "+actual3);
					
				    break;



				case 4: 
					System.out.println("Entendido, cerrando progarma...... ");
					sigue=false;
				    break;
			default: System.out.println("Introduzca un numero valido, de lo contario no funcionará el programa");}


		
	
}}}
		
		
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		

