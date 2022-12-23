package copias;

public class testStudent {

	public static void main(String[] args) {
		Student stu1=new Student();
		Student stu2=new Student();
		stu1.setNumber(12345);
		
		System.out.println(stu1.toString());
		System.out.println(stu2.toString());
		
		//atencion copia
		stu2=stu1;
		
		System.out.println(stu1.toString());
		System.out.println(stu2.toString());
		
		
		stu2.setNumber(888);
		
		System.out.println(stu1.toString());
		System.out.println(stu2.toString());
	}

}
 