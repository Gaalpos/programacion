package libArrays;

public class Student {
	
	int rollno;
	String name, address;

	public Student (int rollno, String name, String address) {
		this.rollno=rollno;
		this.name=name;
		this.address=address;
	}
//tendré queobreescribir el metodo para copmparar estudiantes
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
	}
	
}
