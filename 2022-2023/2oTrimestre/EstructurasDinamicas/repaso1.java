import java.util.Random;

public class repaso4 {

    public static int  generaNuemro(){

        Random r = new Random();
        return r.nextInt(100);
    }
    public static void main(String[] args) {
        


        int [] numero = new int [20];
        int [] cuadrado = new int [20];
        int [] cubo = new int [20];

        for(int i=0; i<numero.length;i++){
            numero[i]=generaNuemro();
        }

        System.out.println(numero);

        for(int i=0; i<numero.length;i++){
            cuadrado[i] = (int) Math.pow(numero[i],2);
            cubo[i] = (int) Math.pow(numero[i],3);
        }

        System.out.println("Numero ----> Cuadrado---->  Cubo");
        for(int i=0; i<numero.length;i++){
            System.out.println(numero[i]+" ");
            System.out.println(cuadrado[i]+" ");
            System.out.println(cubo[i]+" ");
            System.out.println();
        }
    }
    
}
    