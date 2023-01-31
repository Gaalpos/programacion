public class ejercicio6 {

    /*
     * 6. Leer los datos correspondientes a dos tablas de 12
     * elementos numéricos, y mezclarlos en una tercera de la
     * forma: 3 de la tabla A, 3 de la B, otros 3 de A, otros 3 de
     * la B, etc
     */

    public static void main(String[] args) {

        int[] array1 = { 1, 1, 1, 3, 3, 3, 5, 5, 5, 7, 7, 7 };
        int[] array2 = { 2, 2, 2, 4, 4, 4, 6, 6, 6, 8, 8, 8 };
        int[] mezcla = new int [24];

        for (int i = 0, j = 0; i < mezcla.length; i = i + 6, j = j + 3) {
            mezcla[i] = array1[j];
            mezcla[i + 1] = array1[j + 1];
            mezcla[i + 2] = array1[j + 2];
            mezcla[i + 3] = array2[j];
            mezcla[i + 4] = array2[j + 1];
            mezcla[i + 5] = array2[j + 2];

        }

        for (int k = 0; k < mezcla.length; k++) {
            System.out.println(mezcla[k]);
        }
    }
}
