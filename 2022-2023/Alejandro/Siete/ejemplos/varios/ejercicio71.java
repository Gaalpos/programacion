package varios;

import java.util.Arrays;

public class ejercicio71 {

    public static String pegaCadenas(String[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array pasado no valido");
        }

        String larga = "";
        for (int j = 0; j < arr.length; j++) {
            larga = larga + arr[j];
        }
        return larga;
    }

    public static void main(String[] args) {

        String parrafo = "The Last of Us es un videojuego de terror y de acción y aventura desarrollado por la compañía estadounidense Naughty Dog y distribuido por Sony Computer Entertainment para la consola PlayStation 3 en 2013. La trama describe las vivencias de Joel y Ellie, un par de supervivientes de una pandemia en Estados Unidos que provoca la mutación de los seres humanos en criaturas caníbales.";
        String cads[] = parrafo.split(" ");
        System.out.println(Arrays.toString(cads));
        String llamada = pegaCadenas(cads);
        System.out.println(llamada);
        String[] cadenitas = null;
        String cadenita = pegaCadenas(cadenitas);
    }

}
