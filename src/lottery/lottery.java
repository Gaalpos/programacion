package lottery;

import java.util.Scanner;

public class lottery {

    public static void main(String[] args) { 
        // TODO Auto-generated method stub
        Scanner pepe = new Scanner(System.in);

        int num1 = 1, respuesta;
        int num3;

        Double min = 0.0;  // Set To Your Desired Min Value
        Double max = 36.0;

        

        do {
        	
        	num3 = (int) ((Math.random() * ((max - min) + 1)) + min);
            //entrance
            System.out.print("Type a number between 0 and 36: ");
            num1 = pepe.nextInt();

            if (num1 == num3) System.out.println("You win! :)\n");
            else System.out.println("Sorry, notrhing for you\n");
            

            System.out.println("The number was: " + num3 + "\n");
            System.out.println("Type 1 to repeat");
            respuesta = pepe.nextInt();

        }while (respuesta == 1);
        pepe.close();
    }

}