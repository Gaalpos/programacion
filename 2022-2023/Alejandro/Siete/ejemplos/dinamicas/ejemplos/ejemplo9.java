package dinamicas;

import java.util.ArrayList;
import java.util.Scanner;

import Cadenas.reto4;

public class ejemplo9 {

    public static ArrayList<Gato> poblarLista(int numero) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Gato> lista = new ArrayList<Gato>();
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
        ArrayList<Gato> milista;
        Scanner sc = new Scanner(System.in);
        System.out.println("dime cuantos gatos: ");
        milista = poblarLista(sc.nextInt());
        System.out.println(milista);

    }
}
