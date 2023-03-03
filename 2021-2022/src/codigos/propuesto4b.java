package codigos;

/*n 5. Realiza un programa que calcule la 
longitud de una circunferencia de radio 3 metros

área circunferencia = Pi*radio^2
*/
import java.util.Scanner;

public class propuesto4b {
	
	public static double longitud(double radio) {
		return 2+Math.PI*radio;
	}
	
	public static double area(double radius) {
		return Math.PI *radius*radius;
	}
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		double rad = 0d, longitud=0d, area=0d;
		
		//Entrada
		System.out.print("Introduzca un radio :");
		rad = sc.nextDouble();
	
		
		//salida
		System.out.println("La longitud de la circunferenica con radio " +rad+ " es " + longitud(rad) + " y el área es "+area(rad) );
				
	}

}