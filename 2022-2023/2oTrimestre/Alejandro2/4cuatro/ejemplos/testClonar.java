package ejemplos;

public class testClonar {

	//CLONACION
	
	public static void main(String[] args) {
		
		rectangulo r1= new rectangulo(5,7,"rect1");
		rectangulo r2= (rectangulo) r1.clone();
		
		r2.inrementarAlto();
		r2.inrementarAncho();
		r2.setNombre("rect2--clonado");
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		System.out.println("son iguales?????: "+r1.equals(r2));
		System.out.println(r1.hashCode());
		System.out.println(r2.hashCode());
	}
	
	
}