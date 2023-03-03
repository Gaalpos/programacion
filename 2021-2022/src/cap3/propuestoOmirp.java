package cap3;

import java.util.Scanner;

/*9. (Ejercicio de dificultad alta) Realiza una clase miNumero con un método
 *esOmirp que diga si un número es Omirp o no. Un número es Omirp si es un
 *número primo y, además, al invertir sus dígitos da otro número primo.
 Por ejemplo: 7951 y 1597*/

//Listar por pantalla todos los números primos entre 1 y 1000/
public class propuestoOmirp {
	
		public static void listarPrimos(int n) {
			for(int i=1;i<n;i++) {
				if(esPrimo(i))
					System.out.println(i);
			}
		}
	
		public static boolean esPrimo(int numero) {
			boolean primo=true;
			int i=2;
			
			while(i<numero && primo) {
				if(numero%i==0) {
					primo=false;
				}else {
					i++;
				}
			}
			
			return primo;
		}

		public static void main(String[] args) {
			Scanner esc=new Scanner(System.in);
			System.out.println("Introduce el número que quieres comprobar:");
			int aux=esc.nextInt();
			
			System.out.println("El numero "+aux+" es primo? " +esPrimo(aux));
			
			System.out.println("Primos a listar:");
			aux=esc.nextInt();
			listarPrimos(aux);
		}
	
}
