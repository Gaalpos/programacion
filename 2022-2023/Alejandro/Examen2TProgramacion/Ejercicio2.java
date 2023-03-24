
import java.util.Arrays;

public class Ejercicio2 {
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

    public static int[] generaArray() {
        int[] arr = new int[50];
        for (int i = 0; i < 50; i++) {
            int random = (int) (Math.random() * (200 + 1)) - 100;
            arr[i] = random;
        }
        return arr;
    }

    public static void main(String[] args) {
        int p = 0;
        int n = 0;
        int contPos = 0;
        int contNeg = 0;
        int[] arr = generaArray();

        for (int i = 0; i < 50; i++) {
            if (arr[i] >= 0) {
                contPos++;
            } else
                contNeg++;
        }
        int[] positivos = new int[contPos];
        int[] negativos = new int[contNeg];
        for (int i = 0; i < 50; i++) {
            if (arr[i] >= 0) {
                positivos[p] = arr[i];
                p++;
            } else {
                negativos[n] = arr[i];
                n++;
            }
        }
        System.out.println(Arrays.toString(positivos));
        System.out.println(Arrays.toString(negativos));
        burbuja(positivos);
        burbuja(negativos);
        System.out.println(Arrays.toString(positivos));
        System.out.println(Arrays.toString(negativos));
    }
}
