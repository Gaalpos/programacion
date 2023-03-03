package ejemplos2;

public class testPajaro2 {

	public static void main(String[] args) {
		
		Pajaro2.muestrapajaros();
		Pajaro2 p1,p2;
		p1=new Pajaro2();
		p2=new Pajaro2 ('a', 3) ;
		// tengo que usar el nombre de la clase
		//Pajaro2.muestrapajaros ();
		Pajaro2 p3=new Pajaro2();
		Pajaro2 p4=new Pajaro2();
		Pajaro2 p5=new Pajaro2('v',5);
		System.out.println(p5.toString());
		Pajaro2 p6=new Pajaro2();
		Pajaro2 p7=new Pajaro2();
		
		/*p1.muestrapajaros();
		p2.muestrapajaros();*/
		Pajaro2.muestrapajaros();
		}
		
	
	
}
