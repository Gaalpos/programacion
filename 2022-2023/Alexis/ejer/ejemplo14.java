package ejer;

public class ejemplo14 {

	public static void main(String[] args) {
		StringBuffer nome = new StringBuffer("torreon");
		nome.reverse();
		System.out.println(nome);
		
		StringBuffer modulo = new StringBuffer("Lneguaje de marcas y sistema de gestion de informacion");
		modulo.delete(21, 67);
		System.out.println(modulo);
		
		modulo.replace(0, 11, "PEPE ganga");
		System.out.println(modulo);
		
		//OJO AL METODO substring ==>>>> devuelve un STRING
		String inmuta = modulo.substring(0,15);
		System.out.println(inmuta);
		
		String fin = modulo.toString();	
		System.out.println(fin);
	}

}