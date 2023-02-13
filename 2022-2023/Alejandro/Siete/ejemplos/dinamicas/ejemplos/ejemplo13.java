package dinamicas;

import java.util.ArrayList;
import java.util.Collections;

public class ejemplo13 {
    public static void main(String[] args) {
        ArrayList<Gato> g = new ArrayList<Gato>();
        g.add(new Gato("Garfield", "naranja", "mestizo", 7));
        g.add(new Gato("Pepe", "gris", "angora", 2));
        g.add(new Gato("Mauri", "blanco", "manx", 5));
        g.add(new Gato("Ulises", "marrón", "persa", 1));
        g.add(new Gato("Adán", "negro", "angora", 1));

        // Ordena por CompareTo
        Collections.sort(g);

        System.out.println("\nDatos de los gatos ordenados por edad de mas a menos:");

        for (Gato gatoAux : g) {
            System.out.println(gatoAux + "\n");
        }
    }
}
