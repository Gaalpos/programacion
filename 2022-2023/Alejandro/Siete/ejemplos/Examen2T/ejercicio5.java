package Examen2T;

import java.util.ArrayList;

public class ejercicio5 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        ArrayList<String> b = new ArrayList<String>();

        a.add("rojo");
        a.add("verde");
        a.add("azul");
        a.add("blanco");
        a.add("negro");

        b.add("violeta");
        b.add("negro");
        b.add("verde");
        b.add("rosa");
        b.add("blanco");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (a.get(i) == b.get(j)) {
                    System.out.println("El color: " + b.get(j) + " coincide en ambos arrayList");
                }

            }

        }
    }
}
