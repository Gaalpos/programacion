package cap2;

import java.util.Scanner;

public class testConsumo {

	public static void main(String[] args) {
		
		double k,l,v,p;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("introdzca datos del viaje");
		
		System.out.println("kilometros recorridos: ");
		k=sc.nextDouble();
		
		System.out.println("Litros consumidos: ");
		l=sc.nextDouble();
		
		System.out.println("velocidad promedio: ");
		v=sc.nextDouble();
		
		System.out.println("precio litro (euros): ");
		p=sc.nextDouble();
		
		
		System.out.println();
		System.out.println();
		consumo viaje1= new consumo(k,l,v,p);
		System.out.println(viaje1.toString());
		System.out.println("info util del viaje\n");
		System.out.println(viaje1.dameInfo());
	}

}
