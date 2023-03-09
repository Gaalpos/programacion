import java.util.Scanner;

public class ejemplo13 {
	
	private static String[] lista;
	
	final static int  POS=4;
	
	public static void muestra() {
		for (int i=0; i<POS; i++) {
			System.out.println(lista[i] + " ");
		
		}
	}
	
	public static void main(String[] args) {
			
		Scanner sc= new Scanner(System.in);
		lista = new String[POS];
		
		for (int i=0; i<POS; i++) {
			System.out.println(" dame un nombre");
			String ln = sc.nextLine();
			lista[i]=ln.toString();
		}
		System.out.println();
		muestra();
		
	}

}
