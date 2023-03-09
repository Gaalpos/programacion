package ejercicio;

import java.util.Arrays;
import java.util.Scanner;

// Pedir por teclado dos series de 7 enteros. Posteriormente se
// ordenarán crecientemente por el método quicksort. Por último se
// fusionaran las dos tablas en una tercera, de forma que sigan
// ordenados de forma creciente.

public class ejercicio2B {

     //Ordenamos los Arrays con el metoo quicksort

     public static void selectionSort(int array[]) {
	    int size = array.length;

	    for (int step = 0; step < size - 1; step++) {
	      int min_idx = step;

	      for (int i = step + 1; i < size; i++) {

	        // To sort in descending order, change > to < in this line.
	        // Select the minimum element in each loop.
	        if (array[i] < array[min_idx]) {
	          min_idx = i;
	        }
	      }

	      // put min at the correct position
	      int temp = array[step];
	      array[step] = array[min_idx];
	      array[min_idx] = temp;
	    }
    }
        
         
	  
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int[] ArrayA = new int[7];
        int[] ArrayB = new int[7];

        //Inicializo Array A y lo muestro

        System.out.println("Este seria el Array A: ");
        for(int i=0; i<ArrayA.length;i++) {
            ArrayA[i]=(int) (Math.random()*100 +1);
            System.out.println(ArrayA[i]+" ");
        }

        //Inicializo y muestro el Array B

        System.out.println("Este seria el Array B: ");
        for(int i=0; i<ArrayB.length;i++) {
            ArrayB[i]=(int) (Math.random()*100 + 1);
            System.out.println(ArrayB[i]+ " ");
        }

        }
}
    