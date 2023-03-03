import java.util.Scanner;

/*
 * Se desea realizar un pago mediante billetes de curso legal. El
programa pedirá la cantidad de dólares a pagar y mostrará en
pantalla el número de billetes de 100, 50, 20, 10, 5, 2 y 1
necesarios para realizar el pago. Así mismo devolverá el resto a
pagar en monedas.
 */

public class Billetes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double pago = 0;
        double[] billetes = { 100, 50, 20, 10, 5, 2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01 };
        double contador[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        System.out.println(contador.length);

        System.out.println("Cuanto tiene que pagar");
        pago = sc.nextDouble();

        for (int i = 0; i <= contador.length; i++) {

            if (pago >= billetes[i]) {
                do {
                    pago = pago - billetes[i];
                    contador[i] = contador[i] + 1;

                } while (pago >= billetes[i]);
            }
        }

        System.out.println(contador.toString());

    }
}

// int Bcien = 0;
// int Bcincuenta = 0;
// int Bveinte = 0;
// int Bdiez = 0;
// int Bcinco = 0;

// int MUnE = 0;
// int MDosE = 0;
// int MCincuenta = 0;
// int BVeinte = 0;
// int Mdiez = 0;
// int Mcinco = 0;
// int Mdos = 0;
// int Muno = 0;

// System.out.println("Cuanto tiene que pagar");
// pago = sc.nextDouble();

// if (pago >= 100) {
// do {
// pago = pago - 100;
// Bcien++;

// } while (pago >= 100);
// }

// if (pago >= 50) {
// do {
// pago = pago - 50;
// Bcien++;

// } while (pago >= 50);
// }

// if (pago >= 20) {
// do {
// pago = pago - 20;
// Bcien++;

// } while (pago >= 20);
// }

// if (pago >= 10) {
// do {
// pago = pago - 10;
// Bcien++;

// } while (pago >= 10);
// }

// if (pago >= 5) {
// do {
// pago = pago - 5;
// Bcien++;

// } while (pago >= 5);
// }}
