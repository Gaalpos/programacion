package Boletin;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr=new int[10];
        int num;
        int posicion;
        for(int i=0;i<8;i++){
            System.out.println("Introduce un numero para cadena 1: ");
            arr[i]=sc.nextInt();

        }
        System.out.println("Introduce un numero: ");
        num=sc.nextInt();
        System.out.println("Introduce posicion: ");
        posicion=sc.nextInt();
        arr[posicion]=num;
    }
   
}
