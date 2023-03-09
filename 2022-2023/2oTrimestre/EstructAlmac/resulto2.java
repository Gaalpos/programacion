import java.lang.reflect.Array;
import java.util.Arrays;

public class resulto2 {

	private static int[] lista;
	final static int POS = 30;
	final static int LIMITE = 100;

	// metodo para obtener una aleatorio
	public static int getAleatorio() {
		return (int) (Math.random() * LIMITE + 1);
	}

	public static void muestra() {
		for (int i = 0; i < lista.length; i++) {
			System.out.print(lista[i] + " ");
		}
	}

	public static void listar() {
		System.out.println(Arrays.toString(lista));
	}
	public static void ordena() {
		Arrays.sort(lista);
	}

	public static void generaArray() {
		for (int i = 0; i < lista.length; i++) {
			lista[i] = getAleatorio();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		lista = new int[POS];
		
		generaArray();
		System.out.println(" Array desordenado");
		muestra();
		ordena();
		System.out.println();
		System.out.println("Array ordenado");
		muestra();
	}

}
