package Repaso;

import java.util.Scanner;

/*Comprobar si un numero y su inverso son primos y mostrarlos 
para los 100 primeros numeros naturales*/
public class Primada {
    
    public static boolean esPrimo(int n){
        int contador = 2;
        boolean primus= true;
        while (contador<n &&primus) {
            if (n%contador==0) {
                primus=false;
            }
            contador++;
        }
        return primus;
    } 
    
public static void main(String[] args) {
    Scanner lee= new Scanner(System.in);
    int numero=0;
    //int otro=0;
    System.out.println("Que diferencia quieres entre ellos?: ");
    int diferencia= lee.nextInt();
    //otro=numero+8;
for(int j=1;j<101;j++){

    if (esPrimo(j)&& esPrimo(j+diferencia)) {
        System.out.println(j+" y "+(j+diferencia)+" son ambos primos");
    }
    
}

}



}
