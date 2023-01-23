package ejemplos;

public class testEquals {

	public static void main(String[] args) {
		
		rectangulo r1= new rectangulo(5,7,"r1");
		rectangulo r2= new rectangulo(5,7,"r2");
		rectangulo r3= r1;
		if(r1.equals(r2)) {
			System.out.println("iguales r1 y r2");
		}
		if(r1.equals(r3)) {
			System.out.println("Iguales r1 y r3");
		}
		
		
		
	}
	
	
}
