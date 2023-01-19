package varios;

import java.util.Scanner;

public class ejercicio77 {

	public static int obtenerNumCar(String[] arr ,char c) {
		
		int total=0;
		for(int k=0; k<arr.length; k++) {
			System.out.println("cadena: "+k+" es "+ arr[k]);
			int parcial=0;
			for(int j=0; j<arr[k].length(); j++) {	
				//System.out.println("caracter: "+j+" es "+ arr[k].charAt(j)+"");
				char letra=arr[k].charAt(j);
				if(letra==c) parcial++;
			}//fin caracteres
				System.out.println("esta cadena tiene"+ parcial+" veces letras "+c);
				total+=parcial;
				
			}//fin cadenas
			return total;
			}
		

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
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
		System.out.println("dame letra: ");
		char contar=sc.nextLine().charAt(0);
		
		System.out.println("la letra "+'a'+ " aparece un total de: "+obtenerNumCar(chunga, 'a'));
	}
	
}
