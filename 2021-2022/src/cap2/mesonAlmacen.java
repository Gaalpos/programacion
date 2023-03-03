package cap2;
/*
 * Modifica el programa anterior creando una clase que permita almacenar los kilos de papas y chocos del
restaurante. Implementa los siguientes métodos:

public void addChocos(int x). Añade x kilos de chocos a los ya existentes.

public void addPapas(int x). Añade x kilos de papas a los ya existentes.

public int getComensales(). Devuelve el número de clientes que puede atender el restaurante (este es el
método anterior).

public void showChocos(). Muestra por pantalla los kilos de chocos que hay en el almacén.

public void showPapas(). Añade Muestra por pantalla los kilos de papas que hay en el almacén.
 */

import java.util.Scanner;

/*Modifica el programa anterior creando una clase que permita almacenar
 *  los kilos de papas y chocos del restaurante. 
 *  Implementa los siguientes métodos:
public void addChocos(int x). Añade x kilos de chocos a los ya existentes.
public void addPapas(int x). Añade x kilos de papas a los ya existentes.
public int getComensales(). Devuelve el número de clientes que puede atender
el restaurante (este es el método anterior).

public void showChocos(). Muestra por pantalla los kilos de chocos que
 hay en el almacén.
public void showPapas(). Añade Muestra por pantalla los kilos de papas que
 hay en el almacén.
 
 public void showAlmacen --->>>> muestra lo que tengo 
*/
public class mesonAlmacen {

	//mi almacen
	static double papas;
	static double chocos;
	
	public static int getComensales() {
		   int cont=0;
		   //condicion para hacer un guiso para tres comensales
		   while(papas>=1  && chocos>=0.5)     {
					papas-=1;
					chocos-=0.5;
					cont=cont+3;
				    }; //fin while
				    System.out.println("TURNO DE comedor");
				    System.out.println("----------------");
				    System.out.println("comensales: "+cont);
				    /*System.out.println("patatas quedan: "+p);
				    System.out.println("chocos quedan: "+c);*/
			return cont;
	}
	
	public static void showPapas() {
		System.out.println("Patatas: "+papas);
	}
	public static void showChocos() {
		System.out.println("Chocos: "+chocos);
		}
	public static void showAlmacen() {
		System.out.println("EXISTENCIAS ALMACEN");
		System.out.println("-------------------");
		showPapas();
		showChocos();
	}
	
	public static void actualizaAlmacen() {
		Scanner es = new Scanner(System.in);
		System.out.println("Patatas añadir(kg): ");
		papas = es.nextDouble();
		System.out.println("Chocos añadir(kg): ");
		chocos = es.nextDouble();
	}
	
	public static void menu() {
		Scanner es= new Scanner(System.in);
		//repetir mientras israel quiera
		boolean seguir=true;
		char resp;
		do {
		        /*  mostrar almacen
				 * 	ir a comprar
				 *  mostrar almacem
				 *  dar de comer
				 */
			showAlmacen();
			actualizaAlmacen();
			showAlmacen();
			getComensales();
			System.out.println("otro dia S/N");
			resp=es.next().charAt(0);
			if(resp=='n')
				seguir = false;
		}while(seguir);
	}

	public static void main(String[] args) {
		menu();
	}
}