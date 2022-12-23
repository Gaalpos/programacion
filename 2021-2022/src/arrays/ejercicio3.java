package arrays;

import java.util.Scanner;

//leer y guardar filtrando notas  entre 0 y 10
public class ejercicio3 {

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);

		int tamano = 0;
		while (tamano <= 0) {
			System.out.print("¿Cuántas notas quieres introducir?");
			if (lector.hasNextInt()) {
				tamano = lector.nextInt();
			} else {
				lector.next();
			}
		}
		lector.nextLine();
		System.out.println("Se leerán " + tamano + " valores reales.");
		System.out.println("Puedes escribir varios valores en una sola línea, "
		+ "separados por espacios.");
		
		// Los guardaremos en un array. Ya conocemos el tamaño.
		float[] notas = new float[tamano];
	
		// Estructura de repetición con contador.
		int index = 0;
		while (index < notas.length) {
				
			if (lector.hasNextFloat()) {
				// Se ha leído una nota, pero es válida (entre 0 y 10)?
				float nota = lector.nextFloat();
				if ((nota >= 0) && (nota <= 10)) {
					notas[index] = nota;
					index++;
				}
			} else {
				lector.next();
			}
		
		}
		// Ignoramos los valores sobrantes de la última línea.
		lector.nextLine();
		
		System.out.println("La secuencia leída es: ");
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
	}

}