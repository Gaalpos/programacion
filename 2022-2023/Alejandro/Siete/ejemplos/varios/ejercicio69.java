package varios;

import java.util.Arrays;

public class ejercicio69 {

    public static int[] arrayPotencias2(int capacidad) {
        int[] potencia = new int[capacidad];
        for (int i = 0; i < potencia.length; i++) {
            potencia[i] = (int) Math.pow(2, i);

        }
        return potencia;

    }

    public static void main(String[] args) {

        int[] uno = arrayPotencias2(12);
        System.out.println(Arrays.toString(uno));

    }
}