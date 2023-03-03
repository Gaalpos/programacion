package varios;

import java.util.Arrays;

public class ejercicio72 {

    public static String obtenerCadenaMasLarga(String[] arr) {
        int posicion = 0;
        int longitud = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > longitud)
                posicion = i;
            longitud = arr[i].length();
        }
        return arr[posicion];
    }

    public static int[] obtenerLongCadenas(String[] arr) {
        int[] largos = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            largos[i] += arr[i].length();
        }
        return largos;
    }

    public static int obtenerSumaTotal(String[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("largo de la cadena: " + i + " es " + arr[i].length());
            total += arr[i].length();
        }
        return total;
    }

    public static void main(String[] args) {

        String parrafo = "The Last of Us es un videojuego de terror y de acción y aventura desarrollado por la compañía estadounidense Naughty Dog y distribuido por Sony Computer Entertainment para la consola PlayStation 3 en 2013. La trama describe las vivencias de Joel y Ellie, un par de supervivientes de una pandemia en Estados Unidos que provoca la mutación de los seres humanos en criaturas caníbales.";
        String cads[] = parrafo.split(" ");

        System.out.println(obtenerSumaTotal(cads));
        System.out.println(Arrays.toString(obtenerLongCadenas(cads)));
        System.out.println(obtenerCadenaMasLarga(cads));
    }
}
