package cap3;

import java.util.Scanner;

/*Ejemplo: Se quiere determinar el importe a facturar a los clientes
 *de unos grandes almacenes según estos criterios:
	 
· Si pagan con tarjeta oro tendrán un 15% de descuento.
· Si pagan con tarjeta club tendrán un 10% de descuento.
· Si la tarjeta (oro o club) es modalidad joven, tendrán un 5% de descuento.
· Los descuentos son acumulables.
*/
public class tarjetas {

	public static void main(String[] args) {

		// recogida de datos 1--->true 0---->false
		Scanner sc = new Scanner(System.in);
		int importe = 0;
		/*
		 * boolean oro = false; boolean club = false; boolean joven = false;
		 */
		String resp, resp2, resp3;

		
		System.out.println("Introduzca el importe");
		importe = sc.nextInt();

		System.out.println("Tienes tarjetas?");
		resp = sc.next();

		if (resp.equalsIgnoreCase("s")) {
			System.out.println("Es oro?");
			resp2 = sc.next();
			if (resp2.equalsIgnoreCase("s")) {
				// oro
				System.out.println("Es joven?");
				resp3 = sc.next();
				if (resp3.equalsIgnoreCase("s")) {
					System.out.println("decuento por oro y joven");
					System.out.println("importe a pagar: "+ (importe*0.85)*0.95+" €");
				} else {
					System.out.println("Descuento por oro");
					System.out.println("Importe a pagar: "+importe*0.85+" €");
				}

			} else {
				System.out.println("su tarjeta es club");
				System.out.println("Es joven?");
				resp3 = sc.next();
				if (resp3.equalsIgnoreCase("s")) {
					System.out.println("decuento por club y joven");
					System.out.println("Importe a pagar: "+ (importe*0.90)*0.95+" €");
				} else {
					System.out.println("Descuento por club");
					System.out.println("Importe a pagar: "+importe*0.90+" €");
				}

			}

		}else {
			System.out.println("Pague lo debido: "+importe +" €");
		}
		/*
		 * System.out.println("No hay descuentos");
		 * 
		 * System.out.println("Es oro?"); resp2 = sc.next();
		 * 
		 * System.out.println("Es joven?"); resp3 = sc.next();
		 * 
		 * System.out.println("oro: "); oro = (sc.nextInt() == 1);
		 * System.out.println("club: "); club = (sc.nextInt() == 1);
		 * System.out.println("joven: "); joven = (sc.nextInt() == 1);
		 * 
		 * 
		 * if (oro) { if (club) { if (joven) {
		 * System.out.println("NO PUEDE SERoroT clubT jovenT"); } else {
		 * System.out.println("NO PUEDE SERoroT clubT jovenF"); } } else { if (joven) {
		 * System.out.println("oroT clubF jovenT"); } else {
		 * System.out.println("oroT clubF jovenF"); } } } else { if (club) { if (joven)
		 * { System.out.println("oroF clubT jovenT"); } else {
		 * System.out.println("oroF clubT jovenF"); } } else { if (joven) {
		 * System.out.println("NO PUEDE SER oroF clubF jovenT"); } else {
		 * System.out.println("oroF clubF jovenF"); } } }
		 */
	}
}