package boletin;

// 5. Leer por teclado dos tablas de 10 números enteros y
// mezclarlas en una tercera de la forma: el 1o de A, el 1o de
// B, el 2o de A, el 2o de B, etc.

public class ejercicio5 {
    
    public static void main(String[] args) {
        int arrayA[] = new int[10];
        int arrayB[] = new int[10];
        int arrayC[] = new int[20];
        int i;

        //Inicializo y muestro A
        System.out.print("array A: ");
        for (i = 0; i < arrayA.length; i++) {
            arrayA[i] = (int) (Math.random() * 100 + 1);
            System.out.print(arrayA[i] + " ");
        }
        System.out.println();
        
        //Inicializo y muestro B
        System.out.print("array B: ");
        for (i = 0; i < arrayB.length; i++) {
            arrayB[i] = (int) (Math.random() * 100) + 1;
            System.out.print(arrayB[i] + " ");
        }
        System.out.println();
        
        //Ahora voy rellenando C cogiendo las posiciones pares de A y la impares de B
        for (i = 0; i < arrayC.length / 2; i++) {
            arrayC[i * 2] = arrayA[i];
            arrayC[i * 2 + 1] = arrayB[i];
        }
        System.out.println();
        
        //Por último muestro C
        System.out.print("array C: ");
        for (i = 0; i < arrayC.length; i++) {
            System.out.print(arrayC[i] + " ");
        }
    }

    
}