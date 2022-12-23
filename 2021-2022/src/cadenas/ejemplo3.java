package cadenas;

public class ejemplo3 {

	public static void main(String[] args) {
		
		String uno = "Allariz";
		String dos = "Betanzos";
		String tres = "Cangas";
		
		System.out.println(uno.equals(dos));
		System.out.println(dos.equals(uno));
		System.out.println(uno.equals(tres));
		
		System.out.println(uno.length());
		System.out.println(dos.charAt(3));
		
		char letra = tres.charAt(2);
		System.out.println(letra);

	}

}
