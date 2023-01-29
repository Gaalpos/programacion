package anomalos;
import java.util.Arrays;
import java.util.Scanner;
public class LectorValoresConocidos {
    

// Un programa que lee un número conocido de valores enteros.

	
	// Se leerán 10 valores.
	public static final int MARCA = -1;
	public static final int NUM_VALORES = 10;

	public static void main(String[] args) {
	
		Scanner lector = new Scanner(System.in);
		float[] arr= new float[NUM_VALORES];
		System.out.println("Escribe " + NUM_VALORES + " flotantes. Se puede hacer en diferentes líneas.");
		System.out.println("Después del último valor escribe un" + MARCA);

		
		
		int numValoresLeidos = 0;
		boolean marca = false;
		while (!marca) {
			// Antes de leer, comprobamos si realmente hay un entero.
			if (lector.hasNextFloat()) {
				float valor = lector.nextFloat();
				if (valor == MARCA) {
					// Sí lo es.
					marca = true;
				}
				if(valor>=0&&valor<=10){
					arr[numValoresLeidos]=valor;
				System.out.println("Valor " + numValoresLeidos + " leído: " + valor);
				numValoresLeidos++;
				}
				else{
					System.out.println("valor no válido");
				}
			} else {
				lector.next();
			}
		}
		// Los valores que sobren en la última línea escrita se descartan.
		lector.nextLine();
		System.out.println("Ya se han leído " + NUM_VALORES + " valores.");
		System.out.println(Arrays.toString(arr));
	}
}

