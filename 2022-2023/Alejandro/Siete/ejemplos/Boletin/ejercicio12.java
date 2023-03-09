<<<<<<< HEAD
package Boletin;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr = new int[10];
        int posicion;
        for(int i=0;i<arr.length;i++){
            System.out.println("Introduce un numero para array: ");
            arr[i]=sc.nextInt();

        }
        System.out.println("Dime la posicion: ");
        posicion=sc.nextInt();

        arr[posicion]=0;
        System.out.println(Arrays.toString(arr));
    }
}
=======
package Boletin;

import java.util.Arrays;
import java.util.Scanner;
/*
 * Leer por teclado una tabla de 10 elementos numéricos
enteros y una posición (entre 0 y 9). Eliminar el elemento
situado en la posición dada sin dejar huecos.
 */
public class ejercicio12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr = new int[10];
        int posicion;
        for(int i=0;i<arr.length;i++){
            System.out.println("Introduce un numero para array: ");
            arr[i]=sc.nextInt();

        }
        System.out.println("Dime la posicion: ");
        posicion=sc.nextInt();

        arr[posicion]=0;
        System.out.println(Arrays.toString(arr));
    }
}
>>>>>>> 3719236a9f18b0d230e7b9995bd68cbd837bf087
