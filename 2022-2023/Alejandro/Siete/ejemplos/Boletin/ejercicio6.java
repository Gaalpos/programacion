package Boletin;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
            int[] arr=new int[12];
            int[] arr2=new int[12];
            int[] arr3=new int[8];
        int j=0;
            for(int i=0;i<arr.length;i++){
                System.out.println("Introduce un numero para cadena 1: ");
                arr[i]=sc.nextInt();
    
            }
            for(int i=0;i<arr2.length;i++){
                System.out.println("Introduce un numero para cadena 2: ");
                arr2[i]=sc.nextInt();
                
            }
            
            for(int i=0;i<10;i++){
    
                arr3[j]=arr[i];
                j++;
                arr3[j]=arr2[i];
                j++;
                
    
            }
            System.out.println(Arrays.toString(arr3));
    }    
}
