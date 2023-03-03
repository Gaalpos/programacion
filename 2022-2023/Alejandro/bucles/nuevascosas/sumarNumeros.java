package nuevascosas;

import java.util.Scanner;

public class sumarNumeros {
	
	
	public static int sumaRepetitiva(int numero){
		int cont=0;
		int suma=0;
		int raz=1;
		int corte=numero;
		int i=1;
		while(i<=corte) {
			System.out.println(i+",");
			cont++;
			suma+=i;
			i+=raz;}
		return suma;
	}
	
	
	public static int sumaRecursiva(int numero) {
		int corte= numero;
		if(numero==1)
			return 1;
		else
			return numero + sumaRecursiva(numero-1);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc= new Scanner(System.in);
		int ini=1;
		
		int corte;
		
		
		System.out.println("Introduce un numero: ");
		corte= sc.nextInt();
		
		
		
		
		System.out.println("Has contado "+corte+" numeros");
		System.out.println("la suma de los números es: "+sumaRepetitiva(corte));
		System.out.println("la suma recursiva de los números es: "+sumaRecursiva(corte));
		
	}
}
