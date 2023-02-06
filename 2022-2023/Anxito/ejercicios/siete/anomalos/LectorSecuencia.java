package anomalos;
import java.util.Scanner;

public class LectorSecuencia {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine();
        sc.close();
    
        String[] palabras = frase.split(" ");
        for (String palabra : palabras) {
          System.out.println(palabra);
        }
      }
    }

