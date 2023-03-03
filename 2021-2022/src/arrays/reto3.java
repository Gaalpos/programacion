package arrays;

//saber si alguine ha suspendido
public class reto3 {

	final static float SUSPENSO=5;
	
	public static void main(String args[]) {
		
		
		float[] notas = { 2f, 5.5f, 9f, 10f, 4.9f, 8f, 8.5f, 7f, 6.6f, 5f, 9f, 7f };
		
		boolean encontrado = false;
		
		int i = 0;

		//se repite si (no ha llegado al final) YY ( no lo ha encontrado)
		while ((i < notas.length) && (!encontrado)) {
			if (notas[i]< SUSPENSO) {
				encontrado = true;
			}
			i = i + 1;
		}
		//Se ha encontrado?
		if (encontrado) {
			System.out.println("Alguien ha suspendido");
		} else {
			System.out.println("Nadie ha suspendido ");
		}
	}
}