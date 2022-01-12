package examenA;

import java.util.Scanner;

public class testContador {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		Contador uno = new Contador();
		Contador dos = new Contador(3);
		int a=0;
		int b=0;
	
		System.out.println(uno.toString());
		System.out.println(dos.toString());

		
		System.out.println("Añadir contador: ");
		a=sc.nextInt();
		dos.sumar(a);
		System.out.println(uno.toString());
		System.out.println(dos.toString());
		
		System.out.println("Quitar contador: ");
		b=sc.nextInt();
		dos.restar(b);
		System.out.println(uno.toString());
		System.out.println(dos.toString());
		sc.close();
	}
}
