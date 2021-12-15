
/* Método que introduzca la estatura en cm de una 
	 persona y la convierta a pies y pulgadas. */

import java.util.Scanner;

public class ejercicio1A {

	

	public static void centimetrosAPiesyPulgadas(double cm) {
		double ft = 0, in = 0;
		ft = (int)  (cm / 30.48);
		in = (int) ((cm % 30.48) / 2.54);
		System.out.println(cm + " centímetros son " + ft + "\' (pies) y " + in + "\" (pulgadas).");
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una estatura en cm: ");
		double cm =sc.nextDouble();
		centimetrosAPiesyPulgadas(cm);
	}
}
