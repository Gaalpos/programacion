package repasoLiberatorio;

// Leer los datos correspondientes a dos tablas de 12
// elementos numéricos, y mezclarlos en una tercera de la
// forma: 3 de la tabla A, 3 de la B, otros 3 de A, otros 3 de
// la B, etc

public class repaso6 {

    public static void main(String[] args) {

        int[] ArrayA = new int[12];
        int[] ArrayB = new int[12];
        int[] ArrayC = new int[24];

        //Inicializo y muestro el Array A
        System.out.println("Este es el Array A: ");
        for(int i=0; i<ArrayA.length; i++) {
            ArrayA[i] = (int) (Math.random()*100 + 1);
            System.out.println(ArrayA[i] + " ");
        }

        //Inicializo y muestro el Array B
        System.out.println("Este es el Array de B: ");
        for(int i=0;i<ArrayB.length;i++) {
            ArrayB[i] = (int) (Math.random()*100 + 1);
            System.out.println(ArrayB[i] + " ");
        }

        //Recorro los dos Arrays y los introduzco en el Array C

        for( int i=0, j=0; i<ArrayC.length; i=i+6, j=j+3){
            ArrayC[i] = ArrayA[j];
            ArrayC[i+1] = ArrayA[j+1];
            ArrayC[i+2] = ArrayA[j+2];
            ArrayC[i+3] = ArrayB[j];
            ArrayC[i+4] = ArrayB[j+1];
            ArrayC[i+5] = ArrayB[j+2];
        }

        //Recorro el Array de C y muestro el Array A y B mezclados de tres en tres

        System.out.println("Este es el Array de C: ");
        for(int k=0; k<ArrayC.length;k++) {
            System.out.println(ArrayC[k]);
        }
        
    }
    
}
