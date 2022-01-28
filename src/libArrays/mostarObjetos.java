package libArrays;

import java.util.Arrays;

public class mostarObjetos {
	public static void main(String[] args) {
		
		Student []array = { new Student (111, "bbb", "London"),
				new Student (131, "aaa", "New York"),
				new Student (194, "ccc", "Vigo")};
		
		System.out.println(Arrays.toString(array));
		
		
		/*
		 * ERROR: no tengo criterio apra ordenar los objetos Student
		 */
		Arrays.sort(array);
	}
}
