public class ejemplo4 {

    public static void mostrarArray(char[] arr) {
        System.out.println();
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println(" ");
        System.out.println();
    }

    public static void main(String[] args) {
        char[] nombre1 = { 'p', 'e', 'p', 'e' };
        char[] nombre2 = { 112, 101, 112, 101 };
        char[] nombre3 = new char[4];

        mostrarArray(nombre1);
        mostrarArray(nombre2);
        mostrarArray(nombre3);

        System.out.println("longitud de aray de chars " + nombre1.length);

        System.out.println(nombre1);
        System.out.println(nombre2);
        System.out.println(nombre3);

        String st = "hola me llamo maria";
        System.out.println(st);

    
    }

}
