package arrays;

import java.util.Arrays;


/*
 * El array no esta completamente ocupado
 */
public class ejemplo6{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Se parte de un array que contiene todos los valores.
		float [] notas = {2f, 5.5f, 9f, 10f, 4.9f, 8f, 8.5f, 7f, 6.6f, 5f, 9f, 7f, 0f,0f,0f,0f,0f,0f,0f};
		
		int contar=0;
		float suma = 0;
		float max=0f; //ojo con el valor inicial
		float min =10f;//ojo con el valor inicial
		
		
		for (int j = 0; j <notas.length;j++) {
			if(notas[j]!=0)
			contar++;
		}
		
		System.out.println("Notas válidas: " +contar);
		// Hay que recorrer todo el array de extremo a extremo.
		for (int j = 0; j <contar;j++) {
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
		System.out.println(" La media es " + suma/contar);
		System.out.println(" el máximo es "+max);
		System.out.println(" el minimo es "+min);
	}

}