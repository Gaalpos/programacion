import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame una frase: ");
        String cad = sc.nextLine();

        System.out.println("Dame otra frase: ");
        String cad2 = sc.nextLine();
        String fin = "";
        String[] arr = cad.split(" ");
        String[] arr2 = cad2.split(" ");
        int min = 0;
        int max = 0;
        boolean elige = false;
        if (arr.length <= arr2.length) {
            min = arr.length;
            max = arr2.length;
            elige = true;
        } else {
            min = arr2.length;
            max = arr.length;
        }

        if (elige) {
            for (int i = 0; i < max; i++) {
                if (i <= min) {
                    fin += arr[i] + " " + arr2[i] + " ";
                } else {
                    fin += arr2[i] + " ";
                }
            }
        }

        else {
            for (int i = 0; i < max; i++) {
                if (i <= min) {
                    fin += arr[i] + " " + arr2[i] + " ";
                } else {
                    fin += arr[i] + " ";
                }
            }
        }
        System.out.println("la cadena final: ");
        System.out.println(fin);
    }
}
