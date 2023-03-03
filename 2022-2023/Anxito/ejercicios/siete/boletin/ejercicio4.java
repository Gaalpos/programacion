package boletin;

/*4. Leer 10 números enteros. Debemos mostrarlos en el 
siguiente orden: el primero, el último, el segundo, el 
penúltimo, el tercero, etc. */

import java.util.Scanner;

public class ejercicio4 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int numero[] = new int[10];
        for(int i=0;i<10;i++){
        System.out.println("Introduzca numero");
        numero[i] = sc.nextInt();
        }
        System.out.println("El resultado es");
        for(int i=0;i<=4;i++){
        System.out.println(numero[i]);
        System.out.println(numero[9-i]);
        }
        }
        }

