package libArrays;

/*
 * el testeo de esta clase utilizara una instancia de la clase ordenaRoll, donde ya disponemos
 * del metodo compare 8estudiante a, estudiante b que permite el oprdenamiento
 */
public class estudiante{
	
	int rollno;
	String name, address;

	public estudiante (int rollno, String name, String address) {
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

	/*
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
	*/
	 
}