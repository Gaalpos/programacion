package cadenas;

public class ejemplo1 {

	public static void main(String[] args) {
		
		Character a1;
		a1 = new Character('A');
		Character a2 = new Character('B');
		Character a3 = new Character('P');
		
		char minus = a1.toLowerCase('Z');
		System.out.println(minus);
		
		boolean esLetra = a1.isLetter('5');
		System.out.println(esLetra);
		
		System.out.println(a1.equals(a2));
		System.out.println(a1.compareTo(a2));
		System.out.println(a1.compareTo(a3));
		

	}

}
