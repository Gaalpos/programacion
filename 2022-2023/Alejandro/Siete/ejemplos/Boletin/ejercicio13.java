package Boletin;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int[] arr2 = new int[10];
        int[] pares = new int[10];
        int[] impares = new int[10];
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Introduce un numero para cadena 1: ");
            arr[i] = sc.nextInt();

        }

        for (int i = 0; i < arr.length; i++) {
        if (arr[i]%2==0) {
            pares[i]=arr[i];
        }
        else{
            impares[i]=arr[i];
        }
        
    }
    for(int i = 0; i < pares.length; i++) {
        if(pares[i]!=0){
            arr2[j]=pares[i];
            j++;
        }
}
for(int i = 0; i < impares.length; i++) {
    if(impares[i]!=0){
        arr2[j]=impares[i];
        j++;
    }
}

System.out.println(Arrays.toString(arr2));
    }
}
