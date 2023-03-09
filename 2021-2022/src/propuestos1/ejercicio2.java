package propuestos1;

import java.util.Scanner;


public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner escaner = new Scanner(System.in);
		
		int a=10;
		int b=7;
		
		double x=3.2;
		double y=4.1;
		
		System.out.print("Introduzca valor A: ");
		a = escaner.nextInt();
		System.out.print("Introduzca valor B: ");
		b = escaner.nextInt();
		
		System.out.print("Introduzca valor X: ");
		x = escaner.nextDouble();
		System.out.print("Introduzca valor Y: ");
		y = escaner.nextDouble();
		
		
		System.out.println("Variable A="+a);
		System.out.println("Variable B= "+b);
		System.out.println("Variable X= "+x);
		System.out.println("Variable Y= "+y);
		
		System.out.println("OPERACIONES");
		System.out.println("A+B= "+(a+b));
		System.out.println("A-B= "+(a-b));
		System.out.println("A*B= "+(a*b));
		System.out.println("A/B= "+(a/b));
		System.out.println("A%B= "+(a%b));
		
		System.out.println("X+Y= "+(x+y));
		System.out.println("X-Y= "+(x-y));
		System.out.println("X*Y= "+(x*y));
		System.out.println("X/Y= "+(x/y));
		System.out.println("X%Y= "+(x%y));
		
		System.out.println("A+X= "+(a+x));
		System.out.println("B/Y= "+(b/y));
		System.out.println("B%Y= "+(b%y));
		
		System.out.println("El doble de A es "+(a*2));
		System.out.println("El doble de B es "+(b*2));
		System.out.println("El doble de X es "+(x*2));
		System.out.println("El doble de Y es "+(y*2));
		System.out.println("La suma de todas las variables es "+(a+b+x+y));
		System.out.println("El producto de todas las variables es "+(a*b*x*y));

		
		
		escaner.close();
		
	}

}
