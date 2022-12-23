package prensa;

public class testP {
	public static void main(String[] args) {
		
		Publicacion pub= new Publicacion(100f, 45);
		System.out.println(pub.toString());
		
		Libro lib = new Libro (243, 34.34f, "a", "b", "345", "d", "d");
		System.out.println(lib.toString());
		
		Periodico faro = new Periodico ("fdv","hoxe", 56, 1.20f );
		System.out.println(faro.toString());
	}

}
