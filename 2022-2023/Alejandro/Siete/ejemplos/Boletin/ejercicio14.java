<<<<<<< HEAD
package Boletin;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int[] arr2 = new int[10];
        int[] arr3 = new int[arr.length + arr2.length];

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.println("Introduce un numero para array ordenado de forma creciente: ");
                arr[i] = sc.nextInt();

            } else if (sc.nextInt() > arr[i - 1]) {
                System.out.println("Introduce un numero mayor: ");
                arr[i] = sc.nextInt();

            } else {
                System.out.println("El numero introducido no es válido: ");

            }

        }
        for (int i = 0; i < arr2.length; i++) {
            if (i == 0) {
                System.out.println("Introduce un numero para array 2 ordenado de forma creciente: ");
                arr2[i] = sc.nextInt();

            } else if (sc.nextInt() > arr2[i - 1]) {
                System.out.println("Introduce un numero mayor: ");
                arr2[i] = sc.nextInt();

            } else {
                System.out.println("El numero introducido no es válido: ");

            }

        }
        int long1 = 0;
        int long2 = 0;
        for (int j = 0; j < arr.length + arr2.length; j++) {
            if (arr[long1] < arr2[long2]) {
                arr3[j] = arr[long1];
                long1++;
            } else {
                arr3[j] = arr2[long2];
                long2++;
            }
        }
        System.out.println(Arrays.toString(arr3));

    }
}
=======
package Boletin;

import java.util.Arrays;
import java.util.Scanner;
// 14. Leer dos series de 10 enteros, que estarán ordenados
// crecientemente. Copiar (fusionar) las dos tablas en una
// tercera, de forma que sigan ordenados.

public class ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int[] arr2 = new int[10];
        int[] arr3 = new int[arr.length + arr2.length];
        int i = 0;
        int j = 0;
        while ( i < arr.length) {
            if (i == 0) {
                System.out.println("Introduce un numero para array ordenado de forma creciente: ");
                arr[i] = sc.nextInt();
                i++;

            } else if (sc.nextInt() > arr[i - 1]) {
                System.out.println("Introduce un numero mayor: ");
                arr[i] = sc.nextInt();
                i++;
            } else {
                System.out.println("El numero introducido no es válido: ");
                i++;
            }

        }
        while ( j < arr2.length) {
            if (j == 0) {
                System.out.println("Introduce un numero para array 2 ordenado de forma creciente: ");
                arr2[j] = sc.nextInt();
                j++;
            } else if (sc.nextInt() > arr2[i - 1]) {
                System.out.println("Introduce un numero mayor: ");
                arr2[j] = sc.nextInt();
                j++;
            } else {
                System.out.println("El numero introducido no es válido: ");
                j++;
            }

        }
        int long1 = 0;
        int long2 = 0;
        for (int z = 0; z < arr.length + arr2.length; z++) {
            if (arr[long1] < arr2[long2]) {
                arr3[z] = arr[long1];
                long1++;
            } else {
                arr3[z] = arr2[long2];
                long2++;
            }
        }
        System.out.println(Arrays.toString(arr3));

    }
}
>>>>>>> 3719236a9f18b0d230e7b9995bd68cbd837bf087
