package ejerciciosCadenas;



import java.util.Scanner;

/*
 7) Rutina que devuelve la suma de los caracteres correspondientes a dígitos decimales
pertenecientes a la secuencia almacenada en un String. Por ejemplo si la cadena es
ABC12m4XYZ entonces la rutina debe devolver el valor numérico entero 7.
 */
public class ejercicio7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int suma = 0;
		String cad = "";

		System.out.println("introduzca una cadena con algun numero entero");
		cad = sc.nextLine();

		for (int i = 0; i < cad.length(); i++) {
			if (Character.isDigit(cad.charAt(i)))
				suma += (int) Integer.parseInt(String.valueOf(cad.charAt(i)));
		}
		System.out.println("suma de digitos es: " + suma);
		sc.close();
	}
}
