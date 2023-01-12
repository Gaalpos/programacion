public class ejemplo8 {
    public static void main(String[] args) {

        // Diferencia entre equals y el operador ==

        String cad1 = "EMMA";
        String cad2 = new String("EMMA");

        if (cad1.equals(cad2)) {
            System.out.println("son iguales");
        } else {
            System.out.println("no son iguales");
        }

        if (cad1 == cad2) {
            System.out.println("son iguales");
        } else {
            System.out.println("no son iguales");
        }
    }
}
