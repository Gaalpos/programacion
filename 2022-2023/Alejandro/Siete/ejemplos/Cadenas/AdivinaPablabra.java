package Cadenas;

import java.util.Random;
import java.util.Scanner;

public class AdivinaPablabra {

    public static final String PALABRA_SECRETA = generaPalabra();

    public static String generaPalabra() {
        String palabra = "";
        Random r;
        for (int i = 0; i < 4; i++) {
            r = new Random();
            char letra = (char) (r.nextInt(26) + 97);
            // System.out.println(letra);
            palabra += letra;
            // System.out.println(palabra);
        }
        return palabra;
    }

    public static void main(String[] args) {

        System.out.println(generaPalabra());

        Scanner lector = new Scanner(System.in);
        System.out.println("Empezamos el juego.");
        System.out.println("Adivina una palabra del diccionario.");
        boolean acierto = false;
        while (!acierto) {
            System.out.print("¿Qué palabra crees que es?");
            String palabra = lector.nextLine();

            // metodo compareTo
            int posicion = palabra.compareTo(PALABRA_SECRETA);
            if (posicion < 0) {
                // La palabra del usuario es anterior a la secreta.
                System.out.println("Has fallado! La palabra va después ...");
            } else if (posicion > 0) {
                // La palabra del usuario es posterior a la secreta
                System.out.println("Has fallado! La palabra va antes ...");
            } else {
                // Si vale 0, es que se ha acertado.
                acierto = true;
            }
        }
        System.out.println("Enhorabuena. Has acertado!");

    }
}
