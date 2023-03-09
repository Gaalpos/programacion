package Examen2T;

import java.util.Scanner;

public class ejercicio2aAlt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];

        // Pedir la primera serie de 5 enteros
        System.out.println("Introduce la primera serie de 5 enteros:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        // Pedir la segunda serie de 5 enteros
        System.out.println("Introduce la segunda serie de 5 enteros:");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        // Ordenar la primera serie de forma decreciente usando el método de la burbuja
        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = 0; j < arr1.length - i - 1; j++) {
                if (arr1[j] < arr1[j + 1]) {
                    int temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }
            }
        }

        // Ordenar la segunda serie de forma decreciente usando el método de la burbuja
        for (int i = 0; i < arr2.length - 1; i++) {
            for (int j = 0; j < arr2.length - i - 1; j++) {
                if (arr2[j] < arr2[j + 1]) {
                    int temp = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = temp;
                }
            }
        }

        // Crear una tercera serie de 10 enteros y fusionar las dos series ordenadas
        int[] arr3 = new int[10];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] > arr2[j]) {
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

        // Imprimir la tercera serie ordenada de forma decreciente
        System.out.println("La tercera serie ordenada de forma decreciente es:");
        for (int num : arr3) {
            System.out.print(num + " ");
        }
    }
}
