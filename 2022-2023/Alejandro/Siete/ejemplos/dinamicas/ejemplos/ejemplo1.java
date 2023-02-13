package dinamicas;

import java.util.ArrayList;
import java.util.Comparator;

public class ejemplo1 implements Comparator {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        System.out.println("Nº de elementos: " + a.size());
        a.add("rojo");
        a.add("verde");
        a.add("azul");
        System.out.println("Nº de elementos: " + a.size());
        a.add("blanco");
        System.out.println("Nº de elementos: " + a.size());
        System.out.println("El elemento que hay en la posición 0 es " +
                a.get(0));
        System.out.println("El elemento que hay en la posición 3 es " +
                a.get(3));

        for (int i = 0; i < a.size(); i++) {
            System.out.println("posicion " + i + " color " + a.get(i));
        }

        // cuando usamos objetos empleamos un bucle foreach SOLO PARA MOSTRAR

        for (String cad : a) {
            System.out.println("color " + cad);
        }

        System.out.println(a);
        a.remove("blanco");
        System.out.println(a);
        a.sort(null);
    }

    @Override
    public int compare(String o1, String o2) {
        // TODO Auto-generated method stub
        return o1.compareTo(o2);
    }
}
