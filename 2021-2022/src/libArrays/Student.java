package libArrays;

public class Student implements Comparable<Student> {
	
	int rollno;
	String name, address;

	public Student (int rollno, String name, String address) {
		this.rollno=rollno;
		this.name=name;
		this.address=address;
	}
	
	//tendré queobreescribir el metodo para copmparar estudiantes
	public String toString() {
		return  this.rollno+ " "+ this.name + " " + this.address ;
	}

	/*
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
	}
	*/

	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		if(this.name.compareTo(s.name)<1) 
			return -1;
		else if(this.name.compareTo(s.name)==0)
			return 0;
		else
			return 1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rollno;
		return result;
	}

	
	//OJOOOO
	//MUY SIMPLIFICADO
	@Override
	public boolean equals(Object obj) {
	
		Student other = (Student) obj;
		
		if (!address.equals(other.address))
			return false;
		
		if (!name.equals(other.name))
			return false;
		
		if (rollno != other.rollno)
			return false;
		
		return true;
	}
	
	/*
	 * OTRA OPCION MAS FACIL
	 * 
	 * 
	 */
	
	
}
