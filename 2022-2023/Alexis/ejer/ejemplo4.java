package ejer;

public class ejemplo4 {

	public static void main(String[] args) {
		
	String cadena = "Los Wrappers java (envoltorios) son clases diseñadas para ser un complemento"
			+ " de los tipos primitivos siendo los únicos elementos de Java que no son objetos, el cual, tiene"
			+ " algunas ventajas desde el punto de vista de la eficiencia, pero algunos inconvenientes"
			+ " desde el punto de vista de la funcionalidad.";
	
	System.out.println(cadena);
	
	//declarar un array de Strings
	String[] cachitos = cadena.split(" ");
	
	for(int j=0; j<cachitos.length;j++) {
		
		System.out.println("la palabra "+j+" es "+cachitos[j]);
	}
	
	}
	
	
}