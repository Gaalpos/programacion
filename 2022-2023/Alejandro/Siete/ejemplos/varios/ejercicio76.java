package varios;

import java.util.Arrays;

public class ejercicio76 {
    public static String[] obtenerCincoVocales(String[] arr) {
		
		String[] filtro= new String[arr.length];
		int indice=0;
	for(int k=0; k<arr.length; k++) {
		System.out.println("cadena: "+k+" es "+ arr[k]);
		boolean a=false;
		boolean e=false;
		boolean i=false;
		boolean o=false;
		boolean u=false;
		
		for(int j=0; j<arr[k].length(); j++) {	
			//System.out.println("caracter: "+j+" es "+arr[i].charAt(j));
			char letra= arr[k].charAt(j);
			if(letra=='a') a=true;
			if(letra=='e') e=true;
			if(letra=='i') i=true;
			if(letra=='o') o=true;
			if(letra=='u') u=true;
		}//fin caracteres
			
		if(a&&e&&i&&o&&u) {
			System.out.println("esta cadena tiene unas cinco vocales ");
			filtro[indice]=arr[k];
			indice++;}
			System.out.println();
		}//fin cadenas
		return filtro;
	
			
		
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
		
		String cads[] = {"ayuntamiento", "murcielago", "piscina", "universidad", "euforia"};
		
		String chunga[]=parrafo.split(" ");
		System.out.println(Arrays.toString(obtenerCincoVocales(cads)));
		System.out.println(Arrays.toString(obtenerCincoVocales(chunga)));
}
}
