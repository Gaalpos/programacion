package nuevascosas;

import java.util.Scanner;

public class factorial {

	public static int factorialIterativo(int numero) {
		int factorial=1;
		for(int i=1;i<=numero;i++) {
			factorial*=i;
			
		}
		return factorial;
	}
	public static int factorialRecursivo(int numero) {
	
		if(numero==1) {
			return 1;
		}
		else {
			return numero*factorialRecursivo(numero-1);
		}
	
}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc= new Scanner(System.in);
		int numero=0;
		System.out.println("Introduce un número entero: ");
		numero=sc.nextInt();
		
		
		System.out.println("El factorial de "+numero+" es "+factorialIterativo(numero));
		
		System.out.println("___________________________________________________________");
		
		System.out.println("El factorial por recursividad de "+numero+" es "+factorialRecursivo(numero));
	}

}
