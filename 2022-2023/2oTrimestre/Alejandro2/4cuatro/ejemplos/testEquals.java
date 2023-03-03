package ejemplos;

public class testEquals {

	public static void main(String[] args) {
		
		rectangulo r1 = new rectangulo(5,7,"");
		rectangulo r2 = new rectangulo(5,7,"");
		rectangulo r3= r1;
		System.out.println("r1 y r2 iguales?? "+r1.equals(r2));
		System.out.println("r1 y r3 iguales?? "+r2.equals(r3));
		
	}
	
	
}
