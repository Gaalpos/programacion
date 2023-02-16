package repasoLiberatorio;

import java.util.Arrays;
import java.util.Random;

import javax.lang.model.util.ElementScanner6;

public class repaso3 {
    
    public static int generaNumero() {
        Random r = new Random();
        return r.nextInt(100);
    }

    public static void main(String[] args) {

        int pares=0;
        int nones=0;

        int[] numero = new int[20];

        for (int i=0; i<numero.length;i++) {
            numero[i]=generaNumero();

        }

        System.out.println(Arrays.toString(numero));

        for(int i=0; i<numero.length;i++) {
            if(numero[i]%2==0) 
            pares++;
        else
            nones++;
        }

        System.out.println(Arrays.toString(numero));
        System.out.println("pares "+pares);
        System.out.println("nones "+nones);

        int[] par = new int[pares];
        int[] non = new int[nones];

        int cpar=0;
        int cnon=0;

        for(int i=0; i<numero.length;i++) {
            if(numero[i]%2==0) {
                par[cpar]=numero[i];
                cpar++;
        }  else{
            non[cnon]=numero[i];
            cnon++;
        }

        }
        System.out.println(Arrays.toString(numero));
        System.out.println(Arrays.toString(par));
        System.out.println(Arrays.toString(non));

        for(int i=0; i<pares;i++) {
            
                numero[i]=par[i];
        }
            for(int i=pares; i<numero.length;i++) {
                numero[i] = impares[i-impares.length];
            }
 
            System.out.println(Arrays.toString(numero));
            }               
            
        }
        
    
    
