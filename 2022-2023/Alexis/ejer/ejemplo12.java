package ejer;

public class ejemplo12 {

	public static void main(String[] args) {
		
		String cadena = "Lorem Ipsum is simply dummy text of the printing and typesetting +"
				+ "industry. Lorem Ipsum has been the industry's standard dum+"
				+ "my text ever since the 1500s, when an unknown printer took a galley of t+"
				+ "ype and scrambled it to make a type specimen book. It has survived not only five+"
				+ " centuries, but also the leap into electronic typesetting, remaining essentially unchanged.+"
				+ " It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum +"
				+ "passages, and more recently with desktop publishing software like Aldus PageMaker including v+"
				+ "ersions of Lorem Ipsum"; 
		
		System.out.println(cadena);
		
		//declarar un array de Strings
		String[] cachitos = cadena.split(" ");
		
		for(int j=0; j<cachitos.length;j++) {
			
			System.out.println("La palabra "+j+" es "+cachitos[j]);
			
		}
	}
	
}
	