package probar;

import java.util.Scanner;

import ejemplos.despedirse;
import ejemplos.saluda;

public class testMultiple {

	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce tu nombre: ");
		String n=sc.nextLine();
		
		
		
		saluda s= new saluda(n);
		System.out.println("SALUDO");
		s.mostrarSaludo();
		System.out.println();
		
		
		System.out.println("DESPEDIDA");
		despedirse d= new despedirse(n);
		d.mostrarAdios();
		
		
	}
}
