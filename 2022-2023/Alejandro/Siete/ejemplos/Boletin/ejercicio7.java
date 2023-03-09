<<<<<<< HEAD
package Boletin;

public class ejercicio7 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int i = 0;
        boolean creciente = false;
        boolean decreciente = false;
        boolean desordenados = false;

        while (arr[i] > arr[i + 1]) {
            i++;
        }
    }
}
=======
package Boletin;

import java.util.Arrays;
// 7. Leer por teclado una serie de 10 números enteros. La 
// aplicación debe indicarnos si los números están ordenados 
// de forma creciente, decreciente, o si están desordenados. 

public class ejercicio7 {
    static int averiguaOrden(int array[]) {
        int paresOrdenadosAscendente = 0, paresOrdenadosDescendente = 0, resultado;

        //Recorro todo el array y cuento los pares que hay ordenados de forma creciente
        //y también cuento los que hay ordenados de forma decreciente
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                paresOrdenadosAscendente++;
            }
            if (array[i] > array[i + 1]) {
                paresOrdenadosDescendente++;
            }
        }
        if (paresOrdenadosAscendente == array.length - 1) {
            //Si los pares ordenados de forma creciente es igual al total de pares
            //es porque está ordenado de forma creciente todo el array
            resultado = 1;
        } else if (paresOrdenadosDescendente == array.length - 1) {
            //Si los pares ordenados de forma decreciente es igual al total de pares
            //es porque está ordenado de forma decreciente todo el array
            resultado = -1;
        } else {
            //En caso contrario, es porque no hay orden
            resultado = 0;
        }

        return resultado;
    }

    public static void main(String[] args) {
        //Creo un array con valores arbitrarios
        int array[] = {10,9,8,7,6,5,4,3,2,1};
        int orden;

        //Hago una llamada a la función para averiguar el orden del array
        orden = averiguaOrden(array);
        //Dependiendo del valor que devuelva la llamada a la función tendré
        //que imprimir el orden correspondiente
        switch (orden) {
            case 0:
                System.out.print("El array "+Arrays.toString(array)+" no tiene orden");
                break;
            case 1:
                System.out.print("El array "+Arrays.toString(array)+" está ordenado de forma creciente");
                break;
            case -1:
                System.out.print("El array "+Arrays.toString(array)+" está ordenado de forma decreciente");
                break;
        }
    }
}
>>>>>>> 3719236a9f18b0d230e7b9995bd68cbd837bf087
