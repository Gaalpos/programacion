import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import Examen2TProgramacion.Carta;

public class Ejercicio6 {
    static HashMap<String, Integer> puntaje = new HashMap();

    static void ponPuntosAlMapa() {
        puntaje.put("a", 11);
        puntaje.put("k", 10);
        puntaje.put("q", 10);
        puntaje.put("j", 10);
        puntaje.put("diez", 10);
        puntaje.put("nueve", 9);
        puntaje.put("ocho", 8);
        puntaje.put("siete", 7);
        puntaje.put("seis", 6);
        puntaje.put("cinco", 5);
        puntaje.put("cuatro", 4);
        puntaje.put("tres", 3);
        puntaje.put("dos", 2);

    }

    static ArrayList<Carta> mano = new ArrayList<>();

    public static void main(String[] args) {

        ponPuntosAlMapa();
        Carta c = new Carta();
        System.out.println(c.toString());
        mano.add(c);

        do {
            Carta nueva = new Carta();

            if (!mano.contains(nueva)) {
                System.out.println(nueva.toString());
                mano.add(nueva);
            } else {
                // System.out.println(nueva.toString());
                // System.out.println("carta repetida");

            }

        } while (mano.size() < 7);

        System.out.println("mano obtenida sin ordenar");
        for (Carta car : mano) {
            System.out.println(car.toString());
        }
        Collections.sort(mano);
        System.out.println("mano obtenida ordenada");
        for (Carta car : mano) {
            System.out.println(car.toString());
        }

        int total = 0;
        for (Carta car : mano) {
            total += puntaje.get(car.getValor());
        }
        System.out.println("Total de la tirada: " + total);
    }
}
