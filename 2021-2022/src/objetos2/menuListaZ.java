package objetos2;

import java.util.ArrayList;

import java.util.Scanner;

public class menuListaZ {
	
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
	
	public static void listarDiscos(ArrayList<Disco> album) {
		for (Disco d: album) {
			System.out.println(d);
		}
	}
	
	public static void anadirDisco(ArrayList<Disco> album) {
		Scanner mal = new Scanner(System.in);
		Disco dis = new Disco();
		// Busca la primera posición libre del array
		int primeraLibre = -1;
		String codigoIntroducido;
		boolean busca = true;



			System.out.print("Código: ");
			codigoIntroducido = mal.nextLine();
			dis.setCodigo(codigoIntroducido);
			System.out.println("codigo ya existente");


			System.out.print("Autor: ");
			String autorIntroducido = mal.nextLine();
			dis.setAutor(autorIntroducido);

			System.out.print("Título: ");
			String tituloIntroducido = mal.nextLine();
			dis.setTitulo(tituloIntroducido);

			System.out.print("Género: ");
			String generoIntroducido = mal.nextLine();
			dis.setGenero(generoIntroducido);

			System.out.print("Duración: ");
			int duracionIntroducida = Integer.parseInt(mal.nextLine());
			dis.setDuracion(duracionIntroducida);
		

	}
	
	public static void modificarDisco(ArrayList<Disco> album, String cod) {
		Scanner mal = new Scanner(System.in);

		int i = -1;

			System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");
			boolean busca = true;
			System.out.println("Código: " + album.getCodigo());
			System.out.print("Nuevo código: ");
			String codigoIntroducido = mal.nextLine();

			col[i].setCodigo(codigoIntroducido);



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

	}

	public static void menu(ArrayList<Disco> album) {
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
				//listarDiscos(album);
				break;
			case 2: // AÑADIR *ojo codigo
				System.out.println("\nNUEVO DISCO");
				System.out.println("===========");
				//anadirDisco(album);
				break;
			case 3: // MODIFICAR *ojo codigo
				System.out.println("\nMODIFICAR");
				System.out.println("===========");
				System.out.print("Por favor, introduzca el código del disco cuyos datos desea cambiar: ");
				codigoIntroducido = sc.nextLine();
				//modificarDisco(album, codigoIntroducido);
				break;
			case 4: // BORRAR
				System.out.println("\nBORRAR");
				System.out.println("======");
				System.out.print("Por favor, introduzca el código del disco que desea borrar: ");
				codigoIntroducido = sc.nextLine();
				//borrarDisco(album, codigoIntroducido);
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
	
	public static ArrayList<Disco> modeloDatos() {
		ArrayList<Disco> album = new ArrayList<Disco>();
		return album;
	}

	public static void main(String[] args) {
		menu(modeloDatos());
	}
	
}

