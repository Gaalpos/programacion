
/*
 * metodo que recoge un array de enteros y devuelva
 * una cadena con su contenido
 */
public class ejercicio64 {

    public static String obtenerArrayComoString(int[] array) {

        String devolver = "";
        for (int i = 0; i < array.length; i++) {
            devolver += array[i];
        }
        return devolver;
    }

    public static String obtenerArrayComoString1(int[] array) {

        String devolver = "";
        // Recorre cada valor del array
        // ojo con la inicializacion a 0 de i
        for (int i : array) {
            System.out.println("indice?NO " + i);
            System.out.println("Valor correspondiente a indice?" + i);
            devolver += i;
        }
        return devolver;
    }

    public static void main(String[] args) {

        int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(obtenerArrayComoString1(num));

        String[] palabras = { "lun", "mar", "mier", "jue", "vier", "sab", "dom" };

        for (String palabrita : palabras)
            System.out.println(palabrita);

    }

}
