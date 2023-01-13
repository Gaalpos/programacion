
public class ejemplo14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer nome = new StringBuffer("torreon");
		
		nome.reverse();
		System.out.println(nome);
		
		StringBuffer modulo= new StringBuffer(" lenguajes de marcas y sistemas de gestion de informacion");
		modulo.delete(21, 37);
		System.out.println(modulo);
		
		modulo.replace(0, 11, "lenguaje de marcado");
		
		//OJO AL METODO SUBSTRING, que devuelove un STRING
		String inmuta = modulo.substring(0, 15);
		System.out.println(inmuta);
		
		//ojo devuelve un string
		String fin = modulo.toString();
		System.out.println(fin);
		
	}

}
