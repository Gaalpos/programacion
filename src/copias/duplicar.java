package copias;

import java.util.Arrays;

public class duplicar {
	
	public static void main(String[] args) {
		
		
		float [] notas = {2f, 5.5f, 9f, 10f, 4.9f, 8f, 8.5f, 7f, 6.6f, 5f, 9f, 7f};
		System.out.println(Arrays.toString(notas));
		
		//UNO
		float [] duplicado =new float [notas.length];
		
		//DOS
		for(int i=0;i<notas.length;i++){
			duplicado[i]=notas[i];
		}
		
		//TRES
		
		System.out.println("El original");
		System.out.println(Arrays.toString(notas));
		System.out.println("Este es el duplicado:");
		System.out.println(Arrays.toString(duplicado));
	}

}
