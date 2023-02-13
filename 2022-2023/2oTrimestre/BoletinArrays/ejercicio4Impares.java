import java.util.Scanner;

/*4. Leer 10 números enteros. Debemos mostrarlos en el
siguiente orden: el primero, el último, el segundo, el
penúltimo, el tercero, etc.
Modificarlo para que el array sea impar*/

public class ejercicio4Impares {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// int[] arr = new int[10];
		int[] array = { 0, 1, 2, 3, 4 };
		int medio = 0;

		// for(int i=0; i<arr.length;i++) {
		// System.out.println("ingresa numero: "+i);
		// arr[i]=sc.nextInt();
		// }

		if (array.length % 2 == 0)
			medio = array.length / 2;
		else
			medio = array.length / 2 + 1;
		System.out.println(medio + " indice ");

		for (int i = 0; i <= 4; i++) {
			System.out.print(array[i] + " ");
			System.out.print(array[5 - i] + " ");

			

		}

	}

}
