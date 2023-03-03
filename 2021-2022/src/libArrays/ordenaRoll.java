package libArrays;

import java.util.Comparator;

public class ordenaRoll implements Comparator<Student>{

	
	// Usado para ordenar ascendente por el atributo roll number
	@Override
	public int compare(Student a, Student b) {
		// TODO Auto-generated method stub
		return a.rollno - b.rollno; 
	}
	
}
