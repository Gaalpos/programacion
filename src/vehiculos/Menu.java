package vehiculos;

import java.util.ArrayList;
import java.util.Scanner;

import objetosT3.Electrodomestico.Color;

public class Menu {

	static ArrayList<Vehiculo> lista = new ArrayList<>();

	// añadir vehiculo
	public void añadir(Vehiculo v) {
		lista.add(v);
	}

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
				System.out.println("elimindado");
			}
		}
	}

	public void listar() {
		for (Vehiculo v : lista) {
			System.out.println(v.toString());
		}
	}

	public Vehiculo datos() {
		Vehiculo v = null;

		Scanner sc = new Scanner(System.in);

		boolean corte = false;
		int opcion = 0;

	

			System.out.println("Introduce una opcion");
			System.out.println("1 coche, 2 moto, 3 camion, 4 salir");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				// pide datos
				Color color = Color.BLANCO;

				System.out.println("ruedas");
				byte nruedas = sc.nextByte();

				System.out.println("cilindrada");
				short cilindrada = sc.nextShort();

				System.out.println("potencia");
				short potencia = sc.nextShort();

				System.out.println("plazas");
				byte np = sc.nextByte();

				Coche Fiat = new Coche(color, nruedas, cilindrada, potencia, np);
				v = Fiat;

				// añadir
				break;
			case 2:
				Color pintura = Color.NEGRO;

				System.out.println("cilindrada");
				short cilindros = sc.nextShort();

				System.out.println("potencia");
				short potenciaP = sc.nextShort();

				System.out.println("plazas");
				byte plazas = sc.nextByte();

				Motocicleta Ducati = new Motocicleta(pintura, cilindros, potenciaP);

				v = Ducati;
				break;
			// pide matgricula
			// pide datros
			// añadir
			// break;
			case 3:

				Color chapa = Color.BLANCO;

				System.out.println("ruedas");
				byte rueditas = sc.nextByte();

				System.out.println("cilindrada");
				short cilinder = sc.nextShort();
			
				System.out.println("potencia");
				short power = sc.nextShort();

				System.out.println("ejes");
				byte ejardos = sc.nextByte();

				Camion MAN = new Camion(chapa, rueditas, ejardos, cilinder, power);
				v = MAN;
				// pide matgricula
				// borrar
				break;

			case 4:
				System.out.println("SALIR");
				;
				corte = true;
				break;
			default:
				System.out.println("ERROR");
			}
	
		return v;
	}

	public void menu() {
		Scanner sc = new Scanner(System.in);

		boolean corte = false;
		int opcion = 0;

		do {

			System.out.println("Introduce una opcion");
			System.out.println("1 añadir, 2 editar, 3 borrar, 4 listar, 5 Salir");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				// pide datos
				añadir(datos());
				// añadir
				break;
			case 2:

				// pide matgricula
				// pide datros
				// añadir
				break;
			case 3:
				borrar(pideMatricula());
				// pide matgricula
				// borrar
				

				break;
			case 4:
				System.out.println("Listado de vehiculos");
				listar();

				break;
			case 5:
				System.out.println("SALIR");
				;
				corte = true;
				break;
			default:
				System.out.println("ERROR");
			}
		} while (!corte);
	}

	public Vehiculo pideMatricula() {
		
		Vehiculo v = null;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("introudce la matricula");
		String m = sc.nextLine();
		
		for(int i=0; i<lista.size();i++) {
			if( lista.get(i).getMatricula().equals(m));
			v=lista.get(i);
		}
		
		return v;
	}
	
	
	public static void main(String[] args) {
		Menu m= new Menu();
		m.menu();
	}
}
