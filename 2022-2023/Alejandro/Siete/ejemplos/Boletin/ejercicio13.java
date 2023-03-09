<<<<<<< HEAD
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
=======
package Boletin;

import java.util.Arrays;
import java.util.Scanner;
/*
     * Leer 10 enteros. Guardar en otra tabla los elementos
    pares de la primera, y a continuación los elementos
    impares. Realizar dos versiones: una trabajando con los
    valores y otra trabajando con los índices.
     */
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
>>>>>>> 3719236a9f18b0d230e7b9995bd68cbd837bf087
