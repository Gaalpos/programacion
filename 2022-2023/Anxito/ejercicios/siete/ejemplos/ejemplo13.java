package ejemplos;

public class ejemplo13 {

	public static void main(String[] args) {

		//cadena string
		StringBuffer nombre = new StringBuffer("Pepe");
		StringBuffer apellidos = new StringBuffer(80);
		StringBuffer direccion = new StringBuffer();
		
		System.out.println(nombre.length());
		System.out.println(nombre.capacity());
		
		StringBuffer nome = new StringBuffer("Juan Carlos");
		StringBuffer apelidos = new StringBuffer(" Moreno Perez");
		nome.append(apelidos);
		System.out.println(nome);
		System.out.println(nome.length());
		System.out.println(nome.capacity());
		
		String dir = " Hispanidad 33";
		nome.append(dir);
		
		System.out.println(nome);
		System.out.println(nome.length());
		System.out.println(nome.capacity());
		
		String otroApe = " One Direction";
		nome.insert(nome.length(), otroApe);
		System.out.println(nome);
		System.out.println(nome.length());
		
		nome.insert(14, "nuevo");
		System.out.println(nome);
		System.out.println(nome.length());
		
		
	}
	
}
