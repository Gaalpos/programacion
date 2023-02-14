package dinamico;

import java.util.ArrayList;
import java.util.Scanner;

// Realiza de nuevo el ejercicio de la colección de discos 
// pero utilizando esta vez 
// una lista para almacenar la información sobre los 
// discos en lugar de un array 
// convencional. Comprobarás que el código se simplifica 
// notablemente ¿Cuánto 
// ocupa el programa original hecho con un array? ¿Cuánto 
// ocupa este nuevo 
// programa hecho con una lista? 

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

        //opcion de menu
		int opcion;
		Scanner s = new Scanner(System.in);
        //variables para un objeto de la clase disco 
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
