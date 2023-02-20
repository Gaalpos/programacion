import java.util.Scanner;

/*
 * Ejercicio 1A (1,5 Ptos)
Los clientes de un gran almacén tendrán ventajas según estos
criterios:
Si pagan con tarjeta ORO tendrán un 20% de descuento.
Si pagan con tarjeta PLATA tendrán un 10% de descuento.
Si pagan con tarjeta BRONCE tendrán un 5% de descuento.
Si dichas tarjetas son además de clase STAR, tendrán un 5% de
descuento.
Los descuentos son acumulables.
Preguntar al usuario un precio normal y el tipo de tarjeta y la
clase presentar por pantalla el descuento y el precio final.
 */

public class Ejercicio1A {

    public static void pideTarjetas(){
        System.out.println("Indique su tarjeta");
        System.out.println("1 ORO");
        System.out.println("2 PLATA");
        System.out.println("3 BRONCE");
    }
    public static void pideStar(){
        System.out.println("Es STAR?");
        System.out.println("1 SI");
        System.out.println("2 NO");
    }


    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    double discount=1.00;
    double starDsicount = 1.00;
    System.out.println(" Cantidad a pagar:");
    float amount=sc.nextFloat();

    pideTarjetas();
    int card = sc.nextInt();

    if(card == 1 )  discount = 0.8;
    if(card == 2 ) discount = 0.9;
    if(card == 3  ) discount = 0.95;

    pideStar();
    int star=sc.nextInt();

    if(star == 1) starDsicount = 0.95;

    double total = amount * discount * starDsicount; 
    System.out.println("TOTAL A PAGAR: " + (float)total);
    
    sc.close();
    }
}