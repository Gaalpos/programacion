package ejercicios;

import java.util.Scanner;

public class ejerciciometodos {

	//vamos a preparar un metodo que haga la conversión de 
	//metros a kilometros
	
	public static double kilometrosAMetros(double k) {
		double m= k*1000;
		return m;
	}
	public static double metrosAKilometros(double m) {
		double k= m/1000;
		return k;}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);	
		double metros,kilometros;
	System.out.println("por favor introduzca numero de kilometros: ");	
	kilometros= sc.nextDouble();
	metros=kilometrosAMetros(kilometros);
	System.out.println("en metros son: "+metros);
	
	
	System.out.println("por favor introduzca numero de metros: ");	
	metros= sc.nextDouble();
	kilometros=metrosAKilometros(metros);
	System.out.println("en metros son: "+kilometros);
	}

}
