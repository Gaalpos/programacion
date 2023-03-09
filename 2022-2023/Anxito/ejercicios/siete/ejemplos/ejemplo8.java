package ejemplos;

public class ejemplo8 {

	//diferencia entre equals y el operador==
	public static void main(String[] args) {
		
		
		
		String cad1 = "EMMA";
		String cad2 = new String ("EMMA");
		
		if (cad1.equals(cad2)) {
			System.out.println("son iguales");
		}
		else {
			System.out.println("No son iguales");
		}
		
		//con ==
		
		if (cad1==cad2) {
			System.out.println("son iguales");
		}
		else {
			System.out.println("No son iguales");
		}
		
		

	}
	
	
}
