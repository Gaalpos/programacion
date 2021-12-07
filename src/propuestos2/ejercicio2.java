package propuestos2;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		Scanner escaner= new Scanner(System.in);
		
		float a,b,c,p;
		
		//entrada
		System.out.print("Longitud lado A: ");
		a = escaner.nextFloat();
		System.out.print("Longitud lado B: ");
		b = escaner.nextFloat();
		System.out.print("Longitud lado C: ");
		c = escaner.nextFloat();
		
		p = (a+b+c)/2;
		System.out.println("El área de dicho triangulo es:");
		System.out.println(Math.sqrt(p*(p-a)*(p-b)*(p-c)));
		escaner.close();
	}

}
