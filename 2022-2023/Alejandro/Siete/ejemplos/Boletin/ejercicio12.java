package Boletin;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr = new int[10];
        int posicion;
        for(int i=0;i<arr.length;i++){
            System.out.println("Introduce un numero para array: ");
            arr[i]=sc.nextInt();

        }
        System.out.println("Dime la posicion: ");
        posicion=sc.nextInt();

        arr[posicion]=0;
        System.out.println(Arrays.toString(arr));
    }
}
