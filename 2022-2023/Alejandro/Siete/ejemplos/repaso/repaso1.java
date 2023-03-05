package repaso;

import java.util.Arrays;
import java.util.Random;

public class repaso1 {

    // bubble sort

    public static void burbuja(int [] Arr) {
		
		int aux;  
		for(int i=Arr.length; i>0; i--) {
			for(int j=0; j<i-1;j++) {
				if(Arr[j]>Arr[j+1]) {
					aux =Arr[j+1];
					Arr[j+1]=Arr[j];
					Arr[j]=aux;
				}
			}
		}
	}

    public static int generaNumero() {
        Random r = new Random();
        return r.nextInt(100);
    }

    public static void main(String[] args) {

        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        for (int i = 0; i < numero.length; i++) {
            numero[i] = generaNumero();
        }
        System.out.println(Arrays.toString(numero));

        for (int i = 0; i < numero.length; i++) {
            cuadrado[i] = (int) Math.pow(numero[i], 2);
            cubo[i] = (int) Math.pow(numero[i], 3);

        }

        // Ordena numero por burbuja
        burbuja(numero);
        burbuja(cuadrado);
        burbuja(cubo);

        System.out.println("numero>cuadrado>cubo");
        for (int j = 0; j < numero.length; j++) {

            System.out.print(numero[j] + " ");
            System.out.print(cuadrado[j] + " ");
            System.out.print(cubo[j] + " ");
            System.out.println();
        }

    }
}
