package resueltos;

import java.util.Scanner;

public class resuelto1 {
	
			public static double celsiusToFarenheit(double temp)
			{
			return (1.8)*temp + 32;
			}
			public static double farenheitToCelsius(double temp)
			{
			return (temp - 32)/1.8;}
			public static void main(String[]args) {
				boolean sigue = true;
				Scanner sc = new Scanner(System.in);
				while (sigue) {
				System.out.println("Hola sea bienvenido al programa de conversion de temperaturas de CEBEM,"
						+ "le rogamos que haga caso a las instrucciones que aparecerán por panatlla. ");
				System.out.println("Selecciona una opción: ");
				System.out.println("1 para pasar de celsius a farenheit ");
				System.out.println("2 para pasar de farenheit a celsius ");
				System.out.println("3 para salir ");
			int uno=1;
			int dos=2;
			int tres=3;
			double aux;
			
			int opcion= sc.nextInt();
			
	
			switch(opcion){
			
			
			case 1: 
				System.out.println("Introduzca grados celsius: ");
				aux=sc.nextDouble();
				System.out.println("En farenheit da: "+celsiusToFarenheit(aux));
				break;
				
				
				case 2:
				System.out.println("Introduzca grados fahrenheit: ");
				aux=sc.nextDouble();
				System.out.println("En celsius da: "+farenheitToCelsius(aux));
				break;
				
				
				
				case 3: 
					System.out.println("Entendido, cerrando progarma...... ");
					sigue=false;
				    break;

			default: System.out.println("Introduzca un numero valido, de lo contario no funcionará el programa");}
			
			
	}		
	}
			
}
