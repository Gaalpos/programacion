package Boletin;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[12];
        int[] arr2 = new int[12];
        int[] arr3 = new int[24];
        int j = 1;
        int long1 = 0;
        int long2 = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Introduce un numero para cadena 1: ");
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Introduce un numero para cadena 2: ");
            arr2[i] = sc.nextInt();

        }

        for (int i = 0; i < arr3.length;i++) {
            if (j <= 3) {
                arr3[i] = arr[long1];
                long1++;       
                j++;
            }

            else if (j > 3 && j <= 6) {
                arr3[i] = arr2[long2];
                long2++;
                j++;
            }
            else{
                arr3[i] = arr[long1];
                long1++;
                j = 2;
            }
           

        }
        System.out.println(Arrays.toString(arr3));
    }

}