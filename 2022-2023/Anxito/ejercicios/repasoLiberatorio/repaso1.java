package repasoLiberatorio;

import java.util.Arrays;
import java.util.Random;

/*Ejercicio 4
 * Define tres arrays de 20 numeros enteros cada una, con nombre numero,
 * cuadrado y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el 
 * array cuadrado se deben almacenar los cuadrados de los valores que hay en el array numero.
 */

public class repaso1 {

    public static int generaNumero() {
        Random r = new Random();
        return r.nextInt(100);
    }

    public static void burbuja(int[] arr) {

		int aux;

		for (int i = arr.length; i > 0; i--) {
			for (int j = 0; j < 1 - 1; j++) {

				// swap
				if (arr[j] > arr[j + 1]) {
					aux = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = aux;
				}
			}
		}

	}

    
    public static void main(String[] args) {

        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        for (int i=0; i<numero.length;i++) {
            numero[i]=generaNumero();

        }

        System.out.println(Arrays.toString(numero));
        
        for(int i = 0; i<numero.length;i++) {

            cuadrado[i]=(int) Math.pow(numero[i],2);
            cubo[i] = (int) Math.pow(numero[i],3);
        }

        //Ordename numero por burbuja
        burbuja(numero);
        burbuja(cuadrado);
        burbuja(cubo);

        System.out.println("numero---> cuadrado---> cubo--->");
        for(int j=0; j<numero.length; j++) {
            System.out.print(numero[j]+" ");
            System.out.print(cuadrado[j]+ " ");
            System.out.println(cubo[j] +"");
        }
        
        
        
    }
    
}
