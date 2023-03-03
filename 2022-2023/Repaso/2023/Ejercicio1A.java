import java.util.Scanner;

class Ejercicio1A {

    public static void main(String[] args) {

        double precio = 0;
        int tarjeta = 0;
        int star = 0;
        int porcentaje = 0;
        double descuento = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba el precio total");
        precio = sc.nextDouble();
        System.out.println(" Escriba su tarjeta");
        System.out.println("1 tipo ORO");
        System.out.println("2 tipo PLATA");
        System.out.println("3 tipo BRONCE");
        System.out.println("4 No tengo tarjeta");
        tarjeta = sc.nextInt();
        System.out.println(" Es STAR? 1=si 2=no");
        star = sc.nextInt();

        if (tarjeta == 1) {
            descuento = 0.80;
            porcentaje = 20;
        }
        if (tarjeta == 2) {
            descuento = 0.90;
            porcentaje = 10;
        }
        if (tarjeta == 3) {
            descuento = 0.95;
            porcentaje = 5;
        }
        if (star == 1) {
            descuento = descuento - 0.05;
            porcentaje = porcentaje + 5;
        }

        System.out.println(" Su descuento es del " + porcentaje + "%");
        System.out.println(" El precio final es: " + precio * descuento);

    }
}