package Siete.ejemplos.Ejemplos;

public class ejemplo5 {

    public static void main(String[] args) {
        String cad1 = "pepe";
        String cad2 = new String("Lionel");
        String cad3 = new String(cad2);

        System.out.println(cad1);
        System.out.println(cad2);
        System.out.println(cad3);

        System.out.println(cad2.hashCode());
        System.out.println(cad3.hashCode());
        // Al contrario que con los array, las cadenas se guardan en la misma zona de la
        // memoria si tienen los mismos carcateres
        System.out.println(cad2.equals(cad3));
        String cad4 = "CHEEEEE BOLUDOOOO MIRAAAA";
        System.out.println(cad4.length());

        // Como concatenar cadenas
        String cad5 = "Que mirá bobo";
        cad5 = cad5.concat(",anda pa allá bobo");
        System.out.println(cad5.toString());

    }

}
