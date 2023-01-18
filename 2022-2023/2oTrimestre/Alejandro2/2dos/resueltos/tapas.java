package resueltos;

import java.util.Scanner;

/*11. (Ejercicio de dificultad alta) El restaurante mejicano de Israel cuya especialidad son las papas con chocos nos pide
diseñar un método con el que se pueda saber cuántos clientes pueden atender con la materia prima que tienen en el
almacén. El método recibe la cantidad de papas y chocos en kilos y devuelve el número de clientes que puede atender
el restaurante teniendo en cuenta que por cada tres personas, Israel utiliza un kilo de papas y medio de chocos.*/

public class tapas {

	public static int numeroClientes(double p, double c) {
		int clientes = 0;
		while (p >= 0.33 && c >= 0.17) {
			p = p - 0.33;
			c = c - 0.17;
			clientes += 1;
		}

		return clientes;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double patatas;// En kilos
		double chocos;// En kilos

		System.out.println("cuantos kilos de patatas hay? ");
		patatas = sc.nextDouble();
		System.out.println("cuantos kilos de chocos hay? ");
		chocos = sc.nextDouble();

		System.out.println("El numero de comensales es: " + numeroClientes(patatas, chocos));
	}

}
