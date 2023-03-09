package repaso;

import java.util.Arrays;
import java.util.Random;

public class repaso3 {

    public static int generaNumero() {
        Random r = new Random();
        return r.nextInt(100);
    }

    public static void main(String[] args) {

        int pares = 0;
        int nones = 0;

        int[] numero = new int[20];

        for (int i = 0; i < numero.length; i++) {
            numero[i] = generaNumero();
        }

        for (int i = 0; i < numero.length; i++) {
            if (numero[i] % 2 == 0) {
                pares++;
            } else {
                nones++;
            }

        }
        System.out.println(Arrays.toString(numero));
        System.out.println("pares " + pares);
        System.out.println("impares " + nones);

        int[] par = new int[pares];
        int[] non = new int[nones];
        int cpar = 0;
        int cnon = 0;

        for (int i = 0; i < numero.length; i++) {
            if (numero[i] % 2 == 0) {
                par[cpar] = numero[i];
                cpar++;
            } else {
                non[cnon] = numero[i];
                cnon++;
            }

        }

        System.out.println(Arrays.toString(numero));
        System.out.println(Arrays.toString(par));
        System.out.println(Arrays.toString(non));

        for (int i = 0; i < numero.length; i++) {
            for (int j = 0; j < pares; j++) {
                numero[i] = par[j];
                i++;
            }
            for (int k = 0; k < nones; k++) {
                numero[i] = non[k];
                i++;
            }

        }
        System.out.println(Arrays.toString(numero));

    }
}
