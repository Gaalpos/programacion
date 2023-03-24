import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
    public static void burbuja(int[] Arr) {

        int aux;
        for (int i = Arr.length; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (Arr[j] < Arr[j + 1]) {
                    aux = Arr[j + 1];
                    Arr[j + 1] = Arr[j];
                    Arr[j] = aux;
                }
            }
        }
    }

    static String[] letras = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q",
            "r", "s", "t", "u", "v", "w", "x", "y", "z" };

    static int[] res = new int[letras.length];

    public static int recorrido(String cadena, String car) {
        int total = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == car.charAt(0)) {
                total++;
            }
        }
        return total;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("introduce una cadena: ");
        String cadena = sc.nextLine();
        cadena = cadena.toLowerCase().replaceAll(" ", " ");

        for (int j = 0; j < letras.length; j++) {
            res[j] = recorrido(cadena, letras[j]);
        }
        int[] ordenado = res;
        burbuja(ordenado);
        int z = 0;
        for (int i = 0; i < letras.length; i++) {
            if (z < 3) {
                if (res[i] == ordenado[z]) {
                    System.out.println("Letra: " + letras[i] + " valor:" + res[i]);
                    z++;
                }
            }

        }

    }
}
