import java.util.Arrays;

public class ejercicio71 {

    public static String pegaCadenas(String[] arr) {

        if (arr == null)
            throw new IllegalArgumentException(" array no valido");

        String larga = "";
        for (int j = 0; j < arr.length; j++) {
            larga = larga + arr[j];
        }
        return larga;
    }

    public static void main(String[] args) {
        String parrafo = "sum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";

        String cadenas[] = parrafo.split(" ");
        System.out.println(Arrays.toString(cadenas));

        String llamada = pegaCadenas(cadenas);
        System.out.println(llamada);

        String[] cadenitas;
        String cadenita = pegaCadenas(cadenitas);

    }
}
