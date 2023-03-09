package ejercicio;

import java.util.Random;

//Generar un Array de 15 numeros entre 300 y 500 y almacenarlos en un array. 
//Listar por pantalla en que posiciones se encuentran los numeros terminados en 7

//NO ME SALE EL METODO QSORTS

public class ejercicio1B {

    final static int SIZE = 15;
    static int[] Array = new int[SIZE];

    static int[] sietes;

    static void generaNumeros() {
        int min = 300;
        int max = 500;

        for(int i=0; i<Array.length;i++) {
            Array[i] = (int) ((Math.random() * ((max - min) + 1)) + min);
        }
    }

    public static int[] contarNumeros() {
        int cuentaSiete=0;
        for(int i=0; i<Array.length;i++) {
            if(Array[i]==7)
                cuentaSiete++;
        }
        return new int[] {cuentaSiete};
    }

    public static void separaNumeros() {
        sietes = new int[contarNumeros()[0]];
        int siete=0;

        for(int i=0; i<Array.length;i++) {
            if(Array[i] == 0 ){
                sietes[siete] = Array[i];
            }
        }
    }

    public static void mostarNumeros(int[] algo){
    for(int i=0; i<algo.length;i++) {
        System.out.println(algo[i]+" ");
    }
    System.out.println("\n-------");
}

public static void main(String[] args) {
    generaNumeros();
    mostarNumeros(Array);

    System.out.println("Este es el Array: ");

    System.out.println("Sietes: ");
    mostarNumeros(sietes);
}

//NO ME SALE EL METOO QSORTS

}
