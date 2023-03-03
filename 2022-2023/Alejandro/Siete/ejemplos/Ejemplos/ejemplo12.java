package Siete.ejemplos.Ejemplos;

public class ejemplo12 {

    public static void main(String[] args) {

        String cadena = "dfn apewfnai owencnwefponopwanihi fohwogfhwabffndpaio ewnfpnwipfipwefbwei pfbiwpbnfipbepbiwab fibewifb iwabf iwpe bfewiia ebw`fiba";

        // declarar un array de strings
        System.out.println(cadena);
        String[] cachitos = cadena.split(" ");

        for (int i = 0; i < cachitos.length; i++) {
            System.out.println("palabra " + i + " es " + cachitos[i]);
        }

    }
}
