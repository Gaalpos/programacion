import java.util.Scanner;

/*
 * Dos números amigos son dos números enteros positivos a y b tales que
 * a es la suma de los divisores de b, y b es la suma de los divisores
 * de a.
 * Pedir dos números a y b al usuario y mostrar si son números amigos o
 * no lo son.
 * Un ejemplo es el par de números (220, 284), ya que: los divisores de
 * 220 son 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 y 110, que suman 284; y
 * los divisores de 284 son 1, 2, 4, 71 y 142, que suman 220
 */

public class Ejercicio2A {

    public static int calculaDivisores(int a) {

        int contador = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                System.out.println(i);
                contador = contador + i;
            }
        }
        return contador - a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int contadorA = 0;
        int contadorB = 0;

        System.out.println(" Numero A");
        a = sc.nextInt();
        System.out.println(" Numero B");
        b = sc.nextInt();

        contadorA = calculaDivisores(a);
        contadorB = calculaDivisores(b);

        if (contadorA == b && contadorB == a) {
            System.out.println(" son AMIGOS");
        } else {
            System.err.println(" NO son amigos");
        }

        System.out.println(" * Nota, el  propio numero no se tiene en cuenta" + "\n" +
                "como divisor para el calculo de los numeros amigos");
    }
}

// System.out.println();
// System.out.println("Divisores A ");
// for (int i = 1; i <= a; i++) {
// if (a % i == 0) {
// System.out.println(i);
// contadorA = contadorA + i;
// }
// }

// System.out.println();
// System.out.println("Divisores B ");
// for (int i = 1; i <= b; i++) {
// if (b % i == 0) {
// System.out.println(i);
// contadorB = contadorB + i;

// }
// }

// contadorA = contadorA - a;
// contadorB = contadorB - b;
