package arrays;

import java.util.Arrays;

public class reto2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Se parte de un array que contiene todos los valores.
		float [] notas = {2f, 5.5f, 9f, 10f, 4.9f, 8f, 8.5f, 7f, 6.6f, 5f, 9f, 7f};
		
		
		float suma = 0;
		float max=0f; //ojo con el valor inicial
		float min =10f;
		
		// Hay que recorrer todo el array de extremo a extremo.
		for (int j = 0; j <notas.length;j++) {
		suma = suma + notas[j];
		
		//COMPROBAR SI ES MAXIMO
		if(notas[j]>max) {
			max=notas[j];
			}
		if (notas[j]<min) {
			min=notas[j];
			}
		}
		
		System.out.println(Arrays.toString(notas));
		System.out.println(" La media es " + suma/notas.length);
		System.out.println(" el máximo es "+max);
		System.out.println(" el minimo es "+min);
	}

}