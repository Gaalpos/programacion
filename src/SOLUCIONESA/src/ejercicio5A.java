/*
 * Ejercicio 5A. Dos números primos son primos gemelos si su diferencia es igual a 2.
 * Es decir, una pareja de la forma (p, p+2) siendo p un número primo es una pareja
 * de números primos.
 * Por ejemplo, las parejas (3, 5) y (11,13) son dos parejas de primos gemelos.
 * Listar por pantalla todos los numero gemelos entre 0 y 100. 
 */
public class ejercicio5A {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=0;
		
		for (i=1;i<=100;i++) {
			if (esPrimo(i)==true) {
				if (esPrimo(i+2)==true) {
					System.out.println("("+i+","+(i+2)+")");
				}
			}
		}	
	}

	public static boolean esPrimo (int num) {
		int i=0;
		for (i=2;i<num;i++) {
			if (num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	
}
