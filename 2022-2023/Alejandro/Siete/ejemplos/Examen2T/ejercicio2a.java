package Examen2T;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio2a {
    public static void burbuja(int[] Arr) {

        int aux;
        for (int i = Arr.length; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (Arr[j] > Arr[j + 1]) {
                    aux = Arr[j + 1];
                    Arr[j + 1] = Arr[j];
                    Arr[j] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        int[] arr3 = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Introduce numero para array 1: ");
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Introduce numero para array 2: ");
            arr2[i] = sc.nextInt();
        }
        burbuja(arr1);
        burbuja(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        int a = arr1.length - 1;
        int b = arr2.length - 1;

        for (int i = 0; i < 10; i++) {
            if (arr1[a] >= arr2[b]) {
                arr3[i] = arr1[a];
                a--;

            } else {
                arr3[i] = arr2[b];
                b--;

            }
        }
        System.out.println(Arrays.toString(arr3));

    }

}
