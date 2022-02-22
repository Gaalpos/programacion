package ejerciciosCadenas;



import java.util.Scanner;

/*
recoge una palabra y comprueba si es palindromo o no.
Definicion: Se puede leer de dch a izq como de izq a dcha
Ej Ana,Bob,Otto,Anina o Aziza  
 */
/*
 PALINDROMO FRASE Isaac no ronca asi
 */
public class ejercicioA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String invertida = "";

		System.out.println("introduce una palabra");
		String cad = sc.nextLine();

		// recorremos la cadena desde el final

		for (int i = cad.length() - 1; i >= 0; i--) {
			//System.out.println(i);
			invertida += cad.charAt(i);
			//System.out.println(invertida);
		}
		//System.out.println("la cadena invertida es \n" + invertida);
		if(cad.equals(invertida))
			System.out.println(cad+" Es palindromo");
		else
			System.out.println(cad+" No es palindromo");
	
	
		sc.close();
	
	
	
	
	
	}
}
