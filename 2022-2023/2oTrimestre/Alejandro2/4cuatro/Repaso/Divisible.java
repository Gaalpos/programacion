package Repaso;

import java.util.Scanner;

/*Muestra los divisibles entre 1 y 100 divisibles entre 10
 * y muestra los divisibles entre 6 */
public class Divisible {
    public static void main(String[] args) {


        //pedimos hasta que nº queremos hacer la comprobación
        Scanner lee= new Scanner(System.in);
        int limite;
        System.out.println("Hasta que numero vamos a comprobar?: ");
        limite= lee.nextInt();
        int contadiez=0;
        int contaseis=0;
        for(int j=1;j<limite+1;j++){

            if ((j%10)==0) {
                System.out.println(j+" es divisible entre 10");
                contadiez++;
            }
            if ((j%6)==0) {
                System.out.println(j+" es divisible entre 6");
                contaseis++;
            }
            
        }
        System.out.println("Comprobacion de numeros hasta "+limite);
        System.out.println("Total de divisibles entre 10: "+contadiez);
        System.out.println("Total de divisibles entre 6: "+contaseis);
    }
}
