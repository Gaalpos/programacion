public class ejemplo5 {
    public static void main(String[] args) {
        String cad1 = "pepe";
        String cad2 = new String("lionel");
        String cad3 = new String(cad2);

        System.out.println(cad1);
        System.out.println(cad2);
        System.out.println(cad3);

        System.out.println(cad2.hashCode());
        System.out.println(cad3.hashCode());

        System.out.println(cad2.equals(cad3));
        String cad4 = "CHELO";
        System.out.println(cad4.length());

        String cad5 = "Andy";
        cad5 = cad5.concat(" y Lukas");

        System.out.println(cad5);
        ;

    }
}
