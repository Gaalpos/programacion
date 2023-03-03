package codigos;

import java.util.Scanner;

public class Loteria {

    public static void main(String[] args) { 
        // TODO Auto-generated method stub
        Scanner pepe = new Scanner(System.in);

        int num1 = 0, respuesta;
        int num3;

        Double min = 0.0;  // Set To Your Desired Min Value
        Double max = 36.0;

        

        do {
        	
        	num3 = (int) ((Math.random() * ((max - min) + 1)) + min);
            //entrance
            System.out.print("Introduce un  numero del 1 al 36: ");
            num1 = pepe.nextInt();

            if (num1 == num3) System.out.println("¡Enhorabuena!Te invito a un refresco :)\n");
            else System.out.println("Lo siento, no has ganado nada\n");
            

            System.out.println("El número era: " + num3 + "\n");
            System.out.println("PULSA 1 para seguir");
            respuesta = pepe.nextInt();

        }while (respuesta == 1);
        pepe.close();
    }

}