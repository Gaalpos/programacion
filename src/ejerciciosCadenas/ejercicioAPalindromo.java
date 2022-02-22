package ejerciciosCadenas;

import java.util.Scanner;

/*
PALINDROMO FRASE Isaac no ronca asi
yo hago yoga hoy
*/
public class ejercicioAPalindromo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//String invertida = "";
	String derecha ="";
	String izquierda="";
	
	System.out.println("introduce una cadena");
	String cad = sc.nextLine();

	String[] palabros = cad.split(" ");
	
	
	for(String cacho:  palabros) {
		//System.out.println(cacho);
		derecha+=cacho;
	}
	//System.out.println(derecha);
	
	
	// recorremos la cadena desde el final

	for (int i = derecha.length() - 1; i >= 0; i--) {
		//System.out.println(i);
		izquierda += derecha.charAt(i);
		//System.out.println(invertida);
	}
	//System.out.println(izquierda);
	
	
	//System.out.println("la cadena invertida es \n" + invertida);
	if(derecha.equalsIgnoreCase(izquierda))
		System.out.println(cad+" Es palindromo");
	else
		System.out.println(cad+" No es palindromo");

	sc.close();

}
}
