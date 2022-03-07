package listas;

import java.util.ArrayList;
import java.util.Scanner;

public class ejemplo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(18);
		numeros.add(22);
		numeros.add(-30);
		System.out.println("Número de elementos: " + numeros.size());
		System.out.println("El elemento de la posicion 1 es " + numeros.get(1));

		Integer dato = numeros.get(2);
		System.out.println(dato);
		System.out.println("introduce un entero");
		dato = Integer.parseInt(sc.nextLine());
		System.out.println(dato);
		numeros.set(2, dato);
		
		int i =0;
		for(Integer num :numeros) {
		System.out.println("posicion "+i+" es "+ numeros.get(0));
		i++;
		}

	}
}
