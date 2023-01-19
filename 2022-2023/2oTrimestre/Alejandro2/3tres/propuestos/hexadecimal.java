package propuestos;

public class hexadecimal {

/*ESTE SI ES UN EJERCICIO DE DIFICULTAD ALTA*/
	
	public static String decimalToHexadecimal(int n) {
		String hexaFinal="";
		int restos=0;
		
		while (n/16!=0) {
			restos=n%16;
			hexaFinal+=cifrasHexa(restos);
			n=n/16;
		}
		hexaFinal+=cifrasHexa(n);
		
		//creamos un constructor de cadenas con la original y le damos la vuelta
		StringBuilder devolver = new StringBuilder(hexaFinal);
		String vuelta = devolver.reverse().toString();
		
		return vuelta;
	}
	
	//solo validopara numeros entre 0 y 15
	public static String cifrasHexa(int n) {
		String transformado="";
		
		if (n<=9) 
			transformado=String.valueOf(n); //que coño es String.vlaueOf()??????
		else if (n==10) 
			transformado="A";
		else if (n==11) 
			transformado="B";
		else if (n==12) 
			transformado="C";
		else if (n==13) 
			transformado="D";
		else if (n==14) 
			transformado="E";
		else if (n==15) 
			transformado="F";
		
		return transformado;
	}
	
	public static void main(String[] args) {
		System.out.println(decimalToHexadecimal(32));
		System.out.println(decimalToHexadecimal(7000));
		System.out.println(decimalToHexadecimal(16));
		System.out.println(decimalToHexadecimal(1));
	}
		
		
		
		
		
		
		
		
		
		
}
