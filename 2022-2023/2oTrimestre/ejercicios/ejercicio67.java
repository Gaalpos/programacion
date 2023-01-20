import java.lang.reflect.Array;
import java.util.Arrays;

class ejercicios67 {

    public static int sumaValores(int[] arr) {
        int suma = 0;
        for (int i = 0; i < arr.length; i++) {
            suma += arr[i];
        }
        return suma;
    }

    public static int[] rellenaPares(int capacidad) {
        int[] pares = new int[capacidad];
        for (int i = 0; i < pares.length; i++) {
            pares[i] = 2 * i;
        }
        return pares;
    }

    public static int[] rellenaImpares(int capacidad) {
        // preparo un nuevo array
        int[] impares = new int[capacidad];
        for (int i = 0; i < impares.length; i++) {
            impares[i] = (2 * i + 1);
        }
        return impares;
    }

    public static void main(String[] args) {
        // int[] prueba = new int[15];

        int[] sumaPar;
        int[] sumaImpar;

        sumaPar = rellenaPares(12);
        System.out.println(Arrays.toString(sumaPar));

        sumaImpar = rellenaImpares(12);
        System.out.println(Arrays.toString(sumaImpar));

        System.out.println("Suma del array de pares " + sumaValores(sumaPar));
        System.out.println("Suma del array de impares " + sumaValores(sumaImpar));
    }
}

// sumaPar = rellenaPares(prueba);
// System.out.println(Arrays.toString(sumaPar));
// sumaImpar = rellenaImpares(prueba);
// System.out.println(Arrays.toString(sumaImpar));

// System.out.println(Arrays.toString(rellenaPares(prueba)));
// System.out.println(Arrays.toString(rellenaImpares(prueba)));
