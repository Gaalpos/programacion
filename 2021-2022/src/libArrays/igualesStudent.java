package libArrays;

public class igualesStudent {

	public static void main(String[] args) {
		
		Student jicho1 = new Student (1, "Juancho","Lagarto" );
		
		Student jicho2 = new Student (1, "Juancho","Lagarto" );
		
		Student jicho3 = new Student (3, "Josefa","Almeja" );
		
		System.out.println("Iguales 1 y 2? ");
	    System.out.println(jicho1.equals(jicho2));
		System.out.println("Iguales 1 y 3? ");
		System.out.println(jicho1.equals(jicho3));
	}
	
}
