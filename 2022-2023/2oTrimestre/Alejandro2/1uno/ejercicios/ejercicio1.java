package ejercicios;

import java.util.Scanner;

public class ejercicio1 {
	static int n1=50;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n2=30, suma=0, n3=0;
		System.out.println("introduce un número: ");
		n3=sc.nextInt();
		
		suma=n1+n2;
		System.out.println("LA SUMA ES: " + suma);
		suma=suma+n3;
		System.out.println(suma);
		}
		}