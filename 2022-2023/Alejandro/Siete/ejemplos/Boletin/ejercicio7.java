package Boletin;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        
        int[] arr = new int[10];
        int creciente=0;
        int decreciente=0;
        for(int i=0;i<arr.length;i++){
            System.out.println("Introduce un numero para array: ");
            arr[i]=sc.nextInt();

        }
        int i;
        for ( i = 0; i < arr.length-1;i++) {
            if(arr[i]<arr[i+1]){
             creciente++;
            }
            if(arr[i]>arr[i+1]){
             decreciente++;
            }
            
         }
         if (creciente==i) {
            System.out.println("Es creciente");
        }
        else if (decreciente==i) {
            System.out.println("Es decreciente");
        }
        else{
            System.out.println("Es desordenado");
        }
    }
}
