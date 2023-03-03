package probar;

import java.util.Scanner;

import ejemplos.despedirse;
import ejemplos.saludar;

public class testMultiple {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce tu nombre");
		String n=sc.nextLine();
		
		saludar s = new saludar(n);
		System.out.println("SALUDO");
		s.mostrarSaludo();
		System.out.println();	
		System.out.println("DESPEDIDA");
		despedirse d = new despedirse(n);
		d.mostrarDespedida();
	}
	
	
}
