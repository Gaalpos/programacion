package ejemplos;

import java.util.StringTokenizer;

public class ejemploY {
    public static void main(String[] args) {
        StringTokenizer str;
        str = new StringTokenizer("UNO DOS TRES PERICO JUANICO Y ANDRÉS");
        System.out.println("la cadena str tiene: " + str.countTokens() + " elementos");
        while (str.hasMoreTokens()) {
            System.out.println(str.nextToken());
        }
    }
}
