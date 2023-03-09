package examenEv2A;

import java.util.Scanner;

public class ejercicio1 {
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		String [] letras= {"T","R","W","A","G","M","Y","F","P","D","X","B", "N","J","Z","S","Q","V","H","L","C","K","E" };
	
		int dni;
		
		System.out.println("Números del dni");
		dni=sc.nextInt();

		int resto = dni%23;
		
		for(int i=0;i<=letras.length;i++) {
			if (resto == i)
				System.out.println("El dni completo es "+dni +letras[i]);
		}

	}

}
