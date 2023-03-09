package boletinArrays;

import java.util.Scanner;

/*
 * Leer 10 enteros ordenados crecientemente. Leer N y
buscarlo en la tabla. Se debe mostrar la posición en que se
encuentra. Si no está, indicarlo con un mensaje.
 */
public class ejercicio15 {

	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5,6,7,8,9,10 };
		int n=0;
		int p=0;
		boolean found=false;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Qúe numero quieres buscar?");
		n=sc.nextInt();
		
		for(int i=0; i<array.length;i++) {
			if(n==array[i]) {
				p=array[i];
				found=true;
				System.out.println("El "+n+" se encuentra en la psoicion "+p);
			}
		
		}
		if(found==false) System.out.println("Número no encontrado");
	}
}
