package ejemplos;

public class ejemplo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cad1="Pepe";
		String cad2= new String("lionel");
		String cad3 = new String(cad2);
		
		System.out.println(cad1);
		System.out.println(cad2);
		System.out.println(cad3);
		
		System.out.println(cad2.hashCode());
		System.out.println(cad3.hashCode());
		//ojo true
		System.out.println(cad2.equals(cad3));
		String cad4="CHELO";
		System.out.println(cad4.length());
		
		//como concatenar cadenas
		String cad5 = "Andy";
		cad5= cad5.concat(" y Lukas");
		
		System.out.println(cad5.toString());
		
		// revisar este ejemplo de cara a repaso para los examenes.
		//preguntar a pepe dudas por si acaso, para no quedarse con las dudas
		
	
	}

}
