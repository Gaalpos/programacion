import java.util.Arrays;

public class resuleto2b {
	
	private static int[] lista;
	final static int POS = 30;
	final static int LIMITE = 100;

	public static int getAleatorio() {
		return (int) (Math.random() * 100 + 1);
	}
	
	
	public static void listar(int []arr) {
		System.out.println(Arrays.toString(arr));
	}
	
	public static void ordena(int []arr) {
		Arrays.sort(arr);
	}
	
	public static int[] generaArray() {
		int [] fuera = new int[LIMITE];
		for (int i = 0; i < fuera.length; i++) {
			fuera[i] = getAleatorio();
		}
		return fuera;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] este = generaArray();
		listar(este);
		ordena(este);
		listar(este);
		
	}

}
