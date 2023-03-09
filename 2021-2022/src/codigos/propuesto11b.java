package codigos;

/*11. Realiza un programa con una variable entera t la cual contiene un tiempo en segundos y queremos conocer este
tiempo pero expresado en horas, minutos y segundos.
*/
import java.util.Scanner;

public class propuesto11b {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		int t = 0;
		int cociente = 0;
		int modulo = 0;

		System.out.println("introduzca una cantidad de segundos");
		t = escaner.nextInt();
		System.out.println();

		// COMO LO HAGO
		cociente = t / 60;
		modulo = t % 60;

		// SALIDA.
		System.out.println("Minutos" + cociente);
		System.out.println("Minutos" + modulo);

		escaner.close();
	}

}
