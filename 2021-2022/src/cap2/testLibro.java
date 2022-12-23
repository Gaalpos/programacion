package cap2;

import java.util.Scanner;

public class testLibro {
	public static void main(String[] args) {
		Libro librito=new Libro();
		Libro librazo = new Libro("El Cid", "Quijote",8,6);
		Scanner sc=new Scanner(System.in);
		int n=0;
		int a=0;
		
		System.out.println("Introduzca cuantos quiere añadir");
		n=sc.nextInt();
		//System.out.println("Introduzca cuantos quiere prestar");
		
		System.out.println(librito.toString());
		System.out.println(librazo.toString());
		System.out.println(librazo.getEjemplares());
	}
}
