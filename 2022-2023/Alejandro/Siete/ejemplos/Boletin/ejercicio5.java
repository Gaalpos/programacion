<<<<<<< HEAD
package Boletin;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio5 {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        int[] arr=new int[10];
        int[] arr2=new int[10];
        int[] arr3=new int[20];
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
=======
package Boletin;

import java.util.Arrays;
import java.util.Scanner;
// 5. Leer por teclado dos tablas de 10 números enteros y
// mezclarlas en una tercera de la forma: el 1o de A, el 1o de
// B, el 2o de A, el 2o de B, etc.
public class ejercicio5 {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        int[] arr=new int[10];
        int[] arr2=new int[10];
        int[] arr3=new int[20];
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
>>>>>>> 3719236a9f18b0d230e7b9995bd68cbd837bf087
