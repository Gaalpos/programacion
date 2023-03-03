import java.util.Scanner;

/*
 * 3. Leer 5 números por teclado y a continuación realizar la
media de los números positivos, la media de los negativos y
contar el número de ceros.
 */

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] numeros = new int[5];
        
        
        for (int i = 0; i<numeros.length;i++){
            System.out.println(" Numero para la posicion "+ i);
            numeros[i]=sc.nextInt();
        }

        int positivos=0;
        int auxPos=0;

        int negativos=0;
        int auxNeg=0;

        int ceros=0;

        for (int i = 0; i<numeros.length; i++){
            if(numeros[i]>0){
                positivos++;
                auxPos+=numeros[i];
            }

            if(numeros[i]<0){
                negativos++;
                auxNeg+=numeros[i];
            }

            if(numeros[i]==0) ceros++;

        }
            System.out.println();
            System.out.println(" Numeros positivos: " +positivos);
            System.out.println(" Media positivos: " + auxPos/positivos);
            System.out.println();
            System.out.println(" Numeros negativos: " +negativos);
            System.out.println(" Media negativos: " + auxNeg/negativos);
            System.out.println();
            System.out.println("Ceros: "+ceros); 
    
    }

}
