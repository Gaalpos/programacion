package ejemplos;

import java.util.Scanner;

public class ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		byte[] temperaturas; //declarar un array de temperaturas
		int humedades[];   //tambien hemos creado un array de humedades
		
		temperaturas = new byte[10];   //0 0 0 0 0 0 0 0 0 0
		
		int capacidad=5;
		humedades = new int[capacidad];   // 0 0 0 0 0
		
		// quedan organizados por un indice de la posicion: 0 1 2 ..... n-1
		
		//bucle clasico de recorido de las posiciones de un array MOSTRANDOLAS
		System.out.println("Mostrando temperaturas: ");
		for(int j=0; j < temperaturas.length; j++) {
			System.out.println("la temperatura para la posicion (indice) "+j+" es: "+temperaturas[j]);
			
		}
		System.out.println("INTRODUCIENDO TEMPERATURAS");
		//bucle clasico de recorido de las posiciones de un array para introducir
		//datos
				for(int j=0; j < temperaturas.length; j++) {
					System.out.println("introduce la temperatura para el indice "+j+" es: ");
					temperaturas[j]=sc.nextByte();
					
				}
				
				System.out.println("Mostrando temperaturas y calculando su media: ");
				int total=0;
			
				//bucle clasico de recorido de las posiciones de un array MOSTRANDOLAS
			for(int j=0; j < temperaturas.length; j++) {
				System.out.println("la temperatura para la posicion (indice) "+j+" es: "+temperaturas[j]);
					total+=temperaturas[j];
				}
		System.out.println("La media de temperatura es: "+total/temperaturas.length);
	}

}
