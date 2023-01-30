package Boletin;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr = new int[10];
        int[] arr2 = new int[10];
        int n;
        int j=0;
        System.out.println("Introduce cantidad a desplazar: ");
            n=sc.nextInt();
        
        for(int i=0;i<arr.length;i++){
            System.out.println("Introduce un numero para array: ");
            arr[i]=sc.nextInt();

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        for(int x=0;x<n;x++){
            for(int i=0;i<arr.length;i++){
                if(i==arr.length-1){
                arr2[0]=arr[i];
                }
                else{
                arr2[i+1]=arr[i];
                }
    
            }
        }
       
        
        
        System.out.println(Arrays.toString(arr2));

    }
}
