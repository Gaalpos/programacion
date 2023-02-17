package Boletin;

import java.util.Arrays;
import java.util.Scanner;
// 8. Diseñar una aplicación que declare una tabla de 10 
// elementos enteros. Leer mediante el teclado 8 números. 
// Después se debe pedir un número y una posición, insertarlo 
// en la posición indicada, desplazando los que estén detrás.

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
        for(int i=0;i<posicion;i++){
            arr[i]=arr[i+1];
        }


        arr[posicion]=num;
        System.out.println(Arrays.toString(arr));
        

    }
   
}
