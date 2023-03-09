package cap3;

import java.util.Random;

/*
 * 7. Tenemos la siguiente clase:
import java.útil.*;
public class Test {
public static void main {String[] args) {
Random rnd = new Random();
int valor = rnd.nextlnt();
}
}

Modifica el programa para que valor esté entre el rango [500-800] y muestre por pantalla si valor es par o im-
par.
 */

public class propuesto7 {

	public static void main(String[] args) {

		Random rnd = new Random();
		//int valor = rnd.nextInt();
		for (int valor=0; valor <50; valor++);
		int valor = 500+rnd.nextInt(300); //empiezo en 100 y el rango es 100
	
		System.out.println("aleatorio es "+valor);

	}

}
