package repaso2ev;

import java.util.Arrays;
import java.util.Random;

import libArrays.mostrar;

/*
 * Genera un array de 30 posiciones eneteras que tomaran valores
 * entre 0 y 300. Separa en dos arrays los valores pares e impares.
 * Ordenamos ambos arrays por el metodo QuickSort
 */

public class repasoArraysA {

	static int[] numeros=new int [20];
	
	static void generaNumeros() {
		Random r = new Random();
		for (int i=0;i<numeros.length;i++) {
			numeros[i]=r.nextInt(300);
		}
		
	}
	public static void mostrarNumneros() {
		for (int i=0;i<numeros.length;i++) {
		System.out.print(numeros[i]+" ");
	
		}
		System.out.println("\n----------");
	}
	
	public static int [] contarNumeros() {
		int countP=0;
		int countI=0;
		for (int i=0;i<numeros.length;i++) {
			if(numeros[i]%2==0)countP ++;
			else countI++;
		}
		return new int [ ]{countP,countI};
	}
	
	/*
	public static int  contarImpares() {
		int count=0;
		for (int i=0;i<numeros.length;i++) {
			if(numeros[i]%2==0)count ++;
		}
		return count;
	}
	*/
	
	
	public static void main(String[] args) {
		int pares=0;
		int impares=0;
		
		generaNumeros();
		mostrarNumneros();
		pares=contarNumeros()[0];
		impares=contarNumeros()[1];
		
		System.out.println(pares);
		System.out.println(impares);
		
		int [] paresArr = new int[pares];
		int [] imparesArr = new int[impares];
		
		
		int countP=0;
		int countI=0;
		for (int i=0;i<numeros.length;i++) {
			if(numeros[i]%2==0) {
				paresArr[countP]=numeros[i];
				countP++;
			}else {
				imparesArr[countI]=numeros[i];
				countI++;	
			}
		}
		System.out.println("desordenados");
		System.out.println(Arrays.toString(paresArr) );
		System.out.println(Arrays.toString(imparesArr) );
		
		Arrays.sort(paresArr);
		Arrays.sort(imparesArr);
		
		System.out.println("Ordenado");
		System.out.println(Arrays.toString(paresArr) );
		System.out.println(Arrays.toString(imparesArr) );
	}

}
