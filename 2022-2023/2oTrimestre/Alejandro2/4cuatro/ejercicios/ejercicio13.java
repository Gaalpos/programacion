package ejercicios;

import java.util.Scanner;

/*Pedir 10 números. Mostrar la media de los números positivos,
la media de los números negativos y la cantidad de ceros.*/

public class ejercicio13 {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	
		double numero= 0;
		double aux1= 0;
		double aux2= 0;
		int cont1=0;
		int cont2=0;
		int ceros=0;
		System.out.println("Dame un numero: ");
		numero= sc.nextDouble();
		for(int i=1;i<10;i++) {
			
			if(numero>0) {
				 aux1+=numero;
				 System.out.println("Dame otro numero: ");
				 numero= sc.nextDouble();
				 cont1++;
			 }
			 else if(numero<0) {
				 aux2+=numero;
				 System.out.println("Dame otro numero: ");
				 numero= sc.nextDouble();
				 cont2++;
			 }
			 else {
				 ceros++;
				 System.out.println("Dame otro numero: ");
				 numero= sc.nextDouble();
			 }
		}
		System.out.println("La Media de los números positivos es: "+aux1/cont1);
		System.out.println("La Media de los números negativos es: "+aux2/cont2);
		System.out.println("Cantidad de ceros: "+ceros);
	}

}
