package ejemplos;

import java.util.Scanner;

public class ejemplo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner pilla = new Scanner(System.in);
		int dividendo=0;
		int divisor=0;
		int cociente;
		int resto;
		//entradas al programa
		System.out.println("Introduzca el dividendo: ");
		dividendo= pilla.nextInt();
		System.out.println("Introduzca el divisor: ");
		divisor= pilla.nextInt();
		//algoritmo
		cociente=dividendo/divisor;
		resto=dividendo%divisor;
		//salidas
		System.out.println(dividendo+" entre "+divisor+" da de cociente "+cociente+" y de resto "+resto );
		
		
		
	}
	

}
