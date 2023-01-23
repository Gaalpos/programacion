package ejercicios;

/*Diseñar un programa que muestre el producto de los 10
primeros números impares.*/

public class ejercicio11 {

	public static void main(String[] args) {
		int numero=0;
		int aux=1;
		for(int i=1;i<=10;i++) {
			numero=(numero*2)+1;
			aux= aux*numero;
			
			
			
	}
System.out.println("El producto total es: "+aux);
}
}
