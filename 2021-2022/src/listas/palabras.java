package listas;

import java.util.Random;

public class palabras {

	public static int 
	
	
	public static int generaSize() {
		Random r = new Random();
		return r.nextInt(10)+10;
	}
	
	public static String generaPalabra() {
		// Los caracteres de interés en un array de char.
		char[] chars = "0123456789abcdefghijklmnopqrstuvwxyz".toCharArray();
		// Longitud del array de char.
		int charsLength = chars.length;
		// Instanciamos la clase Random
		Random random = new Random();
		// Un StringBuffer para componer la cadena aleatoria de forma eficiente
		StringBuffer buffer = new StringBuffer();
		// Bucle para elegir una cadena de 10 caracteres al azar
		for (int i=0;i<10;i++){
		   // Añadimos al buffer un caracter al azar del array
		   buffer.append(chars[random.nextInt(charsLength)]);
		}
		// Y solo nos queda hacer algo con la cadena
		System.out.println("Random String " + buffer.toString());
		return buffer.toString(); 
		}
	
}

