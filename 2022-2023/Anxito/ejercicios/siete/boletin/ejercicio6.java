package boletin;

// 6. Leer los datos correspondientes a dos tablas de 12 
// elementos numéricos, y mezclarlos en una tercera de la 
// forma: 3 de la tabla A, 3 de la B, otros 3 de A, otros 3 de 
// la B, etc

public class ejercicio6 {
    
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
