package copias;


public class testEstudiante {

	public static void main(String[] args) {
		estudiante estu1=new estudiante();
		estudiante estu2=new estudiante();
		estu1.setNumero(12345);
		estu1.setNumero(13);
		
		System.out.println(estu1.toString());
		System.out.println(estu2.toString());
		
		//atencion copia
		//stu2=stu1;
		
		
		/*USAR METODO CLONE*/
		//COPIA  ROFUNDA
		estu2=(estudiante) estu1.clone();
		
		System.out.println(estu1.toString());
		System.out.println(estu2.toString());
		
		
		estu2.setNumero(888);
		
		System.out.println(estu1.toString());
		System.out.println(estu2.toString());
	}

}
 