package ejemplos;

import java.util.Scanner;

public class testSaludar {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce tu nombre");
		String n=sc.nextLine();
		
		saludar s = new saludar(n);
		System.out.println();
		s.mostrarSaludo();
		
	}
	
	
}
