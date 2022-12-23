import java.util.Scanner;

/*
 * Programar un algoritmo recursivo que permita sumar los dígitos de un número.
 * Ejemplo: Entrada: 1234 Salida10
 */
public class ejercicio3A {

	public static int sumaDigitos(int numero) {

		//caso limite (solo un digito)
		if (numero <= 9) {
			return numero;
		} else {   //1234 -->  sD (4)       +   sD(123)    
			return sumaDigitos(numero % 10) + sumaDigitos(numero / 10);
		}
	}
	
	public static void main(String[] args) {
		int numero=0;
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("dame un numero: ");
	    numero = sc.nextInt();
	
	    System.out.println(sumaDigitos(numero));
	
	}	
}
