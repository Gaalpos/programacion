package EstructAlmac;

public class ejemplo2 {

    public static void mostrarArray(byte[] arr) {
        System.out.println();
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println(" ");
        System.out.println();
    }

    public static void main(String[] args) {

        byte[] temperaturas1 = { 10, 11, 12, 11, 10, 9, 18, 19, 14, 13, 15, 15 };
        System.out.println("numero de valorees: " + temperaturas1.length);
        byte[] temperaturas2 = temperaturas1.clone();
        byte[] temperaturas3 = temperaturas1;

        System.out.println();
        System.out.println("Temperaturas 1");
        mostrarArray(temperaturas1);

        System.out.println();
        System.out.println("Temperaturas 2");
        mostrarArray(temperaturas2);

        System.out.println();
        System.out.println("Temperaturas 3");
        mostrarArray(temperaturas3);

        System.out.println(temperaturas1.toString());
        System.out.println(temperaturas2.toString());

        System.out.println("");
        if (temperaturas1.equals(temperaturas2)) {
            System.out.println(" 1 y 2 son iguales");
        } else {
            System.out.println(" 1 y 2 NO son iguales");
        }

        System.out.println();
        if (temperaturas1.equals(temperaturas3)) {
            System.out.println(" 1 y 3 son iguales");
        } else {
            System.out.println(" 1 y 3 NO son iguales");
        }

        temperaturas1[0] = 35;

        temperaturas2[4] = -17;

        System.out.println();
        System.out.println("Temperaturas 1");
        mostrarArray(temperaturas1);

        System.out.println();
        System.out.println("Temperaturas 2");
        mostrarArray(temperaturas2);

        System.out.println();
        System.out.println("Temperaturas 3");
        mostrarArray(temperaturas3);

    }
}
