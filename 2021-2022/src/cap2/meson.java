package cap2;

/*
 11. (Ejercicio de dificultad alta) El restaurante mejicano de Israel cuya especialidad son las papas con chocos nos pide
diseñar un método con el que se pueda saber cuántos clientes pueden atender con la materia prima que tienen en el
almacén.
El método recibe la cantidad de papas y chocos en kilos y devuelve el número de clientes que puede atender
el restaurante teniendo en cuenta que por cada tres personas, Israel utiliza un kilo de papas y medio de chocos.
 */


/*p>2c
 * 
 * chocos=chocos-c;
 * papas=papas-2c;
 * 
 * return 6c;
 * 
 * papas=papas-p;
 * chocos=chocos-0,5p
 * return 3p;
 * 
 * 
 */

import java.util.Scanner;

public class meson {
	
	static double papas;
	static double chocos;
	
	public static int dimeCuantos(double p, double c) {
		int x=0;

		if(papas>=2*chocos) {
			System.out.println("sobran patatas y faltan chocos");
			//mala cuenta para devolucion
			return (int)(6*chocos);
		}
		else {
			System.out.println("Sobran chocos y faltan patatas");
			//mala cuenta para devolucion
			return (int)(3*papas);
		}
		//System.out.println("Comensales: "+x);
		//return x;
	}
	
	public static void dimeAlmacen() {
		Scanner es=new Scanner(System.in);
		System.out.println("Kg papas: ");
		papas=es.nextDouble();
		System.out.println("Kg de chocos: ");
		chocos=es.nextDouble();
	}
	
	public static void main(String[]args) {
		dimeAlmacen();
		System.out.println("comensales: "+dimeCuantos(papas,chocos));
	}

}
