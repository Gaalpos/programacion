package varios;

import java.util.Arrays;

public class ejercicio67 {
	
	public static int[] factorM(int[]arr, int fact ) {
		for( int i=0; i<arr.length;i++) {
			arr[i]*=fact;
		}
		return arr;
	}
	
	public static int[] rellenaPotencias(int capacidad) {
		
		int[] doses = new int[capacidad];
		for(int i=0; i<doses.length; i++) {
			doses[i]=  (int)Math.pow(2, i);
		}
		return doses;
	}
	
	
	public static int sumaValores(int[] arr) {
        int suma = 0;
        for (int i = 0; i < arr.length; i++) {
            suma += arr[i];
        }
        return suma;

    }
	

	public static int[] rellenaPares(int capacidad) {
		
		//preparo un nuevo array
		int[] pares=new int[capacidad];
		for(int i=0;i<pares.length;i++) {
			pares[i]= i*2;
		}
		return pares;
		
	}
	
	public static int[] rellenaImpares(int capacidad) {
		
		//preparo un nuevo array
		int[] impares = new int[capacidad];
		for(int i=1;i<impares.length;i++) {
			impares[i]=i*2+1;
		}
		return impares;
		
	}
	
	
	public static void main(String[] args) {
		
		int[] sumaPar;
		int[] sumaImpar;
		int[] sumaDoses;
		int[] factorers;
		
		sumaPar=rellenaPares(12);
		System.out.println(Arrays.toString(sumaPar));
		
		sumaImpar=rellenaImpares(15);
		System.out.println(Arrays.toString(sumaImpar));
		
		sumaDoses=rellenaPotencias(12);
		System.out.println(Arrays.toString(sumaDoses));
		
		factorers=rellenaPotencias(8);
		System.out.println(Arrays.toString(factorers));
		
		System.out.println(Arrays.toString(factorM(factorers,16)) );
		
		System.out.println("Suma del array de pares: "+sumaValores(sumaImpar));
		System.out.println("Suma del array de impares: "+sumaValores(sumaImpar));
		System.out.println("Suma del array de potencias de dos: "+);
		
		
	}
	
}
