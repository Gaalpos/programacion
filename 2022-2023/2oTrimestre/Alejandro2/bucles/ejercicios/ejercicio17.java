package ejercicios;

import java.util.Scanner;

/*Una empresa que se dedica a la venta de desinfectantes
necesita un programa para gestionar las facturas. En cada
factura figura: el código del artículo, la cantidad vendida en
litros y el precio por litro.
Se pide de 5 facturas introducidas: Facturación total, cantidad
en litros vendidos del artículo 1 y cuantas facturas se
emitieron de más de 600 €.*/

public class ejercicio17 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int codigo=0;
		int cantidad=0;
		int precio=0;
		int total=0;
		int cantidadde1=0;
		int mayores=0;
		for(int i=1;i<=5;i++) {
		System.out.println("Dame el código de la factura: ");
		codigo=sc.nextInt();
		if(i==1) {
		System.out.println("Dame la cantidad vendida en litros: ");
		cantidad=sc.nextInt();
		cantidadde1=cantidad;
		}
		else {
			System.out.println("Dame la cantidad vendida en litros: ");
			cantidad=sc.nextInt();
		}
		System.out.println("Dame el precio por litro: ");
		precio=sc.nextInt();
		
		total+=cantidad*precio;
		if(cantidad*precio>600) {
			mayores++;
		}
		
		}
		

		System.out.println("La facturación total es: "+total);
		System.out.println("La cantidad de litros del artículo 1 es: "+cantidadde1);
		System.out.println("Facturas de mas de 600€: "+mayores);
		
		
	}

}
