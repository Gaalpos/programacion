package vehiculos;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	static ArrayList<Vehiculo> lista = new ArrayList<>();

	// añadir vehiculo
	public void añadir(Vehiculo v) {
		lista.add(v);
	}

	// mostrar vehiculo

	// editar vehihiculo
	public void editar(Vehiculo v) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getMatricula().equals(v.getMatricula())) {
				lista.set(i, v);
			}
		}
	}

	public void borrar(Vehiculo v) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getMatricula().equals(v.getMatricula())) {
				lista.remove(i);
			}
		}
	}

	public void listar() {
		for (Vehiculo v : lista) {
			System.out.println(v.toString());
		}
	}

	public void menu() {
		Scanner sc = new Scanner(System.in);
		
		boolean corte =false;
		int opcion = 0;
		
		do {
			
		System.out.println("Introduce una opcion");
		System.out.println("1 añadir, 2 editar, 3 borrar, 4 listar");
		opcion = sc.nextInt();

		
		do {
		switch (opcion) {
		case 1:
			// pide datos 
			//añadir
			break;
		case 2:

			//pide matgricula
			//pide datros
			//añadir
			break;
		case 3:
			//pide matgricula
			//borrar

			break;
		case 4:
			System.out.println("Listado de vehiculos");
			listar();

			break;
		case 5  :System.out.println("SALIR");;
			corte =true;
			break;
		default:
			System.out.println("ERROR");
		}
	}while(!corte);
		}

	public static void main(String[] args) {

	}
}
