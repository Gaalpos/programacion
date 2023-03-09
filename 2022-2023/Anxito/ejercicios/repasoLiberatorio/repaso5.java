package repasoLiberatorio;

// 5. Leer por teclado dos tablas de 10 números enteros y
// mezclarlas en una tercera de la forma: el 1o de A, el 1o de
// B, el 2o de A, el 2o de B, etc.

public class repaso5 {

    public static void main(String[] args) {

        int[] ArrayA = new int[10];
        int[] ArrayB = new int[10];
        int[] ArrayC = new int[20];
        int i;

        //Inicializo y muestro el Array A
        System.out.println("Este es el Array de A: ");
        for(i=0;i<ArrayA.length;i++) {
             ArrayA[i]= (int) (Math.random()* 100 +1);
             System.out.println(ArrayA[i] + " ");
        }

        //Inicializo y muestro el Array B
        System.out.println("Este es el Array de B: ");
        for(i=0;i<ArrayB.length;i++) {
            ArrayB[i]= (int) (Math.random()* 100 + 1);
            System.out.println(ArrayB[i] + " ");
        }
        System.out.println();

        //Introduzco los valores de los Arary A y B
        for(i=0;i<ArrayC.length / 2;i++) {
            ArrayC[i*2] = ArrayA[i];
            ArrayC[i*2+1] = ArrayB[i];
        }

        //Inicializo y meustro el Array C

        System.out.println("Este es el Array C: ");
        for(i=0; i<ArrayC.length; i++) {
            System.out.println(ArrayC[i] + " ");
        }
    }
    
}
