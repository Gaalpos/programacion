package repasoLiberatorio;

import java.util.Scanner;

public class practica1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[5];
        for(int i=0; i<5; i++) {
            System.out.println("Dame valores "+(i+1)+" ");
            arr1[i]=sc.nextInt();
        }
        
        System.out.println("El array seria: ");
        for(int i=0; i<5;i++) {
            System.out.println(arr1[i]);
            sc.close();
        }

    }
    
}
