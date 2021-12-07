package codigos;

/*11. Realiza un programa con una variable entera t la cual contiene un tiempo en segundos y queremos conocer este
tiempo pero expresado en horas, minutos y segundos.
*/
import java.util.Scanner;

public class propuesto11 {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		int t = 0;
		int horas = 0;
		int minutos = 0;
		int segundos=0;
		int dias = 0;
		
		/*
		 * t dividido entre 86400
		(t dividido modulo 86400)/3600 ----horas
		(t entre 60) 60----- minutos
		t modulo 60 ---- segundos
		*/

		System.out.println("introduzca una cantidad de segundos");
		t = escaner.nextInt();
		System.out.println();

		// COMO LO HAGO
		dias = t /86400;
		horas = (t%86400)/3600;
		minutos = (t / 60)%60;
		segundos= t % 60;

		// SALIDA.
		System.out.println("Dias " + dias);
		System.out.println("Horas " + horas);
		System.out.println("Minutos " + minutos);
		System.out.println("Segundos " + segundos);
		escaner.close();
	}

}

