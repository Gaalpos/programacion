package varios;

import java.util.Arrays;

public class ejercicio78 {

	//este es el metodo burbuja
	public void obtenerArrayOrdAlfb(String[] arrCad) {
		if(arrCad==null)
			throw new IllegalArgumentException("Parametro no valido");
			int numVeces=0;
			for(int i=0; i<arrCad.length; i++) {
				if(arrCad[i] != null ) {
					for(int j=i+1; j<arrCad.length; j++) {
						if(arrCad[j] !=null &&
								arrCad[j].toUpperCase().compareTo(
								arrCad[i].toUpperCase()) <0) {
							String cadAux = arrCad[i];
							arrCad[i] = arrCad[j];
							arrCad[i] = cadAux;
							
						}
					}
				}
			}
	}
	
	
	public static void main(String[] args) {
		
		String parrafo ="sum has been the industry's standard dummy text"
				+ " ever since the 1500s, when an unknown printer took a"
				+ " galley of type and scrambled it to make a type specimen"
				+ " book. It has survived not only five centuries, but also the "
				+ "leap into electronic typesetting, remaining essentially unchanged. "
				+ "It was popularised in the 1960s with the release of Letraset sheets containing "
				+ "Lorem Ipsum passages, and more recently with desktop publishing "
				+ "software like Aldus"
				+ " PageMaker including versions of Lorem Ipsum.";
		
		String chunga[]=parrafo.split(" ");
		
		
	}
	
}
