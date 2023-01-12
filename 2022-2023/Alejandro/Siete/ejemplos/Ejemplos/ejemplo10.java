package Siete.ejemplos.Ejemplos;

public class ejemplo10 {

    public static void main(String[] args) {

        String cad1 = "JUANA SUAREZ";
        System.out.println(cad1);

        String cad2 = cad1.replace('U', 'F');
        System.out.println(cad2);

        String cad3 = "JUAN CARLOS MORENO";
        System.out.println(cad3);

        System.out.println(cad3.substring(5, 11));
        System.out.println(cad3.substring(12));

        String cad4 = "MAYKA ROMERO";
        System.out.println(cad4.startsWith("JUAN"));
        System.out.println(cad4.startsWith("MAY"));

        String cad5 = "MARIA AMPARO";
        System.out.println(cad5.endsWith("paro"));
        System.out.println(cad5.endsWith("PARO"));
        System.out.println(cad5.endsWith("ARIA"));

    }

}
