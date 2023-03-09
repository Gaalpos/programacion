package Siete.ejemplos.Ejemplos;

public class ejemplo8 {

    // Diferencia entre equals y el operador ==
    public static void main(String[] args) {

        String cad1 = "EMMA";
        String cad2 = new String("EMMA");

        if (cad1.equals(cad2)) {
            System.out.println("Son iguales");

        } else {
            System.out.println("No son iguales");

        }

        if (cad1 == cad2) {
            System.out.println("Son Iguales");
        } else {
            System.out.println("No son iguales");
        }

    }
}
