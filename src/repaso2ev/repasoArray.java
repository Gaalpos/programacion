package repaso2ev;

import java.util.Arrays;

import java.util.Random;

import libArrays.mostrar;

/*
 * Genera un array de 30 posiciones eneteras que tomaran valores
 * entre 0 y 300. Separa en dos arrays los valores pares e impares.
 * Ordenamos ambos arrays por el metodo QuickSort
 */

public class repasoArray {

	final static int SIZE=20;
	static int[] numeros=new int [SIZE];
	
	static int []paresArr;
	static int []imparesArr;
	
	static void generaNumeros() {
		Random r = new Random();
		for (int i=0;i<numeros.length;i++) {
			numeros[i]=r.nextInt(300);
		}
		
	}
	public static void mostrarNumneros(int []algo) {
		for (int i=0;i<algo.length;i++) {
		System.out.print(algo[i]+" ");
	
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
	
	public static void separaNumeros() {
		paresArr = new int[contarNumeros()[0]];
		imparesArr = new int[contarNumeros()[1]];
		int p=0;
		int n=0;
		
		
		for (int i=0;i<numeros.length;i++) {
			if(numeros[i]%2==0) {
				paresArr[p]=numeros[i];
				p++;
			}else {
				imparesArr[n]=numeros[i];
				n++;	
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		
		generaNumeros();
		mostrarNumneros(numeros);
		separaNumeros();
		
		Arrays.sort(paresArr);
		Arrays.sort(imparesArr);
		
		System.out.println("Ordenado");
	
		mostrarNumneros(imparesArr);
		mostrarNumneros(paresArr);
	}

}
