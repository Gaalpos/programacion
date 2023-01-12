package ejemplos;

public class ejemplo11 {

	public static void main(String[] args) {
		
		String cad1="AMPARO HEREDIA";
		System.out.println(cad1.charAt(0)+"  "+cad1.charAt(7));
		
		String cad2 = "EMMA MORENO";
		
		System.out.println(cad2.indexOf("M"));
		System.out.println(cad2.indexOf("J"));
		System.out.println(cad2.indexOf("MOR"));
		System.out.println(cad2.lastIndexOf("O"));
		
		
		//empleo de wrappers para obtener una cadena entera y doble
		String cad3 = "18";
		int numero = Integer.parseInt(cad3); 
		System.out.println(numero);
		String cad4 = "  6  ";
		System.out.println(Integer.parseInt(cad4.trim()));
		String cad5 = "   6.8   ";
		System.out.println(Double.parseDouble(cad5.trim()));
		
		//
		int edad1 = 1694;
		//String es una cadena.
		String str = String.valueOf(edad1);
		System.out.println("este numero es una cadena "+str);
		System.out.println(str.indexOf('9'));
		
	}
	
}
