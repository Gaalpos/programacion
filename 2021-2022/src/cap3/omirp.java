package cap3;

import java.util.Scanner;

public class omirp {

	public static boolean esPrimo(int numero) {
		boolean primo = true;
		int i = 2;
		while (i < numero && primo) {
			if (numero % i == 0) {
				primo = false;
			}
			i++;
		}
		;
		return primo;
	}

//	public static boolean esOmirp(int numero) {
//		boolean omirp = false;
//		int i=0;
//		if
//	}

	public static int invertir(int numero) {

		int a, b, c, d = 0;
		int i = 0;

		a = numero / 1000;
		b = (numero / 100) % 10;
		c = (numero / 10) % 10;
		d = numero % 10;
		i = (d * 1000) + (c * 100) + (b * 10) + a;

		System.out.println("Primera cifra de " + numero + " -> " + a);
		System.out.println("Primera cifra de " + numero + " -> " + b);
		System.out.println("Primera cifra de " + numero + " -> " + c);
		System.out.println("Primera cifra de " + numero + " -> " + d);

		return i;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int aux1, aux2, aux3, aux4 = 0;

		System.out.print("Introduzca una cifra de cuatro digitos: ");
		a = sc.nextInt();
		b = a;
		System.out.println(esPrimo(a));

		System.out.println(invertir(a));
		System.out.println(esPrimo(a));
		System.out.println("NO ES PRIMO");
		
		sc.close();

	}

}
