package Siete.ejemplos.Ejemplos;

public class ejemplo4 {

    public static void mostrarArray(char[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
        System.out.println();
    }

    public static void main(String[] args) {

        char[] nombre1 = { 'p', 'e', 'p', 'e' };
        char[] nombre2 = { 112, 101, 112, 101 };
        char[] nombre3 = new char[4];

        mostrarArray(nombre1);
        mostrarArray(nombre2);
        mostrarArray(nombre3);

        System.out.println("Longitud del array de chars: " + nombre1.length);

        System.out.println(nombre1);
        System.out.println(nombre2);
        System.out.println(nombre3);

        String st = "Hola me llamo María Victoria";
        System.out.println(st);
        System.out.println(st.length());

        System.out.println(st.charAt(12));

    }

}
