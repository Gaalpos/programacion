package codigos;

/*n 5. Realiza un programa que calcule la 
longitud de una circunferencia de radio 3 metros

área circunferencia = Pi*radio^2
*/
import java.util.Scanner;

public class propuesto4 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		double rad = 0d, longitud=0d, area=0d;
		
		//Entrada
		System.out.print("Introduzca un radio :");
		rad = sc.nextDouble();
		
		longitud =2+Math.PI*rad;
		area = Math.PI *rad*rad;
		
		//salida
		System.out.println("La longitud de la circunferenica con radio " +rad+ " es " + longitud + " y el área es "+area );
		

		
	}

}
