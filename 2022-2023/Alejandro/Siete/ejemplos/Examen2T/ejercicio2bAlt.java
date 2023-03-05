package Examen2T;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio2bAlt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[7];
        int[] arr2 = new int[7];

        // Pedir la primera serie de 7 enteros
        System.out.println("Introduce la primera serie de 7 enteros:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        // Pedir la segunda serie de 7 enteros
        System.out.println("Introduce la segunda serie de 7 enteros:");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        // Ordenar la primera serie de forma creciente usando el método quicksort
        Arrays.sort(arr1);

        // Ordenar la segunda serie de forma creciente usando el método quicksort
        Arrays.sort(arr2);

        // Crear una tercera serie de 14 enteros y fusionar las dos series ordenadas
        int[] arr3 = new int[14];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr3[k++] = arr1[i++];
            } else {
                arr3[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            arr3[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            arr3[k++] = arr2[j++];
        }

        // Imprimir la tercera serie ordenada de forma creciente
        System.out.println("La tercera serie ordenada de forma creciente es:");
        for (int num : arr3) {
            System.out.print(num + " ");
        }
    }
}
