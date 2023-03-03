package dinamicas.ejercicios;

import java.util.Scanner;

/*Realiza de nuevo el ejercicio de la colección de discos
pero utilizando esta vez
una lista para almacenar la información sobre los
discos en lugar de un array
convencional. Comprobarás que el código se simplifica
notablemente ¿Cuánto

ocupa el programa original hecho con un array? ¿Cuánto
ocupa este nuevo
programa hecho con una lista? */

public class coleccionDiscos {
    public static void main(String[] args) {

		// N determina el tamaño del array
		final int N = 100;

		// Crea el array de discos
		Disco[] discos = new Disco[N];

		// Crea todos los discos que van en cada una de las celdas del array
		for (int i = 0; i < N; i++) {
			discos[i] = new Disco();
		}

        discos[0] = new Disco("GASA41", "Wim Mertens", "Maximazing the Audience", "instrumental", 50);
	    discos[1] = new Disco("FGHQ64", "Metallica", "Black album", "hard rock", 46);
	    discos[2] = new Disco("TYUI89", "Supersubmarina", "Viento de cara", "pop rock", 42);

		int opcion;
		Scanner s = new Scanner(System.in);
		String codigoIntroducido;
		String autorIntroducido;
		String tituloIntroducido;
		String generoIntroducido;
		int duracionIntroducida;

		do {
			System.out.println("\nCOLECCIÓN DE DISCOS");
			System.out.println("===================");
			System.out.println("1. Listado");
			System.out.println("2. Nuevo disco");
			System.out.println("3. Modificar");
			System.out.println("4. Borrar");
			System.out.println("5. Salir");
			System.out.print("Introduzca una opción: ");
			opcion = Integer.parseInt(s.nextLine());

			switch (opcion) {
			case 1:
				System.out.println("\nLISTADO");
				System.out.println("=======");

			default:

			} // switch
		} while (opcion != 5);
	}

    
}




