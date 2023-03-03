package resueltos;

import java.util.Arrays;

public class resuelto2 {

	private static int[] lista;
	final static int POS = 50;
	final static int LIMITE = 100;
	
	public static int getAleatorio() {
		return (int) (Math.random()*LIMITE+1);
	}
	public static void muestra(int[] arr) {
		for(int i  = 0; i<lista.length; i++) {
		System.out.print(lista[i]+" ");
		}
	}
	public static void ordena(int[] arr) {
		Arrays.sort(arr);
	}
	public static void listar(int[] arr) {
		Arrays.toString(arr);
	}
	public static int[] generaArray() {
		int[] fuera = new int[30];
		for(int i = 0; i < lista.length; i++) {
			lista[i] = getAleatorio();
		}
		return fuera;
	}
	
	public static void main(String[] args) {
		
		int[] este = generaArray();
		System.out.println("array desordenado");
		muestra(este);
		ordena(este);
		System.out.println("array ordenado");
		muestra(este);
	}

}