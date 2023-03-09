package Siete.ejemplos.Ejemplos;

import java.util.Scanner;

public class ejemplo3 {

    private static int[] temperaturas;
    final static int POSICIONES = 10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dato = 0;
        int media = 0;
        temperaturas = new int[POSICIONES];

        for (int i = 0; i < POSICIONES; i++) {
            try {
                System.out.println("introduzca temperatura: ");
                String sdato = System.console().readLine();
                dato = Integer.parseInt(sdato);
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
                System.out.println("Error al introducir dato");
            }

            temperaturas[i] = dato;

        }
        for (int i = 0; i < POSICIONES; i++) {
            media += temperaturas[i];
        }
        media = media / POSICIONES;
        System.out.println("la media es: " + media);

    }

}
