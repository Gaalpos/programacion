package varios;

import java.util.Arrays;

public class ejercicio72 {
	
	//ejercicio75
	public static String obtenerCadenaMasLarga(String[] arr) {
		
		int posicion=0;
		int maximo=0;
		for(int i=0; i<arr.length;i++) {
			System.out.println("largo de cadena: "+i+" es "+ arr[i].length());
			if(arr[i].length() > maximo ) {
				posicion=i;
				maximo=arr[i].length();	
			}
			System.out.println("posicion: "+posicion+" largo: "+maximo);
		}
		return arr[posicion];
		}
	
	
	//PRACTICA 72 obtenerLongCadenas
	
public static int[] obtenerLongCadenas(String[] arr) {
		
		int [] largos = new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("largo de cadena: "+i+" es "+ arr[i].length());
			largos[i]=arr[i].length();
		}
		return largos;
	}
	

	public static int obtenerSumaTotal(String[] arr) {
		
		int total=0;
		for(int i=0; i<arr.length;i++) {
			
			
			System.out.println("largo de la cadena: "+i+" es " +arr[i].length());
			total+=arr[i].length();
		}
		return total;
		
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

		String cads[] = parrafo.split(" ");
		
		System.out.println("Total de caracteres: "+obtenerSumaTotal(cads));
		
		System.out.println(Arrays.toString(obtenerLongCadenas(cads)));
		
		//ejercicio 75
		System.out.println(obtenerCadenaMasLarga(cads));
	}
	
	
}
