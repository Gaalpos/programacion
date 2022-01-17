package arrays;

public class ejemplo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Se parte de un array que contiene todos los valores.
		float [] arrayNotas = {2f, 5.5f, 9f, 10f, 4.9f, 8f, 8.5f, 7f, 6.6f, 5f, 9f, 7f};
		
		// Acumulador de la suma de valores.
		float acumulado = 0;
		
		// Hay que recorrer todo el array de extremo a extremo.
		for (int i = 0; i <arrayNotas.length;i++) {
		acumulado = acumulado + arrayNotas[i];
		}
		float resultado = acumulado/arrayNotas.length;
		System.out.println("El resultado es " + resultado);
		
	}

}
