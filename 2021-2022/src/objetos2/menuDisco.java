package objetos2;

import java.util.ArrayList;
import java.util.Scanner;

public class menuDisco {

	// N determina el tamaño del array ESTATICO
	static int N = 3;

	public static boolean filtrarCodigo(Disco[] col, String cod) {

		boolean encontrado = false;
		int i = 0;
		do {
			if (col[i].getCodigo().equals(cod))
				encontrado = true;
			i++;
		} while (!encontrado && i < N);
		return encontrado;
	}

	public static void listarDiscos(Disco[] col) {
		for (int i = 0; i < N; i++) {
			if (!col[i].getCodigo().equals("LIBRE")) {
				System.out.println(col[i]);
			}
		}
	}

	public static void anadirDisco(Disco[] col) {
		Scanner mal = new Scanner(System.in);
		// Busca la primera posición libre del array
		int primeraLibre = -1;
		String codigoIntroducido;
		boolean busca = true;

		do {
			primeraLibre++;
		} while (primeraLibre < N && !((col[primeraLibre].getCodigo()).equals("LIBRE")));

		if (primeraLibre < N) {
			System.out.println("Por favor, introduzca los datos del disco.");
			/* pedir codigo */
			do {
				System.out.print("Código: ");
				codigoIntroducido = mal.nextLine();
				if (!filtrarCodigo(col, codigoIntroducido)) {
					col[primeraLibre].setCodigo(codigoIntroducido);
					busca = false;
				} else
					System.out.println("codigo ya existente");
			} while (busca);
			/* fin pedir codigo */

			System.out.print("Autor: ");
			String autorIntroducido = mal.nextLine();
			col[primeraLibre].setAutor(autorIntroducido);

			System.out.print("Título: ");
			String tituloIntroducido = mal.nextLine();
			col[primeraLibre].setTitulo(tituloIntroducido);

			System.out.print("Género: ");
			String generoIntroducido = mal.nextLine();
			col[primeraLibre].setGenero(generoIntroducido);

			System.out.print("Duración: ");
			int duracionIntroducida = Integer.parseInt(mal.nextLine());
			col[primeraLibre].setDuracion(duracionIntroducida);
		} else {
			System.out.println("no hay registros libres");
			System.out.println("elimine algun disco");
		}
	}

	public static void modificarDisco(Disco[] col, String cod) {
		Scanner mal = new Scanner(System.in);

		int i = -1;
		do {
			i++;
		} while (i < N && !((col[i].getCodigo()).equals(cod)));

		if (i < N) {
			System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");
			boolean busca = true;
			System.out.println("Código: " + col[i].getCodigo());
			System.out.print("Nuevo código: ");
			String codigoIntroducido = mal.nextLine();
			if (!codigoIntroducido.equals("")) {
				/* pedir codigo */
				while (busca) {
					if (!filtrarCodigo(col, codigoIntroducido)) {
						col[i].setCodigo(codigoIntroducido);
						busca = false;
					} else {
						System.out.println("codigo ya existente");
						System.out.print("Nuevo Código: ");
						codigoIntroducido = mal.nextLine();
					}
				}
				;
			}

			System.out.println("Autor: " + col[i].getAutor());
			System.out.print("Nuevo autor: ");
			String autorIntroducido = mal.nextLine();
			if (!autorIntroducido.equals("")) {
				col[i].setAutor(autorIntroducido);
			}

			System.out.println("Título: " + col[i].getTitulo());
			System.out.print("Nuevo título: ");
			String tituloIntroducido = mal.nextLine();
			if (!tituloIntroducido.equals("")) {
				col[i].setTitulo(tituloIntroducido);
			}

			System.out.println("Género: " + col[i].getGenero());
			System.out.print("Nuevo género: ");
			String generoIntroducido = mal.nextLine();
			if (!generoIntroducido.equals("")) {
				col[i].setGenero(generoIntroducido);
			}

			System.out.println("Duración: " + col[i].getDuracion());
			System.out.print("Duración: ");
			String duracionIntroducidaString = mal.nextLine();
			if (!duracionIntroducidaString.equals("")) {
				col[i].setDuracion(Integer.parseInt(duracionIntroducidaString));
			}

		} else
			System.out.println("codigo no encontrado");
	}

	public static void borrarDisco(Disco[] col, String cod) {
		int i = -1;
		do {
			i++;
		} while (i < N && !((col[i].getCodigo()).equals(cod)));

		if (i < N) {
			col[i].setCodigo("LIBRE");
			System.out.println("Album borrado.");
		} else
			System.out.println("codigo no encontrado");
	}

	public static void mostrarMenu() {
		System.out.println("\n\nCOLECCIÓN DE DISCOS");
		System.out.println("===================");
		System.out.println("1. Listado");
		System.out.println("2. Nuevo disco");
		System.out.println("3. Modificar");
		System.out.println("4. Borrar");
		System.out.println("5. Salir");
		System.out.print("Introduzca una opción: ");
	}

	public static void menu(Disco[] album) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		String codigoIntroducido;
		/* EMPIEZA MENU */
		do {
			mostrarMenu();
			opcion = Integer.parseInt(sc.nextLine());

			switch (opcion) {
			case 1: // LISTADO
				System.out.println("\nLISTADO");
				System.out.println("=======");
				listarDiscos(album);
				break;
			case 2: // AÑADIR *ojo codigo
				System.out.println("\nNUEVO DISCO");
				System.out.println("===========");
				anadirDisco(album);
				break;
			case 3: // MODIFICAR *ojo codigo
				System.out.println("\nMODIFICAR");
				System.out.println("===========");
				System.out.print("Por favor, introduzca el código del disco cuyos datos desea cambiar: ");
				codigoIntroducido = sc.nextLine();
				modificarDisco(album, codigoIntroducido);
				break;
			case 4: // BORRAR
				System.out.println("\nBORRAR");
				System.out.println("======");
				System.out.print("Por favor, introduzca el código del disco que desea borrar: ");
				codigoIntroducido = sc.nextLine();
				borrarDisco(album, codigoIntroducido);
				break;
			case 5:
				System.out.println("ABANDONANDO PROGRAMA...");
				break;
			default:
				System.out.println("opcion no valida");
			} // switch
		} while (opcion != 5);
		/* FIN DE MENU */

	}

	public static Disco[] modeloDatos() {
		Disco[] album = new Disco[N];
		for (int i = 0; i < N; i++) {
			album[i] = new Disco();
		}
		return album;
	}

	public static void main(String[] args) {
		menu(modeloDatos());
	}
}