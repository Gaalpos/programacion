package cap2;

import java.util.Scanner;

public class rebajas {

	public static double descubrePorcentaje(double original, double actual) {
		return (original - actual) * 100 / original;
	}

	public static double descubreOriginal(double actual, double porcentaje) {
		return actual / (1 - (porcentaje / 100));
	}

	// ultimo metodo aplicable
	public static double descubreActual(double original, double porcentaje) {
		// 1000 - (15/100)*1000 ---> 850
		return original - (porcentaje / 100) * original;
	}

	public static void main(String[] args) {

		Scanner esc = new Scanner(System.in);
		double ori = 0d;
		double act = 0d;
		double por = 0d;
		int dato = 0;

		do {

			System.out.println("Opciones:");
			System.out.println("Pulse 1 para saber el porcentaje");
			System.out.println("Pulse 2 para saber el precio original");
			System.out.println("Pulse 3 para saber el precio actual");
			System.out.println("Pulse 4 para salir");

			dato = esc.nextInt();

			switch (dato) {
			case 1: {
				System.out.println("precio original= ");
				ori = esc.nextDouble();
				System.out.println("precio actual= ");
				act = esc.nextDouble();
				// alg
				por = descubrePorcentaje(ori, act);
				// s/+l
				System.out.println("porcentaje: " + por+"%");

				break;
			}
			case 2: {
				System.out.println("precio actual= ");
				act = esc.nextDouble();
				System.out.println("porcentaje= ");
				por = esc.nextDouble();

				ori = descubreOriginal(act, por);
				System.out.println("PRECIO ORIGINAL: " + ori);

				break;
			}
			case 3: {
				System.out.println("precio original= ");
				ori = esc.nextDouble();
				System.out.println("porcentaje= ");
				por = esc.nextDouble();

				act = descubreActual(ori, por);
				System.out.println("precio actual: " + act);
				break;
			}
			default:
				System.out.println("Gracias por su visita");

			}
		} while (dato < 4);
		esc.close();
	}

}