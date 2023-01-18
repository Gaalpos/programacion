import java.util.Scanner;

/*
 * Método que introduzca la estatura en cm de una persona y la
convierta a su cantidad equivalente en pies y pulgadas.
1 pie (ft) = 12 in = 30,48 cm
1 pulgada (in) = 2,54 cm
 */
public class Ejercicio3A {

    final static double PIE = 30.48;

    public static double cmAPulgadas(double a) {
        return a / 2.54;

    }

    public static int cmAPies(double a) {
        int pies = 0;

        do {
            a = a - PIE;
            pies = pies + 1;
        } while (a >= PIE);
        return pies;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double cm = 0;
        int pies = 0;

        System.out.println("Escribe los centimetros");
        cm = sc.nextDouble();

        if (cm >= PIE) {
            do {
                cm = cm - PIE;
                pies = pies + 1;
            } while (cm >= PIE);
            // pies = cmAPies(cm);

        }

        System.out.println("PIES: " + pies);
        System.out.println("PULGADAS: " + cmAPulgadas(cm));
        sc.close();
    }
}