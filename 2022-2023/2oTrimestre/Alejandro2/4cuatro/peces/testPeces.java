package peces;

public class testPeces {

	public static void main(String[] args) {
		
		Pez uno = new Pez("sardina");
		System.out.println(uno.toString());
		Pez dos = new Pez("nemo");
		System.out.println(dos.toString());
		
		System.out.println("iguales?: "+ uno.equals(dos));
		System.out.println("numero de peces creados:"+Pez.cuentaPeces());
		
		Pez tres = new Pez(uno);
		System.out.println(tres.toString());
		
		System.out.println("iguales?: "+tres.equals(dos));
		System.out.println("iguales?: "+tres.equals(uno));
		
	}
	
}
