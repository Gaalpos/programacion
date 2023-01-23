package varios;

public class ejercicio64 {
    // metodo qque recoge un arra de enteros
    // y devuelvauna cadea con su contenido
    public static String obtenerArrayComoString(int[] arr) {
        String devolver = "";

        // i RECORRE CADA VALOR DEL ARRAY
        // NO SIRVE COMO INDICE
        for (int valor : arr) {
            System.out.println("indice?NO: " + valor);
            System.out.println("Valor correspondiente a indice?: " + valor);
            devolver += valor;
        }
        return devolver;
    }

    public static void main(String[] args) {

        int[] num = { 54, 55, 56, 57, 58, 59, 60 };
        System.out.println(obtenerArrayComoString(num));

        String[] palabras = { "lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo" };
        for (String palabrita : palabras)
            System.out.println(palabrita);

    }
}
