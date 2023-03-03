

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> compis = new ArrayList<String>();

        compis.add("Gaalpos");
        compis.add("Anxo");
        compis.add("María");
        compis.add("Yowy");
        compis.add("Laura");
        compis.add("Gabri");
        Collections.sort(compis);

        for (String s : compis) {
            System.out.println(compis);
        }

    }
}
