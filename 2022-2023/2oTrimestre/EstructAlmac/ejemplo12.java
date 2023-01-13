
public class ejemplo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cadena = "Erase una vez un principe que vivia en un catillo de gominola . Su nombre era Manolito .";
		
		System.out.println(cadena);
		
		//declarar un array de Strings
		String [] cachitos = cadena.split(" ");
		for(int j=0; j<cachitos.length;j++) {
			System.out.println(" Palabra "+j+ " "+cachitos[j]);
			
		}

	}

}
