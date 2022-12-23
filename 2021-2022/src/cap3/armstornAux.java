package cap3;

import java.util.Scanner;

public class armstornAux {

	public static int potencia(int base, int exponente) {
		int res = base;
		for (int i = 0; i < exponente - 1; i++) {
			res = res * base;
		}
		return res;
	}

	public static void mostrarRango(int primero, int ultimo) {
		for (int i = primero; i < ultimo; i++)
			System.out.println(i);
	}

	public static void main(String[] args) {
		int b = 0;
		int e = 0;
		Scanner sc = new Scanner(System.in);

		
		System.out.println("ejercicio resuelto 6/n");
		System.out.println("Dame base");
		b = sc.nextInt();
		System.out.println("Dame exponente");
		e = sc.nextInt();

		System.out.println("El resultado es: " + potencia(b, e));

		System.out.println("Ejercicio resuelto 6");
		System.out.println("Di primer numero");
		int p = sc.nextInt();
		System.out.println("Di ultimo numero");
		int u = sc.nextInt();

		mostrarRango(p, u);

		System.out.println("ejercicio resuelto 7/n");
		
		System.out.println("Dime un numero del 1al 10");
		int num=sc.nextInt();
		
		System.out.println(englishNumbers(num));
		

		sc.close();
	}

	
	//cambiar el método par que reciba un número y devuelva una cadena 
	private static String englishNumbers(int numero) {
		// TODO Auto-generated method stub
		
		
			switch (numero) {
			case 1:
				return "one";
				
			case 2:
				return"two";
				
			case 3:
				return "three";
				
			case 4:
				return "four";
				
			case 5:
				return "five";
				
			case 6:
				return "six";
				
			case 7:
				return "seven";
				
			case 8:
				return "eight";
				
			case 9:
				return "nine";
			case 10:
				return "ten";
			default:
				return "error";
			}
		}

	}
