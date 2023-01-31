import java.util.Scanner;
/*
 * 3. Leer 5 números por teclado y a continuación realizar la
media de los números positivos, la media de los negativos y
contar el número de ceros.
 */

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0;
        int[] numeritos = new int[5];
        int pos=0;
        int tpos=0;
        int neg=0;
        int tneg=0;
        int ceros=0;
        
        for(int i=0;i<numeritos.length;i++ ){
            System.out.println("Numerito posicion :"+i);
            n=sc.nextInt();
            numeritos[i]=n;
            if(n>0){
                pos++;
                tpos+=n;
            }
            if(n<0){
                neg++;
                tneg+=n;
            }
            if(n==0) ceros++;
        }

        System.out.println("Positivos:"+pos);
        System.out.println("Media positivos:"+tpos/pos);
        
        System.out.println("Negativos   :"+neg);
        System.out.println("Media Negativos:"+tneg/neg);

        System.out.println("Ceros:"+ceros);

       sc.close();
    }
}
