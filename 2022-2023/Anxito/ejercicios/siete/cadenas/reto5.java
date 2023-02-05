package cadenas;

import java.util.Scanner;

// Reto 5: haga un programa que muestre por pantalla cada una de las
// palabras individuales de una frase en líneas diferentes. Para ello,
// antes deberá ir averiguando las posiciones donde hay espacios en
// blanco para poder delimitar dónde empieza y termina cada palabra.

public class reto5 {
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
