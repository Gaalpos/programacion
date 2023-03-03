package libArrays;

import java.util.Arrays;

public class mostrarEstudiantesOrdenados {

	public static void main(String[] args) {
		
		Student[] array= {
				new Student (111, "bbbb", "london"),
				new Student (131, "aaaa", "nyc"),
				new Student (121, "cccc", "jaipur"),
		};
		
		System.out.println("Unsorted");
		System.out.println(Arrays.toString(array));

	
	//OJOOOO parametro 1 --> array
	/*parametro 2 ---> objeto anonimo de la clase que tiene el metodo
	 * que collection usa para ordenar
	 * EL COMPARATIR
	*/
	Arrays.sort(array, new ordenaRoll());
	System.out.println("\n Sorted by rollno");
	System.out.println(Arrays.toString(array));
	
	
	for(Student generico:array) {
		System.out.println(generico.toString());
	}
	}
}
