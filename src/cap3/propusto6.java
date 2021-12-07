package cap3;

/*
 * 6. Realiza un programa que muestre por pantalla las tablas de multiplicar del 1 al 10 con el siguiente formato:
Tabla del 1
 */
public class propusto6 {
	public static void main(String[] args) {

		for (int j = 1; j <= 10; j++) {

			System.out.println("Tabla del " + j);
			for (int i = 1; i <= 10; i++) {
				System.out.println(j + " por " + i + " = " + (j*i));
			}//fin de i
			System.out.println();
		}//fin de j
	}
}
