package cadenas;

public class ejemplo5 {

	public static void main(String[] args) {
		
		String despedida = "Adios";
		String s1 =despedida.substring(1,3);
		String s2 =despedida.substring(1);
		
		System.out.println(despedida);
		System.out.println(s1);
		System.out.println(s2);
		
		// uso de toString
		String s;
		int a= 78;
		s=Integer.toString(a);
		
		//convertimos un dato primitivo en una cadena
		System.out.println(s);
		
		//ojo concatenacion
		s=s+32;
		System.out.println(s);
		
		//de string a numerico
		String t;
		t="156.24";
		double dato=Double.parseDouble(t);
		//int fran =Integer.parseInt(t);
		//hay que saber quer queremos extraer
		
		System.out.println("el dato numerico extraido es "+ dato);
		System.out.println(2*dato);
		System.out.println(3*dato);
		
		
	}
}
