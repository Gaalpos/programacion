package varios;

public class ejercicio64 {

	
	//metodo que recoge un array de enteros
	//y devuelva una cadena con su contenido
	
	public static String obtenerArrayComoString(int[] arr){
		String devolver = "";
		
		//RECORRE CADA VALOR DEL ARRAY
		//NO SIRVE COM INDICE
		//ojo con la inicializacion del entero i
		for(int valor: arr) {
		System.out.println("indice?NO: "+valor);
		System.out.println("Valor correspondiente a indice?: "+valor);
		devolver+=valor;
	}
		return devolver;
		

	}
	
	public static void main(String[] args) {
		
		int[] num = {54,55,56,57,58,59,60};
		System.out.println(obtenerArrayComoString(num));
		
		String[] palabras= {"lun", "mar", "mie", "jueves", "viernes", "sab","dom" };
		
		for(String palabrita:  palabras ) System.out.println(palabrita);
		
	}
	
	
}
