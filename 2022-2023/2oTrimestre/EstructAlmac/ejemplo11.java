

public class ejemplo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cad1 = "AMPARO HEREDIA";
		System.out.println(cad1.charAt(0)+ "    "+ cad1.charAt(7));
		String cad2 = "EMMA MORENO";
		
		System.out.println(cad2.indexOf('M'));
		System.out.println(cad2.indexOf('J'));
		System.out.println(cad2.indexOf("MOR"));
		System.out.println(cad2.lastIndexOf("O"));
		
		String cad3= "19";
		int numero = Integer.parseInt(cad3);
		System.out.println(numero);
		
		String cad4 ="     3    ";
		System.out.println(Integer.parseInt(cad4.trim()));
		String cad5= " 6.8 ";
		System.out.println(Double.parseDouble(cad5.trim()));

		
		int edad1=6;
		String str= String.valueOf(edad1);
		System.out.println("Este numero es una cadena ==>"+str);
		System.out.println(str.indexOf('9'));
	}

}
