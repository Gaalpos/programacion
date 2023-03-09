package Boletin;

import java.util.Arrays;
import java.util.Scanner;

public class varianteEj5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int[] arr2 = new int[6];
        int suma = arr.length + arr2.length;
        int[] arr3 = new int[suma];
        int minimo = Math.min(arr.length, arr2.length);
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Introduce un numero para cadena 1: ");
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Introduce un numero para cadena 2: ");
            arr2[i] = sc.nextInt();

        }

        for (int i = 0; i < minimo; i++) {

            arr3[j] = arr[i];
            j++;
            arr3[j] = arr2[i];
            j++;

        }
        for (int i = 0; i < suma - minimo; i++) {

            arr3[j] = arr[i];
            j++;
            arr3[j] = arr2[i];
            j++;

        }
        System.out.println(Arrays.toString(arr3));
    }
}
