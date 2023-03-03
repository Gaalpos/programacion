package Repaso;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;


public class Capicua{

public static int contarDigitos(int numero){
    if((numero/10)==0){
        return 1;
        
    }
    else
    return 1+ contarDigitos(numero/10);
}

public static int invRepitiendo(int numero){
    


}


    public static void main(String[] args) {
        Scanner lee= new Scanner(System.in);
        int numero=0;
        int inverso=0;
        System.out.println("Introduce un numero: ");
        numero= lee.nextInt();

        inverso=invRepitiendo(numero);
        System.out.println(numero);
        System.out.println(inverso);



    }



}