package resueltos;

import java.util.Arrays;

public class resuelto1 {

	private static int[] lista;
	final static int POS = 50;
	final static int LIMITE = 100;
	
	public static int getAleatorio() {
		return (int) (Math.random()*LIMITE+1);
	}
	public static void muestra() {
		for(int i  = 0; i<lista.length; i++) {
		System.out.print(lista[i]+" ");
		}
	}
	public static void ordena() {
		Arrays.sort(lista);
	}
	public static void listar() {
		Arrays.toString(lista);
	}
	public static void generaArray() {
		for(int i = 0; i < lista.length; i++) {
			lista[i] = getAleatorio();
		}
	}
	
	public static void main(String[] args) {
		
		lista = new int[POS];
		generaArray();
		System.out.println("array desordenado");
		muestra();
		ordena();
		System.out.println("array ordenado");
		muestra();
	}

}