import java.util.Arrays;

public class ejercicio619 {

    public static int[] obtenerLongCadenas(String[] arr) {
        int[] largos = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("largo de la cadena " + i + " es " + arr[i].length());
            largos[i] += arr[i].length();
        }

        return largos;
    }

    public static int obtenerSumaTotal(String[] arr) {

        int total = 0;
        for (int i = 0; i < arr.length; i++) {

            System.out.println("largo de la cadena " + i + " es " + arr[i].length());
            total += arr[i].length();
        }
        return total;

    }

    public static String obtenerMayorCadena(String[] arr) {

        int posicion = 0;
        int maximo = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("largo de la cadena " + i + " es " + arr[i].length());
            if (arr[i].length() > maximo) {
                posicion = i;
                maximo = arr[i].length();

            }
        }
        return arr[posicion];
    }

    public static void main(String[] args) {

        String parrafo = "sum has been the industry's standard dummy text ever since the 1500";
        String cads[] = parrafo.split(" ");
        // String longos[] = parrafo.split(" ");

        System.out.println("total de caracteres:" + obtenerSumaTotal(cads));
        System.out.println("mayor cadena " + obtenerMayorCadena(cads));

    }

}
