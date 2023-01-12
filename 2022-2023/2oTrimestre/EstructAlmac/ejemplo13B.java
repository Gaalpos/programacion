
public class ejemplo13B {
	
	public static void main(String[] args) {
		
		
		StringBuffer nombre = new StringBuffer ("Pepe");
		StringBuffer apellidos = new StringBuffer (80);
		StringBuffer direccion = new StringBuffer ("Pepe");
		
		System.out.println(nombre.length());
		System.out.println(nombre.capacity());
		
		StringBuffer nome = new StringBuffer( " Juan Carlos");
		StringBuffer apelidos = new StringBuffer ("Moreno Perez");
		
		nome.append(apelidos);
		System.out.println(nome);
		System.out.println(nome.length());
		System.out.println(nome.capacity());
		
		
		String dir= " Hispanidad 22";
		nome.append(dir);
		
		System.out.println(nome);
		System.out.println(nome.length());
		System.out.println(nome.capacity());
		
		String otroApe= " one Direction";
		nome.insert(nome.length(), otroApe);
		System.out.println(nome);
		System.out.println(nome.length());
		
		nome.insert(14, "nuevo");
		System.out.println(nome);
		System.out.println(nome.capacity());
		
		
		
	}

}
