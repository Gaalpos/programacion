package ejercicios;
import java.util.Scanner;
/*Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de
1000€.*/


public class ejercicio14 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int numero=0;
		int aux=0;
		int mayores=0;
		 for(int i=1;i<=10;i++) {
			System.out.println("Dame un sueldo: ");
			numero= sc.nextInt();
			aux+=numero;
			if(numero>1000){
				mayores++;
			}

		 }
System.out.println("La suma es: "+aux);
System.out.println("Hay "+mayores+" sueldos mayores de 1000€");

	}

}
