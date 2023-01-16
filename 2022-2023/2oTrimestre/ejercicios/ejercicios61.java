package ejercicios;

import java.util.Arrays;

public class ejercicios61 {

    public static void main(String[] args) {

        // opc1 enters arrDig1 ---> 0 hasta 9

        int[] arrDig1 = new int[10];
        for (int i = 0; i < arrDig1.length; i++) {
            arrDig1[i] = i;

        }

        System.out.println(Arrays.toString(arrDig1));

        // opc2 arDig2 ---> 9 hasta 0
        int[] arrDig2 = new int[10];
        for (int i = 0; i < arrDig2.length; i++) {
            arrDig2[i] = (arrDig2.length - 1) - i;

        }

        System.out.println(Arrays.toString(arrDig2));

        char[] arrCh1 = { 'a', 'e', 'i', 'o', 'u' };
        System.out.println(Arrays.toString(arrCh1));

        char[] arrCh2 = new char[5];
        for (int j = 0; j < arrCh2.length; j++) {
            arrCh2[j] = (char) (97 + j);
        }
        System.out.println(Arrays.toString(arrCh2));

        // opc 5
        String cadena = "";
        for (int j = 0; j < arrCh1.length; j++) {
            cadena += arrCh1[j];
            System.out.println(cadena);
        }
        System.out.println(cadena);

        // opc 6

        String cadena2 = "";
        for (int j = 0; j < arrCh1.length; j++) {
            cadena2 += arrCh1[j];
            System.out.println(cadena2);
        }
        System.out.println(cadena2);

        // opc 7
        // intercalar los dos arrays
        String cadena3 = "";
        for (int j = 0; j < arrCh1.length; j++) {
            cadena3 += arrCh1[j];
            cadena3 += arrCh2[j];
            System.out.println(cadena3);
        }

        // opc 8
        // mostrar la suma de cada posicion o indice de arrDig1 o arrDig2
        int[] dig3 = new int[arrDig1.length];

        for (int k = 0; k < arrDig1.length; k++) {
            System.out.println(arrDig1[k] + arrDig2[k]);
        }

        System.out.println(Arrays.toString(dig3));

        int[] suma = new int[arrDig1.length];

        // sumar=arrDig1+arrDig2;

    }
}
