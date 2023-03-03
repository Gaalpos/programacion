package dinamicas;

import java.util.ArrayList;
import java.util.Scanner;

public class ejemplo10 {
    static ArrayList<Gato> lista = new ArrayList<Gato>();

    public static ArrayList<Gato> poblarLista(int numero) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numero; i++) {
            Gato g = new Gato();
            System.out.println("Dame nombre: ");
            g.setNombre(sc.next());

            System.out.println("Dame color: ");
            g.setColor(sc.next());

            System.out.println("Dame raza: ");
            g.setRaza(sc.next());

            lista.add(g);

        }

        return lista;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dime cuantos gatos: ");
        poblarLista(sc.nextInt());
        lista.sort(null);
        System.out.println(lista);

    }
}
