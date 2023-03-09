package Resueltos;

import java.util.Arrays;

public class resuelto2 {

    private static int[] Lista;
    final static int POS = 30;
    final static int LIMITE = 100;

    public static int getAleatorio() {
        return (int) (Math.random() * LIMITE + 1);
    }

    public static void muestra() {
        for (int i = 0; i < Lista.length; i++) {
            System.out.print(Lista[i] + " ");
        }
    }

    public static void listar() {
        System.out.println(Arrays.toString(Lista));
    }

    public static void ordena() {
        Arrays.sort(Lista);
    }

    public static void generaArray() {
        for (int i = 0; i < Lista.length; i++) {
            Lista[i] = getAleatorio();

        }
    }

    public static void main(String[] args) {
        Lista = new int[POS];
        generaArray();
        System.out.println("array desordenado");
        listar();
        ordena();
        System.out.println(" ");
        System.out.println("array ordeando");
        listar();
    }
}
