package cap3;

import java.util.Scanner;

/*
 * 9. (Ejercicio de dificultad alta) Realiza una clase minumero con un método esOmirp que diga si un número es Omirp
o no. Un número es Omirp si es un número primo y, además, al invertir sus dígitos da otro número primo. Por
ejemplo: 7951 y 1597.
 */

import java.util.Scanner;

//Ahora muestra por pantalla todos los numeros entre el 1 y el 1000
public class propuesto9 {

	public static boolean esPrimo(int numero) {
		boolean primo = true;
		int i = 2;
		while (i < numero && primo) {
			if (numero % i == 0) {
				primo = false;
			}
			i++;
		};
		return primo;
	}

	public static void listarPrimos(int n) {
		for (int i = 1; i <= n; i++) {
			if (esPrimo(i))
				System.out.println(i);

		}
	}

	public static void main(String[] args) {
//TODO Auto-generated method stub
		int aux = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("numero a comprobar: ");
		aux = sc.nextInt();
		System.out.println(esPrimo(aux));

		System.out.println("Primos a listar: ");
		aux = sc.nextInt();
		listarPrimos(aux);
		sc.close();
	};

}
