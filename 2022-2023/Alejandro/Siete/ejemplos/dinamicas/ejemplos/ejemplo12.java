package dinamicas;

import java.util.ArrayList;
import java.util.Collections;

public class ejemplo12 {

    public static void main(String[] args) {
        ArrayList<String> colores = new ArrayList<String>();
        colores.add("marron");
        colores.add("azul");
        colores.add("turquesa");
        colores.add("blanco");
        System.out.println("\nColores en el orden original:");
        for (String s : colores) {
            System.out.println(s);
        }
        Collections.sort(colores);
        System.out.println("\nNúmeros ordenados:");
        for (String s : colores) {
            System.out.println(s);
        }
    }
}
