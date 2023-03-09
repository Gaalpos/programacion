public class ejemplo9 {

    public static void mostrarArray(char[] arr) {
        System.out.println();
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println(" ");
        System.out.println();
    }

    public static void main(String[] args) {

        String cad1 = " MAYKA   es mi TIA";

        System.out.println(cad1.trim());

        String cad2 = "PEDRO RUIZ";
        System.out.println(cad2.toUpperCase());

        // conversion de un objeto string en un array de caracteres
        String cad5 = "hola mundo";

        char[] arr = cad5.toCharArray();
        mostrarArray(arr);

        String nuevo = new String(arr);

        System.out.println(nuevo);

    }
}
