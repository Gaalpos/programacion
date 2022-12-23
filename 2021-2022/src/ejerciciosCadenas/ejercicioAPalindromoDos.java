package ejerciciosCadenas;

/*
Podemos usar el método replace() para reemplazar un solo carácter en una 
cadena. replace(oldChar, newChar) exige dos argumentos: 
el primer argumento es el carácter que queremos que se sustituya, 
y el segundo es un nuevo carácter que debe sustituir al antiguo.
*/

import java.util.Scanner;

public class ejercicioAPalindromoDos {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String derecha ="";
	String izquierda="";
	
	System.out.println("introduce una cadena");
	String cad = sc.nextLine();
	
	
	derecha= cad.replace(" ", "");
	
	System.out.println(derecha);
	
	
	// recorremos la cadena desde el final

	for (int i = derecha.length() - 1; i >= 0; i--) {
		
		izquierda += derecha.charAt(i);
		
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

