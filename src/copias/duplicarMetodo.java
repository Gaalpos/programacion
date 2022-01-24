package copias;

import java.util.Arrays;

public class duplicarMetodo {
	
	public static float[]replicar(float []original){
		float [] replica =new float[original.length];
		for(int i=0;i<original.length;i++) 
			replica[i]=original[i];
		return replica;
		
	}
	
	public static void mostrar (float[]original) {
		System.out.println("[");
		
		for(int i=0;i<original.length;i++)
			System.out.println(original[i]+(" "));
		
		System.out.println("]");
	}
	
	public static void main(String[] args) {
		
		
		float [] notas = {2f, 5.5f, 9f, 10f, 4.9f, 8f, 8.5f, 7f, 6.6f, 5f, 9f, 7f};
		System.out.println(Arrays.toString(notas));
		
		
		float[]duplicanotas=replicar(notas);
		
		System.out.println("El original");
		mostrar(notas);
		System.out.println("Este es el duplicado:");
		mostrar(duplicanotas);
		//UNO
		/*float [] duplicado =new float [notas.length];
		
		//DOS
		for(int i=0;i<notas.length;i++){
			duplicado[i]=notas[i];
		}
		
		//TRES
		System.out.println("El original");
		System.out.println(Arrays.toString(notas));
		System.out.println("Este es el duplicado:");
		System.out.println(Arrays.toString(duplicado));
		*/
		
		
	}

}