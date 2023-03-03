package ejemplos;

public class ejemplo14 {

	public static void main(String[] args) {
		
		StringBuffer nome = new StringBuffer("torreon");
		nome.reverse();
		System.out.println(nome);
		
		StringBuffer modulo = new StringBuffer("lenguaje de marcas y sistemas de gestion y informacion");
		modulo.delete(21, 67);
		System.out.println(modulo);
		
		modulo.replace(0, 11, "lenguaje de");
		System.out.println(modulo);
		
		//OJO AL METODO SUBSTRING ==>>> Devuelve un STRING
		String inmuta = modulo.substring(0,21);
		System.out.println(inmuta);
		
		//ojo devuelve un string
		String fin = modulo.toString();
		
		System.out.println(fin+"tamaño "+fin.length());
		
	}
	
}
