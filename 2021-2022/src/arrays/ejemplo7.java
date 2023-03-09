package arrays;

//Un programa para ver si alguien ha sacado un 10.
public class ejemplo7 {

	final static float EL_BUSCADO=10;
	
	public static void main(String args[]) {
		
		
		float[] notas = { 2f, 5.5f, 9f, 10f, 4.9f, 8f, 8.5f, 7f, 6.6f, 5f, 9f, 7f };
		
		boolean encontrado = false;
		
		int i = 0;

		//se repite si (no ha llegado al final) YY ( no lo ha encontrado)
		while ((i < notas.length) && (!encontrado)) {
			if (notas[i] == EL_BUSCADO) {
				encontrado = true;
			}
			i = i + 1;
		}
		//Se ha encontrado?
		if (encontrado) {
			System.out.println("Alguien ha sacado un "+EL_BUSCADO);
		} else {
			System.out.println("Nadie ha sacado un "+EL_BUSCADO);
		}
	}
}
