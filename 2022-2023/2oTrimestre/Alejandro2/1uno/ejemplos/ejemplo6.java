package ejemplos;

import java.util.Scanner;

public class ejemplo6 {

	/* programa para calcular la longitud de una circunferencia de radio r*/
	
	
	final static double PI= 3.141592;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		double radio= 0;
		double longitud;
		double area;
		System.out.println("Introduce el radio: ");	
		radio= sc.nextDouble();
		longitud = 2*PI*radio;
		area= PI*Math.pow(radio,2);
		System.out.println("la longitud es: "+longitud);
		System.out.println("el area es: "+area);
	}

}
