package cap3;

import java.util.Scanner;

public class propuesto1b {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		int mayor,menor; //dos variables auxiliares
		Scanner sc = new Scanner(System.in);

		// TRES NUMEROS DISTINTOs
		System.out.println("Introduce numero A");
		a = sc.nextInt();
		System.out.println("Introduce numero B");
		b = sc.nextInt();
		System.out.println("Introduce numero C");
		c = sc.nextInt();

        mayor = a;
		
		if(mayor<b) {
			mayor = b;
		}
		if(mayor < c) {
			mayor = c;
		}
		
		menor = a;
		
		if(menor>b) {
			menor = b;
		}
		if(menor > c) {
			menor = c;
		}
		
		System.out.println("Mayor: "+mayor);
		System.out.println("Menor: "+menor);
		
		sc.close();
	}
}
