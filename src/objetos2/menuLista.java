package objetos2;

import java.util.ArrayList;
import java.util.Scanner;

public class menuLista {
	static int N = 100;
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

	public static Disco[] modeloDatos() {
		ArrayList<Disco> album = new ArrayList <Disco>();
		for (int i = 0; i < N; i++) {
			album[i] = new Disco();
		}
		return album;
	}
	
	public static void main(String[] args) {
		menu(modeloDatos());
	}
}
