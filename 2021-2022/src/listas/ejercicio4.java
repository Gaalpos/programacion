package listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ejercicio4 {

	public static String encripta(String s) {
		
		// Los caracteres de interés en un array de char.
		char[] letras = "0123456789abcdefghijklmnopqrstuvwxyz".toCharArray();
		ArrayList<Character>lista= new ArrayList(Arrays.asList(letras));
		// Longitud del array de char.
		int charsLength = letras.length;

		String dev = "";
		
		for(int i=0; i<s.length();i++) {
			dev+=lista.get(lista.indexOf(s.charAt(i))+1);
		}
		
		//encriptado
		return dev;
	}
	
	public static void main(String[] args) {
		System.out.println(encripta("abcdeejf132"));
	}
}
