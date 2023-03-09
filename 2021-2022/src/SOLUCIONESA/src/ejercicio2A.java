import java.util.Scanner;

/*Los clientes de un gran almacén tendrán ventajas según estos criterios:
• Si pagan con tarjeta VIP tendrán un 15% de descuento.
• Si pagan con tarjeta PLUS tendrán un 10% de descuento.
• Si dichas tarjetas son además modalidad joven, tendrán un 5% de descuento.
• Los descuentos son acumulables.
Se pide dado un precio normal y conociendo el tipo de tarjeta y modalidad calcular el descuento y el precio final.*/

public class ejercicio2A {

	private static Scanner sc = new Scanner(System.in);
	
	public static void descuentoAcumulable(double precio) {
		System.out.println("Tiene tarjeta VIP? (s/n): ");
		switch (sc.next().charAt(0)) {
			case 's':
			System.out.println("La tarjeta es de modalidad joven? (s/n): ");
			switch (sc.next().charAt(0)) {
				case 'n':
				System.out.println("El precio final es: " + (0.85*precio));
				System.out.println("El descuento es: " + (0.15*precio));
				break;
				case 's':
				System.out.println("El precio final es: " + 0.95*(0.85*precio));
				System.out.println("El descuento es: " + (precio-(0.95*0.85*precio)));
				break;
				default:
				System.out.println("opción no válida");
				break;
				}
			break;
			case 'n':
			System.out.println("Tiene tarjeta PLUS? (s/n): ");
			switch (sc.next().charAt(0)) {
				case 's':
				System.out.println("La tarjeta es de modalidad joven? (s/n): ");
				switch (sc.next().charAt(0)) {
					case 'n':
					System.out.println("El precio final es: " + (0.90*precio));
					System.out.println("El descuento es: " + (0.10*precio));
					break;
					case 's':
						System.out.println("El precio final es: " + 0.95*(0.90*precio));
						System.out.println("El descuento es: " +  (precio-(0.95*0.90*precio)));
					break;
					default:
					System.out.println("opción no válida");
					break;
				}
				break;
			case 'n':
				System.out.println("El precio final es: " + precio);
				System.out.println("No hay descuento");
				break;
			default:
				System.out.println("opción no válida");
				break;
			}
			break;
		default:
			System.out.println("opción no válida");
			break;
		}
	}

	public static void main(String[] args) {
		System.out.println("Introduzca un precio: ");
		descuentoAcumulable(sc.nextDouble());
		
	}
	
	
}
