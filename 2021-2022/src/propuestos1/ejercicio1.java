package propuestos1;

import java.util.Scanner;


public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner escaner = new Scanner(System.in);
		
		int n = 0;
		double a = 0;
		char c='a';
		
	System.out.print("Introduzca valor A: ");
	n = escaner.nextInt();
	System.out.print("Introduzca valor B: ");
	a = escaner.nextDouble();
	
	
	
	System.out.println("Valor A: "+ n);
	System.out.println("valor B: "+ a);
	System.out.println("variable C = "+c);
	
	System.out.println(" A+B= "+ (n+a));
	System.out.println(" A-B= "+ (n-a));
	System.out.println("El valor numérico de C es " +(int)c);

	escaner.close();
}
}