package cap2;

import java.util.Scanner;

public class tetstAuto {

	public static void main(String[] args) {

		String marca;
		String modelo;
		double k, l, v, p;

		Scanner sc = new Scanner(System.in);

		System.out.println("introduce marca");
		marca=sc.next();
		System.out.println("introduce modelo");
		modelo=sc.next();
		
		//ASPIRANTE A METODO
		System.out.println("Datos del viaje");
		System.out.print("kilometros recorridos: ");
		k = sc.nextDouble();
		System.out.print("Litros consumidos: ");
		l = sc.nextDouble();
		System.out.print("velocidad promedio: ");
		v = sc.nextDouble();
		System.out.print("precio litro (euros): ");
		p = sc.nextDouble();

		System.out.println();
		System.out.println();

		consumo viaje1 = new consumo(k, l, v, p);
		System.out.println(viaje1.toString());
		System.out.println("info util del viaje\n");
		System.out.println(viaje1.dameInfo());
		System.out.println();
		
		auto penelope=new auto (marca,modelo, viaje1);
		System.out.println(penelope.toString());
		
		sc.close();
	}

}
