import java.util.Scanner;

/* Ejercicio 2B Calcular el coste del estacionamiento en un parking de modo que 
 * las 4 primeras horas se cobran a 2,50 euros y las siguientes a 1,10 hasta llegar a 
 * un tope de 28 euros para 24 horas. Si permanece aparcado más de un día se cobrarían
 * 28 euros al día y 1,50 las horas siguientes. 
 */
public class ejercicio2B {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int horas, dia = 0;
		double total = 0;
		int resto=0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Cuantas horas de parking?");
		horas = sc.nextInt();

		if (horas <= 4) {
			total = horas * 2.50;
		} else if (horas > 4 && horas <= 24) {
			horas -= 4;
			total = (horas * 1.10) + 10;
			if (total > 28) {
				total = 28;
			}
		} else {
			
			do {
				dia = horas / 24;
			} while (horas < 24);
			
			resto=dia*24;
			
			total = (horas-resto) * 1.50 + (dia*28);
		}
		System.out.println("Total a pagar: "+total+" €");

		sc.close();
	}

	
	
	
}
