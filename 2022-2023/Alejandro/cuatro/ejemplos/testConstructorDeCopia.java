package ejemplos;

public class testConstructorDeCopia {

	public static void main(String[] args) {
		
		rectangulo original = new rectangulo(10,5, "original");
		rectangulo clonado = new rectangulo(original);
		
		System.out.println("Son iguales???: "+original.equals(clonado));
		
		System.out.println(original.toString());
		System.out.println(clonado.toString());
		
		System.out.println(original.hashCode());
		System.out.println(clonado.hashCode());
		
	}
	
	
}
